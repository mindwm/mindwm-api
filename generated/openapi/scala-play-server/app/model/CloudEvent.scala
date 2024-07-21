package model

import play.api.libs.json._
import java.net.URI
import java.time.OffsetDateTime

/**
  * CloudEvents Specification JSON Schema
  * @param id Identifies the event.
  * @param source Identifies the context in which an event happened.
  * @param specversion The version of the CloudEvents specification which the event uses.
  * @param `type` Describes the type of event related to the originating occurrence.
  * @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
  * @param dataschema Identifies the schema that data adheres to.
  * @param subject Describes the subject of the event in the context of the event producer (identified by source).
  * @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
  * @param data The event payload.
  * @param dataBase64 Base64 encoded event payload. Must adhere to RFC4648.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-21T21:31:12.299262078Z[Etc/UTC]", comments = "Generator version: 7.7.0")
case class CloudEvent(
  id: String,
  source: String,
  specversion: String,
  `type`: String,
  datacontenttype: Option[String],
  dataschema: Option[URI],
  subject: Option[String],
  time: Option[OffsetDateTime],
  data: Option[JsObject],
  dataBase64: Option[String]
)

object CloudEvent {
  implicit lazy val cloudEventJsonFormat: Format[CloudEvent] = Json.format[CloudEvent]
}

