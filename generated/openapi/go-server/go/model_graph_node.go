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
	"time"
)



type GraphNode struct {

	// Identifies the event.
	Id string `json:"id"`

	Source string `json:"source"`

	// The version of the CloudEvents specification which the event uses.
	Specversion string `json:"specversion"`

	Type string `json:"type"`

	// Content type of the data value. Must adhere to RFC 2046 format.
	Datacontenttype string `json:"datacontenttype,omitempty"`

	// Identifies the schema that data adheres to.
	Dataschema string `json:"dataschema,omitempty"`

	// Describes the subject of the event in the context of the event producer (identified by source).
	Subject string `json:"subject,omitempty"`

	// Timestamp of when the occurrence happened. Must adhere to RFC 3339.
	Time time.Time `json:"time,omitempty"`

	Data GraphNodeAllOfData `json:"data,omitempty"`

	// Base64 encoded event payload. Must adhere to RFC4648.
	DataBase64 string `json:"data_base64,omitempty"`
}

// AssertGraphNodeRequired checks if the required fields are not zero-ed
func AssertGraphNodeRequired(obj GraphNode) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"source": obj.Source,
		"specversion": obj.Specversion,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertGraphNodeAllOfDataRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertGraphNodeConstraints checks if the values respects the defined constraints
func AssertGraphNodeConstraints(obj GraphNode) error {
	if err := AssertGraphNodeAllOfDataConstraints(obj.Data); err != nil {
		return err
	}
	return nil
}