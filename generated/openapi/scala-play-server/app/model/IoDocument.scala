package model

import play.api.libs.json._
import java.net.URI
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for IoDocument.
  * @param id Identifies the event.
  * @param specversion The version of the CloudEvents specification which the event uses.
  * @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
  * @param dataschema Identifies the schema that data adheres to.
  * @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
  * @param dataBase64 Base64 encoded event payload. Must adhere to RFC4648.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-21T21:31:12.299262078Z[Etc/UTC]", comments = "Generator version: 7.7.0")
case class IoDocument(
  id: String,
  source: String,
  specversion: String,
  `type`: String,
  datacontenttype: Option[String],
  dataschema: Option[URI],
  subject: Option[String],
  time: Option[OffsetDateTime],
  data: Option[TmuxPaneIoDocument],
  dataBase64: Option[String]
  additionalProperties: Map[String, OasAnyTypeNotMapped]
)

object IoDocument {
  implicit lazy val ioDocumentJsonFormat: Format[IoDocument] = {
    val realJsonFormat = Json.format[IoDocument]
    val declaredPropNames = Set("id", "source", "specversion", "`type`", "datacontenttype", "dataschema", "subject", "time", "data", "dataBase64")
    
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
      Writes { ioDocument =>
        val jsObj = realJsonFormat.writes(ioDocument)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

