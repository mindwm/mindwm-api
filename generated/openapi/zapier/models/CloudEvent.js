const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Identifies the event. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}source`,
                label: `Identifies the context in which an event happened. - [${labelPrefix}source]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}specversion`,
                label: `The version of the CloudEvents specification which the event uses. - [${labelPrefix}specversion]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `Describes the type of event related to the originating occurrence. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}datacontenttype`,
                label: `Content type of the data value. Must adhere to RFC 2046 format. - [${labelPrefix}datacontenttype]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}dataschema`,
                label: `Identifies the schema that data adheres to. - [${labelPrefix}dataschema]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}subject`,
                label: `Describes the subject of the event in the context of the event producer (identified by source). - [${labelPrefix}subject]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}time`,
                label: `Timestamp of when the occurrence happened. Must adhere to RFC 3339. - [${labelPrefix}time]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}data`,
                label: `The event payload. - [${labelPrefix}data]`,
                dict: true,
            },
            {
                key: `${keyPrefix}data_base64`,
                label: `Base64 encoded event payload. Must adhere to RFC4648. - [${labelPrefix}data_base64]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'source': bundle.inputData?.[`${keyPrefix}source`],
            'specversion': bundle.inputData?.[`${keyPrefix}specversion`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'datacontenttype': bundle.inputData?.[`${keyPrefix}datacontenttype`],
            'dataschema': bundle.inputData?.[`${keyPrefix}dataschema`],
            'subject': bundle.inputData?.[`${keyPrefix}subject`],
            'time': bundle.inputData?.[`${keyPrefix}time`],
            'data': bundle.inputData?.[`${keyPrefix}data`],
            'data_base64': bundle.inputData?.[`${keyPrefix}data_base64`],
        }
    },
}
