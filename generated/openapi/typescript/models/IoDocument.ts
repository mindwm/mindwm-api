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

import { HttpFile } from '../http/http';

export class IoDocument {
    /**
    * User input
    */
    'input': string;
    /**
    * Command output (mix of stdout & stderr)
    */
    'output': string;
    /**
    * ps1 (prompt) AFTER the input and output
    */
    'ps1': string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "input",
            "baseName": "input",
            "type": "string",
            "format": ""
        },
        {
            "name": "output",
            "baseName": "output",
            "type": "string",
            "format": ""
        },
        {
            "name": "ps1",
            "baseName": "ps1",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return IoDocument.attributeTypeMap;
    }

    public constructor() {
    }
}

