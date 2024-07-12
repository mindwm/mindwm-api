package MindwWM.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Selection context
 * @param window window id
 */
data class ClipboardPayloadContext(

    @Schema(example = "null", description = "window id")
    @get:JsonProperty("window") val window: kotlin.String? = null
) {

}

