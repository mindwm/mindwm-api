package MindWM.models

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
  source: Option[Refined[String, MatchesRegex["^mindwm\\\\.[a-zA-Z0-9_]{1,32}\\\\.[a-zA-Z0-9-]{1,63}\\.clipboard$"]]],
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
* @param id Identifies the event.
* @param source 
* @param specversion The version of the CloudEvents specification which the event uses.
* @param _type Describes the type of event related to the originating occurrence.
* @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
* @param dataschema Identifies the schema that data adheres to.
* @param subject Describes the subject of the event in the context of the event producer (identified by source).
* @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
* @param data 
* @param dataUnderscorebase64 Base64 encoded event payload. Must adhere to RFC4648.
*/

case class GraphNode(
  id: Refined[String, MinSize[1]],
  source: String,
  specversion: Refined[String, MinSize[1]],
  _type: Refined[String, MinSize[1]],
  datacontenttype: Option[Refined[String, MinSize[1]]],
  dataschema: Option[Refined[URI, MinSize[1]]],
  subject: Option[Refined[String, MinSize[1]]],
  time: Option[ZonedDateTime],
  data: Option[GraphNodeAllOfData],
  dataUnderscorebase64: Option[String]
)
object GraphNode {
  implicit val encoderGraphNode: Encoder[GraphNode] = deriveEncoder[GraphNode].mapJson(_.dropNullValues)
  implicit val decoderGraphNode: Decoder[GraphNode] = deriveDecoder[GraphNode]
}

/**
* 
* @param _type 
* @param source 
* @param data 
*/

case class GraphNodeAllOf(
  _type: Option[String],
  source: Option[String],
  data: Option[GraphNodeAllOfData]
)
object GraphNodeAllOf {
  implicit val encoderGraphNodeAllOf: Encoder[GraphNodeAllOf] = deriveEncoder[GraphNodeAllOf].mapJson(_.dropNullValues)
  implicit val decoderGraphNodeAllOf: Decoder[GraphNodeAllOf] = deriveDecoder[GraphNodeAllOf]
}

/**
* 
* @param headers 
* @param messageUnderscorekey 
* @param meta 
* @param offset 
* @param partition 
* @param sourceUnderscoretype 
* @param timestamp 
* @param topic 
* @param schema 
* @param payload 
*/

case class GraphNodeAllOfData(
  headers: Object,
  messageUnderscorekey: String,
  meta: Neo4jCaptureDataChangeMeta,
  offset: Int,
  partition: Int,
  sourceUnderscoretype: String,
  timestamp: ZonedDateTime,
  topic: String,
  schema: Neo4jCaptureDataChangeSchema,
  payload: Neo4jCaptureDataChangeNodePayload
)
object GraphNodeAllOfData {
  implicit val encoderGraphNodeAllOfData: Encoder[GraphNodeAllOfData] = deriveEncoder[GraphNodeAllOfData].mapJson(_.dropNullValues)
  implicit val decoderGraphNodeAllOfData: Decoder[GraphNodeAllOfData] = deriveDecoder[GraphNodeAllOfData]
}

/**
* 
* @param payload 
*/

case class GraphNodeAllOfDataAllOf(
  payload: Option[Neo4jCaptureDataChangeNodePayload]
)
object GraphNodeAllOfDataAllOf {
  implicit val encoderGraphNodeAllOfDataAllOf: Encoder[GraphNodeAllOfDataAllOf] = deriveEncoder[GraphNodeAllOfDataAllOf].mapJson(_.dropNullValues)
  implicit val decoderGraphNodeAllOfDataAllOf: Decoder[GraphNodeAllOfDataAllOf] = deriveDecoder[GraphNodeAllOfDataAllOf]
}

/**
* 
* @param id Identifies the event.
* @param source 
* @param specversion The version of the CloudEvents specification which the event uses.
* @param _type Describes the type of event related to the originating occurrence.
* @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
* @param dataschema Identifies the schema that data adheres to.
* @param subject Describes the subject of the event in the context of the event producer (identified by source).
* @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
* @param data 
* @param dataUnderscorebase64 Base64 encoded event payload. Must adhere to RFC4648.
*/

