goog.provide('API.Client.CloudEvent');

/**
 * CloudEvents Specification JSON Schema
 * @record
 */
API.Client.CloudEvent = function() {}

/**
 * Identifies the event.
 * @type {!string}
 * @export
 */
API.Client.CloudEvent.prototype.id;

/**
 * Identifies the context in which an event happened.
 * @type {!string}
 * @export
 */
API.Client.CloudEvent.prototype.source;

/**
 * The version of the CloudEvents specification which the event uses.
 * @type {!string}
 * @export
 */
API.Client.CloudEvent.prototype.specversion;

/**
 * Describes the type of event related to the originating occurrence.
 * @type {!string}
 * @export
 */
API.Client.CloudEvent.prototype.type;

/**
 * Content type of the data value. Must adhere to RFC 2046 format.
 * @type {!string}
 * @export
 */
API.Client.CloudEvent.prototype.datacontenttype;

/**
 * Identifies the schema that data adheres to.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.CloudEvent.prototype.dataschema;

/**
 * Describes the subject of the event in the context of the event producer (identified by source).
 * @type {!string}
 * @export
 */
API.Client.CloudEvent.prototype.subject;

/**
 * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
 * @type {!Date}
 * @export
 */
API.Client.CloudEvent.prototype.time;

/**
 * The event payload.
 * @type {!API.Client.Object}
 * @export
 */
API.Client.CloudEvent.prototype.data;

/**
 * Base64 encoded event payload. Must adhere to RFC4648.
 * @type {!string}
 * @export
 */
API.Client.CloudEvent.prototype.dataBase64;

