package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Neo4jCaptureDataChangeSchema._

case class Neo4jCaptureDataChangeSchema (
  constraints: Option[Map[String, AnyType]],
properties: Option[Map[String, AnyType]])

object Neo4jCaptureDataChangeSchema {
  import DateTimeCodecs._

  implicit val Neo4jCaptureDataChangeSchemaCodecJson: CodecJson[Neo4jCaptureDataChangeSchema] = CodecJson.derive[Neo4jCaptureDataChangeSchema]
  implicit val Neo4jCaptureDataChangeSchemaDecoder: EntityDecoder[Neo4jCaptureDataChangeSchema] = jsonOf[Neo4jCaptureDataChangeSchema]
  implicit val Neo4jCaptureDataChangeSchemaEncoder: EntityEncoder[Neo4jCaptureDataChangeSchema] = jsonEncoderOf[Neo4jCaptureDataChangeSchema]
}
