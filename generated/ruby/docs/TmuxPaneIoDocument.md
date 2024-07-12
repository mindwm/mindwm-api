# OpenapiClient::TmuxPaneIoDocument

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **input** | **String** | User input |  |
| **output** | **String** | Command output (mix of stdout &amp; stderr) |  |
| **ps1** | **String** | ps1 (prompt) AFTER the input and output |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::TmuxPaneIoDocument.new(
  input: null,
  output: null,
  ps1: null
)
```

