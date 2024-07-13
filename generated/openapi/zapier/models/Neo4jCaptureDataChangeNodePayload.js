const utils = require('../utils/utils');
const Neo4jCaptureDataChangeNodePayload_after = require('../models/Neo4jCaptureDataChangeNodePayload_after');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...Neo4jCaptureDataChangeNodePayload_after.fields(`${keyPrefix}after`, isInput),
            {
                key: `${keyPrefix}before`,
                label: `[${labelPrefix}before]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `[${labelPrefix}type]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'after': utils.removeIfEmpty(Neo4jCaptureDataChangeNodePayload_after.mapping(bundle, `${keyPrefix}after`)),
            'before': bundle.inputData?.[`${keyPrefix}before`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
        }
    },
}
