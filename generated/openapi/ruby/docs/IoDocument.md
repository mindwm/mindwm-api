# OpenapiClient::IoDocument

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** |  | [optional] |
| **source** | **String** |  | [optional] |
| **data** | [**TmuxPaneIoDocument**](TmuxPaneIoDocument.md) |  | [optional] |
| **id** | **String** | Identifies the event. |  |
| **specversion** | **String** | The version of the CloudEvents specification which the event uses. |  |
| **datacontenttype** | **String** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] |
| **dataschema** | **String** | Identifies the schema that data adheres to. | [optional] |
| **subject** | **String** |  | [optional][default to &#39;IoDocument&#39;] |
| **time** | **Time** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] |
| **data_base64** | **String** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::IoDocument.new(
  type: null,
  source: null,
  data: null,
  id: null,
  specversion: null,
  datacontenttype: null,
  dataschema: null,
  subject: null,
  time: null,
  data_base64: null
)
```

