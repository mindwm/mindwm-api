# Neo4jChangeDataCaptureMeta


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **str** |  | 
**source** | [**Neo4jChangeDataCaptureMetaSource**](Neo4jChangeDataCaptureMetaSource.md) |  | 
**timestamp** | **int** |  | 
**tx_event_id** | **int** |  | 
**tx_events_count** | **int** |  | 
**tx_id** | **int** |  | 
**username** | **str** |  | 

## Example

```python
from MindWM.models.neo4j_change_data_capture_meta import Neo4jChangeDataCaptureMeta

# TODO update the JSON string below
json = "{}"
# create an instance of Neo4jChangeDataCaptureMeta from a JSON string
neo4j_change_data_capture_meta_instance = Neo4jChangeDataCaptureMeta.from_json(json)
# print the JSON string representation of the object
print(Neo4jChangeDataCaptureMeta.to_json())

# convert the object into a dict
neo4j_change_data_capture_meta_dict = neo4j_change_data_capture_meta_instance.to_dict()
# create an instance of Neo4jChangeDataCaptureMeta from a dict
neo4j_change_data_capture_meta_from_dict = Neo4jChangeDataCaptureMeta.from_dict(neo4j_change_data_capture_meta_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


