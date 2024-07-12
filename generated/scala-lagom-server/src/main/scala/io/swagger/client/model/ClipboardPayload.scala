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

case class ClipboardPayload (
            /* Starting position of clipboard selection [x,y] */
                  start: Option[Seq[Int]],
            /* Ending position of clipboard selection [x,y] */
                  stop: Option[Seq[Int]],
            /* Clipboard data */
                  data: Option[String],
                  `type`:  Option[ClipboardPayload&#x60;type&#x60;Enum.ClipboardPayload&#x60;type&#x60;Enum],
                  context: Option[ClipboardPayloadContext]
)

object ClipboardPayload {
implicit val format: Format[ClipboardPayload] = Json.format
}

object ClipboardPayload&#x60;type&#x60;Enum extends Enumeration {
  val   primary, secondary, clipboard = Value
  type ClipboardPayload&#x60;type&#x60;Enum = Value
  implicit val format: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[ClipboardPayload&#x60;type&#x60;Enum.type])
}
