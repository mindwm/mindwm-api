package models

import (
	"time"
)

type IoDocument struct {

	Type string `json:"type,omitempty"`

	Source string `json:"source,omitempty" validate:"regexp=[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\\\\\\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)\\\\\\\\.tmux\\\\\\\\.[A-Za-z0-9+\\/]*={0,2}\\\\.[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}\\\\\\\\.[0-9]+?\\\\\\\\.[0-9]+?\\\\\\\\.tiodocument$"`

	Data TmuxPaneIoDocument `json:"data,omitempty"`

	// Identifies the event.
	Id string `json:"id"`

	// The version of the CloudEvents specification which the event uses.
	Specversion string `json:"specversion"`

	// Content type of the data value. Must adhere to RFC 2046 format.
	Datacontenttype string `json:"datacontenttype,omitempty"`

	// Identifies the schema that data adheres to.
	Dataschema string `json:"dataschema,omitempty"`

	Subject string `json:"subject,omitempty"`

	// Timestamp of when the occurrence happened. Must adhere to RFC 3339.
	Time time.Time `json:"time,omitempty"`

	// Base64 encoded event payload. Must adhere to RFC4648.
	DataBase64 string `json:"data_base64,omitempty"`
}
