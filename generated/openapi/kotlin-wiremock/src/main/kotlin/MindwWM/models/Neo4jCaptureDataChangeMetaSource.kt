@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package MindwWM.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Neo4jCaptureDataChangeMetaSource(
    @field:JsonProperty("hostname")
    val hostname: kotlin.String,

)
