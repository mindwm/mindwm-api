package models

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
