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

/**
 * The Neo4jCaptureDataChangeNodePayloadAfter model module.
 * @module model/Neo4jCaptureDataChangeNodePayloadAfter
 * @version 0.1.0
 */
class Neo4jCaptureDataChangeNodePayloadAfter {
    /**
     * Constructs a new <code>Neo4jCaptureDataChangeNodePayloadAfter</code>.
     * @alias module:model/Neo4jCaptureDataChangeNodePayloadAfter
     * @param labels {Array.<String>} 
     * @param properties {Object.<String, Object>} 
     */
    constructor(labels, properties) { 
        
        Neo4jCaptureDataChangeNodePayloadAfter.initialize(this, labels, properties);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, labels, properties) { 
        obj['labels'] = labels;
        obj['properties'] = properties;
    }

    /**
     * Constructs a <code>Neo4jCaptureDataChangeNodePayloadAfter</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Neo4jCaptureDataChangeNodePayloadAfter} obj Optional instance to populate.
     * @return {module:model/Neo4jCaptureDataChangeNodePayloadAfter} The populated <code>Neo4jCaptureDataChangeNodePayloadAfter</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Neo4jCaptureDataChangeNodePayloadAfter();

            if (data.hasOwnProperty('labels')) {
                obj['labels'] = ApiClient.convertToType(data['labels'], ['String']);
            }
            if (data.hasOwnProperty('properties')) {
                obj['properties'] = ApiClient.convertToType(data['properties'], {'String': Object});
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>Neo4jCaptureDataChangeNodePayloadAfter</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>Neo4jCaptureDataChangeNodePayloadAfter</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of Neo4jCaptureDataChangeNodePayloadAfter.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is an array
        if (!Array.isArray(data['labels'])) {
            throw new Error("Expected the field `labels` to be an array in the JSON data but got " + data['labels']);
        }

        return true;
    }


}

Neo4jCaptureDataChangeNodePayloadAfter.RequiredProperties = ["labels", "properties"];

/**
 * @member {Array.<String>} labels
 */
Neo4jCaptureDataChangeNodePayloadAfter.prototype['labels'] = undefined;

/**
 * @member {Object.<String, Object>} properties
 */
Neo4jCaptureDataChangeNodePayloadAfter.prototype['properties'] = undefined;






export default Neo4jCaptureDataChangeNodePayloadAfter;

