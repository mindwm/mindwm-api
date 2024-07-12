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
 * The event payload.
 * @export
 * @interface CloudEventData
 */
export interface CloudEventData {
}

/**
 * Check if a given object implements the CloudEventData interface.
 */
export function instanceOfCloudEventData(value: object): value is CloudEventData {
    return true;
}

export function CloudEventDataFromJSON(json: any): CloudEventData {
    return CloudEventDataFromJSONTyped(json, false);
}

export function CloudEventDataFromJSONTyped(json: any, ignoreDiscriminator: boolean): CloudEventData {
    return json;
}

export function CloudEventDataToJSON(value?: CloudEventData | null): any {
    return value;
}

