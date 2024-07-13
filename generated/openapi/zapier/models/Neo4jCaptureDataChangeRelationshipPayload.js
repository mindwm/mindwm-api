const utils = require('../utils/utils');
const Neo4jCaptureDataChangeRelationshipPayload_end = require('../models/Neo4jCaptureDataChangeRelationshipPayload_end');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}after`,
                label: `[${labelPrefix}after]`,
                required: true,
                dict: true,
            },
            {
                key: `${keyPrefix}before`,
                label: `[${labelPrefix}before]`,
                required: true,
                type: 'string',
            },
            ...Neo4jCaptureDataChangeRelationshipPayload_end.fields(`${keyPrefix}end`, isInput),
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}label`,
                label: `[${labelPrefix}label]`,
                required: true,
                type: 'string',
            },
            ...Neo4jCaptureDataChangeRelationshipPayload_end.fields(`${keyPrefix}start`, isInput),
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
            'after': bundle.inputData?.[`${keyPrefix}after`],
            'before': bundle.inputData?.[`${keyPrefix}before`],
            'end': utils.removeIfEmpty(Neo4jCaptureDataChangeRelationshipPayload_end.mapping(bundle, `${keyPrefix}end`)),
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'label': bundle.inputData?.[`${keyPrefix}label`],
            'start': utils.removeIfEmpty(Neo4jCaptureDataChangeRelationshipPayload_end.mapping(bundle, `${keyPrefix}start`)),
            'type': bundle.inputData?.[`${keyPrefix}type`],
        }
    },
}
