goog.provide('API.Client.IoDocument');

/**
 * @record
 */
API.Client.IoDocument = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.IoDocument.prototype.type;

/**
 * @type {!string}
 * @export
 */
API.Client.IoDocument.prototype.source;

/**
 * @type {!API.Client.TmuxPaneIoDocument}
 * @export
 */
API.Client.IoDocument.prototype.data;

/**
 * Identifies the event.
 * @type {!string}
 * @export
 */
API.Client.IoDocument.prototype.id;

/**
 * The version of the CloudEvents specification which the event uses.
 * @type {!string}
 * @export
 */
API.Client.IoDocument.prototype.specversion;

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
 * Describes the subject of the event in the context of the event producer (identified by source).
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
 * Base64 encoded event payload. Must adhere to RFC4648.
 * @type {!string}
 * @export
 */
API.Client.IoDocument.prototype.dataBase64;

