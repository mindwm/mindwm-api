package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import Neo4jCaptureDataChange._

case class Neo4jCaptureDataChange (
  headers: Map[String, AnyType],
messageKey: String,
meta: Neo4jCaptureDataChangeMeta,
offset: Integer,
partition: Integer,
sourceType: String,
timestamp: OffsetDateTime,
topic: String,
schema: Neo4jCaptureDataChangeSchema,
payload: Neo4jCaptureDataChangePayload)

object Neo4jCaptureDataChange {
  import DateTimeCodecs._

  implicit val Neo4jCaptureDataChangeCodecJson: CodecJson[Neo4jCaptureDataChange] = CodecJson.derive[Neo4jCaptureDataChange]
  implicit val Neo4jCaptureDataChangeDecoder: EntityDecoder[Neo4jCaptureDataChange] = jsonOf[Neo4jCaptureDataChange]
  implicit val Neo4jCaptureDataChangeEncoder: EntityEncoder[Neo4jCaptureDataChange] = jsonEncoderOf[Neo4jCaptureDataChange]
}
