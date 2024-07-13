package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * @param headers  for example: ''null''
 * @param messageKey  for example: ''null''
 * @param meta  for example: ''null''
 * @param offset  for example: ''null''
 * @param partition  for example: ''null''
 * @param sourceType  for example: ''null''
 * @param timestamp  for example: ''null''
 * @param topic  for example: ''null''
 * @param schema  for example: ''null''
 * @param payload  for example: ''null''
*/
final case class GraphRelationshipAllOfData (
  headers: Any,
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

