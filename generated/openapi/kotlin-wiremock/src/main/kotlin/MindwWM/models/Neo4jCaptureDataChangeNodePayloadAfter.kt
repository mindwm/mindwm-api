@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package MindwWM.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Neo4jCaptureDataChangeNodePayloadAfter(
    @field:JsonProperty("labels")
    val labels: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("properties")
    val properties: kotlin.collections.Map<kotlin.String, kotlin.Any>,

)
