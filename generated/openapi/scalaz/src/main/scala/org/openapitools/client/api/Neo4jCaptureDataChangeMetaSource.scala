package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Neo4jCaptureDataChangeMetaSource._

case class Neo4jCaptureDataChangeMetaSource (
  hostname: String)

object Neo4jCaptureDataChangeMetaSource {
  import DateTimeCodecs._

  implicit val Neo4jCaptureDataChangeMetaSourceCodecJson: CodecJson[Neo4jCaptureDataChangeMetaSource] = CodecJson.derive[Neo4jCaptureDataChangeMetaSource]
  implicit val Neo4jCaptureDataChangeMetaSourceDecoder: EntityDecoder[Neo4jCaptureDataChangeMetaSource] = jsonOf[Neo4jCaptureDataChangeMetaSource]
  implicit val Neo4jCaptureDataChangeMetaSourceEncoder: EntityEncoder[Neo4jCaptureDataChangeMetaSource] = jsonEncoderOf[Neo4jCaptureDataChangeMetaSource]
}
