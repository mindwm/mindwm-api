const utils = require('../utils/utils');
const AnyType = require('../models/AnyType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}constraints`,
                label: `[${labelPrefix}constraints]`,
                dict: true,
            },
            {
                key: `${keyPrefix}properties`,
                label: `[${labelPrefix}properties]`,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'constraints': bundle.inputData?.[`${keyPrefix}constraints`],
            'properties': bundle.inputData?.[`${keyPrefix}properties`],
        }
    },
}
