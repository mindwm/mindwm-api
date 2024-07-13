package models

type Neo4jCaptureDataChangeSchema struct {

	Constraints map[string]interface{} `json:"constraints,omitempty"`

	Properties map[string]interface{} `json:"properties,omitempty"`
}
