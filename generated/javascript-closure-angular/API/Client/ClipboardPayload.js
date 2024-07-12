goog.provide('API.Client.ClipboardPayload');

/**
 * @record
 */
API.Client.ClipboardPayload = function() {}

/**
 * Starting position of clipboard selection [x,y]
 * @type {!Array<!number>}
 * @export
 */
API.Client.ClipboardPayload.prototype.start;

/**
 * Ending position of clipboard selection [x,y]
 * @type {!Array<!number>}
 * @export
 */
API.Client.ClipboardPayload.prototype.stop;

/**
 * Clipboard data
 * @type {!string}
 * @export
 */
API.Client.ClipboardPayload.prototype.data;

/**
 * Clipboard type
 * @type {!string}
 * @export
 */
API.Client.ClipboardPayload.prototype.type;

/**
 * @type {!API.Client.ClipboardPayload_context}
 * @export
 */
API.Client.ClipboardPayload.prototype.context;

/** @enum {string} */
API.Client.ClipboardPayload.TypeEnum = { 
  primary: 'primary',
  secondary: 'secondary',
  clipboard: 'clipboard',
}
