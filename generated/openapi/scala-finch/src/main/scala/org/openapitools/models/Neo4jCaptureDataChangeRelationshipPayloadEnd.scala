package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import MindWM._
import org.openapitools.models.AnyType
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param ids 
 * @param labels 
 */
case class Neo4jCaptureDataChangeRelationshipPayloadEnd(id: String,
                ids: Map[String, AnyType],
                labels: Seq[String]
                )

object Neo4jCaptureDataChangeRelationshipPayloadEnd {
    /**
     * Creates the codec for converting Neo4jCaptureDataChangeRelationshipPayloadEnd from and to JSON.
     */
    implicit val decoder: Decoder[Neo4jCaptureDataChangeRelationshipPayloadEnd] = deriveDecoder
    implicit val encoder: ObjectEncoder[Neo4jCaptureDataChangeRelationshipPayloadEnd] = deriveEncoder
}
