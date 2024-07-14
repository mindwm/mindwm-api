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
 * @interface Neo4jCaptureDataChangeSchema
 */
export interface Neo4jCaptureDataChangeSchema {
    /**
     * 
     * @type {{ [key: string]: any; }}
     * @memberof Neo4jCaptureDataChangeSchema
     */
    constraints?: { [key: string]: any; };
    /**
     * 
     * @type {{ [key: string]: any; }}
     * @memberof Neo4jCaptureDataChangeSchema
     */
    properties?: { [key: string]: any; };
}

/**
 * Check if a given object implements the Neo4jCaptureDataChangeSchema interface.
 */
export function instanceOfNeo4jCaptureDataChangeSchema(value: object): value is Neo4jCaptureDataChangeSchema {
    return true;
}

export function Neo4jCaptureDataChangeSchemaFromJSON(json: any): Neo4jCaptureDataChangeSchema {
    return Neo4jCaptureDataChangeSchemaFromJSONTyped(json, false);
}

export function Neo4jCaptureDataChangeSchemaFromJSONTyped(json: any, ignoreDiscriminator: boolean): Neo4jCaptureDataChangeSchema {
    if (json == null) {
        return json;
    }
    return {
        
        'constraints': json['constraints'] == null ? undefined : json['constraints'],
        'properties': json['properties'] == null ? undefined : json['properties'],
    };
}

export function Neo4jCaptureDataChangeSchemaToJSON(value?: Neo4jCaptureDataChangeSchema | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'constraints': value['constraints'],
        'properties': value['properties'],
    };
}
