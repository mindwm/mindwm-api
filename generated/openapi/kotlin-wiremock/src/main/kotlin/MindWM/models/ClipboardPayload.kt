@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package MindWM.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ClipboardPayload(
    @field:JsonProperty("start")
    val start: kotlin.collections.List<kotlin.Int>? = null,

    @field:JsonProperty("stop")
    val stop: kotlin.collections.List<kotlin.Int>? = null,

    @field:JsonProperty("data")
    val `data`: kotlin.String? = null,

    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    @field:JsonProperty("context")
    val context: ClipboardPayloadContext? = null,

)
