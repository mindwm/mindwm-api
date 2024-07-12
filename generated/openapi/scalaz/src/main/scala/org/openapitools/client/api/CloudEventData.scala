package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CloudEventData._

case class CloudEventData (
  
object CloudEventData {
  import DateTimeCodecs._

  implicit val CloudEventDataCodecJson: CodecJson[CloudEventData] = CodecJson.derive[CloudEventData]
  implicit val CloudEventDataDecoder: EntityDecoder[CloudEventData] = jsonOf[CloudEventData]
  implicit val CloudEventDataEncoder: EntityEncoder[CloudEventData] = jsonEncoderOf[CloudEventData]
}
