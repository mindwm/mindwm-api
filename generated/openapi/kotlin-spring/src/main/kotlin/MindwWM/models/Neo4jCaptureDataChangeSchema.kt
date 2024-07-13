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
 * @param constraints 
 * @param properties 
 */
data class Neo4jCaptureDataChangeSchema(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("constraints") val constraints: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("properties") val properties: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null
) {

}

