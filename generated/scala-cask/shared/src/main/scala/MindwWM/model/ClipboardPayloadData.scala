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
package MindwWM.model
import MindwWM.model.ClipboardPayloadContext
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** ClipboardPayloadData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class ClipboardPayloadData(
/* Starting position of clipboard selection [x,y] */
  start: Seq[Int] = Nil ,

  /* Ending position of clipboard selection [x,y] */
  stop: Seq[Int] = Nil ,

  /* Clipboard data */
  data: String = "" ,

  /* Clipboard type */
  `type`: ClipboardPayload.&#x60;type&#x60;Enum = null ,

    context: ClipboardPayloadContextData = null 

  ) {

  def asJson: String = write(this)

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val errors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ==================
        // start






        



        // validate min items 2
        if (errors.isEmpty || !failFast) {
          val len = if start == null then 0 else start.size
            if (len < 2) {
               errors += ValidationError(path :+ ClipboardPayload.Fields.start, s"start has $len, which is less than the min items 2")
            }
        }

        // validate min items 2
        if (errors.isEmpty || !failFast) {
          val len = if start == null then 0 else start.size
            if (len > 2) {
               errors += ValidationError(path :+ ClipboardPayload.Fields.start, s"start has $len, which is greater than the max items 2")
            }
        }



        

        // ==================
        // stop






        



        // validate min items 2
        if (errors.isEmpty || !failFast) {
          val len = if stop == null then 0 else stop.size
            if (len < 2) {
               errors += ValidationError(path :+ ClipboardPayload.Fields.stop, s"stop has $len, which is less than the min items 2")
            }
        }

        // validate min items 2
        if (errors.isEmpty || !failFast) {
          val len = if stop == null then 0 else stop.size
            if (len > 2) {
               errors += ValidationError(path :+ ClipboardPayload.Fields.stop, s"stop has $len, which is greater than the max items 2")
            }
        }



        

        // ==================
        // data



        // validate min length 1
        if (errors.isEmpty || !failFast)  {
          val len = if data == null then 0 else data.length
            if (len < 1) {
               errors += ValidationError(path :+ ClipboardPayload.Fields.data, s"length $len is shorter than the min length 1")
            }
        }



        







        

        // ==================
        // `type`






        







        

        // ==================
        // context






        







        
        // validating context
        if (errors.isEmpty || !failFast) {
            if context != null then errors ++= context.validationErrors(path :+ ClipboardPayload.Fields.context, failFast)
        }

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[ClipboardPayload] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : ClipboardPayload = {
    ClipboardPayload(
        start = 
        start
        
        ,
        stop = 
        stop
        
        ,
        data = Option(
        data
        )
        ,
        `type` = Option(
        `type`
        )
        ,
        context = Option(
        context
        )
        .map(_.asModel)
    )
  }
}

object ClipboardPayloadData {

  given readWriter : RW[ClipboardPayloadData] = macroRW

  def fromJsonString(jason : String) : ClipboardPayloadData = try {
        read[ClipboardPayloadData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[ClipboardPayloadData] = try {
        read[List[ClipboardPayloadData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[ClipboardPayload]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[ClipboardPayload]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, ClipboardPayloadData] = try {
        read[Map[String, ClipboardPayloadData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, ClipboardPayload]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, ClipboardPayload]())) {
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

