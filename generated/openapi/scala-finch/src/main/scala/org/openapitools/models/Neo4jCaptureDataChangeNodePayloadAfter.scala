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
 * @param labels 
 * @param properties 
 */
case class Neo4jCaptureDataChangeNodePayloadAfter(labels: Seq[String],
                properties: Map[String, AnyType]
                )

object Neo4jCaptureDataChangeNodePayloadAfter {
    /**
     * Creates the codec for converting Neo4jCaptureDataChangeNodePayloadAfter from and to JSON.
     */
    implicit val decoder: Decoder[Neo4jCaptureDataChangeNodePayloadAfter] = deriveDecoder
    implicit val encoder: ObjectEncoder[Neo4jCaptureDataChangeNodePayloadAfter] = deriveEncoder
}
