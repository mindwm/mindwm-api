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
import type { Neo4jCaptureDataChangeMetaSource } from './Neo4jCaptureDataChangeMetaSource';
import {
    Neo4jCaptureDataChangeMetaSourceFromJSON,
    Neo4jCaptureDataChangeMetaSourceFromJSONTyped,
    Neo4jCaptureDataChangeMetaSourceToJSON,
} from './Neo4jCaptureDataChangeMetaSource';

/**
 * 
 * @export
 * @interface Neo4jCaptureDataChangeMeta
 */
export interface Neo4jCaptureDataChangeMeta {
    /**
     * 
     * @type {string}
     * @memberof Neo4jCaptureDataChangeMeta
     */
    operation: string;
    /**
     * 
     * @type {Neo4jCaptureDataChangeMetaSource}
     * @memberof Neo4jCaptureDataChangeMeta
     */
    source: Neo4jCaptureDataChangeMetaSource;
    /**
     * 
     * @type {number}
     * @memberof Neo4jCaptureDataChangeMeta
     */
    timestamp: number;
    /**
     * 
     * @type {number}
     * @memberof Neo4jCaptureDataChangeMeta
     */
    txEventId: number;
    /**
     * 
     * @type {number}
     * @memberof Neo4jCaptureDataChangeMeta
     */
    txEventsCount: number;
    /**
     * 
     * @type {number}
     * @memberof Neo4jCaptureDataChangeMeta
     */
    txId: number;
    /**
     * 
     * @type {string}
     * @memberof Neo4jCaptureDataChangeMeta
     */
    username: string;
}

/**
 * Check if a given object implements the Neo4jCaptureDataChangeMeta interface.
 */
export function instanceOfNeo4jCaptureDataChangeMeta(value: object): value is Neo4jCaptureDataChangeMeta {
    if (!('operation' in value) || value['operation'] === undefined) return false;
    if (!('source' in value) || value['source'] === undefined) return false;
    if (!('timestamp' in value) || value['timestamp'] === undefined) return false;
    if (!('txEventId' in value) || value['txEventId'] === undefined) return false;
    if (!('txEventsCount' in value) || value['txEventsCount'] === undefined) return false;
    if (!('txId' in value) || value['txId'] === undefined) return false;
    if (!('username' in value) || value['username'] === undefined) return false;
    return true;
}

export function Neo4jCaptureDataChangeMetaFromJSON(json: any): Neo4jCaptureDataChangeMeta {
    return Neo4jCaptureDataChangeMetaFromJSONTyped(json, false);
}

export function Neo4jCaptureDataChangeMetaFromJSONTyped(json: any, ignoreDiscriminator: boolean): Neo4jCaptureDataChangeMeta {
    if (json == null) {
        return json;
    }
    return {
        
        'operation': json['operation'],
        'source': Neo4jCaptureDataChangeMetaSourceFromJSON(json['source']),
        'timestamp': json['timestamp'],
        'txEventId': json['txEventId'],
        'txEventsCount': json['txEventsCount'],
        'txId': json['txId'],
        'username': json['username'],
    };
}

export function Neo4jCaptureDataChangeMetaToJSON(value?: Neo4jCaptureDataChangeMeta | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'operation': value['operation'],
        'source': Neo4jCaptureDataChangeMetaSourceToJSON(value['source']),
        'timestamp': value['timestamp'],
        'txEventId': value['txEventId'],
        'txEventsCount': value['txEventsCount'],
        'txId': value['txId'],
        'username': value['username'],
    };
}
