/*
 * Mindwm API
 *
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * API version: 0.1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package MindWM

type Neo4jCaptureDataChangeNodePayloadAfter struct {

	Labels []string `json:"labels"`

	Properties map[string]interface{} `json:"properties"`
}
