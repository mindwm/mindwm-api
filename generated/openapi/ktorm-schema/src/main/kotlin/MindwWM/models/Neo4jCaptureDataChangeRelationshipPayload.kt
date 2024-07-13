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

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * 
 * @param after 
 * @param before 
 * @param end 
 * @param id 
 * @param label 
 * @param start 
 * @param type 
 */
object Neo4jCaptureDataChangeRelationshipPayloads : BaseTable<Neo4jCaptureDataChangeRelationshipPayload>("Neo4jCaptureDataChangeRelationshipPayload") {
    val after = blob("after")
    val before = text("before")
    val end = long("end")
    val id = text("id")
    val label = text("label")
    val start = long("start")
    val type = text("type")

    /**
     * Create an entity of type Neo4jCaptureDataChangeRelationshipPayload from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = Neo4jCaptureDataChangeRelationshipPayload(
        after = row[after] /* kotlin.Any */,
        before = row[before] ?: "" /* kotlin.String */,
        end = Neo4jCaptureDataChangeRelationshipPayloadEnds.createEntity(row, withReferences) /* Neo4jCaptureDataChangeRelationshipPayloadEnd */,
        id = row[id] ?: "" /* kotlin.String */,
        label = row[label] ?: "" /* kotlin.String */,
        start = Neo4jCaptureDataChangeRelationshipPayloadEnds.createEntity(row, withReferences) /* Neo4jCaptureDataChangeRelationshipPayloadEnd */,
        type = row[type] ?: "" /* kotlin.String */
    )

    /**
    * Assign all the columns from the entity of type Neo4jCaptureDataChangeRelationshipPayload to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = Neo4jCaptureDataChangeRelationshipPayload()
    * database.update(Neo4jCaptureDataChangeRelationshipPayloads, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: Neo4jCaptureDataChangeRelationshipPayload) {
        this.apply {
            set(Neo4jCaptureDataChangeRelationshipPayloads.after, entity.after)
            set(Neo4jCaptureDataChangeRelationshipPayloads.before, entity.before)
            set(Neo4jCaptureDataChangeRelationshipPayloads.end, entity.end)
            set(Neo4jCaptureDataChangeRelationshipPayloads.id, entity.id)
            set(Neo4jCaptureDataChangeRelationshipPayloads.label, entity.label)
            set(Neo4jCaptureDataChangeRelationshipPayloads.start, entity.start)
            set(Neo4jCaptureDataChangeRelationshipPayloads.type, entity.type)
        }
    }

}


