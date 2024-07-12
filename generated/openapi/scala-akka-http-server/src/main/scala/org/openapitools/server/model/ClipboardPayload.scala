package org.openapitools.server.model


/**
 * @param start Starting position of clipboard selection [x,y] for example: ''null''
 * @param stop Ending position of clipboard selection [x,y] for example: ''null''
 * @param data Clipboard data for example: ''null''
 * @param `type` Clipboard type for example: ''null''
 * @param context  for example: ''null''
*/
final case class ClipboardPayload (
  start: Option[Seq[Int]] = None,
  stop: Option[Seq[Int]] = None,
  data: Option[String] = None,
  `type`: Option[String] = None,
  context: Option[ClipboardPayloadContext] = None
)

