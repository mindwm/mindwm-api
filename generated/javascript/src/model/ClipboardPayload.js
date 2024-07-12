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
import ClipboardPayloadContext from './ClipboardPayloadContext';

/**
 * The ClipboardPayload model module.
 * @module model/ClipboardPayload
 * @version 0.1.0
 */
class ClipboardPayload {
    /**
     * Constructs a new <code>ClipboardPayload</code>.
     * @alias module:model/ClipboardPayload
     */
    constructor() { 
        
        ClipboardPayload.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ClipboardPayload</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ClipboardPayload} obj Optional instance to populate.
     * @return {module:model/ClipboardPayload} The populated <code>ClipboardPayload</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ClipboardPayload();

            if (data.hasOwnProperty('start')) {
                obj['start'] = ApiClient.convertToType(data['start'], ['Number']);
            }
            if (data.hasOwnProperty('stop')) {
                obj['stop'] = ApiClient.convertToType(data['stop'], ['Number']);
            }
            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('context')) {
                obj['context'] = ClipboardPayloadContext.constructFromObject(data['context']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ClipboardPayload</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ClipboardPayload</code>.
     */
    static validateJSON(data) {
        // ensure the json data is an array
        if (!Array.isArray(data['start'])) {
            throw new Error("Expected the field `start` to be an array in the JSON data but got " + data['start']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['stop'])) {
            throw new Error("Expected the field `stop` to be an array in the JSON data but got " + data['stop']);
        }
        // ensure the json data is a string
        if (data['data'] && !(typeof data['data'] === 'string' || data['data'] instanceof String)) {
            throw new Error("Expected the field `data` to be a primitive type in the JSON string but got " + data['data']);
        }
        // ensure the json data is a string
        if (data['type'] && !(typeof data['type'] === 'string' || data['type'] instanceof String)) {
            throw new Error("Expected the field `type` to be a primitive type in the JSON string but got " + data['type']);
        }
        // validate the optional field `context`
        if (data['context']) { // data not null
          ClipboardPayloadContext.validateJSON(data['context']);
        }

        return true;
    }


}



/**
 * Starting position of clipboard selection [x,y]
 * @member {Array.<Number>} start
 */
ClipboardPayload.prototype['start'] = undefined;

/**
 * Ending position of clipboard selection [x,y]
 * @member {Array.<Number>} stop
 */
ClipboardPayload.prototype['stop'] = undefined;

/**
 * Clipboard data
 * @member {String} data
 */
ClipboardPayload.prototype['data'] = undefined;

/**
 * Clipboard type
 * @member {module:model/ClipboardPayload.TypeEnum} type
 */
ClipboardPayload.prototype['type'] = undefined;

/**
 * @member {module:model/ClipboardPayloadContext} context
 */
ClipboardPayload.prototype['context'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
ClipboardPayload['TypeEnum'] = {

    /**
     * value: "primary"
     * @const
     */
    "primary": "primary",

    /**
     * value: "secondary"
     * @const
     */
    "secondary": "secondary",

    /**
     * value: "clipboard"
     * @const
     */
    "clipboard": "clipboard"
};



export default ClipboardPayload;

