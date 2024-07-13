package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Neo4jCaptureDataChangeMeta._

case class Neo4jCaptureDataChangeMeta (
  operation: String,
source: Neo4jCaptureDataChangeMetaSource,
timestamp: Integer,
txEventId: Integer,
txEventsCount: Integer,
txId: Integer,
username: String)

object Neo4jCaptureDataChangeMeta {
  import DateTimeCodecs._

  implicit val Neo4jCaptureDataChangeMetaCodecJson: CodecJson[Neo4jCaptureDataChangeMeta] = CodecJson.derive[Neo4jCaptureDataChangeMeta]
  implicit val Neo4jCaptureDataChangeMetaDecoder: EntityDecoder[Neo4jCaptureDataChangeMeta] = jsonOf[Neo4jCaptureDataChangeMeta]
  implicit val Neo4jCaptureDataChangeMetaEncoder: EntityEncoder[Neo4jCaptureDataChangeMeta] = jsonEncoderOf[Neo4jCaptureDataChangeMeta]
}
