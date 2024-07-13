package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import MindwWM._

/**
 * 
 * @param hostname 
 */
case class Neo4jCaptureDataChangeMetaSource(hostname: String
                )

object Neo4jCaptureDataChangeMetaSource {
    /**
     * Creates the codec for converting Neo4jCaptureDataChangeMetaSource from and to JSON.
     */
    implicit val decoder: Decoder[Neo4jCaptureDataChangeMetaSource] = deriveDecoder
    implicit val encoder: ObjectEncoder[Neo4jCaptureDataChangeMetaSource] = deriveEncoder
}
