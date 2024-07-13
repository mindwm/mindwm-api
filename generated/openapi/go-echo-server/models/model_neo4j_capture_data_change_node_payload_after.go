package models

type Neo4jCaptureDataChangeNodePayloadAfter struct {

	Labels []string `json:"labels"`

	Properties map[string]interface{} `json:"properties"`
}
