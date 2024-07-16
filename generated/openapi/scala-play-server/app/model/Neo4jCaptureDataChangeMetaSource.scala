package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Neo4jCaptureDataChange_meta_source.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-16T19:21:21.540878690Z[Etc/UTC]", comments = "Generator version: 7.7.0")
case class Neo4jCaptureDataChangeMetaSource(
  hostname: String
)

object Neo4jCaptureDataChangeMetaSource {
  implicit lazy val neo4jCaptureDataChangeMetaSourceJsonFormat: Format[Neo4jCaptureDataChangeMetaSource] = Json.format[Neo4jCaptureDataChangeMetaSource]
}

