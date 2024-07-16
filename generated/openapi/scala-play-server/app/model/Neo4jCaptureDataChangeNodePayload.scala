package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Neo4jCaptureDataChangeNodePayload.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-16T19:21:21.540878690Z[Etc/UTC]", comments = "Generator version: 7.7.0")
case class Neo4jCaptureDataChangeNodePayload(
  after: Neo4jCaptureDataChangeNodePayloadAfter,
  before: String,
  id: String,
  `type`: String
)

object Neo4jCaptureDataChangeNodePayload {
  implicit lazy val neo4jCaptureDataChangeNodePayloadJsonFormat: Format[Neo4jCaptureDataChangeNodePayload] = Json.format[Neo4jCaptureDataChangeNodePayload]
}

