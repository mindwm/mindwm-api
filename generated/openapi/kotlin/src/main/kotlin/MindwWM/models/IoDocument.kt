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

package MindwWM.models

import MindwWM.models.TmuxPaneIoDocument

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id Identifies the event.
 * @param source 
 * @param specversion The version of the CloudEvents specification which the event uses.
 * @param type 
 * @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
 * @param dataschema Identifies the schema that data adheres to.
 * @param subject 
 * @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
 * @param `data` 
 * @param dataBase64 Base64 encoded event payload. Must adhere to RFC4648.
 */


data class IoDocument (

    /* Identifies the event. */
    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "source")
    val source: kotlin.String,

    /* The version of the CloudEvents specification which the event uses. */
    @Json(name = "specversion")
    val specversion: kotlin.String,

    @Json(name = "type")
    val type: kotlin.String = "IoDocument",

    /* Content type of the data value. Must adhere to RFC 2046 format. */
    @Json(name = "datacontenttype")
    val datacontenttype: kotlin.String? = null,

    /* Identifies the schema that data adheres to. */
    @Json(name = "dataschema")
    val dataschema: java.net.URI? = null,

    @Json(name = "subject")
    val subject: kotlin.String? = "IoDocument",

    /* Timestamp of when the occurrence happened. Must adhere to RFC 3339. */
    @Json(name = "time")
    val time: java.time.OffsetDateTime? = null,

    @Json(name = "data")
    val `data`: TmuxPaneIoDocument? = null,

    /* Base64 encoded event payload. Must adhere to RFC4648. */
    @Json(name = "data_base64")
    val dataBase64: kotlin.String? = null

) : kotlin.collections.HashMap<String, kotlin.Any>() {


}
