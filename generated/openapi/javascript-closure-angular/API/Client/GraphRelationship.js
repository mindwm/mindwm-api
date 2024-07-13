goog.provide('API.Client.GraphRelationship');

/**
 * @record
 */
API.Client.GraphRelationship = function() {}

/**
 * Identifies the event.
 * @type {!string}
 * @export
 */
API.Client.GraphRelationship.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.GraphRelationship.prototype.source;

/**
 * The version of the CloudEvents specification which the event uses.
 * @type {!string}
 * @export
 */
API.Client.GraphRelationship.prototype.specversion;

/**
 * @type {!string}
 * @export
 */
API.Client.GraphRelationship.prototype.type;

/**
 * Content type of the data value. Must adhere to RFC 2046 format.
 * @type {!string}
 * @export
 */
API.Client.GraphRelationship.prototype.datacontenttype;

/**
 * Identifies the schema that data adheres to.
 * @type {!API.Client.URI}
 * @export
 */
API.Client.GraphRelationship.prototype.dataschema;

/**
 * Describes the subject of the event in the context of the event producer (identified by source).
 * @type {!string}
 * @export
 */
API.Client.GraphRelationship.prototype.subject;

/**
 * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
 * @type {!Date}
 * @export
 */
API.Client.GraphRelationship.prototype.time;

/**
 * @type {!API.Client.GraphRelationship_allOf_data}
 * @export
 */
API.Client.GraphRelationship.prototype.data;

/**
 * Base64 encoded event payload. Must adhere to RFC4648.
 * @type {!string}
 * @export
 */
API.Client.GraphRelationship.prototype.dataBase64;

/** @enum {string} */
API.Client.GraphRelationship.SourceEnum = { 
  graph.relationship: 'graph.relationship',
}
/** @enum {string} */
API.Client.GraphRelationship.TypeEnum = { 
  created: 'created',
  updated: 'updated',
  deleted: 'deleted',
}
