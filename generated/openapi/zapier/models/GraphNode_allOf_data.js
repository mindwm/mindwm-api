const utils = require('../utils/utils');
const Neo4jCaptureDataChangeNodePayload = require('../models/Neo4jCaptureDataChangeNodePayload');
const Neo4jCaptureDataChange_meta = require('../models/Neo4jCaptureDataChange_meta');
const Neo4jCaptureDataChange_schema = require('../models/Neo4jCaptureDataChange_schema');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}headers`,
                label: `[${labelPrefix}headers]`,
                required: true,
                dict: true,
            },
            {
                key: `${keyPrefix}message_key`,
                label: `[${labelPrefix}message_key]`,
                required: true,
                type: 'string',
            },
            ...Neo4jCaptureDataChange_meta.fields(`${keyPrefix}meta`, isInput),
            {
                key: `${keyPrefix}offset`,
                label: `[${labelPrefix}offset]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}partition`,
                label: `[${labelPrefix}partition]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}source_type`,
                label: `[${labelPrefix}source_type]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}timestamp`,
                label: `[${labelPrefix}timestamp]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}topic`,
                label: `[${labelPrefix}topic]`,
                required: true,
                type: 'string',
            },
            ...Neo4jCaptureDataChange_schema.fields(`${keyPrefix}schema`, isInput),
            ...Neo4jCaptureDataChangeNodePayload.fields(`${keyPrefix}payload`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'headers': bundle.inputData?.[`${keyPrefix}headers`],
            'message_key': bundle.inputData?.[`${keyPrefix}message_key`],
            'meta': utils.removeIfEmpty(Neo4jCaptureDataChange_meta.mapping(bundle, `${keyPrefix}meta`)),
            'offset': bundle.inputData?.[`${keyPrefix}offset`],
            'partition': bundle.inputData?.[`${keyPrefix}partition`],
            'source_type': bundle.inputData?.[`${keyPrefix}source_type`],
            'timestamp': bundle.inputData?.[`${keyPrefix}timestamp`],
            'topic': bundle.inputData?.[`${keyPrefix}topic`],
            'schema': utils.removeIfEmpty(Neo4jCaptureDataChange_schema.mapping(bundle, `${keyPrefix}schema`)),
            'payload': utils.removeIfEmpty(Neo4jCaptureDataChangeNodePayload.mapping(bundle, `${keyPrefix}payload`)),
        }
    },
}
