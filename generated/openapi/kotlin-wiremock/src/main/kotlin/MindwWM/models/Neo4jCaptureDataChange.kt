@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package MindwWM.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Neo4jCaptureDataChange(
    @field:JsonProperty("headers")
    val headers: kotlin.collections.Map<kotlin.String, kotlin.Any>,

    @field:JsonProperty("message_key")
    val messageKey: kotlin.String,

    @field:JsonProperty("meta")
    val meta: Neo4jCaptureDataChangeMeta,

    @field:JsonProperty("offset")
    val offset: kotlin.Int,

    @field:JsonProperty("partition")
    val partition: kotlin.Int,

    @field:JsonProperty("source_type")
    val sourceType: kotlin.String,

    @field:JsonProperty("timestamp")
    val timestamp: java.time.OffsetDateTime,

    @field:JsonProperty("topic")
    val topic: kotlin.String,

    @field:JsonProperty("schema")
    val schema: Neo4jCaptureDataChangeSchema,

    @field:JsonProperty("payload")
    val payload: Neo4jCaptureDataChangePayload,

)
