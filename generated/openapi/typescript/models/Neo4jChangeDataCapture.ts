/**
 * Mindwm API
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Neo4jChangeDataCaptureMeta } from '../models/Neo4jChangeDataCaptureMeta';
import { Neo4jChangeDataCapturePayload } from '../models/Neo4jChangeDataCapturePayload';
import { Neo4jChangeDataCaptureSchema } from '../models/Neo4jChangeDataCaptureSchema';
import { HttpFile } from '../http/http';

export class Neo4jChangeDataCapture {
    'headers': { [key: string]: any; };
    'messageKey': string;
    'meta': Neo4jChangeDataCaptureMeta;
    'offset': number;
    'partition': number;
    'sourceType': string;
    'timestamp': Date;
    'topic': string;
    'schema': Neo4jChangeDataCaptureSchema;
    'payload': Neo4jChangeDataCapturePayload;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "headers",
            "baseName": "headers",
            "type": "{ [key: string]: any; }",
            "format": ""
        },
        {
            "name": "messageKey",
            "baseName": "message_key",
            "type": "string",
            "format": ""
        },
        {
            "name": "meta",
            "baseName": "meta",
            "type": "Neo4jChangeDataCaptureMeta",
            "format": ""
        },
        {
            "name": "offset",
            "baseName": "offset",
            "type": "number",
            "format": ""
        },
        {
            "name": "partition",
            "baseName": "partition",
            "type": "number",
            "format": ""
        },
        {
            "name": "sourceType",
            "baseName": "source_type",
            "type": "string",
            "format": ""
        },
        {
            "name": "timestamp",
            "baseName": "timestamp",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "topic",
            "baseName": "topic",
            "type": "string",
            "format": ""
        },
        {
            "name": "schema",
            "baseName": "schema",
            "type": "Neo4jChangeDataCaptureSchema",
            "format": ""
        },
        {
            "name": "payload",
            "baseName": "payload",
            "type": "Neo4jChangeDataCapturePayload",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Neo4jChangeDataCapture.attributeTypeMap;
    }

    public constructor() {
    }
}

