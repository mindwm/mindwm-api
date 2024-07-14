<?php

/**
 * Mindwm API
 * PHP version 7.4
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 * The version of the OpenAPI document: 0.1.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 */
namespace OpenAPIServer\Model;

use OpenAPIServer\BaseModel;

/**
 * Neo4jCaptureDataChange
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class Neo4jCaptureDataChange extends BaseModel
{
    /**
     * @var string Models namespace.
     * Can be required for data deserialization when model contains referenced schemas.
     */
    protected const MODELS_NAMESPACE = '\OpenAPIServer\Model';

    /**
     * @var string Constant with OAS schema of current class.
     * Should be overwritten by inherited class.
     */
    protected const MODEL_SCHEMA = <<<'SCHEMA'
{
  "required" : [ "headers", "message_key", "meta", "offset", "partition", "payload", "schema", "source_type", "timestamp", "topic" ],
  "properties" : {
    "headers" : {
      "additionalProperties" : { }
    },
    "message_key" : {
      "type" : "string"
    },
    "meta" : {
      "$ref" : "#/components/schemas/Neo4jCaptureDataChange_meta"
    },
    "offset" : {
      "type" : "integer"
    },
    "partition" : {
      "type" : "integer"
    },
    "source_type" : {
      "type" : "string"
    },
    "timestamp" : {
      "type" : "string",
      "format" : "date-time"
    },
    "topic" : {
      "type" : "string"
    },
    "schema" : {
      "$ref" : "#/components/schemas/Neo4jCaptureDataChange_schema"
    },
    "payload" : {
      "$ref" : "#/components/schemas/Neo4jCaptureDataChange_payload"
    }
  }
}
SCHEMA;
}