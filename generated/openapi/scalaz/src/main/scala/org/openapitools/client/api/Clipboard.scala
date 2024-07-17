package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI
import java.time.OffsetDateTime
import java.util.HashMap

import Clipboard._

case class Clipboard (
  /* Identifies the event. */
  id: String,
source: String,
/* The version of the CloudEvents specification which the event uses. */
  specversion: String,
`type`: String,
/* Content type of the data value. Must adhere to RFC 2046 format. */
  datacontenttype: Option[String],
/* Identifies the schema that data adheres to. */
  dataschema: Option[URI],
subject: Option[String],
/* Timestamp of when the occurrence happened. Must adhere to RFC 3339. */
  time: Option[OffsetDateTime],
data: Option[ClipboardPayload],
/* Base64 encoded event payload. Must adhere to RFC4648. */
  dataBase64: Option[String])

object Clipboard {
  import DateTimeCodecs._

  implicit val ClipboardCodecJson: CodecJson[Clipboard] = CodecJson.derive[Clipboard]
  implicit val ClipboardDecoder: EntityDecoder[Clipboard] = jsonOf[Clipboard]
  implicit val ClipboardEncoder: EntityEncoder[Clipboard] = jsonEncoderOf[Clipboard]
}
