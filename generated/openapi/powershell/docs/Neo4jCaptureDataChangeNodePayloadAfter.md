# Neo4jCaptureDataChangeNodePayloadAfter
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Labels** | **String[]** |  | 
**Properties** | [**System.Collections.Hashtable**](AnyType.md) |  | 

## Examples

- Prepare the resource
```powershell
$Neo4jCaptureDataChangeNodePayloadAfter = Initialize-MindWMNeo4jCaptureDataChangeNodePayloadAfter  -Labels null `
 -Properties null
```

- Convert the resource to JSON
```powershell
$Neo4jCaptureDataChangeNodePayloadAfter | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

