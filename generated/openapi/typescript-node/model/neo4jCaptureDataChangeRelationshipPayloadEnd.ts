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

import { RequestFile } from './models';

export class Neo4jCaptureDataChangeRelationshipPayloadEnd {
    'id': string;
    'ids': { [key: string]: any; };
    'labels': Array<string>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "ids",
            "baseName": "ids",
            "type": "{ [key: string]: any; }"
        },
        {
            "name": "labels",
            "baseName": "labels",
            "type": "Array<string>"
        }    ];

    static getAttributeTypeMap() {
        return Neo4jCaptureDataChangeRelationshipPayloadEnd.attributeTypeMap;
    }
}
