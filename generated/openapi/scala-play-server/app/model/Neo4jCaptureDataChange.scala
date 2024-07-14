package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Neo4jCaptureDataChange.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-14T12:13:56.862725603Z[Etc/UTC]", comments = "Generator version: 7.7.0")
case class Neo4jCaptureDataChange(
  headers: Map[String, OasAnyTypeNotMapped],
  messageKey: String,
  meta: Neo4jCaptureDataChangeMeta,
  offset: Int,
  partition: Int,
  sourceType: String,
  timestamp: OffsetDateTime,
  topic: String,
  schema: Neo4jCaptureDataChangeSchema,
  payload: Neo4jCaptureDataChangePayload
)

object Neo4jCaptureDataChange {
  implicit lazy val neo4jCaptureDataChangeJsonFormat: Format[Neo4jCaptureDataChange] = Json.format[Neo4jCaptureDataChange]
}

