package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Neo4jCaptureDataChangeRelationshipPayload.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-14T08:12:54.242416594Z[Etc/UTC]", comments = "Generator version: 7.7.0")
case class Neo4jCaptureDataChangeRelationshipPayload(
  after: JsObject,
  before: String,
  end: Neo4jCaptureDataChangeRelationshipPayloadEnd,
  id: String,
  label: String,
  start: Neo4jCaptureDataChangeRelationshipPayloadEnd,
  `type`: String
)

object Neo4jCaptureDataChangeRelationshipPayload {
  implicit lazy val neo4jCaptureDataChangeRelationshipPayloadJsonFormat: Format[Neo4jCaptureDataChangeRelationshipPayload] = Json.format[Neo4jCaptureDataChangeRelationshipPayload]
}

