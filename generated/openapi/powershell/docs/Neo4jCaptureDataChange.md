# Neo4jCaptureDataChange
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Headers** | [**System.Collections.Hashtable**](AnyType.md) |  | 
**MessageKey** | **String** |  | 
**Meta** | [**Neo4jCaptureDataChangeMeta**](Neo4jCaptureDataChangeMeta.md) |  | 
**Offset** | **Int32** |  | 
**Partition** | **Int32** |  | 
**SourceType** | **String** |  | 
**Timestamp** | **System.DateTime** |  | 
**Topic** | **String** |  | 
**Schema** | [**Neo4jCaptureDataChangeSchema**](Neo4jCaptureDataChangeSchema.md) |  | 
**Payload** | [**Neo4jCaptureDataChangePayload**](Neo4jCaptureDataChangePayload.md) |  | 

## Examples

- Prepare the resource
```powershell
$Neo4jCaptureDataChange = Initialize-MindwWMNeo4jCaptureDataChange  -Headers null `
 -MessageKey null `
 -Meta null `
 -Offset null `
 -Partition null `
 -SourceType null `
 -Timestamp null `
 -Topic null `
 -Schema null `
 -Payload null
```

- Convert the resource to JSON
```powershell
$Neo4jCaptureDataChange | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

