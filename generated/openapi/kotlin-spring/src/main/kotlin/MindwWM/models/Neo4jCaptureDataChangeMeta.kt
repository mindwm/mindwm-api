package MindwWM.models

import java.util.Objects
import MindwWM.models.Neo4jCaptureDataChangeMetaSource
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
 * @param operation 
 * @param source 
 * @param timestamp 
 * @param txEventId 
 * @param txEventsCount 
 * @param txId 
 * @param username 
 */
data class Neo4jCaptureDataChangeMeta(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("operation", required = true) val operation: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("source", required = true) val source: Neo4jCaptureDataChangeMetaSource,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("timestamp", required = true) val timestamp: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("txEventId", required = true) val txEventId: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("txEventsCount", required = true) val txEventsCount: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("txId", required = true) val txId: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("username", required = true) val username: kotlin.String
) {

}

