package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import MindWM._
import java.net.URI
import java.time.ZonedDateTime

/**
 * CloudEvents Specification JSON Schema
 * @param id Identifies the event.
 * @param source Identifies the context in which an event happened.
 * @param specversion The version of the CloudEvents specification which the event uses.
 * @param _type Describes the type of event related to the originating occurrence.
 * @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
 * @param dataschema Identifies the schema that data adheres to.
 * @param subject Describes the subject of the event in the context of the event producer (identified by source).
 * @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
 * @param data The event payload.
 * @param dataUnderscorebase64 Base64 encoded event payload. Must adhere to RFC4648.
 */
case class CloudEvent(id: String,
                source: String,
                specversion: String,
                _type: String,
                datacontenttype: Option[String],
                dataschema: Option[URI],
                subject: Option[String],
                time: Option[ZonedDateTime],
                data: Option[Object],
                dataUnderscorebase64: Option[String]
                )

object CloudEvent {
    /**
     * Creates the codec for converting CloudEvent from and to JSON.
     */
    implicit val decoder: Decoder[CloudEvent] = deriveDecoder
    implicit val encoder: ObjectEncoder[CloudEvent] = deriveEncoder
}
