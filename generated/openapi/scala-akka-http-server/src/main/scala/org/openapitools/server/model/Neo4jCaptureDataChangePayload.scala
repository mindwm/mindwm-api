package org.openapitools.server.model


/**
 * @param after  for example: ''null''
 * @param before  for example: ''null''
 * @param id  for example: ''null''
 * @param `type`  for example: ''null''
 * @param end  for example: ''null''
 * @param label  for example: ''null''
 * @param start  for example: ''null''
*/
final case class Neo4jCaptureDataChangePayload (
  after: Any,
  before: String,
  id: String,
  `type`: String,
  end: Neo4jCaptureDataChangeRelationshipPayloadEnd,
  label: String,
  start: Neo4jCaptureDataChangeRelationshipPayloadEnd
)

