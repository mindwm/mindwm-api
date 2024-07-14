package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import MindwWM._
import java.time.ZonedDateTime
import org.openapitools.models.Neo4jCaptureDataChangeMeta
import org.openapitools.models.Neo4jCaptureDataChangeNodePayload
import org.openapitools.models.Neo4jCaptureDataChangeSchema

/**
 * 
 * @param headers 
 * @param messageUnderscorekey 
 * @param meta 
 * @param offset 
 * @param partition 
 * @param sourceUnderscoretype 
 * @param timestamp 
 * @param topic 
 * @param schema 
 * @param payload 
 */
case class GraphNodeAllOfData(headers: Object,
                messageUnderscorekey: String,
                meta: Neo4jCaptureDataChangeMeta,
                offset: Int,
                partition: Int,
                sourceUnderscoretype: String,
                timestamp: ZonedDateTime,
                topic: String,
                schema: Neo4jCaptureDataChangeSchema,
                payload: Neo4jCaptureDataChangeNodePayload
                )

object GraphNodeAllOfData {
    /**
     * Creates the codec for converting GraphNodeAllOfData from and to JSON.
     */
    implicit val decoder: Decoder[GraphNodeAllOfData] = deriveDecoder
    implicit val encoder: ObjectEncoder[GraphNodeAllOfData] = deriveEncoder
}