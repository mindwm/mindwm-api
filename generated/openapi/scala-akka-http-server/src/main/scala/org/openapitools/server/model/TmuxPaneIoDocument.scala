package org.openapitools.server.model


/**
 * @param input User input for example: ''null''
 * @param output Command output (mix of stdout & stderr) for example: ''null''
 * @param ps1 ps1 (prompt) AFTER the input and output for example: ''null''
*/
final case class TmuxPaneIoDocument (
  input: String,
  output: String,
  ps1: String
)

