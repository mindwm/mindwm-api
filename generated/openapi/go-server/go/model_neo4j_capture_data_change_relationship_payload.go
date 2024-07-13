// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Mindwm API
 *
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * API version: 0.1.0
 */

package MindwWM




type Neo4jCaptureDataChangeRelationshipPayload struct {

	After map[string]interface{} `json:"after"`

	Before string `json:"before"`

	End Neo4jCaptureDataChangeRelationshipPayloadEnd `json:"end"`

	Id string `json:"id"`

	Label string `json:"label"`

	Start Neo4jCaptureDataChangeRelationshipPayloadEnd `json:"start"`

	Type string `json:"type"`
}

// AssertNeo4jCaptureDataChangeRelationshipPayloadRequired checks if the required fields are not zero-ed
func AssertNeo4jCaptureDataChangeRelationshipPayloadRequired(obj Neo4jCaptureDataChangeRelationshipPayload) error {
	elements := map[string]interface{}{
		"after": obj.After,
		"before": obj.Before,
		"end": obj.End,
		"id": obj.Id,
		"label": obj.Label,
		"start": obj.Start,
		"type": obj.Type,
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

// AssertNeo4jCaptureDataChangeRelationshipPayloadConstraints checks if the values respects the defined constraints
func AssertNeo4jCaptureDataChangeRelationshipPayloadConstraints(obj Neo4jCaptureDataChangeRelationshipPayload) error {
	if err := AssertNeo4jCaptureDataChangeRelationshipPayloadEndConstraints(obj.End); err != nil {
		return err
	}
	if err := AssertNeo4jCaptureDataChangeRelationshipPayloadEndConstraints(obj.Start); err != nil {
		return err
	}
	return nil
}
