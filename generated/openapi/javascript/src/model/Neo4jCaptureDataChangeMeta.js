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
import Neo4jCaptureDataChangeMetaSource from './Neo4jCaptureDataChangeMetaSource';

/**
 * The Neo4jCaptureDataChangeMeta model module.
 * @module model/Neo4jCaptureDataChangeMeta
 * @version 0.1.0
 */
class Neo4jCaptureDataChangeMeta {
    /**
     * Constructs a new <code>Neo4jCaptureDataChangeMeta</code>.
     * @alias module:model/Neo4jCaptureDataChangeMeta
     * @param operation {String} 
     * @param source {module:model/Neo4jCaptureDataChangeMetaSource} 
     * @param timestamp {Number} 
     * @param txEventId {Number} 
     * @param txEventsCount {Number} 
     * @param txId {Number} 
     * @param username {String} 
     */
    constructor(operation, source, timestamp, txEventId, txEventsCount, txId, username) { 
        
        Neo4jCaptureDataChangeMeta.initialize(this, operation, source, timestamp, txEventId, txEventsCount, txId, username);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, operation, source, timestamp, txEventId, txEventsCount, txId, username) { 
        obj['operation'] = operation;
        obj['source'] = source;
        obj['timestamp'] = timestamp;
        obj['txEventId'] = txEventId;
        obj['txEventsCount'] = txEventsCount;
        obj['txId'] = txId;
        obj['username'] = username;
    }

    /**
     * Constructs a <code>Neo4jCaptureDataChangeMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Neo4jCaptureDataChangeMeta} obj Optional instance to populate.
     * @return {module:model/Neo4jCaptureDataChangeMeta} The populated <code>Neo4jCaptureDataChangeMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Neo4jCaptureDataChangeMeta();

            if (data.hasOwnProperty('operation')) {
                obj['operation'] = ApiClient.convertToType(data['operation'], 'String');
            }
            if (data.hasOwnProperty('source')) {
                obj['source'] = Neo4jCaptureDataChangeMetaSource.constructFromObject(data['source']);
            }
            if (data.hasOwnProperty('timestamp')) {
                obj['timestamp'] = ApiClient.convertToType(data['timestamp'], 'Number');
            }
            if (data.hasOwnProperty('txEventId')) {
                obj['txEventId'] = ApiClient.convertToType(data['txEventId'], 'Number');
            }
            if (data.hasOwnProperty('txEventsCount')) {
                obj['txEventsCount'] = ApiClient.convertToType(data['txEventsCount'], 'Number');
            }
            if (data.hasOwnProperty('txId')) {
                obj['txId'] = ApiClient.convertToType(data['txId'], 'Number');
            }
            if (data.hasOwnProperty('username')) {
                obj['username'] = ApiClient.convertToType(data['username'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>Neo4jCaptureDataChangeMeta</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>Neo4jCaptureDataChangeMeta</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of Neo4jCaptureDataChangeMeta.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['operation'] && !(typeof data['operation'] === 'string' || data['operation'] instanceof String)) {
            throw new Error("Expected the field `operation` to be a primitive type in the JSON string but got " + data['operation']);
        }
        // validate the optional field `source`
        if (data['source']) { // data not null
          Neo4jCaptureDataChangeMetaSource.validateJSON(data['source']);
        }
        // ensure the json data is a string
        if (data['username'] && !(typeof data['username'] === 'string' || data['username'] instanceof String)) {
            throw new Error("Expected the field `username` to be a primitive type in the JSON string but got " + data['username']);
        }

        return true;
    }


}

Neo4jCaptureDataChangeMeta.RequiredProperties = ["operation", "source", "timestamp", "txEventId", "txEventsCount", "txId", "username"];

/**
 * @member {String} operation
 */
Neo4jCaptureDataChangeMeta.prototype['operation'] = undefined;

/**
 * @member {module:model/Neo4jCaptureDataChangeMetaSource} source
 */
Neo4jCaptureDataChangeMeta.prototype['source'] = undefined;

/**
 * @member {Number} timestamp
 */
Neo4jCaptureDataChangeMeta.prototype['timestamp'] = undefined;

/**
 * @member {Number} txEventId
 */
Neo4jCaptureDataChangeMeta.prototype['txEventId'] = undefined;

/**
 * @member {Number} txEventsCount
 */
Neo4jCaptureDataChangeMeta.prototype['txEventsCount'] = undefined;

/**
 * @member {Number} txId
 */
Neo4jCaptureDataChangeMeta.prototype['txId'] = undefined;

/**
 * @member {String} username
 */
Neo4jCaptureDataChangeMeta.prototype['username'] = undefined;






export default Neo4jCaptureDataChangeMeta;
