/**
 * Mindwm API
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * OpenAPI spec version: 0.1.0
 *
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 *
 * https://openapi-generator.tech
 */

// this model was generated using model.mustache
package MindWM.model
import MindWM.model.URI
import java.time.OffsetDateTime
import ujson.Value
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class CloudEvent(
/* Identifies the event. */
  id: String,

  /* Identifies the context in which an event happened. */
  source: String,

  /* The version of the CloudEvents specification which the event uses. */
  specversion: String,

  /* Describes the type of event related to the originating occurrence. */
  `type`: String,

  /* Content type of the data value. Must adhere to RFC 2046 format. */
  datacontenttype: Option[String] = None ,

  /* Identifies the schema that data adheres to. */
  dataschema: Option[URI] = None ,

  /* Describes the subject of the event in the context of the event producer (identified by source). */
  subject: Option[String] = None ,

  /* Timestamp of when the occurrence happened. Must adhere to RFC 3339. */
  time: Option[OffsetDateTime] = None ,

  /* The event payload. */
  data: Option[Value] = None ,

  /* Base64 encoded event payload. Must adhere to RFC4648. */
  dataBase64: Option[String] = None 

  ) {

  def asJson: String = asData.asJson

  def asData : CloudEventData = {
    CloudEventData(
            id = id,
            source = source,
            specversion = specversion,
            `type` = `type`,
            datacontenttype = datacontenttype.getOrElse(""),
            dataschema = dataschema.getOrElse(""),
            subject = subject.getOrElse(""),
            time = time.getOrElse(null),
            data = data.getOrElse(ujson.Null),
            dataBase64 = dataBase64.getOrElse("")
    )
  }

}

object CloudEvent{

    given RW[CloudEvent] = CloudEventData.readWriter.bimap[CloudEvent](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case id extends Fields("id")
            case source extends Fields("source")
            case specversion extends Fields("specversion")
            case `type` extends Fields("`type`")
            case datacontenttype extends Fields("datacontenttype")
            case dataschema extends Fields("dataschema")
            case subject extends Fields("subject")
            case time extends Fields("time")
            case data extends Fields("data")
            case dataBase64 extends Fields("dataBase64")
    }


}

