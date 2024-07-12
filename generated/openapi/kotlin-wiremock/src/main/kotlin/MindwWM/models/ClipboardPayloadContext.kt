@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package MindwWM.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ClipboardPayloadContext(
    @field:JsonProperty("window")
    val window: kotlin.String? = null,

)
