package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Neo4jCaptureDataChange_payload.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-14T08:12:54.242416594Z[Etc/UTC]", comments = "Generator version: 7.7.0")
case class Neo4jCaptureDataChangePayload(
  after: JsObject,
  before: String,
  id: String,
  `type`: String,
  end: Neo4jCaptureDataChangeRelationshipPayloadEnd,
  label: String,
  start: Neo4jCaptureDataChangeRelationshipPayloadEnd
  additionalProperties: 
)

object Neo4jCaptureDataChangePayload {
  implicit lazy val neo4jCaptureDataChangePayloadJsonFormat: Format[Neo4jCaptureDataChangePayload] = {
    val realJsonFormat = Json.format[Neo4jCaptureDataChangePayload]
    val declaredPropNames = Set("after", "before", "id", "`type`", "end", "label", "start")
    
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
      Writes { neo4jCaptureDataChangePayload =>
        val jsObj = realJsonFormat.writes(neo4jCaptureDataChangePayload)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

