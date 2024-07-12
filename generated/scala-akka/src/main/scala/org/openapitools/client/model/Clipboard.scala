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
package org.openapitools.client.model

import java.net.URI
import java.time.OffsetDateTime
import org.openapitools.client.core.ApiModel

case class Clipboard (
  `type`: Option[String] = None,
  source: Option[String] = None,
  data: Option[ClipboardPayload] = None,
  /* Identifies the event. */
  id: String,
  /* The version of the CloudEvents specification which the event uses. */
  specversion: String,
  /* Content type of the data value. Must adhere to RFC 2046 format. */
  datacontenttype: Option[String] = None,
  /* Identifies the schema that data adheres to. */
  dataschema: Option[URI] = None,
  /* Describes the subject of the event in the context of the event producer (identified by source). */
  subject: Option[String] = None,
  /* Timestamp of when the occurrence happened. Must adhere to RFC 3339. */
  time: Option[OffsetDateTime] = None,
  /* Base64 encoded event payload. Must adhere to RFC4648. */
  dataBase64: Option[String] = None
) extends ApiModel

