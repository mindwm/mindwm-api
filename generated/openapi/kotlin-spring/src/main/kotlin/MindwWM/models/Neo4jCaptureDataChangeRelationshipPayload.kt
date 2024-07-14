package MindwWM.models

import java.util.Objects
import MindwWM.models.Neo4jCaptureDataChangeRelationshipPayloadEnd
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
 * @param after 
 * @param before 
 * @param end 
 * @param id 
 * @param label 
 * @param start 
 * @param type 
 */
data class Neo4jCaptureDataChangeRelationshipPayload(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("after", required = true) val after: kotlin.Any,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("before", required = true) val before: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("end", required = true) val end: Neo4jCaptureDataChangeRelationshipPayloadEnd,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("label", required = true) val label: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("start", required = true) val start: Neo4jCaptureDataChangeRelationshipPayloadEnd,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("type", required = true) val type: kotlin.String
) {

}
