/**
* Mindwm API
* This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
*
* The version of the OpenAPI document: 0.1.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package MindwWM.models

import MindwWM.models.ClipboardPayload
import MindwWM.models.CloudEventData

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param id Identifies the event.
 * @param specversion The version of the CloudEvents specification which the event uses.
 * @param type 
 * @param source 
 * @param &#x60;data&#x60; 
 * @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
 * @param dataschema Identifies the schema that data adheres to.
 * @param subject Describes the subject of the event in the context of the event producer (identified by source).
 * @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
 * @param dataBase64 Base64 encoded event payload. Must adhere to RFC4648.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class Clipboard (
    /* Identifies the event. */
    @SerializedName("id") private val _id: kotlin.String?,
    /* Identifies the context in which an event happened. */
    @SerializedName("source") private val _source: kotlin.String?,
    /* The version of the CloudEvents specification which the event uses. */
    @SerializedName("specversion") private val _specversion: kotlin.String?,
    /* Describes the type of event related to the originating occurrence. */
    @SerializedName("type") private val _type: kotlin.String?,
    val type: kotlin.String? = null,
    val source: kotlin.String? = null,
    val `data`: ClipboardPayload? = null,
    /* Content type of the data value. Must adhere to RFC 2046 format. */
    val datacontenttype: kotlin.String? = null,
    /* Identifies the schema that data adheres to. */
    val dataschema: java.net.URI? = null,
    /* Describes the subject of the event in the context of the event producer (identified by source). */
    val subject: kotlin.String? = null,
    /* Timestamp of when the occurrence happened. Must adhere to RFC 3339. */
    val time: java.time.OffsetDateTime? = null,
    /* Base64 encoded event payload. Must adhere to RFC4648. */
    val dataBase64: kotlin.String? = null
) {

        val id get() = _id ?: throw IllegalArgumentException("id is required")
                    
        val source get() = _source ?: throw IllegalArgumentException("source is required")
                    
        val specversion get() = _specversion ?: throw IllegalArgumentException("specversion is required")
                    
        val type get() = _type ?: throw IllegalArgumentException("type is required")
                    
}

