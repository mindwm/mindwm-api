package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import MindWM._
import java.net.URI
import java.time.ZonedDateTime
import org.openapitools.models.AnyType
import org.openapitools.models.TmuxPaneIoDocument
import scala.collection.immutable.HashMap

/**
 * 
 * @param id Identifies the event.
 * @param source 
 * @param specversion The version of the CloudEvents specification which the event uses.
 * @param _type 
 * @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
 * @param dataschema Identifies the schema that data adheres to.
 * @param subject 
 * @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
 * @param data 
 * @param dataUnderscorebase64 Base64 encoded event payload. Must adhere to RFC4648.
 */
case class IoDocument(id: String,
                source: String,
                specversion: String,
                _type: String,
                datacontenttype: Option[String],
                dataschema: Option[URI],
                subject: Option[String],
                time: Option[ZonedDateTime],
                data: Option[TmuxPaneIoDocument],
                dataUnderscorebase64: Option[String]
                )

object IoDocument {
    /**
     * Creates the codec for converting IoDocument from and to JSON.
     */
    implicit val decoder: Decoder[IoDocument] = deriveDecoder
    implicit val encoder: ObjectEncoder[IoDocument] = deriveEncoder
}
