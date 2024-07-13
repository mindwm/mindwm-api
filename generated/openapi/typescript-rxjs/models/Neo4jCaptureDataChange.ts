// tslint:disable
/**
 * Mindwm API
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import type {
    Neo4jCaptureDataChangeMeta,
    Neo4jCaptureDataChangePayload,
    Neo4jCaptureDataChangeSchema,
} from './';

/**
 * @export
 * @interface Neo4jCaptureDataChange
 */
export interface Neo4jCaptureDataChange {
    /**
     * @type {{ [key: string]: any; }}
     * @memberof Neo4jCaptureDataChange
     */
    headers: { [key: string]: any; };
    /**
     * @type {string}
     * @memberof Neo4jCaptureDataChange
     */
    message_key: string;
    /**
     * @type {Neo4jCaptureDataChangeMeta}
     * @memberof Neo4jCaptureDataChange
     */
    meta: Neo4jCaptureDataChangeMeta;
    /**
     * @type {number}
     * @memberof Neo4jCaptureDataChange
     */
    offset: number;
    /**
     * @type {number}
     * @memberof Neo4jCaptureDataChange
     */
    partition: number;
    /**
     * @type {string}
     * @memberof Neo4jCaptureDataChange
     */
    source_type: string;
    /**
     * @type {string}
     * @memberof Neo4jCaptureDataChange
     */
    timestamp: string;
    /**
     * @type {string}
     * @memberof Neo4jCaptureDataChange
     */
    topic: string;
    /**
     * @type {Neo4jCaptureDataChangeSchema}
     * @memberof Neo4jCaptureDataChange
     */
    schema: Neo4jCaptureDataChangeSchema;
    /**
     * @type {Neo4jCaptureDataChangePayload}
     * @memberof Neo4jCaptureDataChange
     */
    payload: Neo4jCaptureDataChangePayload;
}
