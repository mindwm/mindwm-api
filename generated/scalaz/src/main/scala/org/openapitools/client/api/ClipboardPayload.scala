package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ClipboardPayload._

case class ClipboardPayload (
  /* Starting position of clipboard selection [x,y] */
  start: Option[List[Integer]],
/* Ending position of clipboard selection [x,y] */
  stop: Option[List[Integer]],
/* Clipboard data */
  data: Option[String],
/* Clipboard type */
  `type`: Option[`Type`],
context: Option[ClipboardPayloadContext])

object ClipboardPayload {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Primary extends `Type`
  case object Secondary extends `Type`
  case object Clipboard extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Primary" => Some(Primary)
      case "Secondary" => Some(Secondary)
      case "Clipboard" => Some(Clipboard)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Primary => "Primary"
      case Secondary => "Secondary"
      case Clipboard => "Clipboard"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val ClipboardPayloadCodecJson: CodecJson[ClipboardPayload] = CodecJson.derive[ClipboardPayload]
  implicit val ClipboardPayloadDecoder: EntityDecoder[ClipboardPayload] = jsonOf[ClipboardPayload]
  implicit val ClipboardPayloadEncoder: EntityEncoder[ClipboardPayload] = jsonEncoderOf[ClipboardPayload]
}
