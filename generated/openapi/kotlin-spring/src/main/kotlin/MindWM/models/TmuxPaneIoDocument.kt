package MindWM.models

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
 * 
 * @param input User input
 * @param output Command output (mix of stdout & stderr)
 * @param ps1 ps1 (prompt) AFTER the input and output
 */
data class TmuxPaneIoDocument(

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "User input")
    @get:JsonProperty("input", required = true) val input: kotlin.String,

    @get:Size(min=0)
    @Schema(example = "null", required = true, description = "Command output (mix of stdout & stderr)")
    @get:JsonProperty("output", required = true) val output: kotlin.String,

    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "ps1 (prompt) AFTER the input and output")
    @get:JsonProperty("ps1", required = true) val ps1: kotlin.String
) : kotlin.collections.HashMap<String, kotlin.Any>{

}

