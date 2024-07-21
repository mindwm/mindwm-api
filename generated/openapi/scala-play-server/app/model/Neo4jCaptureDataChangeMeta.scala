package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Neo4jCaptureDataChange_meta.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-21T21:31:12.299262078Z[Etc/UTC]", comments = "Generator version: 7.7.0")
case class Neo4jCaptureDataChangeMeta(
  operation: String,
  source: Neo4jCaptureDataChangeMetaSource,
  timestamp: Int,
  txEventId: Int,
  txEventsCount: Int,
  txId: Int,
  username: String
)

object Neo4jCaptureDataChangeMeta {
  implicit lazy val neo4jCaptureDataChangeMetaJsonFormat: Format[Neo4jCaptureDataChangeMeta] = Json.format[Neo4jCaptureDataChangeMeta]
}

