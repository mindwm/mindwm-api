package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI
import java.time.OffsetDateTime

import CloudEvent._

case class CloudEvent (
  /* Identifies the event. */
  id: String,
/* Identifies the context in which an event happened. */
  source: String,
/* The version of the CloudEvents specification which the event uses. */
  specversion: String,
/* Describes the type of event related to the originating occurrence. */
  `type`: String,
/* Content type of the data value. Must adhere to RFC 2046 format. */
  datacontenttype: Option[String],
/* Identifies the schema that data adheres to. */
  dataschema: Option[URI],
/* Describes the subject of the event in the context of the event producer (identified by source). */
  subject: Option[String],
/* Timestamp of when the occurrence happened. Must adhere to RFC 3339. */
  time: Option[OffsetDateTime],
data: Option[CloudEventData],
/* Base64 encoded event payload. Must adhere to RFC4648. */
  dataBase64: Option[String])

object CloudEvent {
  import DateTimeCodecs._

  implicit val CloudEventCodecJson: CodecJson[CloudEvent] = CodecJson.derive[CloudEvent]
  implicit val CloudEventDecoder: EntityDecoder[CloudEvent] = jsonOf[CloudEvent]
  implicit val CloudEventEncoder: EntityEncoder[CloudEvent] = jsonEncoderOf[CloudEvent]
}
