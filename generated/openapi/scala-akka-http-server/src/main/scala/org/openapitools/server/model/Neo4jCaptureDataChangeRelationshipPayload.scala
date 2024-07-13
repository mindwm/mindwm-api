package org.openapitools.server.model


/**
 * @param after  for example: ''null''
 * @param before  for example: ''null''
 * @param end  for example: ''null''
 * @param id  for example: ''null''
 * @param label  for example: ''null''
 * @param start  for example: ''null''
 * @param `type`  for example: ''null''
*/
final case class Neo4jCaptureDataChangeRelationshipPayload (
  after: Any,
  before: String,
  end: Neo4jCaptureDataChangeRelationshipPayloadEnd,
  id: String,
  label: String,
  start: Neo4jCaptureDataChangeRelationshipPayloadEnd,
  `type`: String
)

