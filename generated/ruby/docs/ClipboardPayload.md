# OpenapiClient::ClipboardPayload

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **start** | **Array&lt;Integer&gt;** | Starting position of clipboard selection [x,y] | [optional] |
| **stop** | **Array&lt;Integer&gt;** | Ending position of clipboard selection [x,y] | [optional] |
| **data** | **String** | Clipboard data | [optional] |
| **type** | **String** | Clipboard type | [optional] |
| **context** | [**ClipboardPayloadContext**](ClipboardPayloadContext.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ClipboardPayload.new(
  start: null,
  stop: null,
  data: null,
  type: null,
  context: null
)
```

