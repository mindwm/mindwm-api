package models

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
