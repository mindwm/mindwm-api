package MindWM.models

import java.util.Objects
import MindWM.models.TmuxPaneIoDocument
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
 * 
 * @param id Identifies the event.
 * @param specversion The version of the CloudEvents specification which the event uses.
 * @param type 
 * @param source 
 * @param &#x60;data&#x60; 
 * @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
 * @param dataschema Identifies the schema that data adheres to.
 * @param subject 
 * @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
 * @param dataBase64 Base64 encoded event payload. Must adhere to RFC4648.
 */
data class IoDocument(

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Identifies the event.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @get:Pattern(regexp="[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)\\\\.tmux\\\\.[A-Za-z0-9+/]*={0,2}\\.[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}\\\\.[0-9]+?\\\\.[0-9]+?\\\\.tiodocument$")
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("source", required = true) val source: kotlin.String,

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "The version of the CloudEvents specification which the event uses.")
    @get:JsonProperty("specversion", required = true) val specversion: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("type", required = true) val type: kotlin.String = "IoDocument",

    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @get:Pattern(regexp="[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)\\\\.tmux\\\\.[A-Za-z0-9+/]*={0,2}\\.[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}\\\\.[0-9]+?\\\\.[0-9]+?\\\\.tiodocument$")
    @Schema(example = "null", description = "")
    @get:JsonProperty("source") val source: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("data") val `data`: TmuxPaneIoDocument? = null,

    @get:Size(min=1)
    @Schema(example = "null", description = "Content type of the data value. Must adhere to RFC 2046 format.")
    @get:JsonProperty("datacontenttype") val datacontenttype: kotlin.String? = null,

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", description = "Identifies the schema that data adheres to.")
    @get:JsonProperty("dataschema") val dataschema: java.net.URI? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("subject") val subject: kotlin.String? = "IoDocument",

    @get:Size(min=1)
    @Schema(example = "null", description = "Timestamp of when the occurrence happened. Must adhere to RFC 3339.")
    @get:JsonProperty("time") val time: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "Base64 encoded event payload. Must adhere to RFC4648.")
    @get:JsonProperty("data_base64") val dataBase64: kotlin.String? = null
) : kotlin.collections.HashMap<String, kotlin.Any>{

}

