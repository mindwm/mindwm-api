/*
 * Mindwm API
 *
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * API version: 0.1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package MindWM

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
