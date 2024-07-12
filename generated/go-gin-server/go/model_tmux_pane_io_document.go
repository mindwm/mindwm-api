/*
 * Mindwm API
 *
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * API version: 0.1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package MindwWM

type TmuxPaneIoDocument struct {

	// User input
	Input string `json:"input"`

	// Command output (mix of stdout & stderr)
	Output string `json:"output"`

	// ps1 (prompt) AFTER the input and output
	Ps1 string `json:"ps1"`
}
