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
    Neo4jCaptureDataChangeNodePayloadAfter,
} from './';

/**
 * @export
 * @interface Neo4jCaptureDataChangeNodePayload
 */
export interface Neo4jCaptureDataChangeNodePayload {
    /**
     * @type {Neo4jCaptureDataChangeNodePayloadAfter}
     * @memberof Neo4jCaptureDataChangeNodePayload
     */
    after: Neo4jCaptureDataChangeNodePayloadAfter;
    /**
     * @type {string}
     * @memberof Neo4jCaptureDataChangeNodePayload
     */
    before: string;
    /**
     * @type {string}
     * @memberof Neo4jCaptureDataChangeNodePayload
     */
    id: string;
    /**
     * @type {string}
     * @memberof Neo4jCaptureDataChangeNodePayload
     */
    type: string;
}
