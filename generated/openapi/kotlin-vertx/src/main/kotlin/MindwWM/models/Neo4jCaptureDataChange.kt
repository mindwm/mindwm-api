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

import MindwWM.models.Neo4jCaptureDataChangeMeta
import MindwWM.models.Neo4jCaptureDataChangePayload
import MindwWM.models.Neo4jCaptureDataChangeSchema

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param headers 
 * @param messageKey 
 * @param meta 
 * @param offset 
 * @param partition 
 * @param sourceType 
 * @param timestamp 
 * @param topic 
 * @param schema 
 * @param payload 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class Neo4jCaptureDataChange (
    @SerializedName("headers") private val _headers: kotlin.collections.Map<kotlin.String, kotlin.Any>?,
    @SerializedName("messageKey") private val _messageKey: kotlin.String?,
    @SerializedName("meta") private val _meta: Neo4jCaptureDataChangeMeta?,
    @SerializedName("offset") private val _offset: kotlin.Int?,
    @SerializedName("partition") private val _partition: kotlin.Int?,
    @SerializedName("sourceType") private val _sourceType: kotlin.String?,
    @SerializedName("timestamp") private val _timestamp: java.time.OffsetDateTime?,
    @SerializedName("topic") private val _topic: kotlin.String?,
    @SerializedName("schema") private val _schema: Neo4jCaptureDataChangeSchema?,
    @SerializedName("payload") private val _payload: Neo4jCaptureDataChangePayload?
) {

        val headers get() = _headers ?: throw IllegalArgumentException("headers is required")
                    
        val messageKey get() = _messageKey ?: throw IllegalArgumentException("messageKey is required")
                    
        val meta get() = _meta ?: throw IllegalArgumentException("meta is required")
                    
        val offset get() = _offset ?: throw IllegalArgumentException("offset is required")
                    
        val partition get() = _partition ?: throw IllegalArgumentException("partition is required")
                    
        val sourceType get() = _sourceType ?: throw IllegalArgumentException("sourceType is required")
                    
        val timestamp get() = _timestamp ?: throw IllegalArgumentException("timestamp is required")
                    
        val topic get() = _topic ?: throw IllegalArgumentException("topic is required")
                    
        val schema get() = _schema ?: throw IllegalArgumentException("schema is required")
                    
        val payload get() = _payload ?: throw IllegalArgumentException("payload is required")
                    
}

