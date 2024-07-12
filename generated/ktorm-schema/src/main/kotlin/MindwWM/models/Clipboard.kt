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
 * @param id Identifies the event.
 * @param source Identifies the context in which an event happened.
 * @param specversion The version of the CloudEvents specification which the event uses.
 * @param type Describes the type of event related to the originating occurrence.
 * @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
 * @param dataschema Identifies the schema that data adheres to.
 * @param subject Describes the subject of the event in the context of the event producer (identified by source).
 * @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
 * @param data 
 * @param dataBase64 Base64 encoded event payload. Must adhere to RFC4648.
 */
object Clipboards : BaseTable<Clipboard>("Clipboard") {
    val id = text("id") /* Identifies the event. */
    val source = text("source") /* Identifies the context in which an event happened. */
    val specversion = text("specversion") /* The version of the CloudEvents specification which the event uses. */
    val type = text("type") /* Describes the type of event related to the originating occurrence. */
    val datacontenttype = text("datacontenttype") /* null */ /* Content type of the data value. Must adhere to RFC 2046 format. */
    val dataschema = text("dataschema") /* null */ /* Identifies the schema that data adheres to. */
    val subject = text("subject") /* null */ /* Describes the subject of the event in the context of the event producer (identified by source). */
    val time = datetime("time") /* null */ /* Timestamp of when the occurrence happened. Must adhere to RFC 3339. */
    val data = long("data") /* null */
    val dataBase64 = text("data_base64") /* null */ /* Base64 encoded event payload. Must adhere to RFC4648. */

    /**
     * Create an entity of type Clipboard from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = Clipboard(
        id = row[id] ?: "" /* kotlin.String */ /* Identifies the event. */,
        source = row[source] ?: "" /* kotlin.String */ /* Identifies the context in which an event happened. */,
        specversion = row[specversion] ?: "" /* kotlin.String */ /* The version of the CloudEvents specification which the event uses. */,
        type = row[type] ?: "" /* kotlin.String */ /* Describes the type of event related to the originating occurrence. */,
        datacontenttype = row[datacontenttype]  /* kotlin.String? */ /* Content type of the data value. Must adhere to RFC 2046 format. */,
        dataschema = row[dataschema]  /* java.net.URI? */ /* Identifies the schema that data adheres to. */,
        subject = row[subject]  /* kotlin.String? */ /* Describes the subject of the event in the context of the event producer (identified by source). */,
        time = row[time]  /* java.time.LocalDateTime? */ /* Timestamp of when the occurrence happened. Must adhere to RFC 3339. */,
        data = CloudEventDatas.createEntity(row, withReferences) /* CloudEventData? */,
        dataBase64 = row[dataBase64]  /* kotlin.String? */ /* Base64 encoded event payload. Must adhere to RFC4648. */
    )

    /**
    * Assign all the columns from the entity of type Clipboard to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = Clipboard()
    * database.update(Clipboards, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: Clipboard) {
        this.apply {
            set(Clipboards.id, entity.id)
            set(Clipboards.source, entity.source)
            set(Clipboards.specversion, entity.specversion)
            set(Clipboards.type, entity.type)
            set(Clipboards.datacontenttype, entity.datacontenttype)
            set(Clipboards.dataschema, entity.dataschema)
            set(Clipboards.subject, entity.subject)
            set(Clipboards.time, entity.time)
            set(Clipboards.data, entity.data)
            set(Clipboards.dataBase64, entity.dataBase64)
        }
    }

}


