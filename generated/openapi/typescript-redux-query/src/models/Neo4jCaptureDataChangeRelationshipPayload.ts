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

import { exists, mapValues } from '../runtime';
import {
    Neo4jCaptureDataChangeRelationshipPayloadEnd,
    Neo4jCaptureDataChangeRelationshipPayloadEndFromJSON,
    Neo4jCaptureDataChangeRelationshipPayloadEndToJSON,
} from './';

/**
 * 
 * @export
 * @interface Neo4jCaptureDataChangeRelationshipPayload
 */
export interface Neo4jCaptureDataChangeRelationshipPayload  {
    /**
     * 
     * @type {object}
     * @memberof Neo4jCaptureDataChangeRelationshipPayload
     */
    after: object;
    /**
     * 
     * @type {string}
     * @memberof Neo4jCaptureDataChangeRelationshipPayload
     */
    before: string;
    /**
     * 
     * @type {Neo4jCaptureDataChangeRelationshipPayloadEnd}
     * @memberof Neo4jCaptureDataChangeRelationshipPayload
     */
    end: Neo4jCaptureDataChangeRelationshipPayloadEnd;
    /**
     * 
     * @type {string}
     * @memberof Neo4jCaptureDataChangeRelationshipPayload
     */
    id: string;
    /**
     * 
     * @type {string}
     * @memberof Neo4jCaptureDataChangeRelationshipPayload
     */
    label: string;
    /**
     * 
     * @type {Neo4jCaptureDataChangeRelationshipPayloadEnd}
     * @memberof Neo4jCaptureDataChangeRelationshipPayload
     */
    start: Neo4jCaptureDataChangeRelationshipPayloadEnd;
    /**
     * 
     * @type {string}
     * @memberof Neo4jCaptureDataChangeRelationshipPayload
     */
    type: string;
}

export function Neo4jCaptureDataChangeRelationshipPayloadFromJSON(json: any): Neo4jCaptureDataChangeRelationshipPayload {
    return {
        'after': json['after'],
        'before': json['before'],
        'end': Neo4jCaptureDataChangeRelationshipPayloadEndFromJSON(json['end']),
        'id': json['id'],
        'label': json['label'],
        'start': Neo4jCaptureDataChangeRelationshipPayloadEndFromJSON(json['start']),
        'type': json['type'],
    };
}

export function Neo4jCaptureDataChangeRelationshipPayloadToJSON(value?: Neo4jCaptureDataChangeRelationshipPayload): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'after': value.after,
        'before': value.before,
        'end': Neo4jCaptureDataChangeRelationshipPayloadEndToJSON(value.end),
        'id': value.id,
        'label': value.label,
        'start': Neo4jCaptureDataChangeRelationshipPayloadEndToJSON(value.start),
        'type': value.type,
    };
}


