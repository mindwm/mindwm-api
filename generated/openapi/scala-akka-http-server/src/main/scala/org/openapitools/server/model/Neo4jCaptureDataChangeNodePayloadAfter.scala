package org.openapitools.server.model


/**
 * @param labels  for example: ''null''
 * @param properties  for example: ''null''
*/
final case class Neo4jCaptureDataChangeNodePayloadAfter (
  labels: Seq[String],
  properties: Map[String, AnyType]
)

