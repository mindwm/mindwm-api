# Neo4jCaptureDataChangeRelationshipPayload
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**After** | [**SystemCollectionsHashtable**](.md) |  | 
**Before** | **String** |  | 
**VarEnd** | [**Neo4jCaptureDataChangeRelationshipPayloadEnd**](Neo4jCaptureDataChangeRelationshipPayloadEnd.md) |  | 
**Id** | **String** |  | 
**Label** | **String** |  | 
**Start** | [**Neo4jCaptureDataChangeRelationshipPayloadEnd**](Neo4jCaptureDataChangeRelationshipPayloadEnd.md) |  | 
**Type** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$Neo4jCaptureDataChangeRelationshipPayload = Initialize-MindwWMNeo4jCaptureDataChangeRelationshipPayload  -After null `
 -Before null `
 -VarEnd null `
 -Id null `
 -Label null `
 -Start null `
 -Type null
```

- Convert the resource to JSON
```powershell
$Neo4jCaptureDataChangeRelationshipPayload | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

