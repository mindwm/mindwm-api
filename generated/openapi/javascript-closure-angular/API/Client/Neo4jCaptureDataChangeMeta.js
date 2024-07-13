goog.provide('API.Client.Neo4jCaptureDataChange_meta');

/**
 * @record
 */
API.Client.Neo4jCaptureDataChangeMeta = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.Neo4jCaptureDataChangeMeta.prototype.operation;

/**
 * @type {!API.Client.Neo4jCaptureDataChange_meta_source}
 * @export
 */
API.Client.Neo4jCaptureDataChangeMeta.prototype.source;

/**
 * @type {!number}
 * @export
 */
API.Client.Neo4jCaptureDataChangeMeta.prototype.timestamp;

/**
 * @type {!number}
 * @export
 */
API.Client.Neo4jCaptureDataChangeMeta.prototype.txEventId;

/**
 * @type {!number}
 * @export
 */
API.Client.Neo4jCaptureDataChangeMeta.prototype.txEventsCount;

/**
 * @type {!number}
 * @export
 */
API.Client.Neo4jCaptureDataChangeMeta.prototype.txId;

/**
 * @type {!string}
 * @export
 */
API.Client.Neo4jCaptureDataChangeMeta.prototype.username;