case class GraphRelationship(
  id: Refined[String, MinSize[1]],
  source: String,
  specversion: Refined[String, MinSize[1]],
  _type: Refined[String, MinSize[1]],
  datacontenttype: Option[Refined[String, MinSize[1]]],
  dataschema: Option[Refined[URI, MinSize[1]]],
  subject: Option[Refined[String, MinSize[1]]],
  time: Option[ZonedDateTime],
  data: Option[GraphRelationshipAllOfData],
  dataUnderscorebase64: Option[String]
)
object GraphRelationship {
  implicit val encoderGraphRelationship: Encoder[GraphRelationship] = deriveEncoder[GraphRelationship].mapJson(_.dropNullValues)
  implicit val decoderGraphRelationship: Decoder[GraphRelationship] = deriveDecoder[GraphRelationship]
}

/**
* 
* @param _type 
* @param source 
* @param data 
*/

case class GraphRelationshipAllOf(
  _type: Option[String],
  source: Option[String],
  data: Option[GraphRelationshipAllOfData]
)
object GraphRelationshipAllOf {
  implicit val encoderGraphRelationshipAllOf: Encoder[GraphRelationshipAllOf] = deriveEncoder[GraphRelationshipAllOf].mapJson(_.dropNullValues)
  implicit val decoderGraphRelationshipAllOf: Decoder[GraphRelationshipAllOf] = deriveDecoder[GraphRelationshipAllOf]
}

/**
* 
* @param headers 
* @param messageUnderscorekey 
* @param meta 
* @param offset 
* @param partition 
* @param sourceUnderscoretype 
* @param timestamp 
* @param topic 
* @param schema 
* @param payload 
*/

case class GraphRelationshipAllOfData(
  headers: Object,
  messageUnderscorekey: String,
  meta: Neo4jCaptureDataChangeMeta,
  offset: Int,
  partition: Int,
  sourceUnderscoretype: String,
  timestamp: ZonedDateTime,
  topic: String,
  schema: Neo4jCaptureDataChangeSchema,
  payload: Neo4jCaptureDataChangeRelationshipPayload
)
object GraphRelationshipAllOfData {
  implicit val encoderGraphRelationshipAllOfData: Encoder[GraphRelationshipAllOfData] = deriveEncoder[GraphRelationshipAllOfData].mapJson(_.dropNullValues)
  implicit val decoderGraphRelationshipAllOfData: Decoder[GraphRelationshipAllOfData] = deriveDecoder[GraphRelationshipAllOfData]
}

/**
* 
* @param payload 
*/

case class GraphRelationshipAllOfDataAllOf(
  payload: Option[Neo4jCaptureDataChangeRelationshipPayload]
)
object GraphRelationshipAllOfDataAllOf {
  implicit val encoderGraphRelationshipAllOfDataAllOf: Encoder[GraphRelationshipAllOfDataAllOf] = deriveEncoder[GraphRelationshipAllOfDataAllOf].mapJson(_.dropNullValues)
  implicit val decoderGraphRelationshipAllOfDataAllOf: Decoder[GraphRelationshipAllOfDataAllOf] = deriveDecoder[GraphRelationshipAllOfDataAllOf]
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
* @param subject 
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
  subject: Option[String],
  time: Option[ZonedDateTime],
  dataUnderscorebase64: Option[String]
)
object IoDocument {
  implicit val encoderIoDocument: Encoder[IoDocument] = deriveEncoder[IoDocument].mapJson(_.dropNullValues)
  implicit val decoderIoDocument: Decoder[IoDocument] = deriveDecoder[IoDocument]
}

/**
* 
* @param _type 
* @param subject 
* @param source 
* @param data 
*/

case class IoDocumentAllOf(
  _type: Option[String],
  subject: Option[String],
  source: Option[String],
  data: Option[TmuxPaneIoDocument]
)
object IoDocumentAllOf {
  implicit val encoderIoDocumentAllOf: Encoder[IoDocumentAllOf] = deriveEncoder[IoDocumentAllOf].mapJson(_.dropNullValues)
  implicit val decoderIoDocumentAllOf: Decoder[IoDocumentAllOf] = deriveDecoder[IoDocumentAllOf]
}

/**
* 
* @param headers 
* @param messageUnderscorekey 
* @param meta 
* @param offset 
* @param partition 
* @param sourceUnderscoretype 
* @param timestamp 
* @param topic 
* @param schema 
* @param payload 
*/

