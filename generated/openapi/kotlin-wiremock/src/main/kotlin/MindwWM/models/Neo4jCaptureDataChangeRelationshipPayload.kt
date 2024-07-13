@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package MindwWM.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Neo4jCaptureDataChangeRelationshipPayload(
    @field:JsonProperty("after")
    val after: kotlin.Any,

    @field:JsonProperty("before")
    val before: kotlin.String,

    @field:JsonProperty("end")
    val end: Neo4jCaptureDataChangeRelationshipPayloadEnd,

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("label")
    val label: kotlin.String,

    @field:JsonProperty("start")
    val start: Neo4jCaptureDataChangeRelationshipPayloadEnd,

    @field:JsonProperty("type")
    val type: kotlin.String,

)
