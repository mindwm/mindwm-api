package models

import (
	"time"
)

// CloudEvent - CloudEvents Specification JSON Schema
type CloudEvent struct {

	// Identifies the event.
	Id string `json:"id"`

	// Identifies the context in which an event happened.
	Source string `json:"source"`

	// The version of the CloudEvents specification which the event uses.
	Specversion string `json:"specversion"`

	// Describes the type of event related to the originating occurrence.
	Type string `json:"type"`

	// Content type of the data value. Must adhere to RFC 2046 format.
	Datacontenttype string `json:"datacontenttype,omitempty"`

	// Identifies the schema that data adheres to.
	Dataschema string `json:"dataschema,omitempty"`

	// Describes the subject of the event in the context of the event producer (identified by source).
	Subject string `json:"subject,omitempty"`

	// Timestamp of when the occurrence happened. Must adhere to RFC 3339.
	Time time.Time `json:"time,omitempty"`

	// The event payload.
	Data map[string]interface{} `json:"data,omitempty"`

	// Base64 encoded event payload. Must adhere to RFC4648.
	DataBase64 string `json:"data_base64,omitempty"`
}
