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
import Touch from './Touch';

/**
 * The TouchEvent model module.
 * @module model/TouchEvent
 * @version 0.1.0
 */
class TouchEvent {
    /**
     * Constructs a new <code>TouchEvent</code>.
     * @alias module:model/TouchEvent
     * @extends Object
     * @param id {String} Identifies the event.
     * @param source {String} 
     * @param specversion {String} The version of the CloudEvents specification which the event uses.
     * @param type {String} 
     */
    constructor(id, source, specversion, type) { 
        
        TouchEvent.initialize(this, id, source, specversion, type);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, source, specversion, type) { 
        obj['id'] = id;
        obj['source'] = source;
        obj['specversion'] = specversion;
        obj['type'] = type || 'touch';
    }

    /**
     * Constructs a <code>TouchEvent</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TouchEvent} obj Optional instance to populate.
     * @return {module:model/TouchEvent} The populated <code>TouchEvent</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TouchEvent();

            ApiClient.constructFromObject(data, obj, 'Object');
            

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('source')) {
                obj['source'] = ApiClient.convertToType(data['source'], 'String');
            }
            if (data.hasOwnProperty('specversion')) {
                obj['specversion'] = ApiClient.convertToType(data['specversion'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('datacontenttype')) {
                obj['datacontenttype'] = ApiClient.convertToType(data['datacontenttype'], 'String');
            }
            if (data.hasOwnProperty('dataschema')) {
                obj['dataschema'] = ApiClient.convertToType(data['dataschema'], 'String');
            }
            if (data.hasOwnProperty('subject')) {
                obj['subject'] = ApiClient.convertToType(data['subject'], 'String');
            }
            if (data.hasOwnProperty('time')) {
                obj['time'] = ApiClient.convertToType(data['time'], 'Date');
            }
            if (data.hasOwnProperty('data')) {
                obj['data'] = Touch.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('data_base64')) {
                obj['data_base64'] = ApiClient.convertToType(data['data_base64'], 'String');
            }
            if (data.hasOwnProperty('knativebrokerttl')) {
                obj['knativebrokerttl'] = ApiClient.convertToType(data['knativebrokerttl'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>TouchEvent</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>TouchEvent</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of TouchEvent.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['source'] && !(typeof data['source'] === 'string' || data['source'] instanceof String)) {
            throw new Error("Expected the field `source` to be a primitive type in the JSON string but got " + data['source']);
        }
        // ensure the json data is a string
        if (data['specversion'] && !(typeof data['specversion'] === 'string' || data['specversion'] instanceof String)) {
            throw new Error("Expected the field `specversion` to be a primitive type in the JSON string but got " + data['specversion']);
        }
        // ensure the json data is a string
        if (data['type'] && !(typeof data['type'] === 'string' || data['type'] instanceof String)) {
            throw new Error("Expected the field `type` to be a primitive type in the JSON string but got " + data['type']);
        }
        // ensure the json data is a string
        if (data['datacontenttype'] && !(typeof data['datacontenttype'] === 'string' || data['datacontenttype'] instanceof String)) {
            throw new Error("Expected the field `datacontenttype` to be a primitive type in the JSON string but got " + data['datacontenttype']);
        }
        // ensure the json data is a string
        if (data['dataschema'] && !(typeof data['dataschema'] === 'string' || data['dataschema'] instanceof String)) {
            throw new Error("Expected the field `dataschema` to be a primitive type in the JSON string but got " + data['dataschema']);
        }
        // ensure the json data is a string
        if (data['subject'] && !(typeof data['subject'] === 'string' || data['subject'] instanceof String)) {
            throw new Error("Expected the field `subject` to be a primitive type in the JSON string but got " + data['subject']);
        }
        // validate the optional field `data`
        if (data['data']) { // data not null
          Touch.validateJSON(data['data']);
        }
        // ensure the json data is a string
        if (data['data_base64'] && !(typeof data['data_base64'] === 'string' || data['data_base64'] instanceof String)) {
            throw new Error("Expected the field `data_base64` to be a primitive type in the JSON string but got " + data['data_base64']);
        }
        // ensure the json data is a string
        if (data['knativebrokerttl'] && !(typeof data['knativebrokerttl'] === 'string' || data['knativebrokerttl'] instanceof String)) {
            throw new Error("Expected the field `knativebrokerttl` to be a primitive type in the JSON string but got " + data['knativebrokerttl']);
        }

        return true;
    }


}

TouchEvent.RequiredProperties = ["id", "source", "specversion", "type"];

/**
 * Identifies the event.
 * @member {String} id
 */
TouchEvent.prototype['id'] = undefined;

/**
 * @member {String} source
 */
TouchEvent.prototype['source'] = undefined;

/**
 * The version of the CloudEvents specification which the event uses.
 * @member {String} specversion
 */
TouchEvent.prototype['specversion'] = undefined;

/**
 * @member {String} type
 * @default 'touch'
 */
TouchEvent.prototype['type'] = 'touch';

/**
 * Content type of the data value. Must adhere to RFC 2046 format.
 * @member {String} datacontenttype
 */
TouchEvent.prototype['datacontenttype'] = undefined;

/**
 * Identifies the schema that data adheres to.
 * @member {String} dataschema
 */
TouchEvent.prototype['dataschema'] = undefined;

/**
 * @member {String} subject
 * @default 'node'
 */
TouchEvent.prototype['subject'] = 'node';

/**
 * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
 * @member {Date} time
 */
TouchEvent.prototype['time'] = undefined;

/**
 * @member {module:model/Touch} data
 */
TouchEvent.prototype['data'] = undefined;

/**
 * Base64 encoded event payload. Must adhere to RFC4648.
 * @member {String} data_base64
 */
TouchEvent.prototype['data_base64'] = undefined;

/**
 * knative broker ttl, workaround for https://github.com/knative-extensions/eventing-natss/issues/518
 * @member {String} knativebrokerttl
 * @default '255'
 */
TouchEvent.prototype['knativebrokerttl'] = '255';






export default TouchEvent;

