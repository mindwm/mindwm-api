package model

import play.api.libs.json._
import java.net.URI
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for GraphNode.
  * @param id Identifies the event.
  * @param specversion The version of the CloudEvents specification which the event uses.
  * @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
  * @param dataschema Identifies the schema that data adheres to.
  * @param subject Describes the subject of the event in the context of the event producer (identified by source).
  * @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
  * @param dataBase64 Base64 encoded event payload. Must adhere to RFC4648.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-16T18:20:14.122957721Z[Etc/UTC]", comments = "Generator version: 7.7.0")
case class GraphNode(
  id: String,
  source: GraphNode.Source.Value,
  specversion: String,
  `type`: GraphNode.Type.Value,
  datacontenttype: Option[String],
  dataschema: Option[URI],
  subject: Option[String],
  time: Option[OffsetDateTime],
  data: Option[GraphNodeAllOfData],
  dataBase64: Option[String]
  additionalProperties: Map[String, OasAnyTypeNotMapped]
)

object GraphNode {
  implicit lazy val graphNodeJsonFormat: Format[GraphNode] = {
    val realJsonFormat = Json.format[GraphNode]
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
      Writes { graphNode =>
        val jsObj = realJsonFormat.writes(graphNode)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object Source extends Enumeration {
    val Node = Value("graph.node")
    val Relationship = Value("graph.relationship")

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

