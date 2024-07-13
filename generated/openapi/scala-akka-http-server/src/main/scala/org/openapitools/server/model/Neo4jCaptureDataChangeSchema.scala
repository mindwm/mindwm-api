package org.openapitools.server.model


/**
 * @param constraints  for example: ''null''
 * @param properties  for example: ''null''
*/
final case class Neo4jCaptureDataChangeSchema (
  constraints: Option[Map[String, AnyType]] = None,
  properties: Option[Map[String, AnyType]] = None
)

