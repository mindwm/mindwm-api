# OpenapiClient::Neo4jCaptureDataChangeMeta

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **operation** | **String** |  |  |
| **source** | [**Neo4jCaptureDataChangeMetaSource**](Neo4jCaptureDataChangeMetaSource.md) |  |  |
| **timestamp** | **Integer** |  |  |
| **tx_event_id** | **Integer** |  |  |
| **tx_events_count** | **Integer** |  |  |
| **tx_id** | **Integer** |  |  |
| **username** | **String** |  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::Neo4jCaptureDataChangeMeta.new(
  operation: null,
  source: null,
  timestamp: null,
  tx_event_id: null,
  tx_events_count: null,
  tx_id: null,
  username: null
)
```

