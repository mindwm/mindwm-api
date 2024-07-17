# IoDocument
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Identifies the event. | 
**Source** | **String** |  | 
**Specversion** | **String** | The version of the CloudEvents specification which the event uses. | 
**Type** | **String** |  | [default to "IoDocument"]
**Datacontenttype** | **String** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] 
**Dataschema** | **String** | Identifies the schema that data adheres to. | [optional] 
**Subject** | **String** |  | [optional] [default to "IoDocument"]
**Time** | **System.DateTime** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] 
**VarData** | [**TmuxPaneIoDocument**](TmuxPaneIoDocument.md) |  | [optional] 
**DataBase64** | **String** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] 

## Examples

- Prepare the resource
```powershell
$IoDocument = Initialize-MindWMIoDocument  -Id null `
 -Source null `
 -Specversion null `
 -Type null `
 -Datacontenttype null `
 -Dataschema null `
 -Subject null `
 -Time null `
 -VarData null `
 -DataBase64 null
```

- Convert the resource to JSON
```powershell
$IoDocument | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

