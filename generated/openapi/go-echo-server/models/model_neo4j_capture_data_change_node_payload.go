package models

type Neo4jCaptureDataChangeNodePayload struct {

	After Neo4jCaptureDataChangeNodePayloadAfter `json:"after"`

	Before string `json:"before"`

	Id string `json:"id"`

	Type string `json:"type"`
}
