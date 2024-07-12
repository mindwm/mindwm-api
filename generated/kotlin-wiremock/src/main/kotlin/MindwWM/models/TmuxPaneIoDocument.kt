@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package MindwWM.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TmuxPaneIoDocument(
    @field:JsonProperty("input")
    val input: kotlin.String,

    @field:JsonProperty("output")
    val output: kotlin.String,

    @field:JsonProperty("ps1")
    val ps1: kotlin.String,

)
