@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package MindWM.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Neo4jCaptureDataChangeMetaSource(
    @field:JsonProperty("hostname")
    val hostname: kotlin.String,

)
