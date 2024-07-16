package MindWM.models

import java.util.Objects
import MindWM.models.Neo4jCaptureDataChangeNodePayloadAfter
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
 * @param id 
 * @param type 
 */
data class Neo4jCaptureDataChangeNodePayload(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("after", required = true) val after: Neo4jCaptureDataChangeNodePayloadAfter,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("before", required = true) val before: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("type", required = true) val type: kotlin.String
) {

}

