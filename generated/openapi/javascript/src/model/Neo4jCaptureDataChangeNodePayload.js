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
import Neo4jCaptureDataChangeNodePayloadAfter from './Neo4jCaptureDataChangeNodePayloadAfter';

/**
 * The Neo4jCaptureDataChangeNodePayload model module.
 * @module model/Neo4jCaptureDataChangeNodePayload
 * @version 0.1.0
 */
class Neo4jCaptureDataChangeNodePayload {
    /**
     * Constructs a new <code>Neo4jCaptureDataChangeNodePayload</code>.
     * @alias module:model/Neo4jCaptureDataChangeNodePayload
     * @param after {module:model/Neo4jCaptureDataChangeNodePayloadAfter} 
     * @param before {String} 
     * @param id {String} 
     * @param type {String} 
     */
    constructor(after, before, id, type) { 
        
        Neo4jCaptureDataChangeNodePayload.initialize(this, after, before, id, type);
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
     * Constructs a <code>Neo4jCaptureDataChangeNodePayload</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Neo4jCaptureDataChangeNodePayload} obj Optional instance to populate.
     * @return {module:model/Neo4jCaptureDataChangeNodePayload} The populated <code>Neo4jCaptureDataChangeNodePayload</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Neo4jCaptureDataChangeNodePayload();

            if (data.hasOwnProperty('after')) {
                obj['after'] = Neo4jCaptureDataChangeNodePayloadAfter.constructFromObject(data['after']);
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
     * Validates the JSON data with respect to <code>Neo4jCaptureDataChangeNodePayload</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>Neo4jCaptureDataChangeNodePayload</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of Neo4jCaptureDataChangeNodePayload.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // validate the optional field `after`
        if (data['after']) { // data not null
          Neo4jCaptureDataChangeNodePayloadAfter.validateJSON(data['after']);
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

Neo4jCaptureDataChangeNodePayload.RequiredProperties = ["after", "before", "id", "type"];

/**
 * @member {module:model/Neo4jCaptureDataChangeNodePayloadAfter} after
 */
Neo4jCaptureDataChangeNodePayload.prototype['after'] = undefined;

/**
 * @member {String} before
 */
Neo4jCaptureDataChangeNodePayload.prototype['before'] = undefined;

/**
 * @member {String} id
 */
Neo4jCaptureDataChangeNodePayload.prototype['id'] = undefined;

/**
 * @member {String} type
 */
Neo4jCaptureDataChangeNodePayload.prototype['type'] = undefined;






export default Neo4jCaptureDataChangeNodePayload;

