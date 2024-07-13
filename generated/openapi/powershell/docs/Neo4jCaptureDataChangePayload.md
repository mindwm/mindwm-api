# Neo4jCaptureDataChangePayload
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**After** | [**SystemCollectionsHashtable**](.md) |  | 
**Before** | **String** |  | 
**Id** | **String** |  | 
**Type** | **String** |  | 
**VarEnd** | [**Neo4jCaptureDataChangeRelationshipPayloadEnd**](Neo4jCaptureDataChangeRelationshipPayloadEnd.md) |  | 
**Label** | **String** |  | 
**Start** | [**Neo4jCaptureDataChangeRelationshipPayloadEnd**](Neo4jCaptureDataChangeRelationshipPayloadEnd.md) |  | 

## Examples

- Prepare the resource
```powershell
$Neo4jCaptureDataChangePayload = Initialize-MindwWMNeo4jCaptureDataChangePayload  -After null `
 -Before null `
 -Id null `
 -Type null `
 -VarEnd null `
 -Label null `
 -Start null
```

- Convert the resource to JSON
```powershell
$Neo4jCaptureDataChangePayload | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

