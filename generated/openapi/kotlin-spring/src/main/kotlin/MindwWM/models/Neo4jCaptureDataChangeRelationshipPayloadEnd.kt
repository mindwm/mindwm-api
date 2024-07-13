package MindwWM.models

import java.util.Objects
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
 * @param id 
 * @param ids 
 * @param labels 
 */
data class Neo4jCaptureDataChangeRelationshipPayloadEnd(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("ids", required = true) val ids: kotlin.collections.Map<kotlin.String, kotlin.Any>,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("labels", required = true) val labels: kotlin.collections.List<kotlin.String>
) {

}

