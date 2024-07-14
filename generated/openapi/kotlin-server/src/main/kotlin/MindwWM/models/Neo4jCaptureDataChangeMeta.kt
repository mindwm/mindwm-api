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

import MindwWM.models.Neo4jCaptureDataChangeMetaSource

/**
 * 
 * @param operation 
 * @param source 
 * @param timestamp 
 * @param txEventId 
 * @param txEventsCount 
 * @param txId 
 * @param username 
 */
data class Neo4jCaptureDataChangeMeta(
    val operation: kotlin.String,
    val source: Neo4jCaptureDataChangeMetaSource,
    val timestamp: kotlin.Int,
    val txEventId: kotlin.Int,
    val txEventsCount: kotlin.Int,
    val txId: kotlin.Int,
    val username: kotlin.String
) 
