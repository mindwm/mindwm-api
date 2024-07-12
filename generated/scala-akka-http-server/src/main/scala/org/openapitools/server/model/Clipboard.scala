package org.openapitools.server.model

import java.net.URI
import java.time.OffsetDateTime

/**
 * @param `type`  for example: ''null''
 * @param source  for example: ''null''
 * @param data  for example: ''null''
 * @param id Identifies the event. for example: ''null''
 * @param specversion The version of the CloudEvents specification which the event uses. for example: ''null''
 * @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format. for example: ''null''
 * @param dataschema Identifies the schema that data adheres to. for example: ''null''
 * @param subject Describes the subject of the event in the context of the event producer (identified by source). for example: ''null''
 * @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339. for example: ''null''
 * @param dataBase64 Base64 encoded event payload. Must adhere to RFC4648. for example: ''null''
*/
final case class Clipboard (
  `type`: Option[String] = None,
  source: Option[String] = None,
  data: Option[ClipboardPayload] = None,
  id: String,
  specversion: String,
  datacontenttype: Option[String] = None,
  dataschema: Option[URI] = None,
  subject: Option[String] = None,
  time: Option[OffsetDateTime] = None,
  dataBase64: Option[String] = None
)

