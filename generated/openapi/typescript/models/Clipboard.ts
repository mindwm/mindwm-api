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

import { ClipboardContext } from '../models/ClipboardContext';
import { Vector2int } from '../models/Vector2int';
import { HttpFile } from '../http/http';

export class Clipboard {
    'context': ClipboardContext;
    /**
    * Type of clipboard
    */
    'clipboardType': ClipboardClipboardTypeEnum;
    /**
    * Clipboard content
    */
    'content': string;
    'selectionStart'?: Vector2int;
    'selectionEnd'?: Vector2int;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "context",
            "baseName": "context",
            "type": "ClipboardContext",
            "format": ""
        },
        {
            "name": "clipboardType",
            "baseName": "clipboardType",
            "type": "ClipboardClipboardTypeEnum",
            "format": ""
        },
        {
            "name": "content",
            "baseName": "content",
            "type": "string",
            "format": ""
        },
        {
            "name": "selectionStart",
            "baseName": "selectionStart",
            "type": "Vector2int",
            "format": ""
        },
        {
            "name": "selectionEnd",
            "baseName": "selectionEnd",
            "type": "Vector2int",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Clipboard.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum ClipboardClipboardTypeEnum {
    Primary = 'Primary',
    Secondary = 'Secondary',
    Clipboard = 'Clipboard'
}

