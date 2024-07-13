package models

type Neo4jCaptureDataChangeRelationshipPayload struct {

	After map[string]interface{} `json:"after"`

	Before string `json:"before"`

	End Neo4jCaptureDataChangeRelationshipPayloadEnd `json:"end"`

	Id string `json:"id"`

	Label string `json:"label"`

	Start Neo4jCaptureDataChangeRelationshipPayloadEnd `json:"start"`

	Type string `json:"type"`
}
