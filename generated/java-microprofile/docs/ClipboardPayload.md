

# ClipboardPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**start** | **List&lt;Integer&gt;** | Starting position of clipboard selection [x,y] |  [optional] |
|**stop** | **List&lt;Integer&gt;** | Ending position of clipboard selection [x,y] |  [optional] |
|**data** | **String** | Clipboard data |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Clipboard type |  [optional] |
|**context** | [**ClipboardPayloadContext**](ClipboardPayloadContext.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PRIMARY | &quot;primary&quot; |
| SECONDARY | &quot;secondary&quot; |
| CLIPBOARD | &quot;clipboard&quot; |



