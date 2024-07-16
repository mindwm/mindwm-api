@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package MindWM.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Neo4jCaptureDataChangeMeta(
    @field:JsonProperty("operation")
    val operation: kotlin.String,

    @field:JsonProperty("source")
    val source: Neo4jCaptureDataChangeMetaSource,

    @field:JsonProperty("timestamp")
    val timestamp: kotlin.Int,

    @field:JsonProperty("txEventId")
    val txEventId: kotlin.Int,

    @field:JsonProperty("txEventsCount")
    val txEventsCount: kotlin.Int,

    @field:JsonProperty("txId")
    val txId: kotlin.Int,

    @field:JsonProperty("username")
    val username: kotlin.String,

)
