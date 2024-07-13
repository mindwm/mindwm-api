goog.provide('API.Client.Neo4jCaptureDataChange');

/**
 * @record
 */
API.Client.Neo4jCaptureDataChange = function() {}

/**
 * @type {!Object<!string, API.Client.AnyType>}
 * @export
 */
API.Client.Neo4jCaptureDataChange.prototype.headers;

/**
 * @type {!string}
 * @export
 */
API.Client.Neo4jCaptureDataChange.prototype.messageKey;

/**
 * @type {!API.Client.Neo4jCaptureDataChange_meta}
 * @export
 */
API.Client.Neo4jCaptureDataChange.prototype.meta;

/**
 * @type {!number}
 * @export
 */
API.Client.Neo4jCaptureDataChange.prototype.offset;

/**
 * @type {!number}
 * @export
 */
API.Client.Neo4jCaptureDataChange.prototype.partition;

/**
 * @type {!string}
 * @export
 */
API.Client.Neo4jCaptureDataChange.prototype.sourceType;

/**
 * @type {!Date}
 * @export
 */
API.Client.Neo4jCaptureDataChange.prototype.timestamp;

/**
 * @type {!string}
 * @export
 */
API.Client.Neo4jCaptureDataChange.prototype.topic;

/**
 * @type {!API.Client.Neo4jCaptureDataChange_schema}
 * @export
 */
API.Client.Neo4jCaptureDataChange.prototype.schema;

/**
 * @type {!API.Client.Neo4jCaptureDataChange_payload}
 * @export
 */
API.Client.Neo4jCaptureDataChange.prototype.payload;

