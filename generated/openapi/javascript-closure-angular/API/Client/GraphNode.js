goog.provide('API.Client.GraphNode');

/**
 * @record
 */
API.Client.GraphNode = function() {}

/**
 * Identifies the event.
 * @type {!string}
 * @export
 */
API.Client.GraphNode.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.GraphNode.prototype.source;

/**
 * The version of the CloudEvents specification which the event uses.
 * @type {!string}
 * @export
 */
API.Client.GraphNode.prototype.specversion;

/**
 * @type {!string}
 * @export
 */
API.Client.GraphNode.prototype.type;

/**
 * Content type of the data value. Must adhere to RFC 2046 format.
 * @type {!string}
 * @export
 */
API.Client.GraphNode.prototype.datacontenttype;

/**
 * Identifies the schema that data adheres to.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.GraphNode.prototype.dataschema;

/**
 * Describes the subject of the event in the context of the event producer (identified by source).
 * @type {!string}
 * @export
 */
API.Client.GraphNode.prototype.subject;

/**
 * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
 * @type {!Date}
 * @export
 */
API.Client.GraphNode.prototype.time;

/**
 * @type {!API.Client.GraphNode_allOf_data}
 * @export
 */
API.Client.GraphNode.prototype.data;

/**
 * Base64 encoded event payload. Must adhere to RFC4648.
 * @type {!string}
 * @export
 */
API.Client.GraphNode.prototype.dataBase64;

/** @enum {string} */
API.Client.GraphNode.SourceEnum = { 
  graph.node: 'graph.node',
}
/** @enum {string} */
API.Client.GraphNode.TypeEnum = { 
  created: 'created',
  updated: 'updated',
  deleted: 'deleted',
}
