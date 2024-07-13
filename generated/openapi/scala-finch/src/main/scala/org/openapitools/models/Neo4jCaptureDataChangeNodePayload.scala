package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import MindwWM._
import org.openapitools.models.Neo4jCaptureDataChangeNodePayloadAfter

/**
 * 
 * @param after 
 * @param before 
 * @param id 
 * @param _type 
 */
case class Neo4jCaptureDataChangeNodePayload(after: Neo4jCaptureDataChangeNodePayloadAfter,
                before: String,
                id: String,
                _type: String
                )

object Neo4jCaptureDataChangeNodePayload {
    /**
     * Creates the codec for converting Neo4jCaptureDataChangeNodePayload from and to JSON.
     */
    implicit val decoder: Decoder[Neo4jCaptureDataChangeNodePayload] = deriveDecoder
    implicit val encoder: ObjectEncoder[Neo4jCaptureDataChangeNodePayload] = deriveEncoder
}
