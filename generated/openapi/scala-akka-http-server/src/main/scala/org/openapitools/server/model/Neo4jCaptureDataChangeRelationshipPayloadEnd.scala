package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param ids  for example: ''null''
 * @param labels  for example: ''null''
*/
final case class Neo4jCaptureDataChangeRelationshipPayloadEnd (
  id: String,
  ids: Map[String, AnyType],
  labels: Seq[String]
)

