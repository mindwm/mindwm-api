package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import MindWM._

/**
 * Selection context
 * @param window window id
 */
case class ClipboardPayloadContext(window: Option[String]
                )

object ClipboardPayloadContext {
    /**
     * Creates the codec for converting ClipboardPayloadContext from and to JSON.
     */
    implicit val decoder: Decoder[ClipboardPayloadContext] = deriveDecoder
    implicit val encoder: ObjectEncoder[ClipboardPayloadContext] = deriveEncoder
}
