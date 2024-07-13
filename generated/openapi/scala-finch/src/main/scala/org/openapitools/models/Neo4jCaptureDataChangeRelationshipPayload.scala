package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import MindwWM._
import org.openapitools.models.Neo4jCaptureDataChangeRelationshipPayloadEnd

/**
 * 
 * @param after 
 * @param before 
 * @param end 
 * @param id 
 * @param label 
 * @param start 
 * @param _type 
 */
case class Neo4jCaptureDataChangeRelationshipPayload(after: Object,
                before: String,
                end: Neo4jCaptureDataChangeRelationshipPayloadEnd,
                id: String,
                label: String,
                start: Neo4jCaptureDataChangeRelationshipPayloadEnd,
                _type: String
                )

object Neo4jCaptureDataChangeRelationshipPayload {
    /**
     * Creates the codec for converting Neo4jCaptureDataChangeRelationshipPayload from and to JSON.
     */
    implicit val decoder: Decoder[Neo4jCaptureDataChangeRelationshipPayload] = deriveDecoder
    implicit val encoder: ObjectEncoder[Neo4jCaptureDataChangeRelationshipPayload] = deriveEncoder
}
