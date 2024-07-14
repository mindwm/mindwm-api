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

import MindwWM.models.Neo4jCaptureDataChangeNodePayload
import MindwWM.models.Neo4jCaptureDataChangeRelationshipPayload
import MindwWM.models.Neo4jCaptureDataChangeRelationshipPayloadEnd

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param after 
 * @param before 
 * @param id 
 * @param type 
 * @param end 
 * @param label 
 * @param start 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class Neo4jCaptureDataChangePayload (
    @SerializedName("after") private val _after: kotlin.Any?,
    @SerializedName("before") private val _before: kotlin.String?,
    @SerializedName("id") private val _id: kotlin.String?,
    @SerializedName("type") private val _type: kotlin.String?,
    @SerializedName("end") private val _end: Neo4jCaptureDataChangeRelationshipPayloadEnd?,
    @SerializedName("label") private val _label: kotlin.String?,
    @SerializedName("start") private val _start: Neo4jCaptureDataChangeRelationshipPayloadEnd?
) {

        val after get() = _after ?: throw IllegalArgumentException("after is required")
                    
        val before get() = _before ?: throw IllegalArgumentException("before is required")
                    
        val id get() = _id ?: throw IllegalArgumentException("id is required")
                    
        val type get() = _type ?: throw IllegalArgumentException("type is required")
                    
        val end get() = _end ?: throw IllegalArgumentException("end is required")
                    
        val label get() = _label ?: throw IllegalArgumentException("label is required")
                    
        val start get() = _start ?: throw IllegalArgumentException("start is required")
                    
}
