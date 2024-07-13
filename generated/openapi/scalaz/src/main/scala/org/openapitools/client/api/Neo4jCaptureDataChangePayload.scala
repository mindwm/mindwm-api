package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Neo4jCaptureDataChangePayload._

case class Neo4jCaptureDataChangePayload (
  after: Any,
before: String,
id: String,
`type`: String,
end: Neo4jCaptureDataChangeRelationshipPayloadEnd,
label: String,
start: Neo4jCaptureDataChangeRelationshipPayloadEnd)

object Neo4jCaptureDataChangePayload {
  import DateTimeCodecs._

  implicit val Neo4jCaptureDataChangePayloadCodecJson: CodecJson[Neo4jCaptureDataChangePayload] = CodecJson.derive[Neo4jCaptureDataChangePayload]
  implicit val Neo4jCaptureDataChangePayloadDecoder: EntityDecoder[Neo4jCaptureDataChangePayload] = jsonOf[Neo4jCaptureDataChangePayload]
  implicit val Neo4jCaptureDataChangePayloadEncoder: EntityEncoder[Neo4jCaptureDataChangePayload] = jsonEncoderOf[Neo4jCaptureDataChangePayload]
}
