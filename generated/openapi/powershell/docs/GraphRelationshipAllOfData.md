# GraphRelationshipAllOfData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Headers** | [**SystemCollectionsHashtable**](.md) |  | 
**MessageKey** | **String** |  | 
**Meta** | [**Neo4jCaptureDataChangeMeta**](Neo4jCaptureDataChangeMeta.md) |  | 
**Offset** | **Int32** |  | 
**Partition** | **Int32** |  | 
**SourceType** | **String** |  | 
**Timestamp** | **System.DateTime** |  | 
**Topic** | **String** |  | 
**Schema** | [**Neo4jCaptureDataChangeSchema**](Neo4jCaptureDataChangeSchema.md) |  | 
**Payload** | [**Neo4jCaptureDataChangeRelationshipPayload**](Neo4jCaptureDataChangeRelationshipPayload.md) |  | 

## Examples

- Prepare the resource
```powershell
$GraphRelationshipAllOfData = Initialize-MindWMGraphRelationshipAllOfData  -Headers null `
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
$GraphRelationshipAllOfData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

