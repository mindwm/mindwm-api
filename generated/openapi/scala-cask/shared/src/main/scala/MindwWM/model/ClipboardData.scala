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
import MindwWM.model.ClipboardPayload
import MindwWM.model.URI
import MindwWM.model.oas_any_type_not_mapped
import java.time.OffsetDateTime
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

/** ClipboardData a data transfer object, primarily for simple json serialisation.
  * It has no validation - there may be nulls, values out of range, etc
  */
case class ClipboardData(
  `type`: String = "" ,

    source: String = "" ,

    data: ClipboardPayloadData = null ,

  /* Identifies the event. */
  id: String,

  /* The version of the CloudEvents specification which the event uses. */
  specversion: String,

  /* Content type of the data value. Must adhere to RFC 2046 format. */
  datacontenttype: String = "" ,

  /* Identifies the schema that data adheres to. */
  dataschema: URI = "" ,

    subject: String = "" ,

  /* Timestamp of when the occurrence happened. Must adhere to RFC 3339. */
  time: OffsetDateTime = null ,

  /* Base64 encoded event payload. Must adhere to RFC4648. */
  dataBase64: String = "" 

  ) {

  def asJson: String = write(this)

  def validationErrors(path : Seq[Field], failFast : Boolean) : Seq[ValidationError] = {
    val errors = scala.collection.mutable.ListBuffer[ValidationError]()
        // ==================
        // `type`






        







        

        // ==================
        // source
        // validate against pattern '[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)$'
        if (errors.isEmpty || !failFast) {
           val regex = """[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)$"""
           if source == null || !regex.r.matches(source) then
              errors += ValidationError(path :+ Clipboard.Fields.source, s"value '$source' doesn't match pattern $regex")
        }






        







        

        // ==================
        // data






        







        
        // validating data
        if (errors.isEmpty || !failFast) {
            if data != null then errors ++= data.validationErrors(path :+ Clipboard.Fields.data, failFast)
        }

        // ==================
        // id



        // validate min length 1
        if (errors.isEmpty || !failFast)  {
          val len = if id == null then 0 else id.length
            if (len < 1) {
               errors += ValidationError(path :+ Clipboard.Fields.id, s"length $len is shorter than the min length 1")
            }
        }



        







        

        // ==================
        // specversion



        // validate min length 1
        if (errors.isEmpty || !failFast)  {
          val len = if specversion == null then 0 else specversion.length
            if (len < 1) {
               errors += ValidationError(path :+ Clipboard.Fields.specversion, s"length $len is shorter than the min length 1")
            }
        }



        







        

        // ==================
        // datacontenttype



        // validate min length 1
        if (errors.isEmpty || !failFast)  {
          val len = if datacontenttype == null then 0 else datacontenttype.length
            if (len < 1) {
               errors += ValidationError(path :+ Clipboard.Fields.datacontenttype, s"length $len is shorter than the min length 1")
            }
        }



        







        

        // ==================
        // dataschema



        // validate min length 1
        if (errors.isEmpty || !failFast)  {
          val len = if dataschema == null then 0 else dataschema.length
            if (len < 1) {
               errors += ValidationError(path :+ Clipboard.Fields.dataschema, s"length $len is shorter than the min length 1")
            }
        }



        







        

        // ==================
        // subject






        







        

        // ==================
        // time



        // validate min length 1
        if (errors.isEmpty || !failFast)  {
          val len = if time == null then 0 else time.length
            if (len < 1) {
               errors += ValidationError(path :+ Clipboard.Fields.time, s"length $len is shorter than the min length 1")
            }
        }



        







        

        // ==================
        // dataBase64






        







        

    errors.toSeq
  }

  def validated(failFast : Boolean = false) : scala.util.Try[Clipboard] = {
    validationErrors(Vector(), failFast) match {
      case Seq() => Success(asModel)
      case first +: theRest => Failure(ValidationErrors(first, theRest))
    }
  }

  /** use 'validated' to check validation */
  def asModel : Clipboard = {
    Clipboard(
        `type` = Option(
        `type`
        )
        ,
        source = Option(
        source
        )
        ,
        data = Option(
        data
        )
        .map(_.asModel),
        id = 
        id
        
        ,
        specversion = 
        specversion
        
        ,
        datacontenttype = Option(
        datacontenttype
        )
        ,
        dataschema = Option(
        dataschema
        )
        ,
        subject = Option(
        subject
        )
        ,
        time = Option(
        time
        )
        ,
        dataBase64 = Option(
        dataBase64
        )
        
    )
  }
}

object ClipboardData {

  given readWriter : RW[ClipboardData] = macroRW

  def fromJsonString(jason : String) : ClipboardData = try {
        read[ClipboardData](jason)
     } catch {
          case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
     }

  def manyFromJsonString(jason : String) : Seq[ClipboardData] = try {
        read[List[ClipboardData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as list: $e")
    }

  def manyFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Seq[Clipboard]] = {
      Try(manyFromJsonString(jason)).flatMap { list =>
        list.zipWithIndex.foldLeft(Try(Vector[Clipboard]())) {
          case (Success(list), (next, i)) => 
            next.validated(failFast) match {
              case Success(ok) => Success(list :+ ok)
              case Failure(err) => Failure(new Exception(s"Validation error on element $i: ${err.getMessage}", err))
            }
          case (fail, _)  => fail
        }
      }
    }

  def mapFromJsonString(jason : String) : Map[String, ClipboardData] = try {
        read[Map[String, ClipboardData]](jason)
    } catch {
        case NonFatal(e) => sys.error(s"Error parsing json '$jason' as map: $e")
    }


  def mapFromJsonStringValidated(jason : String, failFast : Boolean = false) : Try[Map[String, Clipboard]] = {
     Try(mapFromJsonString(jason)).flatMap { map =>
       map.foldLeft(Try(Map[String, Clipboard]())) {
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
