# Neo4jCaptureDataChangeMeta


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **str** |  | 
**source** | [**Neo4jCaptureDataChangeMetaSource**](Neo4jCaptureDataChangeMetaSource.md) |  | 
**timestamp** | **int** |  | 
**tx_event_id** | **int** |  | 
**tx_events_count** | **int** |  | 
**tx_id** | **int** |  | 
**username** | **str** |  | 

## Example

```python
from MindwWM.models.neo4j_capture_data_change_meta import Neo4jCaptureDataChangeMeta

# TODO update the JSON string below
json = "{}"
# create an instance of Neo4jCaptureDataChangeMeta from a JSON string
neo4j_capture_data_change_meta_instance = Neo4jCaptureDataChangeMeta.from_json(json)
# print the JSON string representation of the object
print(Neo4jCaptureDataChangeMeta.to_json())

# convert the object into a dict
neo4j_capture_data_change_meta_dict = neo4j_capture_data_change_meta_instance.to_dict()
# create an instance of Neo4jCaptureDataChangeMeta from a dict
neo4j_capture_data_change_meta_from_dict = Neo4jCaptureDataChangeMeta.from_dict(neo4j_capture_data_change_meta_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


