const utils = require('../utils/utils');
const AnyType = require('../models/AnyType');
const ClipboardPayload = require('../models/ClipboardPayload');

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
                label: `[${labelPrefix}source]`,
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
                label: `[${labelPrefix}type]`,
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
                label: `[${labelPrefix}subject]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}time`,
                label: `Timestamp of when the occurrence happened. Must adhere to RFC 3339. - [${labelPrefix}time]`,
                type: 'string',
            },
            ...ClipboardPayload.fields(`${keyPrefix}data`, isInput),
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
            'data': utils.removeIfEmpty(ClipboardPayload.mapping(bundle, `${keyPrefix}data`)),
            'data_base64': bundle.inputData?.[`${keyPrefix}data_base64`],
        }
    },
}
