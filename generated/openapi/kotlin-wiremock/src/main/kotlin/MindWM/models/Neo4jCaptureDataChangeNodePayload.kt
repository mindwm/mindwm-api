@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package MindWM.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Neo4jCaptureDataChangeNodePayload(
    @field:JsonProperty("after")
    val after: Neo4jCaptureDataChangeNodePayloadAfter,

    @field:JsonProperty("before")
    val before: kotlin.String,

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("type")
    val type: kotlin.String,

)
