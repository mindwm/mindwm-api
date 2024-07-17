/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package MindWM.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param input User input
 * @param output Command output (mix of stdout & stderr)
 * @param ps1 ps1 (prompt) AFTER the input and output
 */


data class TmuxPaneIoDocument (

    /* User input */
    @Json(name = "input")
    val input: kotlin.String,

    /* Command output (mix of stdout & stderr) */
    @Json(name = "output")
    val output: kotlin.String,

    /* ps1 (prompt) AFTER the input and output */
    @Json(name = "ps1")
    val ps1: kotlin.String

) : kotlin.collections.HashMap<String, kotlin.Any>() {


}
