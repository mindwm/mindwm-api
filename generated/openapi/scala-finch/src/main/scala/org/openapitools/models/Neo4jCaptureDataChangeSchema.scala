package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import MindWM._
import org.openapitools.models.AnyType

/**
 * 
 * @param constraints 
 * @param properties 
 */
case class Neo4jCaptureDataChangeSchema(constraints: Option[Map[String, AnyType]],
                properties: Option[Map[String, AnyType]]
                )

object Neo4jCaptureDataChangeSchema {
    /**
     * Creates the codec for converting Neo4jCaptureDataChangeSchema from and to JSON.
     */
    implicit val decoder: Decoder[Neo4jCaptureDataChangeSchema] = deriveDecoder
    implicit val encoder: ObjectEncoder[Neo4jCaptureDataChangeSchema] = deriveEncoder
}
