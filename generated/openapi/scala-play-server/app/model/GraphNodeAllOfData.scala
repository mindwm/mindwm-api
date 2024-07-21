package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for GraphNode_allOf_data.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-21T21:31:12.299262078Z[Etc/UTC]", comments = "Generator version: 7.7.0")
case class GraphNodeAllOfData(
  headers: JsObject,
  messageKey: String,
  meta: Neo4jCaptureDataChangeMeta,
  offset: Int,
  partition: Int,
  sourceType: String,
  timestamp: OffsetDateTime,
  topic: String,
  schema: Neo4jCaptureDataChangeSchema,
  payload: Neo4jCaptureDataChangeNodePayload
)

object GraphNodeAllOfData {
  implicit lazy val graphNodeAllOfDataJsonFormat: Format[GraphNodeAllOfData] = Json.format[GraphNodeAllOfData]
}

