package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Neo4jCaptureDataChangeRelationshipPayloadEnd._

case class Neo4jCaptureDataChangeRelationshipPayloadEnd (
  id: String,
ids: Map[String, AnyType],
labels: List[String])

object Neo4jCaptureDataChangeRelationshipPayloadEnd {
  import DateTimeCodecs._

  implicit val Neo4jCaptureDataChangeRelationshipPayloadEndCodecJson: CodecJson[Neo4jCaptureDataChangeRelationshipPayloadEnd] = CodecJson.derive[Neo4jCaptureDataChangeRelationshipPayloadEnd]
  implicit val Neo4jCaptureDataChangeRelationshipPayloadEndDecoder: EntityDecoder[Neo4jCaptureDataChangeRelationshipPayloadEnd] = jsonOf[Neo4jCaptureDataChangeRelationshipPayloadEnd]
  implicit val Neo4jCaptureDataChangeRelationshipPayloadEndEncoder: EntityEncoder[Neo4jCaptureDataChangeRelationshipPayloadEnd] = jsonEncoderOf[Neo4jCaptureDataChangeRelationshipPayloadEnd]
}
