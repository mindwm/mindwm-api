import yaml
import manifests
import file
import .mindwm_api as mindwmApi
import .util as util
import json_merge_patch as p


asyncapi = {
  asyncapi = mindwmApi.asyncapi.version
  info = {
    version = mindwmApi.version
    title = mindwmApi.asyncapi.title
    description = mindwmApi.asyncapi.description
    license = mindwmApi.license
  }
} 

asyncapi_definition = util.yaml_file_merge("asyncapi_base.yaml", asyncapi)


manifests.yaml_stream([p.merge(asyncapi_definition, { components.schemas = yaml.decode(file.read("schemas.yaml")) } )])
