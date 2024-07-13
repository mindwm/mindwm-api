=begin
Mindwm API

This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

The version of the OpenAPI document: 0.1.0
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class Neo4jCaptureDataChangeRelationshipPayloadEnd < ApplicationRecord
  validates_presence_of :id
  validates_presence_of :ids
  validates_presence_of :labels

  serialize :ids, Hash
  serialize :labels, Array
end
