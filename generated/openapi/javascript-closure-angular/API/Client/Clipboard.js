goog.provide('API.Client.Clipboard');

/**
 * @record
 */
API.Client.Clipboard = function() {}

/**
 * Identifies the event.
 * @type {!string}
 * @export
 */
API.Client.Clipboard.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.Clipboard.prototype.source;

/**
 * The version of the CloudEvents specification which the event uses.
 * @type {!string}
 * @export
 */
API.Client.Clipboard.prototype.specversion;

/**
 * @type {!string}
 * @export
 */
API.Client.Clipboard.prototype.type;

/**
 * Content type of the data value. Must adhere to RFC 2046 format.
 * @type {!string}
 * @export
 */
API.Client.Clipboard.prototype.datacontenttype;

/**
 * Identifies the schema that data adheres to.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.Clipboard.prototype.dataschema;

/**
 * @type {!string}
 * @export
 */
API.Client.Clipboard.prototype.subject;

/**
 * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
 * @type {!Date}
 * @export
 */
API.Client.Clipboard.prototype.time;

/**
 * @type {!API.Client.ClipboardPayload}
 * @export
 */
API.Client.Clipboard.prototype.data;

/**
 * Base64 encoded event payload. Must adhere to RFC4648.
 * @type {!string}
 * @export
 */
API.Client.Clipboard.prototype.dataBase64;

