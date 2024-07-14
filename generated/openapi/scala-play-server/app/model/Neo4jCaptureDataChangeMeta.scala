package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Neo4jCaptureDataChange_meta.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-14T12:13:56.862725603Z[Etc/UTC]", comments = "Generator version: 7.7.0")
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

