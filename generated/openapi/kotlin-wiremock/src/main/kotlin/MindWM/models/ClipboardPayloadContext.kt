@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package MindWM.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ClipboardPayloadContext(
    @field:JsonProperty("window")
    val window: kotlin.String? = null,

)
