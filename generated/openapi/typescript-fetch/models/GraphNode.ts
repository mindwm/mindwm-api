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
import type { GraphNodeAllOfData } from './GraphNodeAllOfData';
import {
    GraphNodeAllOfDataFromJSON,
    GraphNodeAllOfDataFromJSONTyped,
    GraphNodeAllOfDataToJSON,
} from './GraphNodeAllOfData';

/**
 * 
 * @export
 * @interface GraphNode
 */
export interface GraphNode {
    [key: string]: any | any;
    /**
     * Identifies the event.
     * @type {string}
     * @memberof GraphNode
     */
    id: string;
    /**
     * 
     * @type {string}
     * @memberof GraphNode
     */
    source: GraphNodeSourceEnum;
    /**
     * The version of the CloudEvents specification which the event uses.
     * @type {string}
     * @memberof GraphNode
     */
    specversion: string;
    /**
     * 
     * @type {string}
     * @memberof GraphNode
     */
    type: GraphNodeTypeEnum;
    /**
     * Content type of the data value. Must adhere to RFC 2046 format.
     * @type {string}
     * @memberof GraphNode
     */
    datacontenttype?: string;
    /**
     * Identifies the schema that data adheres to.
     * @type {string}
     * @memberof GraphNode
     */
    dataschema?: string;
    /**
     * Describes the subject of the event in the context of the event producer (identified by source).
     * @type {string}
     * @memberof GraphNode
     */
    subject?: string;
    /**
     * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
     * @type {Date}
     * @memberof GraphNode
     */
    time?: Date;
    /**
     * 
     * @type {GraphNodeAllOfData}
     * @memberof GraphNode
     */
    data?: GraphNodeAllOfData;
    /**
     * Base64 encoded event payload. Must adhere to RFC4648.
     * @type {string}
     * @memberof GraphNode
     */
    dataBase64?: string;
}


/**
 * @export
 */
export const GraphNodeSourceEnum = {
    Node: 'graph.node',
    Relationship: 'graph.relationship'
} as const;
export type GraphNodeSourceEnum = typeof GraphNodeSourceEnum[keyof typeof GraphNodeSourceEnum];

/**
 * @export
 */
export const GraphNodeTypeEnum = {
    Created: 'created',
    Updated: 'updated',
    Deleted: 'deleted'
} as const;
export type GraphNodeTypeEnum = typeof GraphNodeTypeEnum[keyof typeof GraphNodeTypeEnum];


/**
 * Check if a given object implements the GraphNode interface.
 */
export function instanceOfGraphNode(value: object): value is GraphNode {
    if (!('id' in value) || value['id'] === undefined) return false;
    if (!('source' in value) || value['source'] === undefined) return false;
    if (!('specversion' in value) || value['specversion'] === undefined) return false;
    if (!('type' in value) || value['type'] === undefined) return false;
    return true;
}

export function GraphNodeFromJSON(json: any): GraphNode {
    return GraphNodeFromJSONTyped(json, false);
}

export function GraphNodeFromJSONTyped(json: any, ignoreDiscriminator: boolean): GraphNode {
    if (json == null) {
        return json;
    }
    return {
        
            ...json,
        'id': json['id'],
        'source': json['source'],
        'specversion': json['specversion'],
        'type': json['type'],
        'datacontenttype': json['datacontenttype'] == null ? undefined : json['datacontenttype'],
        'dataschema': json['dataschema'] == null ? undefined : json['dataschema'],
        'subject': json['subject'] == null ? undefined : json['subject'],
        'time': json['time'] == null ? undefined : (new Date(json['time'])),
        'data': json['data'] == null ? undefined : GraphNodeAllOfDataFromJSON(json['data']),
        'dataBase64': json['data_base64'] == null ? undefined : json['data_base64'],
    };
}

export function GraphNodeToJSON(value?: GraphNode | null): any {
    if (value == null) {
        return value;
    }
    return {
        
            ...value,
        'id': value['id'],
        'source': value['source'],
        'specversion': value['specversion'],
        'type': value['type'],
        'datacontenttype': value['datacontenttype'],
        'dataschema': value['dataschema'],
        'subject': value['subject'],
        'time': value['time'] == null ? undefined : ((value['time']).toISOString()),
        'data': GraphNodeAllOfDataToJSON(value['data']),
        'data_base64': value['dataBase64'],
    };
}

