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
    Neo4jCaptureDataChangeMeta,
    Neo4jCaptureDataChangeMetaFromJSON,
    Neo4jCaptureDataChangeMetaToJSON,
    Neo4jCaptureDataChangeRelationshipPayload,
    Neo4jCaptureDataChangeRelationshipPayloadFromJSON,
    Neo4jCaptureDataChangeRelationshipPayloadToJSON,
    Neo4jCaptureDataChangeSchema,
    Neo4jCaptureDataChangeSchemaFromJSON,
    Neo4jCaptureDataChangeSchemaToJSON,
} from './';

/**
 * @type GraphRelationshipAllOfData
 * @export
 */
export interface GraphRelationshipAllOfData extends Neo4jCaptureDataChange {
}

export function GraphRelationshipAllOfDataFromJSON(json: any): GraphRelationshipAllOfData {
    return {
        ...Neo4jCaptureDataChangeFromJSON(json),
    };
}

export function GraphRelationshipAllOfDataToJSON(value?: GraphRelationshipAllOfData): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...Neo4jCaptureDataChangeToJSON(value),
    };
}