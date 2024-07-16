# Neo4jCaptureDataChangeSchema
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Constraints** | [**System.Collections.Hashtable**](AnyType.md) |  | [optional] 
**Properties** | [**System.Collections.Hashtable**](AnyType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$Neo4jCaptureDataChangeSchema = Initialize-MindWMNeo4jCaptureDataChangeSchema  -Constraints null `
 -Properties null
```

- Convert the resource to JSON
```powershell
$Neo4jCaptureDataChangeSchema | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

