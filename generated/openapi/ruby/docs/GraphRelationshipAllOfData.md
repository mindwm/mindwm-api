# OpenapiClient::GraphRelationshipAllOfData

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **headers** | **Object** |  |  |
| **message_key** | **String** |  |  |
| **meta** | [**Neo4jCaptureDataChangeMeta**](Neo4jCaptureDataChangeMeta.md) |  |  |
| **offset** | **Integer** |  |  |
| **partition** | **Integer** |  |  |
| **source_type** | **String** |  |  |
| **timestamp** | **Time** |  |  |
| **topic** | **String** |  |  |
| **schema** | [**Neo4jCaptureDataChangeSchema**](Neo4jCaptureDataChangeSchema.md) |  |  |
| **payload** | [**Neo4jCaptureDataChangeRelationshipPayload**](Neo4jCaptureDataChangeRelationshipPayload.md) |  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GraphRelationshipAllOfData.new(
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

