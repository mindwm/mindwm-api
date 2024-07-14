package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ClipboardPayload.
  * @param start Starting position of clipboard selection [x,y]
  * @param stop Ending position of clipboard selection [x,y]
  * @param data Clipboard data
  * @param `type` Clipboard type
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-14T12:13:56.862725603Z[Etc/UTC]", comments = "Generator version: 7.7.0")
case class ClipboardPayload(
  start: Option[List[Int]],
  stop: Option[List[Int]],
  data: Option[String],
  `type`: Option[ClipboardPayload.Type.Value],
  context: Option[ClipboardPayloadContext]
)

object ClipboardPayload {
  implicit lazy val clipboardPayloadJsonFormat: Format[ClipboardPayload] = Json.format[ClipboardPayload]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Primary = Value("primary")
    val Secondary = Value("secondary")
    val Clipboard = Value("clipboard")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

