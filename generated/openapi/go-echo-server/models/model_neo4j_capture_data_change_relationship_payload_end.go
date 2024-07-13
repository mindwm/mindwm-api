package models

type Neo4jCaptureDataChangeRelationshipPayloadEnd struct {

	Id string `json:"id"`

	Ids map[string]interface{} `json:"ids"`

	Labels []string `json:"labels"`
}
