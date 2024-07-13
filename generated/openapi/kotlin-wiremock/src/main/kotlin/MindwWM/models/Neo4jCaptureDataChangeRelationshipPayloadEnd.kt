@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package MindwWM.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Neo4jCaptureDataChangeRelationshipPayloadEnd(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("ids")
    val ids: kotlin.collections.Map<kotlin.String, kotlin.Any>,

    @field:JsonProperty("labels")
    val labels: kotlin.collections.List<kotlin.String>,

)
