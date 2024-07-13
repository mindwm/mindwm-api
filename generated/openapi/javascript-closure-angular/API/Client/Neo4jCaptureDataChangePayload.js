goog.provide('API.Client.Neo4jCaptureDataChange_payload');

/**
 * @record
 */
API.Client.Neo4jCaptureDataChangePayload = function() {}

/**
 * @type {!API.Client.Object}
 * @export
 */
API.Client.Neo4jCaptureDataChangePayload.prototype.after;

/**
 * @type {!string}
 * @export
 */
API.Client.Neo4jCaptureDataChangePayload.prototype.before;

/**
 * @type {!string}
 * @export
 */
API.Client.Neo4jCaptureDataChangePayload.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.Neo4jCaptureDataChangePayload.prototype.type;

/**
 * @type {!API.Client.Neo4jCaptureDataChangeRelationshipPayload_end}
 * @export
 */
API.Client.Neo4jCaptureDataChangePayload.prototype.end;

/**
 * @type {!string}
 * @export
 */
API.Client.Neo4jCaptureDataChangePayload.prototype.label;

/**
 * @type {!API.Client.Neo4jCaptureDataChangeRelationshipPayload_end}
 * @export
 */
API.Client.Neo4jCaptureDataChangePayload.prototype.start;

