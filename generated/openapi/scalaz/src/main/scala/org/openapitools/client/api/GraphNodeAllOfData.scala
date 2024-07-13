package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import GraphNodeAllOfData._

case class GraphNodeAllOfData (
  headers: Any,
messageKey: String,
meta: Neo4jCaptureDataChangeMeta,
offset: Integer,
partition: Integer,
sourceType: String,
timestamp: OffsetDateTime,
topic: String,
schema: Neo4jCaptureDataChangeSchema,
payload: Neo4jCaptureDataChangeNodePayload)

object GraphNodeAllOfData {
  import DateTimeCodecs._

  implicit val GraphNodeAllOfDataCodecJson: CodecJson[GraphNodeAllOfData] = CodecJson.derive[GraphNodeAllOfData]
  implicit val GraphNodeAllOfDataDecoder: EntityDecoder[GraphNodeAllOfData] = jsonOf[GraphNodeAllOfData]
  implicit val GraphNodeAllOfDataEncoder: EntityEncoder[GraphNodeAllOfData] = jsonEncoderOf[GraphNodeAllOfData]
}
