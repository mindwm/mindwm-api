package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Neo4jCaptureDataChangeNodePayloadAfter._

case class Neo4jCaptureDataChangeNodePayloadAfter (
  labels: List[String],
properties: Map[String, AnyType])

object Neo4jCaptureDataChangeNodePayloadAfter {
  import DateTimeCodecs._

  implicit val Neo4jCaptureDataChangeNodePayloadAfterCodecJson: CodecJson[Neo4jCaptureDataChangeNodePayloadAfter] = CodecJson.derive[Neo4jCaptureDataChangeNodePayloadAfter]
  implicit val Neo4jCaptureDataChangeNodePayloadAfterDecoder: EntityDecoder[Neo4jCaptureDataChangeNodePayloadAfter] = jsonOf[Neo4jCaptureDataChangeNodePayloadAfter]
  implicit val Neo4jCaptureDataChangeNodePayloadAfterEncoder: EntityEncoder[Neo4jCaptureDataChangeNodePayloadAfter] = jsonEncoderOf[Neo4jCaptureDataChangeNodePayloadAfter]
}
