const utils = require('../utils/utils');
const ClipboardPayload_context = require('../models/ClipboardPayload_context');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}start`,
                label: `Starting position of clipboard selection [x,y] - [${labelPrefix}start]`,
                list: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}stop`,
                label: `Ending position of clipboard selection [x,y] - [${labelPrefix}stop]`,
                list: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}data`,
                label: `Clipboard data - [${labelPrefix}data]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `Clipboard type - [${labelPrefix}type]`,
                type: 'string',
                choices: [
                    'primary',
                    'secondary',
                    'clipboard',
                ],
            },
            ...ClipboardPayload_context.fields(`${keyPrefix}context`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'start': bundle.inputData?.[`${keyPrefix}start`],
            'stop': bundle.inputData?.[`${keyPrefix}stop`],
            'data': bundle.inputData?.[`${keyPrefix}data`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'context': utils.removeIfEmpty(ClipboardPayload_context.mapping(bundle, `${keyPrefix}context`)),
        }
    },
}