case class Neo4jCaptureDataChange(
  headers: Map[String, AnyType],
  messageUnderscorekey: String,
  meta: Neo4jCaptureDataChangeMeta,
  offset: Int,
  partition: Int,
  sourceUnderscoretype: String,
  timestamp: ZonedDateTime,
  topic: String,
  schema: Neo4jCaptureDataChangeSchema,
  payload: Neo4jCaptureDataChangePayload
)
object Neo4jCaptureDataChange {
  implicit val encoderNeo4jCaptureDataChange: Encoder[Neo4jCaptureDataChange] = deriveEncoder[Neo4jCaptureDataChange].mapJson(_.dropNullValues)
  implicit val decoderNeo4jCaptureDataChange: Decoder[Neo4jCaptureDataChange] = deriveDecoder[Neo4jCaptureDataChange]
}

/**
* 
* @param operation 
* @param source 
* @param timestamp 
* @param txEventId 
* @param txEventsCount 
* @param txId 
* @param username 
*/

case class Neo4jCaptureDataChangeMeta(
  operation: String,
  source: Neo4jCaptureDataChangeMetaSource,
  timestamp: Int,
  txEventId: Int,
  txEventsCount: Int,
  txId: Int,
  username: String
)
object Neo4jCaptureDataChangeMeta {
  implicit val encoderNeo4jCaptureDataChangeMeta: Encoder[Neo4jCaptureDataChangeMeta] = deriveEncoder[Neo4jCaptureDataChangeMeta].mapJson(_.dropNullValues)
  implicit val decoderNeo4jCaptureDataChangeMeta: Decoder[Neo4jCaptureDataChangeMeta] = deriveDecoder[Neo4jCaptureDataChangeMeta]
}

/**
* 
* @param hostname 
*/

case class Neo4jCaptureDataChangeMetaSource(
  hostname: String
)
object Neo4jCaptureDataChangeMetaSource {
  implicit val encoderNeo4jCaptureDataChangeMetaSource: Encoder[Neo4jCaptureDataChangeMetaSource] = deriveEncoder[Neo4jCaptureDataChangeMetaSource].mapJson(_.dropNullValues)
  implicit val decoderNeo4jCaptureDataChangeMetaSource: Decoder[Neo4jCaptureDataChangeMetaSource] = deriveDecoder[Neo4jCaptureDataChangeMetaSource]
}

/**
* 
* @param after 
* @param before 
* @param id 
* @param _type 
*/

case class Neo4jCaptureDataChangeNodePayload(
  after: Neo4jCaptureDataChangeNodePayloadAfter,
  before: String,
  id: String,
  _type: String
) extends Neo4jCaptureDataChangePayload
object Neo4jCaptureDataChangeNodePayload {
  implicit val encoderNeo4jCaptureDataChangeNodePayload: Encoder[Neo4jCaptureDataChangeNodePayload] = deriveEncoder[Neo4jCaptureDataChangeNodePayload].mapJson(_.dropNullValues)
  implicit val decoderNeo4jCaptureDataChangeNodePayload: Decoder[Neo4jCaptureDataChangeNodePayload] = deriveDecoder[Neo4jCaptureDataChangeNodePayload]
}

/**
* 
* @param labels 
* @param properties 
*/

case class Neo4jCaptureDataChangeNodePayloadAfter(
  labels: List[String],
  properties: Map[String, AnyType]
)
object Neo4jCaptureDataChangeNodePayloadAfter {
  implicit val encoderNeo4jCaptureDataChangeNodePayloadAfter: Encoder[Neo4jCaptureDataChangeNodePayloadAfter] = deriveEncoder[Neo4jCaptureDataChangeNodePayloadAfter].mapJson(_.dropNullValues)
  implicit val decoderNeo4jCaptureDataChangeNodePayloadAfter: Decoder[Neo4jCaptureDataChangeNodePayloadAfter] = deriveDecoder[Neo4jCaptureDataChangeNodePayloadAfter]
}

