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

import * as models from './models';

export interface GraphNodeAllOfData {
    headers: object;

    message_key: string;

    meta: models.Neo4jCaptureDataChangeMeta;

    offset: number;

    partition: number;

    source_type: string;

    timestamp: string;

    topic: string;

    schema: models.Neo4jCaptureDataChangeSchema;

    payload: models.Neo4jCaptureDataChangeNodePayload;

}
