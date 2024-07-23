import yaml
import manifests
import file
import .mindwm_api as mindwmApi
import .util as util
import json_merge_patch as p

if file.read_env("GDSCRIPT_WORKAROUND"):
  _paths = {
    paths = {
      "/" = {}
    } 
  }
  _cloudevent_jsonschema = "./cloudevents_gdscript.yaml"
else:
  _paths = {}
  _cloudevent_jsonschema = "./cloudevents.yaml"

openapi = p.merge({
  openapi = mindwmApi.openapi.version
  info = {
    version = mindwmApi.version
    title = mindwmApi.openapi.title
    description = mindwmApi.openapi.description
    license = mindwmApi.license
  }
}, _paths)

openapi_definition = util.yaml_file_merge("openapi_base.yaml", openapi)

schemas = p.merge(yaml.decode(file.read("schemas.yaml")), {
  CloudEvent = {
    "$ref" = _cloudevent_jsonschema
  }
})

manifests.yaml_stream([p.merge(openapi_definition, { components.schemas = schemas } )])
