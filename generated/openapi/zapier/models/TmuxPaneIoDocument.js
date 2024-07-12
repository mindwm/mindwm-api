const utils = require('../utils/utils');
const AnyType = require('../models/AnyType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}input`,
                label: `User input - [${labelPrefix}input]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}output`,
                label: `Command output (mix of stdout & stderr) - [${labelPrefix}output]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}ps1`,
                label: `ps1 (prompt) AFTER the input and output - [${labelPrefix}ps1]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'input': bundle.inputData?.[`${keyPrefix}input`],
            'output': bundle.inputData?.[`${keyPrefix}output`],
            'ps1': bundle.inputData?.[`${keyPrefix}ps1`],
        }
    },
}
