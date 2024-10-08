PWD := $(shell pwd)
#OPENAPI_MINDWM_VERSION := $(shell cat openapi.yaml | yq '.info.version')
OPENAPI_MINDWM_VERSION := 0.1.0

PACKAGE_NAME := mindwm
GENERATED_DIR := "generated/$(PACKAGE_NAME)/$(OPENAPI_MINDWM_VERSION)"


.DEFAULT_GOAL=openapi-generator

# XXX
.PHONY: generated_dir
generated_dir:
	sudo rm -rf $(GENERATED_DIR)
	test -d $(GENERATED_DIR) || (mkdir -p $(GENERATED_DIR) && chmod a+rwx $(GENERATED_DIR))
	mkdir -p $(GENERATED_DIR)/openapi
	mkdir -p $(GENERATED_DIR)/asyncapi
	
kcl:
	kcl mod update
	kcl run ./mindwm_asyncapi.k | tee $(GENERATED_DIR)/asyncapi/asyncapi.yaml 
	cp ./CloudEvent.yaml $(GENERATED_DIR)/asyncapi/
	kcl run ./mindwm_openapi | tee $(GENERATED_DIR)/openapi/openapi.yaml
	GDSCRIPT_WORKAROUND=1 kcl run ./mindwm_openapi | yq 'del(.. | select(has("const")).const)' | yq 'del(.. | select(has("examples")).examples)' | tee $(GENERATED_DIR)/openapi/openapi_gdscript.yaml                                           
	cp ./CloudEvent.yaml $(GENERATED_DIR)/openapi/
	#cat ./cloudevents.yaml | yq e 'del(.. | select(has("format") and .format == "uri").format)' | tee $(GENERATED_DIR)/openapi/cloudevents_gdscript.yaml

.PHONY: openapi-generator-docker
openapi-generator-docker:
	docker run --rm -v "$(PWD):/local" openapitools/openapi-generator-cli generate \
    		-i /local/openapi.yaml \
                -p packageName=$(PACKAGE_NAME) \
    		-g $(LANG) \
    		-o /local/$(GENERATED_DIR)/$(LANG)

.PHONY: openapi-generator-go
openapi-generator-go: generated_dir
	$(MAKE) openapi-generator-docker LANG=go
.PHONY: openapi-generator-python
openapi-generator-python: generated_dir
	$(MAKE) openapi-generator-docker LANG=python
.PHONY: openapi-generator-gdscript
openapi-generator-gdscript: generated_dir
	docker run --rm -v "$(PWD):/local" ghcr.io/mindwm/openapi-generator/openapi-generator:gdscript generate \
    	-i /local/$(GENERATED_DIR)/openapi/openapi_gdscript.yaml \
        -p packageName=$(PACKAGE_NAME) \
    	-g gdscript \
    	-o /local/$(GENERATED_DIR)/openapi/gdscript
	(cd $(GENERATED_DIR)/openapi/gdscript && sudo sed -r -i'' 's/: Object:$$/: Dictionary:/' models/* core/*)

.PHONY: openapi-context
openapi-context: generated_dir
	docker run -it --rm -v "$(PWD):/local" --entrypoint /bin/sh ghcr.io/mindwm/openapi-generator/openapi-generator:gdscript -c /bin/bash

asyncapi-generate:
	docker run --rm -it -v "$(PWD):/local" \
	   --user=root \
		 -v $(PWD)/.asyncapi-analytics:/root/.asyncapi-analytics \
		 -w /local/$(GENERATED_DIR)/asyncapi \
	   asyncapi/cli generate fromTemplate -o /local/$(GENERATED_DIR)/asyncapi/$(TEMPLATE) /local/$(GENERATED_DIR)/asyncapi/asyncapi.yaml @asyncapi/$(TEMPLATE)-template --force-write

asyncapi-generate-html:
	$(MAKE) asyncapi-generate TEMPLATE=html
# doesn't work with asyncapi 3.0.0.
asyncapi-generate-python:
	$(MAKE) asyncapi-generate TEMPLATE=python-paho
# doesn't work with asyncapi 3.0.0.
asyncapi-generate-markdown:
	docker run --rm -it \
	   --user=root \
		 -v $(PWD)/.asyncapi-analytics:/root/.asyncapi-analytics \
	   -v $(PWD)/asyncapi2.yaml:/app/asyncapi.yml \
		 -v $(PWD)/asyncapi/markdown:/app/output/markdown \
		 asyncapi/cli generate fromTemplate -o /app/output/markdown /app/asyncapi.yml @asyncapi/markdown-template@1.2.1 --force-write

openapi-generator: kcl generated_dir openapi-generator-go openapi-generator-python  asyncapi-generate-html #asyncapi-generate-markdown openapi-generator-gdscript

