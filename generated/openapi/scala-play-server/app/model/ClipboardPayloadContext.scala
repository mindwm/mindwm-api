package model

import play.api.libs.json._

/**
  * Selection context
  * @param window window id
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-17T16:10:01.566697796Z[Etc/UTC]", comments = "Generator version: 7.7.0")
case class ClipboardPayloadContext(
  window: Option[String]
)

object ClipboardPayloadContext {
  implicit lazy val clipboardPayloadContextJsonFormat: Format[ClipboardPayloadContext] = Json.format[ClipboardPayloadContext]
}

