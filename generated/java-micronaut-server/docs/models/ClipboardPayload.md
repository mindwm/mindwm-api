

# ClipboardPayload

The class is defined in **[ClipboardPayload.java](../../src/main/java/org/openapitools/model/ClipboardPayload.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | `List&lt;Integer&gt;` | Starting position of clipboard selection [x,y] |  [optional property]
**stop** | `List&lt;Integer&gt;` | Ending position of clipboard selection [x,y] |  [optional property]
**data** | `String` | Clipboard data |  [optional property]
**type** | [**TypeEnum**](#TypeEnum) | Clipboard type |  [optional property]
**context** | [`ClipboardPayloadContext`](ClipboardPayloadContext.md) |  |  [optional property]




## TypeEnum

Name | Value
---- | -----
PRIMARY | `"primary"`
SECONDARY | `"secondary"`
CLIPBOARD | `"clipboard"`



