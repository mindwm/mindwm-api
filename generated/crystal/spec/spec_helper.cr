# #Mindwm API
#
##This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
#
#The version of the OpenAPI document: 0.1.0
#
#Generated by: https://openapi-generator.tech
#Generator version: 7.7.0
#

# load modules
require "spec"
require "json"
require "../src/openapi_client"

def assert_compilation_error(path : String, message : String) : Nil
  buffer = IO::Memory.new
  result = Process.run("crystal", ["run", "--no-color", "--no-codegen", path], error: buffer)
  result.success?.should be_false
  buffer.to_s.should contain message
  buffer.close
end
