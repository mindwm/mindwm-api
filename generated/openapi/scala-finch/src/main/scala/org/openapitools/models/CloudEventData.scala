package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import MindWM._

/**
 * The event payload.
 */
case class CloudEventData()

object CloudEventData {
    /**
     * Creates the codec for converting CloudEventData from and to JSON.
     */
    implicit val decoder: Decoder[CloudEventData] = deriveDecoder
    implicit val encoder: ObjectEncoder[CloudEventData] = deriveEncoder
}
