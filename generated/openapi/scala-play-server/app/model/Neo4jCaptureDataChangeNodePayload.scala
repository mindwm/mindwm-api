package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Neo4jCaptureDataChangeNodePayload.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-17T14:07:32.260026937Z[Etc/UTC]", comments = "Generator version: 7.7.0")
case class Neo4jCaptureDataChangeNodePayload(
  after: Neo4jCaptureDataChangeNodePayloadAfter,
  before: String,
  id: String,
  `type`: String
)

object Neo4jCaptureDataChangeNodePayload {
  implicit lazy val neo4jCaptureDataChangeNodePayloadJsonFormat: Format[Neo4jCaptureDataChangeNodePayload] = Json.format[Neo4jCaptureDataChangeNodePayload]
}

