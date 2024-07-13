package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import GraphRelationshipAllOfData._

case class GraphRelationshipAllOfData (
  headers: Any,
messageKey: String,
meta: Neo4jCaptureDataChangeMeta,
offset: Integer,
partition: Integer,
sourceType: String,
timestamp: OffsetDateTime,
topic: String,
schema: Neo4jCaptureDataChangeSchema,
payload: Neo4jCaptureDataChangeRelationshipPayload)

object GraphRelationshipAllOfData {
  import DateTimeCodecs._

  implicit val GraphRelationshipAllOfDataCodecJson: CodecJson[GraphRelationshipAllOfData] = CodecJson.derive[GraphRelationshipAllOfData]
  implicit val GraphRelationshipAllOfDataDecoder: EntityDecoder[GraphRelationshipAllOfData] = jsonOf[GraphRelationshipAllOfData]
  implicit val GraphRelationshipAllOfDataEncoder: EntityEncoder[GraphRelationshipAllOfData] = jsonEncoderOf[GraphRelationshipAllOfData]
}
