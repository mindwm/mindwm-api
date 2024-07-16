package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import MindWM._
import org.openapitools.models.AnyType
import scala.collection.immutable.HashMap

/**
 * 
 * @param input User input
 * @param output Command output (mix of stdout & stderr)
 * @param ps1 ps1 (prompt) AFTER the input and output
 */
case class TmuxPaneIoDocument(input: String,
                output: String,
                ps1: String
                )

object TmuxPaneIoDocument {
    /**
     * Creates the codec for converting TmuxPaneIoDocument from and to JSON.
     */
    implicit val decoder: Decoder[TmuxPaneIoDocument] = deriveDecoder
    implicit val encoder: ObjectEncoder[TmuxPaneIoDocument] = deriveEncoder
}
