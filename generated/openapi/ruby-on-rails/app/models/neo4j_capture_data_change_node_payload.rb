=begin
Mindwm API

This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

The version of the OpenAPI document: 0.1.0
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class Neo4jCaptureDataChangeNodePayload < ApplicationRecord
  validates_presence_of :after
  validates_presence_of :before
  validates_presence_of :id
  validates_presence_of :type

end
