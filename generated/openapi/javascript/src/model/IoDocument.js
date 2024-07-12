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
import CloudEvent from './CloudEvent';
import TmuxPaneIoDocument from './TmuxPaneIoDocument';

/**
 * The IoDocument model module.
 * @module model/IoDocument
 * @version 0.1.0
 */
class IoDocument {
    /**
     * Constructs a new <code>IoDocument</code>.
     * @alias module:model/IoDocument
     * @extends Object
     * @implements module:model/CloudEvent
     * @param id {String} Identifies the event.
     * @param source {String} 
     * @param specversion {String} The version of the CloudEvents specification which the event uses.
     * @param type {String} 
     */
    constructor(id, source, specversion, type) { 
        CloudEvent.initialize(this, id, source, specversion, type);
        IoDocument.initialize(this, id, source, specversion, type);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, source, specversion, type) { 
        obj['id'] = id;
        obj['specversion'] = specversion;
    }

    /**
     * Constructs a <code>IoDocument</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/IoDocument} obj Optional instance to populate.
     * @return {module:model/IoDocument} The populated <code>IoDocument</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new IoDocument();

            ApiClient.constructFromObject(data, obj, 'Object');
            
            CloudEvent.constructFromObject(data, obj);

            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('source')) {
                obj['source'] = ApiClient.convertToType(data['source'], 'String');
            }
            if (data.hasOwnProperty('data')) {
                obj['data'] = TmuxPaneIoDocument.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('specversion')) {
                obj['specversion'] = ApiClient.convertToType(data['specversion'], 'String');
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
            if (data.hasOwnProperty('data_base64')) {
                obj['data_base64'] = ApiClient.convertToType(data['data_base64'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>IoDocument</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>IoDocument</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of IoDocument.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['type'] && !(typeof data['type'] === 'string' || data['type'] instanceof String)) {
            throw new Error("Expected the field `type` to be a primitive type in the JSON string but got " + data['type']);
        }
        // ensure the json data is a string
        if (data['source'] && !(typeof data['source'] === 'string' || data['source'] instanceof String)) {
            throw new Error("Expected the field `source` to be a primitive type in the JSON string but got " + data['source']);
        }
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['specversion'] && !(typeof data['specversion'] === 'string' || data['specversion'] instanceof String)) {
            throw new Error("Expected the field `specversion` to be a primitive type in the JSON string but got " + data['specversion']);
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
        // ensure the json data is a string
        if (data['data_base64'] && !(typeof data['data_base64'] === 'string' || data['data_base64'] instanceof String)) {
            throw new Error("Expected the field `data_base64` to be a primitive type in the JSON string but got " + data['data_base64']);
        }

        return true;
    }


}

IoDocument.RequiredProperties = ["id", "source", "specversion", "type"];

/**
 * @member {String} type
 */
IoDocument.prototype['type'] = undefined;

/**
 * @member {String} source
 */
IoDocument.prototype['source'] = undefined;

/**
 * @member {module:model/TmuxPaneIoDocument} data
 */
IoDocument.prototype['data'] = undefined;

/**
 * Identifies the event.
 * @member {String} id
 */
IoDocument.prototype['id'] = undefined;

/**
 * The version of the CloudEvents specification which the event uses.
 * @member {String} specversion
 */
IoDocument.prototype['specversion'] = undefined;

/**
 * Content type of the data value. Must adhere to RFC 2046 format.
 * @member {String} datacontenttype
 */
IoDocument.prototype['datacontenttype'] = undefined;

/**
 * Identifies the schema that data adheres to.
 * @member {String} dataschema
 */
IoDocument.prototype['dataschema'] = undefined;

/**
 * Describes the subject of the event in the context of the event producer (identified by source).
 * @member {String} subject
 */
IoDocument.prototype['subject'] = undefined;

/**
 * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
 * @member {Date} time
 */
IoDocument.prototype['time'] = undefined;

/**
 * Base64 encoded event payload. Must adhere to RFC4648.
 * @member {String} data_base64
 */
IoDocument.prototype['data_base64'] = undefined;


// Implement CloudEvent interface:
/**
 * Identifies the event.
 * @member {String} id
 */
CloudEvent.prototype['id'] = undefined;
/**
 * Identifies the context in which an event happened.
 * @member {String} source
 */
CloudEvent.prototype['source'] = undefined;
/**
 * The version of the CloudEvents specification which the event uses.
 * @member {String} specversion
 */
CloudEvent.prototype['specversion'] = undefined;
/**
 * Describes the type of event related to the originating occurrence.
 * @member {String} type
 */
CloudEvent.prototype['type'] = undefined;
/**
 * Content type of the data value. Must adhere to RFC 2046 format.
 * @member {String} datacontenttype
 */
CloudEvent.prototype['datacontenttype'] = undefined;
/**
 * Identifies the schema that data adheres to.
 * @member {String} dataschema
 */
CloudEvent.prototype['dataschema'] = undefined;
/**
 * Describes the subject of the event in the context of the event producer (identified by source).
 * @member {String} subject
 */
CloudEvent.prototype['subject'] = undefined;
/**
 * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
 * @member {Date} time
 */
CloudEvent.prototype['time'] = undefined;
/**
 * @member {module:model/CloudEventData} data
 */
CloudEvent.prototype['data'] = undefined;
/**
 * Base64 encoded event payload. Must adhere to RFC4648.
 * @member {String} data_base64
 */
CloudEvent.prototype['data_base64'] = undefined;




export default IoDocument;

