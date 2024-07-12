# ClipboardPayload
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Start** | **Int32[]** | Starting position of clipboard selection [x,y] | [optional] 
**Stop** | **Int32[]** | Ending position of clipboard selection [x,y] | [optional] 
**VarData** | **String** | Clipboard data | [optional] 
**Type** | **String** | Clipboard type | [optional] 
**Context** | [**ClipboardPayloadContext**](ClipboardPayloadContext.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ClipboardPayload = Initialize-MindwWMClipboardPayload  -Start null `
 -Stop null `
 -VarData null `
 -Type null `
 -Context null
```

- Convert the resource to JSON
```powershell
$ClipboardPayload | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

