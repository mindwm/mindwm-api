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
data class Neo4jCaptureDataChange(
    val headers: kotlin.collections.Map<kotlin.String, kotlin.Any>,
    val messageKey: kotlin.String,
    val meta: Neo4jCaptureDataChangeMeta,
    val offset: kotlin.Int,
    val partition: kotlin.Int,
    val sourceType: kotlin.String,
    val timestamp: java.time.OffsetDateTime,
    val topic: kotlin.String,
    val schema: Neo4jCaptureDataChangeSchema,
    val payload: Neo4jCaptureDataChangePayload
) 
