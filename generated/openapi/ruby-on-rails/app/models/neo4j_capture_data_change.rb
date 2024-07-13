=begin
Mindwm API

This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

The version of the OpenAPI document: 0.1.0
Generated by: https://github.com/openapitools/openapi-generator.git

=end


class Neo4jCaptureDataChange < ApplicationRecord
  validates_presence_of :headers
  validates_presence_of :message_key
  validates_presence_of :meta
  validates_presence_of :offset
  validates_presence_of :partition
  validates_presence_of :source_type
  validates_presence_of :timestamp
  validates_presence_of :topic
  validates_presence_of :schema
  validates_presence_of :payload

  serialize :headers, Hash
end
