PWD := $(shell pwd)
#OPENAPI_MINDWM_VERSION := $(shell cat openapi.yaml | yq '.info.version')
OPENAPI_MINDWM_VERSION := 0.1.0

PACKAGE_NAME := mindwm
GENERATED_DIR := "generated/$(PACKAGE_NAME)/$(OPENAPI_MINDWM_VERSION)"


.DEFAULT_GOAL=openapi-generator

# XXX
.PHONY: generated_dir
generated_dir:
	test -d $(GENERATED_DIR) || (mkdir -p $(GENERATED_DIR) && chmod a+rwx $(GENERATED_DIR))
	
kcl:
	kcl run ./mindwm_asyncapi > asyncapi.yaml
	kcl run ./mindwm_openapi > openapi.yaml

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
    		-i /local/openapi.yaml \
        -p packageName=$(PACKAGE_NAME) \
    		-g gdscript \
    		-o /local/$(GENERATED_DIR)/gdscript


	#cp ./openapi.yaml openapi-generator/modules
	#cd openapi-generator && \
	#./run-in-docker.sh generate -i modules/openapi.yaml  -g gdscript -o /gen/$(GENERATED_DIR)/gdscript-mindwm -p packageName=$(PACKAGE_NAME) && \
	#cp -vr $(GENERATED_DIR)/gdscript-mindwm/* ../$(GENERATED_DIR)/gdscript/

asyncapi-generate:
	docker run --rm -it \
	   --user=root \
		 -v $(PWD)/.asyncapi-analytics:/root/.asyncapi-analytics \
	   -v $(PWD)/asyncapi2.yaml:/app/asyncapi.yml \
		 -v $(PWD)/asyncapi/$(TEMPLATE):/app/output/$(TEMPLATE) \
	   asyncapi/cli generate fromTemplate -o /app/output/$(TEMPLATE) /app/asyncapi.yml @asyncapi/$(TEMPLATE)-template --force-write

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

