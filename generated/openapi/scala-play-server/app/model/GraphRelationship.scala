package model

import play.api.libs.json._
import java.net.URI
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for GraphRelationship.
  * @param id Identifies the event.
  * @param specversion The version of the CloudEvents specification which the event uses.
  * @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
  * @param dataschema Identifies the schema that data adheres to.
  * @param subject Describes the subject of the event in the context of the event producer (identified by source).
  * @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
  * @param dataBase64 Base64 encoded event payload. Must adhere to RFC4648.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-17T14:07:32.260026937Z[Etc/UTC]", comments = "Generator version: 7.7.0")
case class GraphRelationship(
  id: String,
  source: GraphRelationship.Source.Value,
  specversion: String,
  `type`: GraphRelationship.Type.Value,
  datacontenttype: Option[String],
  dataschema: Option[URI],
  subject: Option[String],
  time: Option[OffsetDateTime],
  data: Option[GraphRelationshipAllOfData],
  dataBase64: Option[String]
  additionalProperties: Map[String, OasAnyTypeNotMapped]
)

object GraphRelationship {
  implicit lazy val graphRelationshipJsonFormat: Format[GraphRelationship] = {
    val realJsonFormat = Json.format[GraphRelationship]
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
      Writes { graphRelationship =>
        val jsObj = realJsonFormat.writes(graphRelationship)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object Source extends Enumeration {
    val GraphRelationship = Value("graph.relationship")

    type Source = Value
    implicit lazy val SourceJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Created = Value("created")
    val Updated = Value("updated")
    val Deleted = Value("deleted")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

