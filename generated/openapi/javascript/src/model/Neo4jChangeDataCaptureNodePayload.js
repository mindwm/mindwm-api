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
 *
 */

import ApiClient from '../ApiClient';
import Neo4jChangeDataCaptureNodePayloadAfter from './Neo4jChangeDataCaptureNodePayloadAfter';

/**
 * The Neo4jChangeDataCaptureNodePayload model module.
 * @module model/Neo4jChangeDataCaptureNodePayload
 * @version 0.1.0
 */
class Neo4jChangeDataCaptureNodePayload {
    /**
     * Constructs a new <code>Neo4jChangeDataCaptureNodePayload</code>.
     * @alias module:model/Neo4jChangeDataCaptureNodePayload
     * @param after {module:model/Neo4jChangeDataCaptureNodePayloadAfter} 
     * @param before {String} 
     * @param id {String} 
     * @param type {String} 
     */
    constructor(after, before, id, type) { 
        
        Neo4jChangeDataCaptureNodePayload.initialize(this, after, before, id, type);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, after, before, id, type) { 
        obj['after'] = after;
        obj['before'] = before;
        obj['id'] = id;
        obj['type'] = type;
    }

    /**
     * Constructs a <code>Neo4jChangeDataCaptureNodePayload</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Neo4jChangeDataCaptureNodePayload} obj Optional instance to populate.
     * @return {module:model/Neo4jChangeDataCaptureNodePayload} The populated <code>Neo4jChangeDataCaptureNodePayload</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Neo4jChangeDataCaptureNodePayload();

            if (data.hasOwnProperty('after')) {
                obj['after'] = Neo4jChangeDataCaptureNodePayloadAfter.constructFromObject(data['after']);
            }
            if (data.hasOwnProperty('before')) {
                obj['before'] = ApiClient.convertToType(data['before'], 'String');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>Neo4jChangeDataCaptureNodePayload</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>Neo4jChangeDataCaptureNodePayload</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of Neo4jChangeDataCaptureNodePayload.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // validate the optional field `after`
        if (data['after']) { // data not null
          Neo4jChangeDataCaptureNodePayloadAfter.validateJSON(data['after']);
        }
        // ensure the json data is a string
        if (data['before'] && !(typeof data['before'] === 'string' || data['before'] instanceof String)) {
            throw new Error("Expected the field `before` to be a primitive type in the JSON string but got " + data['before']);
        }
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['type'] && !(typeof data['type'] === 'string' || data['type'] instanceof String)) {
            throw new Error("Expected the field `type` to be a primitive type in the JSON string but got " + data['type']);
        }

        return true;
    }


}

Neo4jChangeDataCaptureNodePayload.RequiredProperties = ["after", "before", "id", "type"];

/**
 * @member {module:model/Neo4jChangeDataCaptureNodePayloadAfter} after
 */
Neo4jChangeDataCaptureNodePayload.prototype['after'] = undefined;

/**
 * @member {String} before
 */
Neo4jChangeDataCaptureNodePayload.prototype['before'] = undefined;

/**
 * @member {String} id
 */
Neo4jChangeDataCaptureNodePayload.prototype['id'] = undefined;

/**
 * @member {String} type
 */
Neo4jChangeDataCaptureNodePayload.prototype['type'] = undefined;






export default Neo4jChangeDataCaptureNodePayload;

