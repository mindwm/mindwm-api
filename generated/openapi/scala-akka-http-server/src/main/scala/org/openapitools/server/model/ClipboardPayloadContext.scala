package org.openapitools.server.model


/**
 * Selection context
 *
 * @param window window id for example: ''null''
*/
final case class ClipboardPayloadContext (
  window: Option[String] = None
)

