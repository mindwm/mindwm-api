package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for GraphRelationship_allOf_data.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-16T19:21:21.540878690Z[Etc/UTC]", comments = "Generator version: 7.7.0")
case class GraphRelationshipAllOfData(
  headers: JsObject,
  messageKey: String,
  meta: Neo4jCaptureDataChangeMeta,
  offset: Int,
  partition: Int,
  sourceType: String,
  timestamp: OffsetDateTime,
  topic: String,
  schema: Neo4jCaptureDataChangeSchema,
  payload: Neo4jCaptureDataChangeRelationshipPayload
)

object GraphRelationshipAllOfData {
  implicit lazy val graphRelationshipAllOfDataJsonFormat: Format[GraphRelationshipAllOfData] = Json.format[GraphRelationshipAllOfData]
}

