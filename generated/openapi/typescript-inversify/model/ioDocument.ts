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
import { TmuxPaneIoDocument } from './tmuxPaneIoDocument';


export interface IoDocument { 
  [key: string]: any | any;


    type?: string;
    source?: string;
    data?: TmuxPaneIoDocument;
    /**
     * Identifies the event.
     */
    id: string;
    /**
     * The version of the CloudEvents specification which the event uses.
     */
    specversion: string;
    /**
     * Content type of the data value. Must adhere to RFC 2046 format.
     */
    datacontenttype?: string;
    /**
     * Identifies the schema that data adheres to.
     */
    dataschema?: string;
    subject?: string;
    /**
     * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
     */
    time?: string;
    /**
     * Base64 encoded event payload. Must adhere to RFC4648.
     */
    data_base64?: string;
}