/**
* 
* @param after 
* @param before 
* @param id 
* @param _type 
* @param end 
* @param label 
* @param start 
*/
sealed trait Neo4jCaptureDataChangePayload
object Neo4jCaptureDataChangePayload {
  import io.circe.{ Decoder, Encoder }
  import io.circe.syntax._
  import cats.syntax.functor._

// no discriminator
  implicit val neo4jCaptureDataChangePayloadEncoder: Encoder[Neo4jCaptureDataChangePayload] = Encoder.instance {
    case neo4jCaptureDataChangeNodePayload: Neo4jCaptureDataChangeNodePayload => neo4jCaptureDataChangeNodePayload.asJson
    case neo4jCaptureDataChangeRelationshipPayload: Neo4jCaptureDataChangeRelationshipPayload => neo4jCaptureDataChangeRelationshipPayload.asJson
  }

  implicit val neo4jCaptureDataChangePayloadDecoder: Decoder[Neo4jCaptureDataChangePayload] =
    List[Decoder[Neo4jCaptureDataChangePayload]](
      Decoder[Neo4jCaptureDataChangeNodePayload].widen,
      Decoder[Neo4jCaptureDataChangeRelationshipPayload].widen,
  ).reduceLeft(_ or _)
}


/**
* 
* @param after 
* @param before 
* @param end 
* @param id 
* @param label 
* @param start 
* @param _type 
*/

case class Neo4jCaptureDataChangeRelationshipPayload(
  after: Object,
  before: String,
  end: Neo4jCaptureDataChangeRelationshipPayloadEnd,
  id: String,
  label: String,
  start: Neo4jCaptureDataChangeRelationshipPayloadStart,
  _type: String
) extends Neo4jCaptureDataChangePayload
object Neo4jCaptureDataChangeRelationshipPayload {
  implicit val encoderNeo4jCaptureDataChangeRelationshipPayload: Encoder[Neo4jCaptureDataChangeRelationshipPayload] = deriveEncoder[Neo4jCaptureDataChangeRelationshipPayload].mapJson(_.dropNullValues)
  implicit val decoderNeo4jCaptureDataChangeRelationshipPayload: Decoder[Neo4jCaptureDataChangeRelationshipPayload] = deriveDecoder[Neo4jCaptureDataChangeRelationshipPayload]
}

/**
* 
* @param id 
* @param ids 
* @param labels 
*/

case class Neo4jCaptureDataChangeRelationshipPayloadEnd(
  id: String,
  ids: Map[String, AnyType],
  labels: List[String]
)
object Neo4jCaptureDataChangeRelationshipPayloadEnd {
  implicit val encoderNeo4jCaptureDataChangeRelationshipPayloadEnd: Encoder[Neo4jCaptureDataChangeRelationshipPayloadEnd] = deriveEncoder[Neo4jCaptureDataChangeRelationshipPayloadEnd].mapJson(_.dropNullValues)
  implicit val decoderNeo4jCaptureDataChangeRelationshipPayloadEnd: Decoder[Neo4jCaptureDataChangeRelationshipPayloadEnd] = deriveDecoder[Neo4jCaptureDataChangeRelationshipPayloadEnd]
}

/**
* 
* @param id 
* @param ids 
* @param labels 
*/

case class Neo4jCaptureDataChangeRelationshipPayloadStart(
  id: String,
  ids: Map[String, AnyType],
  labels: List[String]
)
object Neo4jCaptureDataChangeRelationshipPayloadStart {
  implicit val encoderNeo4jCaptureDataChangeRelationshipPayloadStart: Encoder[Neo4jCaptureDataChangeRelationshipPayloadStart] = deriveEncoder[Neo4jCaptureDataChangeRelationshipPayloadStart].mapJson(_.dropNullValues)
  implicit val decoderNeo4jCaptureDataChangeRelationshipPayloadStart: Decoder[Neo4jCaptureDataChangeRelationshipPayloadStart] = deriveDecoder[Neo4jCaptureDataChangeRelationshipPayloadStart]
}

/**
* 
* @param constraints 
* @param properties 
*/

case class Neo4jCaptureDataChangeSchema(
  constraints: Option[Map[String, AnyType]],
  properties: Option[Map[String, AnyType]]
)
object Neo4jCaptureDataChangeSchema {
  implicit val encoderNeo4jCaptureDataChangeSchema: Encoder[Neo4jCaptureDataChangeSchema] = deriveEncoder[Neo4jCaptureDataChangeSchema].mapJson(_.dropNullValues)
  implicit val decoderNeo4jCaptureDataChangeSchema: Decoder[Neo4jCaptureDataChangeSchema] = deriveDecoder[Neo4jCaptureDataChangeSchema]
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

