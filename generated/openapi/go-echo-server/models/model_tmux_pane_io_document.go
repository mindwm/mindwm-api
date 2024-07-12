package models

type TmuxPaneIoDocument struct {

	// User input
	Input string `json:"input"`

	// Command output (mix of stdout & stderr)
	Output string `json:"output"`

	// ps1 (prompt) AFTER the input and output
	Ps1 string `json:"ps1"`
}
