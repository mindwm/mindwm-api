package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ClipboardPayloadContext._

case class ClipboardPayloadContext (
  /* window id */
  window: Option[String])

object ClipboardPayloadContext {
  import DateTimeCodecs._

  implicit val ClipboardPayloadContextCodecJson: CodecJson[ClipboardPayloadContext] = CodecJson.derive[ClipboardPayloadContext]
  implicit val ClipboardPayloadContextDecoder: EntityDecoder[ClipboardPayloadContext] = jsonOf[ClipboardPayloadContext]
  implicit val ClipboardPayloadContextEncoder: EntityEncoder[ClipboardPayloadContext] = jsonEncoderOf[ClipboardPayloadContext]
}
