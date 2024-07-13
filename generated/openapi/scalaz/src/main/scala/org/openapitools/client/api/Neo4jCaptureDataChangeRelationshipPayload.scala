package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Neo4jCaptureDataChangeRelationshipPayload._

case class Neo4jCaptureDataChangeRelationshipPayload (
  after: Any,
before: String,
end: Neo4jCaptureDataChangeRelationshipPayloadEnd,
id: String,
label: String,
start: Neo4jCaptureDataChangeRelationshipPayloadEnd,
`type`: String)

object Neo4jCaptureDataChangeRelationshipPayload {
  import DateTimeCodecs._

  implicit val Neo4jCaptureDataChangeRelationshipPayloadCodecJson: CodecJson[Neo4jCaptureDataChangeRelationshipPayload] = CodecJson.derive[Neo4jCaptureDataChangeRelationshipPayload]
  implicit val Neo4jCaptureDataChangeRelationshipPayloadDecoder: EntityDecoder[Neo4jCaptureDataChangeRelationshipPayload] = jsonOf[Neo4jCaptureDataChangeRelationshipPayload]
  implicit val Neo4jCaptureDataChangeRelationshipPayloadEncoder: EntityEncoder[Neo4jCaptureDataChangeRelationshipPayload] = jsonEncoderOf[Neo4jCaptureDataChangeRelationshipPayload]
}
