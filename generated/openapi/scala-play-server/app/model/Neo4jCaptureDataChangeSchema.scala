package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Neo4jCaptureDataChange_schema.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-17T16:10:01.566697796Z[Etc/UTC]", comments = "Generator version: 7.7.0")
case class Neo4jCaptureDataChangeSchema(
  constraints: Option[Map[String, OasAnyTypeNotMapped]],
  properties: Option[Map[String, OasAnyTypeNotMapped]],
)

object Neo4jCaptureDataChangeSchema {
  implicit lazy val neo4jCaptureDataChangeSchemaJsonFormat: Format[Neo4jCaptureDataChangeSchema] = Json.format[Neo4jCaptureDataChangeSchema]
}

