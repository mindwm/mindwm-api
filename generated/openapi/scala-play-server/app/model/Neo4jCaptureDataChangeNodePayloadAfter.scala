package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Neo4jCaptureDataChangeNodePayload_after.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-16T18:20:14.122957721Z[Etc/UTC]", comments = "Generator version: 7.7.0")
case class Neo4jCaptureDataChangeNodePayloadAfter(
  labels: List[String],
  properties: Map[String, OasAnyTypeNotMapped],
)

object Neo4jCaptureDataChangeNodePayloadAfter {
  implicit lazy val neo4jCaptureDataChangeNodePayloadAfterJsonFormat: Format[Neo4jCaptureDataChangeNodePayloadAfter] = Json.format[Neo4jCaptureDataChangeNodePayloadAfter]
}

