package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.net.URI
import java.time.OffsetDateTime
import java.util.HashMap

import GraphRelationship._

case class GraphRelationship (
  /* Identifies the event. */
  id: String,
source: Source,
/* The version of the CloudEvents specification which the event uses. */
  specversion: String,
`type`: `Type`,
/* Content type of the data value. Must adhere to RFC 2046 format. */
  datacontenttype: Option[String],
/* Identifies the schema that data adheres to. */
  dataschema: Option[URI],
/* Describes the subject of the event in the context of the event producer (identified by source). */
  subject: Option[String],
/* Timestamp of when the occurrence happened. Must adhere to RFC 3339. */
  time: Option[OffsetDateTime],
data: Option[GraphRelationshipAllOfData],
/* Base64 encoded event payload. Must adhere to RFC4648. */
  dataBase64: Option[String])

object GraphRelationship {
  import DateTimeCodecs._
  sealed trait Source
  case object GraphRelationship extends Source

  object Source {
    def toSource(s: String): Option[Source] = s match {
      case "GraphRelationship" => Some(GraphRelationship)
      case _ => None
    }

    def fromSource(x: Source): String = x match {
      case GraphRelationship => "GraphRelationship"
    }
  }

  implicit val SourceEnumEncoder: EncodeJson[Source] =
    EncodeJson[Source](is => StringEncodeJson(Source.fromSource(is)))

  implicit val SourceEnumDecoder: DecodeJson[Source] =
    DecodeJson.optionDecoder[Source](n => n.string.flatMap(jStr => Source.toSource(jStr)), "Source failed to de-serialize")
  sealed trait `Type`
  case object Created extends `Type`
  case object Updated extends `Type`
  case object Deleted extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Created" => Some(Created)
      case "Updated" => Some(Updated)
      case "Deleted" => Some(Deleted)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Created => "Created"
      case Updated => "Updated"
      case Deleted => "Deleted"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val GraphRelationshipCodecJson: CodecJson[GraphRelationship] = CodecJson.derive[GraphRelationship]
  implicit val GraphRelationshipDecoder: EntityDecoder[GraphRelationship] = jsonOf[GraphRelationship]
  implicit val GraphRelationshipEncoder: EntityEncoder[GraphRelationship] = jsonEncoderOf[GraphRelationship]
}
