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

import {
    GraphNodeAllOfData,
    GraphNodeAllOfDataFromJSON,
    GraphNodeAllOfDataToJSON,
} from './';

/**
 * @type GraphNode
 * @export
 */
export interface GraphNode extends CloudEvent {
}

export function GraphNodeFromJSON(json: any): GraphNode {
    return {
        ...CloudEventFromJSON(json),
    };
}

export function GraphNodeToJSON(value?: GraphNode): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...CloudEventToJSON(value),
    };
}