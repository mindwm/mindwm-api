package MindWM.models

import java.util.Objects
import MindWM.models.GraphRelationshipAllOfData
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param source 
 * @param specversion The version of the CloudEvents specification which the event uses.
 * @param type 
 * @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
 * @param dataschema Identifies the schema that data adheres to.
 * @param subject Describes the subject of the event in the context of the event producer (identified by source).
 * @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
 * @param &#x60;data&#x60; 
 * @param dataBase64 Base64 encoded event payload. Must adhere to RFC4648.
 */
data class GraphRelationship(

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Identifies the event.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("source", required = true) val source: GraphRelationship.Source,

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "The version of the CloudEvents specification which the event uses.")
    @get:JsonProperty("specversion", required = true) val specversion: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("type", required = true) val type: GraphRelationship.Type,

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
    @get:JsonProperty("data") val `data`: GraphRelationshipAllOfData? = null,

    @Schema(example = "null", description = "Base64 encoded event payload. Must adhere to RFC4648.")
    @get:JsonProperty("data_base64") val dataBase64: kotlin.String? = null
) : kotlin.collections.HashMap<String, kotlin.Any>{

    /**
    * 
    * Values: graphPeriodRelationship
    */
    enum class Source(val value: kotlin.String) {

        @JsonProperty("graph.relationship") graphPeriodRelationship("graph.relationship")
    }

    /**
    * 
    * Values: created,updated,deleted
    */
    enum class Type(val value: kotlin.String) {

        @JsonProperty("created") created("created"),
        @JsonProperty("updated") updated("updated"),
        @JsonProperty("deleted") deleted("deleted")
    }

}

