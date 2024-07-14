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
import { Neo4jCaptureDataChangeSchema } from './neo4jCaptureDataChangeSchema';
import { Neo4jCaptureDataChangeMeta } from './neo4jCaptureDataChangeMeta';
import { Neo4jCaptureDataChangeRelationshipPayload } from './neo4jCaptureDataChangeRelationshipPayload';


export interface GraphRelationshipAllOfData { 
    headers: object;
    message_key: string;
    meta: Neo4jCaptureDataChangeMeta;
    offset: number;
    partition: number;
    source_type: string;
    timestamp: string;
    topic: string;
    schema: Neo4jCaptureDataChangeSchema;
    payload: Neo4jCaptureDataChangeRelationshipPayload;
}
