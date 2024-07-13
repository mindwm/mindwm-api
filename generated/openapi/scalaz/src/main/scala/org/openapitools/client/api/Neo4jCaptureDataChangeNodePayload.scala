package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Neo4jCaptureDataChangeNodePayload._

case class Neo4jCaptureDataChangeNodePayload (
  after: Neo4jCaptureDataChangeNodePayloadAfter,
before: String,
id: String,
`type`: String)

object Neo4jCaptureDataChangeNodePayload {
  import DateTimeCodecs._

  implicit val Neo4jCaptureDataChangeNodePayloadCodecJson: CodecJson[Neo4jCaptureDataChangeNodePayload] = CodecJson.derive[Neo4jCaptureDataChangeNodePayload]
  implicit val Neo4jCaptureDataChangeNodePayloadDecoder: EntityDecoder[Neo4jCaptureDataChangeNodePayload] = jsonOf[Neo4jCaptureDataChangeNodePayload]
  implicit val Neo4jCaptureDataChangeNodePayloadEncoder: EntityEncoder[Neo4jCaptureDataChangeNodePayload] = jsonEncoderOf[Neo4jCaptureDataChangeNodePayload]
}
