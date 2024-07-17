package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TmuxPaneIoDocument.
  * @param input User input
  * @param output Command output (mix of stdout & stderr)
  * @param ps1 ps1 (prompt) AFTER the input and output
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-17T16:10:01.566697796Z[Etc/UTC]", comments = "Generator version: 7.7.0")
case class TmuxPaneIoDocument(
  input: String,
  output: String,
  ps1: String
  additionalProperties: Map[String, OasAnyTypeNotMapped]
)

object TmuxPaneIoDocument {
  implicit lazy val tmuxPaneIoDocumentJsonFormat: Format[TmuxPaneIoDocument] = {
    val realJsonFormat = Json.format[TmuxPaneIoDocument]
    val declaredPropNames = Set("input", "output", "ps1")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { tmuxPaneIoDocument =>
        val jsObj = realJsonFormat.writes(tmuxPaneIoDocument)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

