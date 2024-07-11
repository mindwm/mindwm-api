import yaml
import manifests
import file
import .mindwm_api as mindwmApi
import .util as util
import json_merge_patch as p


openapi = {
  openapi = mindwmApi.openapi.version
  info = {
    version = mindwmApi.version
    title = mindwmApi.openapi.title
    description = mindwmApi.openapi.description
    license = mindwmApi.license
  }
} 

openapi_definition = util.yaml_file_merge("openapi_base.yaml", openapi)


manifests.yaml_stream([p.merge(openapi_definition, { components.schemas = yaml.decode(file.read("schemas.yaml")) } )])
