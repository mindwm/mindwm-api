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

// this model was generated using modelTest.mustache
package MindwWM.model
import MindwWM.model.Neo4jCaptureDataChangeMetaSource

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import scala.util.*

class Neo4jCaptureDataChangeMetaTest extends AnyWordSpec with Matchers {

    "Neo4jCaptureDataChangeMeta.fromJson" should {
        """not parse invalid json""" in {
           val Failure(err) = Try(Neo4jCaptureDataChangeMetaData.fromJsonString("invalid jason"))
           err.getMessage should startWith ("Error parsing json 'invalid jason'")
        }
        """parse """ ignore {
           val Failure(err : ValidationErrors) = Neo4jCaptureDataChangeMetaData.fromJsonString("""""").validated()

           sys.error("TODO")
        }
    }

}