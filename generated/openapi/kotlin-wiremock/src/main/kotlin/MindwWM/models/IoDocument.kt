@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package MindwWM.models

import com.fasterxml.jackson.annotation.JsonProperty

data class IoDocument(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("source")
    val source: kotlin.String,

    @field:JsonProperty("specversion")
    val specversion: kotlin.String,

    @field:JsonProperty("type")
    val type: kotlin.String = "IoDocument",

    @field:JsonProperty("datacontenttype")
    val datacontenttype: kotlin.String? = null,

    @field:JsonProperty("dataschema")
    val dataschema: java.net.URI? = null,

    @field:JsonProperty("subject")
    val subject: kotlin.String? = "IoDocument",

    @field:JsonProperty("time")
    val time: java.time.OffsetDateTime? = null,

    @field:JsonProperty("data")
    val `data`: TmuxPaneIoDocument? = null,

    @field:JsonProperty("data_base64")
    val dataBase64: kotlin.String? = null,

)
