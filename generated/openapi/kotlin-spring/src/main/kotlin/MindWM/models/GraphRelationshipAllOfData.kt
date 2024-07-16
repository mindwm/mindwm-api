package MindWM.models

import java.util.Objects
import MindWM.models.Neo4jCaptureDataChangeMeta
import MindWM.models.Neo4jCaptureDataChangeRelationshipPayload
import MindWM.models.Neo4jCaptureDataChangeSchema
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
 * @param headers 
 * @param messageKey 
 * @param meta 
 * @param offset 
 * @param partition 
 * @param sourceType 
 * @param timestamp 
 * @param topic 
 * @param schema 
 * @param payload 
 */
data class GraphRelationshipAllOfData(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("headers", required = true) val headers: kotlin.Any,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("message_key", required = true) val messageKey: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("meta", required = true) val meta: Neo4jCaptureDataChangeMeta,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("offset", required = true) val offset: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("partition", required = true) val partition: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("source_type", required = true) val sourceType: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("timestamp", required = true) val timestamp: java.time.OffsetDateTime,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("topic", required = true) val topic: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("schema", required = true) val schema: Neo4jCaptureDataChangeSchema,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("payload", required = true) val payload: Neo4jCaptureDataChangeRelationshipPayload
) {

}

