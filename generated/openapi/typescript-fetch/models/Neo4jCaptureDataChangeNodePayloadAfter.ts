/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface Neo4jCaptureDataChangeNodePayloadAfter
 */
export interface Neo4jCaptureDataChangeNodePayloadAfter {
    /**
     * 
     * @type {Array<string>}
     * @memberof Neo4jCaptureDataChangeNodePayloadAfter
     */
    labels: Array<string>;
    /**
     * 
     * @type {{ [key: string]: any; }}
     * @memberof Neo4jCaptureDataChangeNodePayloadAfter
     */
    properties: { [key: string]: any; };
}

/**
 * Check if a given object implements the Neo4jCaptureDataChangeNodePayloadAfter interface.
 */
export function instanceOfNeo4jCaptureDataChangeNodePayloadAfter(value: object): value is Neo4jCaptureDataChangeNodePayloadAfter {
    if (!('labels' in value) || value['labels'] === undefined) return false;
    if (!('properties' in value) || value['properties'] === undefined) return false;
    return true;
}

export function Neo4jCaptureDataChangeNodePayloadAfterFromJSON(json: any): Neo4jCaptureDataChangeNodePayloadAfter {
    return Neo4jCaptureDataChangeNodePayloadAfterFromJSONTyped(json, false);
}

export function Neo4jCaptureDataChangeNodePayloadAfterFromJSONTyped(json: any, ignoreDiscriminator: boolean): Neo4jCaptureDataChangeNodePayloadAfter {
    if (json == null) {
        return json;
    }
    return {
        
        'labels': json['labels'],
        'properties': json['properties'],
    };
}

export function Neo4jCaptureDataChangeNodePayloadAfterToJSON(value?: Neo4jCaptureDataChangeNodePayloadAfter | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'labels': value['labels'],
        'properties': value['properties'],
    };
}
