# OpenapiClient::Clipboard

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **context** | [**ClipboardContext**](ClipboardContext.md) |  |  |
| **clipboard_type** | **String** | Type of clipboard |  |
| **content** | **String** | Clipboard content |  |
| **selection_start** | [**Vector2int**](Vector2int.md) |  | [optional] |
| **selection_end** | [**Vector2int**](Vector2int.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::Clipboard.new(
  context: null,
  clipboard_type: null,
  content: null,
  selection_start: null,
  selection_end: null
)
```

