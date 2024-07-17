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

// this model was generated using modelData.mustache
package MindWM.model
import MindWM.model.Neo4jCaptureDataChangeNodePayloadAfter
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** Neo4jCaptureDataChangeNodePayloadData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class Neo4jCaptureDataChangeNodePayloadData(
  after: Neo4jCaptureDataChangeNodePayloadAfterData,

    before: String,

    id: String,

    `type`: String

  ) {

  def asJson: String = write(this)

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val errors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ==================
        // after






        
        if (errors.isEmpty || !failFast) {
            if (after == null) {
            errors += ValidationError(path :+ Neo4jCaptureDataChangeNodePayload.Fields.after, "after is a required field and cannot be null")
            }
        }
        







        
        // validating after
        if (errors.isEmpty || !failFast) {
            if after != null then errors ++= after.validationErrors(path :+ Neo4jCaptureDataChangeNodePayload.Fields.after, failFast)
        }

        // ==================
        // before






        







        

        // ==================
        // id






        







        

        // ==================
        // `type`






        







        

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[Neo4jCaptureDataChangeNodePayload] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : Neo4jCaptureDataChangeNodePayload = {
    Neo4jCaptureDataChangeNodePayload(
        after = 
        after
        
        ,
        before = 
        before
        
        ,
        id = 
        id
        
        ,
        `type` = 
        `type`
        
        
    )
  }
}

object Neo4jCaptureDataChangeNodePayloadData {

  given readWriter : RW[Neo4jCaptureDataChangeNodePayloadData] = macroRW

  def fromJsonString(jason : String) : Neo4jCaptureDataChangeNodePayloadData = try {
        read[Neo4jCaptureDataChangeNodePayloadData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[Neo4jCaptureDataChangeNodePayloadData] = try {
        read[List[Neo4jCaptureDataChangeNodePayloadData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[Neo4jCaptureDataChangeNodePayload]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[Neo4jCaptureDataChangeNodePayload]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, Neo4jCaptureDataChangeNodePayloadData] = try {
        read[Map[String, Neo4jCaptureDataChangeNodePayloadData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, Neo4jCaptureDataChangeNodePayload]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, Neo4jCaptureDataChangeNodePayload]())) {
         case (Success(map), (key, next)) =>
           next.validated(failFast) match {
             case Success(ok) => Success(map.updated(key, ok))
             case Failure(err) => Failure(new Exception(s"Validation error on element $key: ${err.getMessage}", err))
           }
         case (fail, _) => fail
       }
     }
  }
}
