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
import { Neo4jCaptureDataChangeMeta } from './neo4jCaptureDataChangeMeta';
import { Neo4jCaptureDataChangeRelationshipPayload } from './neo4jCaptureDataChangeRelationshipPayload';
import { Neo4jCaptureDataChangeSchema } from './neo4jCaptureDataChangeSchema';

export class GraphRelationshipAllOfData {
    'headers': object;
    'messageKey': string;
    'meta': Neo4jCaptureDataChangeMeta;
    'offset': number;
    'partition': number;
    'sourceType': string;
    'timestamp': Date;
    'topic': string;
    'schema': Neo4jCaptureDataChangeSchema;
    'payload': Neo4jCaptureDataChangeRelationshipPayload;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "headers",
            "baseName": "headers",
            "type": "object"
        },
        {
            "name": "messageKey",
            "baseName": "message_key",
            "type": "string"
        },
        {
            "name": "meta",
            "baseName": "meta",
            "type": "Neo4jCaptureDataChangeMeta"
        },
        {
            "name": "offset",
            "baseName": "offset",
            "type": "number"
        },
        {
            "name": "partition",
            "baseName": "partition",
            "type": "number"
        },
        {
            "name": "sourceType",
            "baseName": "source_type",
            "type": "string"
        },
        {
            "name": "timestamp",
            "baseName": "timestamp",
            "type": "Date"
        },
        {
            "name": "topic",
            "baseName": "topic",
            "type": "string"
        },
        {
            "name": "schema",
            "baseName": "schema",
            "type": "Neo4jCaptureDataChangeSchema"
        },
        {
            "name": "payload",
            "baseName": "payload",
            "type": "Neo4jCaptureDataChangeRelationshipPayload"
        }    ];

    static getAttributeTypeMap() {
        return GraphRelationshipAllOfData.attributeTypeMap;
    }
}
