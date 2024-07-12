# Clipboard
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **String** |  | [optional] 
**Source** | **String** |  | [optional] 
**VarData** | [**ClipboardPayload**](ClipboardPayload.md) |  | [optional] 
**Id** | **String** | Identifies the event. | 
**Specversion** | **String** | The version of the CloudEvents specification which the event uses. | 
**Datacontenttype** | **String** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] 
**Dataschema** | **String** | Identifies the schema that data adheres to. | [optional] 
**Subject** | **String** |  | [optional] 
**Time** | **System.DateTime** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] 
**DataBase64** | **String** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] 

## Examples

- Prepare the resource
```powershell
$Clipboard = Initialize-MindwWMClipboard  -Type null `
 -Source null `
 -VarData null `
 -Id null `
 -Specversion null `
 -Datacontenttype null `
 -Dataschema null `
 -Subject null `
 -Time null `
 -DataBase64 null
```

- Convert the resource to JSON
```powershell
$Clipboard | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

