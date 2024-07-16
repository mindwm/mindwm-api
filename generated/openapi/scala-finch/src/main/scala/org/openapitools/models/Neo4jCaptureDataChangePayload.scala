package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import MindWM._
import org.openapitools.models.Neo4jCaptureDataChangeNodePayload
import org.openapitools.models.Neo4jCaptureDataChangeRelationshipPayload
import org.openapitools.models.Neo4jCaptureDataChangeRelationshipPayloadEnd

/**
 * 
 * @param after 
 * @param before 
 * @param id 
 * @param _type 
 * @param end 
 * @param label 
 * @param start 
 */
case class Neo4jCaptureDataChangePayload(after: Object,
                before: String,
                id: String,
                _type: String,
                end: Neo4jCaptureDataChangeRelationshipPayloadEnd,
                label: String,
                start: Neo4jCaptureDataChangeRelationshipPayloadEnd
                )

object Neo4jCaptureDataChangePayload {
    /**
     * Creates the codec for converting Neo4jCaptureDataChangePayload from and to JSON.
     */
    implicit val decoder: Decoder[Neo4jCaptureDataChangePayload] = deriveDecoder
    implicit val encoder: ObjectEncoder[Neo4jCaptureDataChangePayload] = deriveEncoder
}
