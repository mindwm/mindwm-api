goog.provide('API.Client.IoDocument');

/**
 * @record
 */
API.Client.IoDocument = function() {}

/**
 * Identifies the event.
 * @type {!string}
 * @export
 */
API.Client.IoDocument.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.IoDocument.prototype.source;

/**
 * The version of the CloudEvents specification which the event uses.
 * @type {!string}
 * @export
 */
API.Client.IoDocument.prototype.specversion;

/**
 * @type {!string}
 * @export
 */
API.Client.IoDocument.prototype.type;

/**
 * Content type of the data value. Must adhere to RFC 2046 format.
 * @type {!string}
 * @export
 */
API.Client.IoDocument.prototype.datacontenttype;

/**
 * Identifies the schema that data adheres to.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.IoDocument.prototype.dataschema;

/**
 * @type {!string}
 * @export
 */
API.Client.IoDocument.prototype.subject;

/**
 * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
 * @type {!Date}
 * @export
 */
API.Client.IoDocument.prototype.time;

/**
 * @type {!API.Client.TmuxPaneIoDocument}
 * @export
 */
API.Client.IoDocument.prototype.data;

/**
 * Base64 encoded event payload. Must adhere to RFC4648.
 * @type {!string}
 * @export
 */
API.Client.IoDocument.prototype.dataBase64;

