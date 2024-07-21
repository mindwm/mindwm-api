package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Neo4jCaptureDataChangeRelationshipPayload_end.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-21T21:31:12.299262078Z[Etc/UTC]", comments = "Generator version: 7.7.0")
case class Neo4jCaptureDataChangeRelationshipPayloadEnd(
  id: String,
  ids: Map[String, OasAnyTypeNotMapped],
  labels: List[String]
)

object Neo4jCaptureDataChangeRelationshipPayloadEnd {
  implicit lazy val neo4jCaptureDataChangeRelationshipPayloadEndJsonFormat: Format[Neo4jCaptureDataChangeRelationshipPayloadEnd] = Json.format[Neo4jCaptureDataChangeRelationshipPayloadEnd]
}

