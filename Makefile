PWD := $(shell pwd)
PACKAGE_NAME := mindwm
OPENAPI_MINDWM_VERSION := $(shell cat mindwm_openapi.yaml | yq '.info.version')

GENERATED_DIR := "generated/$(PACKAGE_NAME)/$(OPENAPI_MINDWM_VERSION)"


.DEFAULT_GOAL=openapi-generator

# XXX
.PHONY: generated_dir
generated_dir:
	test -d $(GENERATED_DIR) || (mkdir -p $(GENERATED_DIR) && chmod a+rwx $(GENERATED_DIR))

.PHONY: openapi-generator-docker
openapi-generator-docker:
	docker run --rm -v "$(PWD):/local" openapitools/openapi-generator-cli generate \
    		-i /local/mindwm_openapi.yaml \
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
	cp ./mindwm_openapi.yaml openapi-generator/modules
	cd openapi-generator && \
	./run-in-docker.sh generate -i modules/mindwm_openapi.yaml  -g gdscript -o /gen/$(GENERATED_DIR)/gdscript-mindwm -p packageName=$(PACKAGE_NAME) && \
	cp -vr out/gdscript-$(PACKAGE_NAME) ../$(GENERATED_DIR)/gdscript

openapi-generator: generated_dir openapi-generator-go openapi-generator-python openapi-generator-gdscript

