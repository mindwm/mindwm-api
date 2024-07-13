package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import MindwWM._
import java.time.ZonedDateTime
import org.openapitools.models.AnyType
import org.openapitools.models.Neo4jCaptureDataChangeMeta
import org.openapitools.models.Neo4jCaptureDataChangePayload
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
case class Neo4jCaptureDataChange(headers: Map[String, AnyType],
                messageUnderscorekey: String,
                meta: Neo4jCaptureDataChangeMeta,
                offset: Int,
                partition: Int,
                sourceUnderscoretype: String,
                timestamp: ZonedDateTime,
                topic: String,
                schema: Neo4jCaptureDataChangeSchema,
                payload: Neo4jCaptureDataChangePayload
                )

object Neo4jCaptureDataChange {
    /**
     * Creates the codec for converting Neo4jCaptureDataChange from and to JSON.
     */
    implicit val decoder: Decoder[Neo4jCaptureDataChange] = deriveDecoder
    implicit val encoder: ObjectEncoder[Neo4jCaptureDataChange] = deriveEncoder
}
