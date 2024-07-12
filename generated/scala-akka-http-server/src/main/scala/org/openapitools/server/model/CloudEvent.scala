package org.openapitools.server.model

import java.net.URI
import java.time.OffsetDateTime

/**
 * CloudEvents Specification JSON Schema
 *
 * @param id Identifies the event. for example: ''null''
 * @param source Identifies the context in which an event happened. for example: ''null''
 * @param specversion The version of the CloudEvents specification which the event uses. for example: ''null''
 * @param `type` Describes the type of event related to the originating occurrence. for example: ''null''
 * @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format. for example: ''null''
 * @param dataschema Identifies the schema that data adheres to. for example: ''null''
 * @param subject Describes the subject of the event in the context of the event producer (identified by source). for example: ''null''
 * @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339. for example: ''null''
 * @param data  for example: ''null''
 * @param dataBase64 Base64 encoded event payload. Must adhere to RFC4648. for example: ''null''
*/
final case class CloudEvent (
  id: String,
  source: String,
  specversion: String,
  `type`: String,
  datacontenttype: Option[String] = None,
  dataschema: Option[URI] = None,
  subject: Option[String] = None,
  time: Option[OffsetDateTime] = None,
  data: Option[CloudEventData] = None,
  dataBase64: Option[String] = None
)

