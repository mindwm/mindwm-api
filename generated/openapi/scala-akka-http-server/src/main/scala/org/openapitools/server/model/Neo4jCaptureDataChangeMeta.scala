package org.openapitools.server.model


/**
 * @param operation  for example: ''null''
 * @param source  for example: ''null''
 * @param timestamp  for example: ''null''
 * @param txEventId  for example: ''null''
 * @param txEventsCount  for example: ''null''
 * @param txId  for example: ''null''
 * @param username  for example: ''null''
*/
final case class Neo4jCaptureDataChangeMeta (
  operation: String,
  source: Neo4jCaptureDataChangeMetaSource,
  timestamp: Int,
  txEventId: Int,
  txEventsCount: Int,
  txId: Int,
  username: String
)

