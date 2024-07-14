/*
 * Mindwm API
 *
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * API version: 0.1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package MindwWM

type Neo4jCaptureDataChangeRelationshipPayloadEnd struct {

	Id string `json:"id"`

	Ids map[string]interface{} `json:"ids"`

	Labels []string `json:"labels"`
}