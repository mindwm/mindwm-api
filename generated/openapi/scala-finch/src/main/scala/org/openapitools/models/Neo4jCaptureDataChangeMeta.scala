package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import MindWM._
import org.openapitools.models.Neo4jCaptureDataChangeMetaSource

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
case class Neo4jCaptureDataChangeMeta(operation: String,
                source: Neo4jCaptureDataChangeMetaSource,
                timestamp: Int,
                txEventId: Int,
                txEventsCount: Int,
                txId: Int,
                username: String
                )

object Neo4jCaptureDataChangeMeta {
    /**
     * Creates the codec for converting Neo4jCaptureDataChangeMeta from and to JSON.
     */
    implicit val decoder: Decoder[Neo4jCaptureDataChangeMeta] = deriveDecoder
    implicit val encoder: ObjectEncoder[Neo4jCaptureDataChangeMeta] = deriveEncoder
}
