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
 * @param id 
 * @param type 
 */
object Neo4jCaptureDataChangeNodePayloads : BaseTable<Neo4jCaptureDataChangeNodePayload>("Neo4jCaptureDataChangeNodePayload") {
    val after = long("after")
    val before = text("before")
    val id = text("id")
    val type = text("type")

    /**
     * Create an entity of type Neo4jCaptureDataChangeNodePayload from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = Neo4jCaptureDataChangeNodePayload(
        after = Neo4jCaptureDataChangeNodePayloadAfters.createEntity(row, withReferences) /* Neo4jCaptureDataChangeNodePayloadAfter */,
        before = row[before] ?: "" /* kotlin.String */,
        id = row[id] ?: "" /* kotlin.String */,
        type = row[type] ?: "" /* kotlin.String */
    )

    /**
    * Assign all the columns from the entity of type Neo4jCaptureDataChangeNodePayload to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = Neo4jCaptureDataChangeNodePayload()
    * database.update(Neo4jCaptureDataChangeNodePayloads, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: Neo4jCaptureDataChangeNodePayload) {
        this.apply {
            set(Neo4jCaptureDataChangeNodePayloads.after, entity.after)
            set(Neo4jCaptureDataChangeNodePayloads.before, entity.before)
            set(Neo4jCaptureDataChangeNodePayloads.id, entity.id)
            set(Neo4jCaptureDataChangeNodePayloads.type, entity.type)
        }
    }

}

