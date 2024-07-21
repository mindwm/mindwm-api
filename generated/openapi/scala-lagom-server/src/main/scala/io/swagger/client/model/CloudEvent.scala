/**
 * Mindwm API
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.swagger.client.model
import play.api.libs.json._
import java.net.URI
import java.time.OffsetDateTime

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
            /* The event payload. */
                  data: Option[Any],
            /* Base64 encoded event payload. Must adhere to RFC4648. */
                  dataBase64: Option[String]
)

object CloudEvent {
implicit val format: Format[CloudEvent] = Json.format
}

