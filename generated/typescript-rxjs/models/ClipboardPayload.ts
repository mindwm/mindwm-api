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

import type {
    ClipboardPayloadContext,
} from './';

/**
 * @export
 * @interface ClipboardPayload
 */
export interface ClipboardPayload {
    /**
     * Starting position of clipboard selection [x,y]
     * @type {Array<number>}
     * @memberof ClipboardPayload
     */
    start?: Array<number>;
    /**
     * Ending position of clipboard selection [x,y]
     * @type {Array<number>}
     * @memberof ClipboardPayload
     */
    stop?: Array<number>;
    /**
     * Clipboard data
     * @type {string}
     * @memberof ClipboardPayload
     */
    data?: string;
    /**
     * Clipboard type
     * @type {string}
     * @memberof ClipboardPayload
     */
    type?: ClipboardPayloadTypeEnum;
    /**
     * @type {ClipboardPayloadContext}
     * @memberof ClipboardPayload
     */
    context?: ClipboardPayloadContext;
}

/**
 * @export
 * @enum {string}
 */
export enum ClipboardPayloadTypeEnum {
    Primary = 'primary',
    Secondary = 'secondary',
    Clipboard = 'clipboard'
}

