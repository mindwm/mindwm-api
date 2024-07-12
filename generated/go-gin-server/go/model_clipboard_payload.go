/*
 * Mindwm API
 *
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * API version: 0.1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package MindwWM

type ClipboardPayload struct {

	// Starting position of clipboard selection [x,y]
	Start []int32 `json:"start,omitempty"`

	// Ending position of clipboard selection [x,y]
	Stop []int32 `json:"stop,omitempty"`

	// Clipboard data
	Data string `json:"data,omitempty"`

	// Clipboard type
	Type string `json:"type,omitempty"`

	Context ClipboardPayloadContext `json:"context,omitempty"`
}
