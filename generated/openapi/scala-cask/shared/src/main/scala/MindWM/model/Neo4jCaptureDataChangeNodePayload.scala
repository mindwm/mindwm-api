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
import MindWM.model.Neo4jCaptureDataChangeNodePayloadAfter
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class Neo4jCaptureDataChangeNodePayload(
  after: Neo4jCaptureDataChangeNodePayloadAfter,

    before: String,

    id: String,

    `type`: String

  ) {

  def asJson: String = asData.asJson

  def asData : Neo4jCaptureDataChangeNodePayloadData = {
    Neo4jCaptureDataChangeNodePayloadData(
            after = after,
            before = before,
            id = id,
            `type` = `type`
    )
  }

}

object Neo4jCaptureDataChangeNodePayload{

    given RW[Neo4jCaptureDataChangeNodePayload] = Neo4jCaptureDataChangeNodePayloadData.readWriter.bimap[Neo4jCaptureDataChangeNodePayload](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case after extends Fields("after")
            case before extends Fields("before")
            case id extends Fields("id")
            case `type` extends Fields("`type`")
    }


}
