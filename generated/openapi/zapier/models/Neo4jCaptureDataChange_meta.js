const utils = require('../utils/utils');
const Neo4jCaptureDataChange_meta_source = require('../models/Neo4jCaptureDataChange_meta_source');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}operation`,
                label: `[${labelPrefix}operation]`,
                required: true,
                type: 'string',
            },
            ...Neo4jCaptureDataChange_meta_source.fields(`${keyPrefix}source`, isInput),
            {
                key: `${keyPrefix}timestamp`,
                label: `[${labelPrefix}timestamp]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}txEventId`,
                label: `[${labelPrefix}txEventId]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}txEventsCount`,
                label: `[${labelPrefix}txEventsCount]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}txId`,
                label: `[${labelPrefix}txId]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}username`,
                label: `[${labelPrefix}username]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'operation': bundle.inputData?.[`${keyPrefix}operation`],
            'source': utils.removeIfEmpty(Neo4jCaptureDataChange_meta_source.mapping(bundle, `${keyPrefix}source`)),
            'timestamp': bundle.inputData?.[`${keyPrefix}timestamp`],
            'txEventId': bundle.inputData?.[`${keyPrefix}txEventId`],
            'txEventsCount': bundle.inputData?.[`${keyPrefix}txEventsCount`],
            'txId': bundle.inputData?.[`${keyPrefix}txId`],
            'username': bundle.inputData?.[`${keyPrefix}username`],
        }
    },
}
