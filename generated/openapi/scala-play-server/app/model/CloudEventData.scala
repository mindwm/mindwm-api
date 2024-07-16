package model

import play.api.libs.json._

/**
  * The event payload.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-16T19:21:21.540878690Z[Etc/UTC]", comments = "Generator version: 7.7.0")
case class CloudEventData(
  additionalProperties: 
)

object CloudEventData {
  implicit lazy val cloudEventDataJsonFormat: Format[CloudEventData] = {
    
    val innerFormat = Format.of[]
    
    Format(
      innerFormat.map(inner => CloudEventData(inner)),
      cloudEventData => innerFormat.writes(cloudEventData.additionalProperties
    )
    
  }
}

