# OpenapiClient::GraphRelationship

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Identifies the event. |  |
| **source** | **String** |  |  |
| **specversion** | **String** | The version of the CloudEvents specification which the event uses. |  |
| **type** | **String** |  |  |
| **datacontenttype** | **String** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] |
| **dataschema** | **String** | Identifies the schema that data adheres to. | [optional] |
| **subject** | **String** | Describes the subject of the event in the context of the event producer (identified by source). | [optional] |
| **time** | **Time** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] |
| **data** | [**GraphRelationshipAllOfData**](GraphRelationshipAllOfData.md) |  | [optional] |
| **data_base64** | **String** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GraphRelationship.new(
  id: null,
  source: null,
  specversion: null,
  type: null,
  datacontenttype: null,
  dataschema: null,
  subject: null,
  time: null,
  data: null,
  data_base64: null
)
```

