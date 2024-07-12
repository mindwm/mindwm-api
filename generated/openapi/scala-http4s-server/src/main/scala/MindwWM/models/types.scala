package MindwWM.models

import java.time._

import io.circe.refined._
import io.circe.syntax._
import io.circe.{ Decoder, Encoder }
import io.circe.generic.semiauto.{ deriveDecoder, deriveEncoder }

import eu.timepit.refined.api.Refined
import eu.timepit.refined.boolean.And
import eu.timepit.refined.collection.MaxSize
import eu.timepit.refined.collection.MinSize
import eu.timepit.refined.string.MatchesRegex
import java.net.URI
import java.time.ZonedDateTime
import scala.collection.immutable.HashMap

/**
* 
* @param _type 
* @param source 
* @param data 
* @param id Identifies the event.
* @param specversion The version of the CloudEvents specification which the event uses.
* @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
* @param dataschema Identifies the schema that data adheres to.
* @param subject 
* @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
* @param dataUnderscorebase64 Base64 encoded event payload. Must adhere to RFC4648.
*/

case class Clipboard(
  _type: Option[String],
  source: Option[Refined[String, MatchesRegex["[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)$"]]],
  data: Option[ClipboardPayload],
  id: Refined[String, MinSize[1]],
  specversion: Refined[String, MinSize[1]],
  datacontenttype: Option[Refined[String, MinSize[1]]],
  dataschema: Option[Refined[URI, MinSize[1]]],
  subject: Option[String],
  time: Option[ZonedDateTime],
  dataUnderscorebase64: Option[String]
)
object Clipboard {
  implicit val encoderClipboard: Encoder[Clipboard] = deriveEncoder[Clipboard].mapJson(_.dropNullValues)
  implicit val decoderClipboard: Decoder[Clipboard] = deriveDecoder[Clipboard]
}

/**
* 
* @param _type 
* @param subject 
* @param source 
* @param data 
*/

case class ClipboardAllOf(
  _type: Option[String],
  subject: Option[String],
  source: Option[Refined[String, MatchesRegex["mindwm.[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-).clipboard$"]]],
  data: Option[ClipboardPayload]
)
object ClipboardAllOf {
  implicit val encoderClipboardAllOf: Encoder[ClipboardAllOf] = deriveEncoder[ClipboardAllOf].mapJson(_.dropNullValues)
  implicit val decoderClipboardAllOf: Decoder[ClipboardAllOf] = deriveDecoder[ClipboardAllOf]
}

/**
* 
* @param start Starting position of clipboard selection [x,y]
* @param stop Ending position of clipboard selection [x,y]
* @param data Clipboard data
* @param _type Clipboard type
* @param context 
*/

case class ClipboardPayload(
  start: Option[Refined[List[Int], MinSize[2] And MaxSize[2]]],
  stop: Option[Refined[List[Int], MinSize[2] And MaxSize[2]]],
  data: Option[Refined[String, MinSize[1]]],
  _type: Option[String],
  context: Option[ClipboardPayloadContext]
)
object ClipboardPayload {
  implicit val encoderClipboardPayload: Encoder[ClipboardPayload] = deriveEncoder[ClipboardPayload].mapJson(_.dropNullValues)
  implicit val decoderClipboardPayload: Decoder[ClipboardPayload] = deriveDecoder[ClipboardPayload]
}

/**
* Selection context
* @param window window id
*/

case class ClipboardPayloadContext(
  window: Option[String]
)
object ClipboardPayloadContext {
  implicit val encoderClipboardPayloadContext: Encoder[ClipboardPayloadContext] = deriveEncoder[ClipboardPayloadContext].mapJson(_.dropNullValues)
  implicit val decoderClipboardPayloadContext: Decoder[ClipboardPayloadContext] = deriveDecoder[ClipboardPayloadContext]
}

/**
* CloudEvents Specification JSON Schema
* @param id Identifies the event.
* @param source Identifies the context in which an event happened.
* @param specversion The version of the CloudEvents specification which the event uses.
* @param _type Describes the type of event related to the originating occurrence.
* @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
* @param dataschema Identifies the schema that data adheres to.
* @param subject Describes the subject of the event in the context of the event producer (identified by source).
* @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
* @param data 
* @param dataUnderscorebase64 Base64 encoded event payload. Must adhere to RFC4648.
*/

case class CloudEvent(
  id: Refined[String, MinSize[1]],
  source: Refined[String, MinSize[1]],
  specversion: Refined[String, MinSize[1]],
  _type: Refined[String, MinSize[1]],
  datacontenttype: Option[Refined[String, MinSize[1]]],
  dataschema: Option[Refined[URI, MinSize[1]]],
  subject: Option[Refined[String, MinSize[1]]],
  time: Option[ZonedDateTime],
  data: Option[CloudEventData],
  dataUnderscorebase64: Option[String]
)
object CloudEvent {
  implicit val encoderCloudEvent: Encoder[CloudEvent] = deriveEncoder[CloudEvent].mapJson(_.dropNullValues)
  implicit val decoderCloudEvent: Decoder[CloudEvent] = deriveDecoder[CloudEvent]
}

/**
* The event payload.
*/

case class CloudEventData(
)
object CloudEventData {
  implicit val encoderCloudEventData: Encoder[CloudEventData] = deriveEncoder[CloudEventData].mapJson(_.dropNullValues)
  implicit val decoderCloudEventData: Decoder[CloudEventData] = deriveDecoder[CloudEventData]
}

/**
* 
* @param _type 
* @param source 
* @param data 
* @param id Identifies the event.
* @param specversion The version of the CloudEvents specification which the event uses.
* @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
* @param dataschema Identifies the schema that data adheres to.
* @param subject Describes the subject of the event in the context of the event producer (identified by source).
* @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
* @param dataUnderscorebase64 Base64 encoded event payload. Must adhere to RFC4648.
*/

case class IoDocument(
  _type: Option[String],
  source: Option[Refined[String, MatchesRegex["[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)\\\\.tmux\\\\.[A-Za-z0-9+\/]*={0,2}\\.[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}\\\\.[0-9]+?\\\\.[0-9]+?\\\\.tiodocument$"]]],
  data: Option[TmuxPaneIoDocument],
  id: Refined[String, MinSize[1]],
  specversion: Refined[String, MinSize[1]],
  datacontenttype: Option[Refined[String, MinSize[1]]],
  dataschema: Option[Refined[URI, MinSize[1]]],
  subject: Option[Refined[String, MinSize[1]]],
  time: Option[ZonedDateTime],
  dataUnderscorebase64: Option[String]
)
object IoDocument {
  implicit val encoderIoDocument: Encoder[IoDocument] = deriveEncoder[IoDocument].mapJson(_.dropNullValues)
  implicit val decoderIoDocument: Decoder[IoDocument] = deriveDecoder[IoDocument]
}

/**
* 
* @param input User input
* @param output Command output (mix of stdout & stderr)
* @param ps1 ps1 (prompt) AFTER the input and output
*/

case class TmuxPaneIoDocument(
  input: Refined[String, MinSize[1]],
  output: Refined[String, MinSize[0]],
  ps1: Refined[String, MinSize[1]]
)
object TmuxPaneIoDocument {
  implicit val encoderTmuxPaneIoDocument: Encoder[TmuxPaneIoDocument] = deriveEncoder[TmuxPaneIoDocument].mapJson(_.dropNullValues)
  implicit val decoderTmuxPaneIoDocument: Decoder[TmuxPaneIoDocument] = deriveDecoder[TmuxPaneIoDocument]
}

