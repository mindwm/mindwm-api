# OpenapiClient::Neo4jCaptureDataChange

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **headers** | **Hash&lt;String, Object&gt;** |  |  |
| **message_key** | **String** |  |  |
| **meta** | [**Neo4jCaptureDataChangeMeta**](Neo4jCaptureDataChangeMeta.md) |  |  |
| **offset** | **Integer** |  |  |
| **partition** | **Integer** |  |  |
| **source_type** | **String** |  |  |
| **timestamp** | **Time** |  |  |
| **topic** | **String** |  |  |
| **schema** | [**Neo4jCaptureDataChangeSchema**](Neo4jCaptureDataChangeSchema.md) |  |  |
| **payload** | [**Neo4jCaptureDataChangePayload**](Neo4jCaptureDataChangePayload.md) |  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::Neo4jCaptureDataChange.new(
  headers: null,
  message_key: null,
  meta: null,
  offset: null,
  partition: null,
  source_type: null,
  timestamp: null,
  topic: null,
  schema: null,
  payload: null
)
```

