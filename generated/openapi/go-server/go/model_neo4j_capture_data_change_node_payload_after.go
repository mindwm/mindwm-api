// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Mindwm API
 *
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * API version: 0.1.0
 */

package MindwWM




type Neo4jCaptureDataChangeNodePayloadAfter struct {

	Labels []string `json:"labels"`

	Properties map[string]interface{} `json:"properties"`
}

// AssertNeo4jCaptureDataChangeNodePayloadAfterRequired checks if the required fields are not zero-ed
func AssertNeo4jCaptureDataChangeNodePayloadAfterRequired(obj Neo4jCaptureDataChangeNodePayloadAfter) error {
	elements := map[string]interface{}{
		"labels": obj.Labels,
		"properties": obj.Properties,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertNeo4jCaptureDataChangeNodePayloadAfterConstraints checks if the values respects the defined constraints
func AssertNeo4jCaptureDataChangeNodePayloadAfterConstraints(obj Neo4jCaptureDataChangeNodePayloadAfter) error {
	return nil
}
