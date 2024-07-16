package MindWM.models

import java.util.Objects
import MindWM.models.ClipboardPayloadContext
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param start Starting position of clipboard selection [x,y]
 * @param stop Ending position of clipboard selection [x,y]
 * @param &#x60;data&#x60; Clipboard data
 * @param type Clipboard type
 * @param context 
 */
data class ClipboardPayload(

    @get:Size(min=2,max=2) 
    @Schema(example = "null", description = "Starting position of clipboard selection [x,y]")
    @get:JsonProperty("start") val start: kotlin.collections.List<kotlin.Int>? = null,

    @get:Size(min=2,max=2) 
    @Schema(example = "null", description = "Ending position of clipboard selection [x,y]")
    @get:JsonProperty("stop") val stop: kotlin.collections.List<kotlin.Int>? = null,

    @get:Size(min=1)
    @Schema(example = "null", description = "Clipboard data")
    @get:JsonProperty("data") val `data`: kotlin.String? = null,

    @Schema(example = "null", description = "Clipboard type")
    @get:JsonProperty("type") val type: ClipboardPayload.Type? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("context") val context: ClipboardPayloadContext? = null
) {

    /**
    * Clipboard type
    * Values: primary,secondary,clipboard
    */
    enum class Type(val value: kotlin.String) {

        @JsonProperty("primary") primary("primary"),
        @JsonProperty("secondary") secondary("secondary"),
        @JsonProperty("clipboard") clipboard("clipboard")
    }

}

