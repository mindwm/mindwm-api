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
import type { ClipboardPayload } from './ClipboardPayload';
import {
    ClipboardPayloadFromJSON,
    ClipboardPayloadFromJSONTyped,
    ClipboardPayloadToJSON,
} from './ClipboardPayload';
import type { CloudEventData } from './CloudEventData';
import {
    CloudEventDataFromJSON,
    CloudEventDataFromJSONTyped,
    CloudEventDataToJSON,
} from './CloudEventData';

/**
 * 
 * @export
 * @interface Clipboard
 */
export interface Clipboard {
    [key: string]: any | any;
    /**
     * 
     * @type {string}
     * @memberof Clipboard
     */
    type?: string;
    /**
     * 
     * @type {string}
     * @memberof Clipboard
     */
    source?: string;
    /**
     * 
     * @type {ClipboardPayload}
     * @memberof Clipboard
     */
    data?: ClipboardPayload;
    /**
     * Identifies the event.
     * @type {string}
     * @memberof Clipboard
     */
    id: string;
    /**
     * The version of the CloudEvents specification which the event uses.
     * @type {string}
     * @memberof Clipboard
     */
    specversion: string;
    /**
     * Content type of the data value. Must adhere to RFC 2046 format.
     * @type {string}
     * @memberof Clipboard
     */
    datacontenttype?: string;
    /**
     * Identifies the schema that data adheres to.
     * @type {string}
     * @memberof Clipboard
     */
    dataschema?: string;
    /**
     * Describes the subject of the event in the context of the event producer (identified by source).
     * @type {string}
     * @memberof Clipboard
     */
    subject?: string;
    /**
     * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
     * @type {Date}
     * @memberof Clipboard
     */
    time?: Date;
    /**
     * Base64 encoded event payload. Must adhere to RFC4648.
     * @type {string}
     * @memberof Clipboard
     */
    dataBase64?: string;
}

/**
 * Check if a given object implements the Clipboard interface.
 */
export function instanceOfClipboard(value: object): value is Clipboard {
    if (!('id' in value) || value['id'] === undefined) return false;
    if (!('specversion' in value) || value['specversion'] === undefined) return false;
    return true;
}

export function ClipboardFromJSON(json: any): Clipboard {
    return ClipboardFromJSONTyped(json, false);
}

export function ClipboardFromJSONTyped(json: any, ignoreDiscriminator: boolean): Clipboard {
    if (json == null) {
        return json;
    }
    return {
        
            ...json,
        'type': json['type'] == null ? undefined : json['type'],
        'source': json['source'] == null ? undefined : json['source'],
        'data': json['data'] == null ? undefined : ClipboardPayloadFromJSON(json['data']),
        'id': json['id'],
        'specversion': json['specversion'],
        'datacontenttype': json['datacontenttype'] == null ? undefined : json['datacontenttype'],
        'dataschema': json['dataschema'] == null ? undefined : json['dataschema'],
        'subject': json['subject'] == null ? undefined : json['subject'],
        'time': json['time'] == null ? undefined : (new Date(json['time'])),
        'dataBase64': json['data_base64'] == null ? undefined : json['data_base64'],
    };
}

export function ClipboardToJSON(value?: Clipboard | null): any {
    if (value == null) {
        return value;
    }
    return {
        
            ...value,
        'type': value['type'],
        'source': value['source'],
        'data': ClipboardPayloadToJSON(value['data']),
        'id': value['id'],
        'specversion': value['specversion'],
        'datacontenttype': value['datacontenttype'],
        'dataschema': value['dataschema'],
        'subject': value['subject'],
        'time': value['time'] == null ? undefined : ((value['time']).toISOString()),
        'data_base64': value['dataBase64'],
    };
}

