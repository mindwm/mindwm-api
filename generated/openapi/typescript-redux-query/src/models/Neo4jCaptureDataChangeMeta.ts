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
    Neo4jCaptureDataChangeMetaSource,
    Neo4jCaptureDataChangeMetaSourceFromJSON,
    Neo4jCaptureDataChangeMetaSourceToJSON,
} from './';

/**
 * 
 * @export
 * @interface Neo4jCaptureDataChangeMeta
 */
export interface Neo4jCaptureDataChangeMeta  {
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

export function Neo4jCaptureDataChangeMetaFromJSON(json: any): Neo4jCaptureDataChangeMeta {
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

export function Neo4jCaptureDataChangeMetaToJSON(value?: Neo4jCaptureDataChangeMeta): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'operation': value.operation,
        'source': Neo4jCaptureDataChangeMetaSourceToJSON(value.source),
        'timestamp': value.timestamp,
        'txEventId': value.txEventId,
        'txEventsCount': value.txEventsCount,
        'txId': value.txId,
        'username': value.username,
    };
}


