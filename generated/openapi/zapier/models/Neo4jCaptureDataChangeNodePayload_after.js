const utils = require('../utils/utils');
const AnyType = require('../models/AnyType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}labels`,
                label: `[${labelPrefix}labels]`,
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}properties`,
                label: `[${labelPrefix}properties]`,
                required: true,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'labels': bundle.inputData?.[`${keyPrefix}labels`],
            'properties': bundle.inputData?.[`${keyPrefix}properties`],
        }
    },
}
