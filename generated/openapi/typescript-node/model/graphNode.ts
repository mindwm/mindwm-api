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

import { RequestFile } from './models';
import { GraphNodeAllOfData } from './graphNodeAllOfData';

export class GraphNode extends any {
    /**
    * Identifies the event.
    */
    'id': string;
    'source': GraphNode.SourceEnum;
    /**
    * The version of the CloudEvents specification which the event uses.
    */
    'specversion': string;
    'type': GraphNode.TypeEnum;
    /**
    * Content type of the data value. Must adhere to RFC 2046 format.
    */
    'datacontenttype'?: string;
    /**
    * Identifies the schema that data adheres to.
    */
    'dataschema'?: string;
    /**
    * Describes the subject of the event in the context of the event producer (identified by source).
    */
    'subject'?: string;
    /**
    * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
    */
    'time'?: Date;
    'data'?: GraphNodeAllOfData;
    /**
    * Base64 encoded event payload. Must adhere to RFC4648.
    */
    'dataBase64'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "source",
            "baseName": "source",
            "type": "GraphNode.SourceEnum"
        },
        {
            "name": "specversion",
            "baseName": "specversion",
            "type": "string"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "GraphNode.TypeEnum"
        },
        {
            "name": "datacontenttype",
            "baseName": "datacontenttype",
            "type": "string"
        },
        {
            "name": "dataschema",
            "baseName": "dataschema",
            "type": "string"
        },
        {
            "name": "subject",
            "baseName": "subject",
            "type": "string"
        },
        {
            "name": "time",
            "baseName": "time",
            "type": "Date"
        },
        {
            "name": "data",
            "baseName": "data",
            "type": "GraphNodeAllOfData"
        },
        {
            "name": "dataBase64",
            "baseName": "data_base64",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return super.getAttributeTypeMap().concat(GraphNode.attributeTypeMap);
    }
}

export namespace GraphNode {
    export enum SourceEnum {
        Node = <any> 'graph.node',
        Relationship = <any> 'graph.relationship'
    }
    export enum TypeEnum {
        Created = <any> 'created',
        Updated = <any> 'updated',
        Deleted = <any> 'deleted'
    }
}
