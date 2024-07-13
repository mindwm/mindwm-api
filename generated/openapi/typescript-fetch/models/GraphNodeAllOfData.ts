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
import type { Neo4jCaptureDataChangeNodePayload } from './Neo4jCaptureDataChangeNodePayload';
import {
    Neo4jCaptureDataChangeNodePayloadFromJSON,
    Neo4jCaptureDataChangeNodePayloadFromJSONTyped,
    Neo4jCaptureDataChangeNodePayloadToJSON,
} from './Neo4jCaptureDataChangeNodePayload';
import type { Neo4jCaptureDataChangeSchema } from './Neo4jCaptureDataChangeSchema';
import {
    Neo4jCaptureDataChangeSchemaFromJSON,
    Neo4jCaptureDataChangeSchemaFromJSONTyped,
    Neo4jCaptureDataChangeSchemaToJSON,
} from './Neo4jCaptureDataChangeSchema';
import type { Neo4jCaptureDataChangeMeta } from './Neo4jCaptureDataChangeMeta';
import {
    Neo4jCaptureDataChangeMetaFromJSON,
    Neo4jCaptureDataChangeMetaFromJSONTyped,
    Neo4jCaptureDataChangeMetaToJSON,
} from './Neo4jCaptureDataChangeMeta';

/**
 * 
 * @export
 * @interface GraphNodeAllOfData
 */
export interface GraphNodeAllOfData {
    /**
     * 
     * @type {object}
     * @memberof GraphNodeAllOfData
     */
    headers: object;
    /**
     * 
     * @type {string}
     * @memberof GraphNodeAllOfData
     */
    messageKey: string;
    /**
     * 
     * @type {Neo4jCaptureDataChangeMeta}
     * @memberof GraphNodeAllOfData
     */
    meta: Neo4jCaptureDataChangeMeta;
    /**
     * 
     * @type {number}
     * @memberof GraphNodeAllOfData
     */
    offset: number;
    /**
     * 
     * @type {number}
     * @memberof GraphNodeAllOfData
     */
    partition: number;
    /**
     * 
     * @type {string}
     * @memberof GraphNodeAllOfData
     */
    sourceType: string;
    /**
     * 
     * @type {Date}
     * @memberof GraphNodeAllOfData
     */
    timestamp: Date;
    /**
     * 
     * @type {string}
     * @memberof GraphNodeAllOfData
     */
    topic: string;
    /**
     * 
     * @type {Neo4jCaptureDataChangeSchema}
     * @memberof GraphNodeAllOfData
     */
    schema: Neo4jCaptureDataChangeSchema;
    /**
     * 
     * @type {Neo4jCaptureDataChangeNodePayload}
     * @memberof GraphNodeAllOfData
     */
    payload: Neo4jCaptureDataChangeNodePayload;
}

/**
 * Check if a given object implements the GraphNodeAllOfData interface.
 */
export function instanceOfGraphNodeAllOfData(value: object): value is GraphNodeAllOfData {
    if (!('headers' in value) || value['headers'] === undefined) return false;
    if (!('messageKey' in value) || value['messageKey'] === undefined) return false;
    if (!('meta' in value) || value['meta'] === undefined) return false;
    if (!('offset' in value) || value['offset'] === undefined) return false;
    if (!('partition' in value) || value['partition'] === undefined) return false;
    if (!('sourceType' in value) || value['sourceType'] === undefined) return false;
    if (!('timestamp' in value) || value['timestamp'] === undefined) return false;
    if (!('topic' in value) || value['topic'] === undefined) return false;
    if (!('schema' in value) || value['schema'] === undefined) return false;
    if (!('payload' in value) || value['payload'] === undefined) return false;
    return true;
}

export function GraphNodeAllOfDataFromJSON(json: any): GraphNodeAllOfData {
    return GraphNodeAllOfDataFromJSONTyped(json, false);
}

export function GraphNodeAllOfDataFromJSONTyped(json: any, ignoreDiscriminator: boolean): GraphNodeAllOfData {
    if (json == null) {
        return json;
    }
    return {
        
        'headers': json['headers'],
        'messageKey': json['message_key'],
        'meta': Neo4jCaptureDataChangeMetaFromJSON(json['meta']),
        'offset': json['offset'],
        'partition': json['partition'],
        'sourceType': json['source_type'],
        'timestamp': (new Date(json['timestamp'])),
        'topic': json['topic'],
        'schema': Neo4jCaptureDataChangeSchemaFromJSON(json['schema']),
        'payload': Neo4jCaptureDataChangeNodePayloadFromJSON(json['payload']),
    };
}

export function GraphNodeAllOfDataToJSON(value?: GraphNodeAllOfData | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'headers': value['headers'],
        'message_key': value['messageKey'],
        'meta': Neo4jCaptureDataChangeMetaToJSON(value['meta']),
        'offset': value['offset'],
        'partition': value['partition'],
        'source_type': value['sourceType'],
        'timestamp': ((value['timestamp']).toISOString()),
        'topic': value['topic'],
        'schema': Neo4jCaptureDataChangeSchemaToJSON(value['schema']),
        'payload': Neo4jCaptureDataChangeNodePayloadToJSON(value['payload']),
    };
}

