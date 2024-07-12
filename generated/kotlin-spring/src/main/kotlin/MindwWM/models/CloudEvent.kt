package MindwWM.models

import java.util.Objects
import MindwWM.models.CloudEventData
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * CloudEvents Specification JSON Schema
 * @param id Identifies the event.
 * @param source Identifies the context in which an event happened.
 * @param specversion The version of the CloudEvents specification which the event uses.
 * @param type Describes the type of event related to the originating occurrence.
 * @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
 * @param dataschema Identifies the schema that data adheres to.
 * @param subject Describes the subject of the event in the context of the event producer (identified by source).
 * @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
 * @param &#x60;data&#x60; 
 * @param dataBase64 Base64 encoded event payload. Must adhere to RFC4648.
 */
data class CloudEvent(

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Identifies the event.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Identifies the context in which an event happened.")
    @get:JsonProperty("source", required = true) val source: kotlin.String,

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "The version of the CloudEvents specification which the event uses.")
    @get:JsonProperty("specversion", required = true) val specversion: kotlin.String,

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Describes the type of event related to the originating occurrence.")
    @get:JsonProperty("type", required = true) val type: kotlin.String,

    @get:Size(min=1)
    @Schema(example = "null", description = "Content type of the data value. Must adhere to RFC 2046 format.")
    @get:JsonProperty("datacontenttype") val datacontenttype: kotlin.String? = null,

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", description = "Identifies the schema that data adheres to.")
    @get:JsonProperty("dataschema") val dataschema: java.net.URI? = null,

    @get:Size(min=1)
    @Schema(example = "null", description = "Describes the subject of the event in the context of the event producer (identified by source).")
    @get:JsonProperty("subject") val subject: kotlin.String? = null,

    @get:Size(min=1)
    @Schema(example = "null", description = "Timestamp of when the occurrence happened. Must adhere to RFC 3339.")
    @get:JsonProperty("time") val time: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("data") val `data`: CloudEventData? = null,

    @Schema(example = "null", description = "Base64 encoded event payload. Must adhere to RFC4648.")
    @get:JsonProperty("data_base64") val dataBase64: kotlin.String? = null
) {

}

