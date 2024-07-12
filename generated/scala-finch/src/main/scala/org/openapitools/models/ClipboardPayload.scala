package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import MindwWM._
import org.openapitools.models.ClipboardPayloadContext
import scala.collection.immutable.Seq

/**
 * 
 * @param start Starting position of clipboard selection [x,y]
 * @param stop Ending position of clipboard selection [x,y]
 * @param data Clipboard data
 * @param _type Clipboard type
 * @param context 
 */
case class ClipboardPayload(start: Option[Seq[Int]],
                stop: Option[Seq[Int]],
                data: Option[String],
                _type: Option[String],
                context: Option[ClipboardPayloadContext]
                )

object ClipboardPayload {
    /**
     * Creates the codec for converting ClipboardPayload from and to JSON.
     */
    implicit val decoder: Decoder[ClipboardPayload] = deriveDecoder
    implicit val encoder: ObjectEncoder[ClipboardPayload] = deriveEncoder
}
