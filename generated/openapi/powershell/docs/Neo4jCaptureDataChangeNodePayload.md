# Neo4jCaptureDataChangeNodePayload
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**After** | [**Neo4jCaptureDataChangeNodePayloadAfter**](Neo4jCaptureDataChangeNodePayloadAfter.md) |  | 
**Before** | **String** |  | 
**Id** | **String** |  | 
**Type** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$Neo4jCaptureDataChangeNodePayload = Initialize-MindWMNeo4jCaptureDataChangeNodePayload  -After null `
 -Before null `
 -Id null `
 -Type null
```

- Convert the resource to JSON
```powershell
$Neo4jCaptureDataChangeNodePayload | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

