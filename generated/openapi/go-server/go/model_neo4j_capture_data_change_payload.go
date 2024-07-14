// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Mindwm API
 *
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * API version: 0.1.0
 */

package MindwWM


import (
	"gopkg.in/validator.v2"
)



type Neo4jCaptureDataChangePayload struct {

	After map[string]interface{} `json:"after"`

	Before string `json:"before"`

	Id string `json:"id"`

	Type string `json:"type"`

	End Neo4jCaptureDataChangeRelationshipPayloadEnd `json:"end"`

	Label string `json:"label"`

	Start Neo4jCaptureDataChangeRelationshipPayloadEnd `json:"start"`
}

// AssertNeo4jCaptureDataChangePayloadRequired checks if the required fields are not zero-ed
func AssertNeo4jCaptureDataChangePayloadRequired(obj Neo4jCaptureDataChangePayload) error {
	elements := map[string]interface{}{
		"after": obj.After,
		"before": obj.Before,
		"id": obj.Id,
		"type": obj.Type,
		"end": obj.End,
		"label": obj.Label,
		"start": obj.Start,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertNeo4jCaptureDataChangeRelationshipPayloadEndRequired(obj.End); err != nil {
		return err
	}
	if err := AssertNeo4jCaptureDataChangeRelationshipPayloadEndRequired(obj.Start); err != nil {
		return err
	}
	return nil
}

// AssertNeo4jCaptureDataChangePayloadConstraints checks if the values respects the defined constraints
func AssertNeo4jCaptureDataChangePayloadConstraints(obj Neo4jCaptureDataChangePayload) error {
	if err := AssertNeo4jCaptureDataChangeRelationshipPayloadEndConstraints(obj.End); err != nil {
		return err
	}
	if err := AssertNeo4jCaptureDataChangeRelationshipPayloadEndConstraints(obj.Start); err != nil {
		return err
	}
	return nil
}