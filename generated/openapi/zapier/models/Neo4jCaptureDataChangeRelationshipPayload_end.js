const utils = require('../utils/utils');
const AnyType = require('../models/AnyType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}ids`,
                label: `[${labelPrefix}ids]`,
                required: true,
                dict: true,
            },
            {
                key: `${keyPrefix}labels`,
                label: `[${labelPrefix}labels]`,
                required: true,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'ids': bundle.inputData?.[`${keyPrefix}ids`],
            'labels': bundle.inputData?.[`${keyPrefix}labels`],
        }
    },
}
