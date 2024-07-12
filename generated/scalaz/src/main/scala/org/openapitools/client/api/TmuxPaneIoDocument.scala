package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.util.HashMap

import TmuxPaneIoDocument._

case class TmuxPaneIoDocument (
  /* User input */
  input: String,
/* Command output (mix of stdout & stderr) */
  output: String,
/* ps1 (prompt) AFTER the input and output */
  ps1: String)

object TmuxPaneIoDocument {
  import DateTimeCodecs._

  implicit val TmuxPaneIoDocumentCodecJson: CodecJson[TmuxPaneIoDocument] = CodecJson.derive[TmuxPaneIoDocument]
  implicit val TmuxPaneIoDocumentDecoder: EntityDecoder[TmuxPaneIoDocument] = jsonOf[TmuxPaneIoDocument]
  implicit val TmuxPaneIoDocumentEncoder: EntityEncoder[TmuxPaneIoDocument] = jsonEncoderOf[TmuxPaneIoDocument]
}
