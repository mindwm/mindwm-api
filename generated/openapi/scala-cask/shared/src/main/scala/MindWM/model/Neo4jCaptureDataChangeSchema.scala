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
import MindWM.model.oas_any_type_not_mapped
import ujson.Value
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class Neo4jCaptureDataChangeSchema(
  constraints: Option[Value] = Map.empty ,

    properties: Option[Value] = Map.empty 

  ) {

  def asJson: String = asData.asJson

  def asData : Neo4jCaptureDataChangeSchemaData = {
    Neo4jCaptureDataChangeSchemaData(
            constraints = constraints,
            properties = properties
    )
  }

}

object Neo4jCaptureDataChangeSchema{

    given RW[Neo4jCaptureDataChangeSchema] = Neo4jCaptureDataChangeSchemaData.readWriter.bimap[Neo4jCaptureDataChangeSchema](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case constraints extends Fields("constraints")
            case properties extends Fields("properties")
    }


}
