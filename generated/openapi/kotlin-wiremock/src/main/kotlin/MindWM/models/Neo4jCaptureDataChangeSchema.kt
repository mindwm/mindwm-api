@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package MindWM.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Neo4jCaptureDataChangeSchema(
    @field:JsonProperty("constraints")
    val constraints: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("properties")
    val properties: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

)
