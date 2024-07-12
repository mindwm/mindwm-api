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
package MindwWM.model
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class CloudEventData(
) {

  def asJson: String = asData.asJson

  def asData : CloudEventDataData = {
    CloudEventDataData(
    )
  }

}

object CloudEventData{

    given RW[CloudEventData] = CloudEventDataData.readWriter.bimap[CloudEventData](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
    }


}

