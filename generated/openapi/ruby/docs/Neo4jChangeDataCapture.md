# OpenapiClient::Neo4jChangeDataCapture

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **headers** | **Hash&lt;String, Object&gt;** |  |  |
| **message_key** | **String** |  |  |
| **meta** | [**Neo4jChangeDataCaptureMeta**](Neo4jChangeDataCaptureMeta.md) |  |  |
| **offset** | **Integer** |  |  |
| **partition** | **Integer** |  |  |
| **source_type** | **String** |  |  |
| **timestamp** | **Time** |  |  |
| **topic** | **String** |  |  |
| **schema** | [**Neo4jChangeDataCaptureSchema**](Neo4jChangeDataCaptureSchema.md) |  |  |
| **payload** | [**Neo4jChangeDataCapturePayload**](Neo4jChangeDataCapturePayload.md) |  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::Neo4jChangeDataCapture.new(
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

