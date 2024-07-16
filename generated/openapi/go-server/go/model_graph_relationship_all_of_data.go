// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Mindwm API
 *
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * API version: 0.1.0
 */

package MindWM


import (
	"time"
)



type GraphRelationshipAllOfData struct {

	Headers map[string]interface{} `json:"headers"`

	MessageKey string `json:"message_key"`

	Meta Neo4jCaptureDataChangeMeta `json:"meta"`

	Offset int32 `json:"offset"`

	Partition int32 `json:"partition"`

	SourceType string `json:"source_type"`

	Timestamp time.Time `json:"timestamp"`

	Topic string `json:"topic"`

	Schema Neo4jCaptureDataChangeSchema `json:"schema"`

	Payload Neo4jCaptureDataChangeRelationshipPayload `json:"payload"`
}

// AssertGraphRelationshipAllOfDataRequired checks if the required fields are not zero-ed
func AssertGraphRelationshipAllOfDataRequired(obj GraphRelationshipAllOfData) error {
	elements := map[string]interface{}{
		"headers": obj.Headers,
		"message_key": obj.MessageKey,
		"meta": obj.Meta,
		"offset": obj.Offset,
		"partition": obj.Partition,
		"source_type": obj.SourceType,
		"timestamp": obj.Timestamp,
		"topic": obj.Topic,
		"schema": obj.Schema,
		"payload": obj.Payload,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertNeo4jCaptureDataChangeMetaRequired(obj.Meta); err != nil {
		return err
	}
	if err := AssertNeo4jCaptureDataChangeSchemaRequired(obj.Schema); err != nil {
		return err
	}
	if err := AssertNeo4jCaptureDataChangeRelationshipPayloadRequired(obj.Payload); err != nil {
		return err
	}
	return nil
}

// AssertGraphRelationshipAllOfDataConstraints checks if the values respects the defined constraints
func AssertGraphRelationshipAllOfDataConstraints(obj GraphRelationshipAllOfData) error {
	if err := AssertNeo4jCaptureDataChangeMetaConstraints(obj.Meta); err != nil {
		return err
	}
	if err := AssertNeo4jCaptureDataChangeSchemaConstraints(obj.Schema); err != nil {
		return err
	}
	if err := AssertNeo4jCaptureDataChangeRelationshipPayloadConstraints(obj.Payload); err != nil {
		return err
	}
	return nil
}
