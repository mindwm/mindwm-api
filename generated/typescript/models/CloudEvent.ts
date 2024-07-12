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

import { CloudEventData } from '../models/CloudEventData';
import { HttpFile } from '../http/http';

/**
* CloudEvents Specification JSON Schema
*/
export class CloudEvent {
    /**
    * Identifies the event.
    */
    'id': string;
    /**
    * Identifies the context in which an event happened.
    */
    'source': string;
    /**
    * The version of the CloudEvents specification which the event uses.
    */
    'specversion': string;
    /**
    * Describes the type of event related to the originating occurrence.
    */
    'type': string;
    /**
    * Content type of the data value. Must adhere to RFC 2046 format.
    */
    'datacontenttype'?: string | null;
    /**
    * Identifies the schema that data adheres to.
    */
    'dataschema'?: string | null;
    /**
    * Describes the subject of the event in the context of the event producer (identified by source).
    */
    'subject'?: string | null;
    /**
    * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
    */
    'time'?: Date | null;
    'data'?: CloudEventData | null;
    /**
    * Base64 encoded event payload. Must adhere to RFC4648.
    */
    'dataBase64'?: string | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "source",
            "baseName": "source",
            "type": "string",
            "format": "uri-reference"
        },
        {
            "name": "specversion",
            "baseName": "specversion",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "string",
            "format": ""
        },
        {
            "name": "datacontenttype",
            "baseName": "datacontenttype",
            "type": "string",
            "format": ""
        },
        {
            "name": "dataschema",
            "baseName": "dataschema",
            "type": "string",
            "format": "uri"
        },
        {
            "name": "subject",
            "baseName": "subject",
            "type": "string",
            "format": ""
        },
        {
            "name": "time",
            "baseName": "time",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "data",
            "baseName": "data",
            "type": "CloudEventData",
            "format": ""
        },
        {
            "name": "dataBase64",
            "baseName": "data_base64",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CloudEvent.attributeTypeMap;
    }

    public constructor() {
    }
}

