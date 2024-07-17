package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for GraphRelationship_allOf_data.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-17T14:07:32.260026937Z[Etc/UTC]", comments = "Generator version: 7.7.0")
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

