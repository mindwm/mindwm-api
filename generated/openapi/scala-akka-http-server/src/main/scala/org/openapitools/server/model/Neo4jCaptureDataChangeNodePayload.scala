package org.openapitools.server.model


/**
 * @param after  for example: ''null''
 * @param before  for example: ''null''
 * @param id  for example: ''null''
 * @param `type`  for example: ''null''
*/
final case class Neo4jCaptureDataChangeNodePayload (
  after: Neo4jCaptureDataChangeNodePayloadAfter,
  before: String,
  id: String,
  `type`: String
)

