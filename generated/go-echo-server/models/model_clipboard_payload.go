package models

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
