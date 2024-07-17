package model

import play.api.libs.json._

/**
  * Selection context
  * @param window window id
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-17T14:07:32.260026937Z[Etc/UTC]", comments = "Generator version: 7.7.0")
case class ClipboardPayloadContext(
  window: Option[String]
)

object ClipboardPayloadContext {
  implicit lazy val clipboardPayloadContextJsonFormat: Format[ClipboardPayloadContext] = Json.format[ClipboardPayloadContext]
}

