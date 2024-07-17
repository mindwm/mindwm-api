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
package MindWM.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * 
 * @param id 
 * @param ids 
 * @param labels 
 */
object Neo4jCaptureDataChangeRelationshipPayloadEnds : BaseTable<Neo4jCaptureDataChangeRelationshipPayloadEnd>("Neo4jCaptureDataChangeRelationshipPayload_end") {
    val id = text("id")
    val ids = blob("ids")

    /**
     * Create an entity of type Neo4jCaptureDataChangeRelationshipPayloadEnd from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = Neo4jCaptureDataChangeRelationshipPayloadEnd(
        id = row[id] ?: "" /* kotlin.String */,
        ids = row[ids] /* kotlin.collections.Map<kotlin.String, kotlin.Any> */,
        labels = emptyList() /* kotlin.Array<kotlin.String> */
    )

    /**
    * Assign all the columns from the entity of type Neo4jCaptureDataChangeRelationshipPayloadEnd to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = Neo4jCaptureDataChangeRelationshipPayloadEnd()
    * database.update(Neo4jCaptureDataChangeRelationshipPayloadEnds, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: Neo4jCaptureDataChangeRelationshipPayloadEnd) {
        this.apply {
            set(Neo4jCaptureDataChangeRelationshipPayloadEnds.id, entity.id)
            set(Neo4jCaptureDataChangeRelationshipPayloadEnds.ids, entity.ids)
        }
    }

}


object Neo4jCaptureDataChangeRelationshipPayloadEndLabels : BaseTable<Pair<kotlin.Long, kotlin.String>>("Neo4jCaptureDataChangeRelationshipPayloadEndLabels") {
    val neo4jCaptureDataChangeRelationshipPayloadEnd = long("neo4jCaptureDataChangeRelationshipPayloadEnd")
    val labels = text("labels")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[neo4jCaptureDataChangeRelationshipPayloadEnd] ?: 0, row[labels] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(Neo4jCaptureDataChangeRelationshipPayloadEndLabels.neo4jCaptureDataChangeRelationshipPayloadEnd, entity.first)
            set(Neo4jCaptureDataChangeRelationshipPayloadEndLabels.labels, entity.second)
        }
    }

}
