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
 * @interface TmuxPaneIoDocument
 */
export interface TmuxPaneIoDocument {
    [key: string]: any | any;
    /**
     * User input
     * @type {string}
     * @memberof TmuxPaneIoDocument
     */
    input: string;
    /**
     * Command output (mix of stdout & stderr)
     * @type {string}
     * @memberof TmuxPaneIoDocument
     */
    output: string;
    /**
     * ps1 (prompt) AFTER the input and output
     * @type {string}
     * @memberof TmuxPaneIoDocument
     */
    ps1: string;
}

/**
 * Check if a given object implements the TmuxPaneIoDocument interface.
 */
export function instanceOfTmuxPaneIoDocument(value: object): value is TmuxPaneIoDocument {
    if (!('input' in value) || value['input'] === undefined) return false;
    if (!('output' in value) || value['output'] === undefined) return false;
    if (!('ps1' in value) || value['ps1'] === undefined) return false;
    return true;
}

export function TmuxPaneIoDocumentFromJSON(json: any): TmuxPaneIoDocument {
    return TmuxPaneIoDocumentFromJSONTyped(json, false);
}

export function TmuxPaneIoDocumentFromJSONTyped(json: any, ignoreDiscriminator: boolean): TmuxPaneIoDocument {
    if (json == null) {
        return json;
    }
    return {
        
            ...json,
        'input': json['input'],
        'output': json['output'],
        'ps1': json['ps1'],
    };
}

export function TmuxPaneIoDocumentToJSON(value?: TmuxPaneIoDocument | null): any {
    if (value == null) {
        return value;
    }
    return {
        
            ...value,
        'input': value['input'],
        'output': value['output'],
        'ps1': value['ps1'],
    };
}

