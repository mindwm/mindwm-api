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
 * The Neo4jChangeDataCaptureRelationshipPayloadEnd model module.
 * @module model/Neo4jChangeDataCaptureRelationshipPayloadEnd
 * @version 0.1.0
 */
class Neo4jChangeDataCaptureRelationshipPayloadEnd {
    /**
     * Constructs a new <code>Neo4jChangeDataCaptureRelationshipPayloadEnd</code>.
     * @alias module:model/Neo4jChangeDataCaptureRelationshipPayloadEnd
     * @param id {String} 
     * @param ids {Object.<String, Object>} 
     * @param labels {Array.<String>} 
     */
    constructor(id, ids, labels) { 
        
        Neo4jChangeDataCaptureRelationshipPayloadEnd.initialize(this, id, ids, labels);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, ids, labels) { 
        obj['id'] = id;
        obj['ids'] = ids;
        obj['labels'] = labels;
    }

    /**
     * Constructs a <code>Neo4jChangeDataCaptureRelationshipPayloadEnd</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Neo4jChangeDataCaptureRelationshipPayloadEnd} obj Optional instance to populate.
     * @return {module:model/Neo4jChangeDataCaptureRelationshipPayloadEnd} The populated <code>Neo4jChangeDataCaptureRelationshipPayloadEnd</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Neo4jChangeDataCaptureRelationshipPayloadEnd();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], {'String': Object});
            }
            if (data.hasOwnProperty('labels')) {
                obj['labels'] = ApiClient.convertToType(data['labels'], ['String']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>Neo4jChangeDataCaptureRelationshipPayloadEnd</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>Neo4jChangeDataCaptureRelationshipPayloadEnd</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of Neo4jChangeDataCaptureRelationshipPayloadEnd.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['labels'])) {
            throw new Error("Expected the field `labels` to be an array in the JSON data but got " + data['labels']);
        }

        return true;
    }


}

Neo4jChangeDataCaptureRelationshipPayloadEnd.RequiredProperties = ["id", "ids", "labels"];

/**
 * @member {String} id
 */
Neo4jChangeDataCaptureRelationshipPayloadEnd.prototype['id'] = undefined;

/**
 * @member {Object.<String, Object>} ids
 */
Neo4jChangeDataCaptureRelationshipPayloadEnd.prototype['ids'] = undefined;

/**
 * @member {Array.<String>} labels
 */
Neo4jChangeDataCaptureRelationshipPayloadEnd.prototype['labels'] = undefined;






export default Neo4jChangeDataCaptureRelationshipPayloadEnd;

