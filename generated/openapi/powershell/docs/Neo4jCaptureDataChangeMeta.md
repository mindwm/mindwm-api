# Neo4jCaptureDataChangeMeta
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **String** |  | 
**Source** | [**Neo4jCaptureDataChangeMetaSource**](Neo4jCaptureDataChangeMetaSource.md) |  | 
**Timestamp** | **Int32** |  | 
**TxEventId** | **Int32** |  | 
**TxEventsCount** | **Int32** |  | 
**TxId** | **Int32** |  | 
**Username** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$Neo4jCaptureDataChangeMeta = Initialize-MindWMNeo4jCaptureDataChangeMeta  -Operation null `
 -Source null `
 -Timestamp null `
 -TxEventId null `
 -TxEventsCount null `
 -TxId null `
 -Username null
```

- Convert the resource to JSON
```powershell
$Neo4jCaptureDataChangeMeta | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

