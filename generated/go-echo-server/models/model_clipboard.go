package models

import (
	"time"
)

type Clipboard struct {

	Type string `json:"type,omitempty"`

	Source string `json:"source,omitempty" validate:"regexp=[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\\\\\\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)$"`

	Data ClipboardPayload `json:"data,omitempty"`

	// Identifies the event.
	Id string `json:"id"`

	// The version of the CloudEvents specification which the event uses.
	Specversion string `json:"specversion"`

	// Content type of the data value. Must adhere to RFC 2046 format.
	Datacontenttype string `json:"datacontenttype,omitempty"`

	// Identifies the schema that data adheres to.
	Dataschema string `json:"dataschema,omitempty"`

	// Describes the subject of the event in the context of the event producer (identified by source).
	Subject string `json:"subject,omitempty"`

	// Timestamp of when the occurrence happened. Must adhere to RFC 3339.
	Time time.Time `json:"time,omitempty"`

	// Base64 encoded event payload. Must adhere to RFC4648.
	DataBase64 string `json:"data_base64,omitempty"`
}
