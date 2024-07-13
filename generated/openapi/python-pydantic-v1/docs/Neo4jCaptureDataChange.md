# Neo4jCaptureDataChange


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headers** | **Dict[str, object]** |  | 
**message_key** | **str** |  | 
**meta** | [**Neo4jCaptureDataChangeMeta**](Neo4jCaptureDataChangeMeta.md) |  | 
**offset** | **int** |  | 
**partition** | **int** |  | 
**source_type** | **str** |  | 
**timestamp** | **datetime** |  | 
**topic** | **str** |  | 
**var_schema** | [**Neo4jCaptureDataChangeSchema**](Neo4jCaptureDataChangeSchema.md) |  | 
**payload** | [**Neo4jCaptureDataChangePayload**](Neo4jCaptureDataChangePayload.md) |  | 

## Example

```python
from MindwWM.models.neo4j_capture_data_change import Neo4jCaptureDataChange

# TODO update the JSON string below
json = "{}"
# create an instance of Neo4jCaptureDataChange from a JSON string
neo4j_capture_data_change_instance = Neo4jCaptureDataChange.from_json(json)
# print the JSON string representation of the object
print Neo4jCaptureDataChange.to_json()

# convert the object into a dict
neo4j_capture_data_change_dict = neo4j_capture_data_change_instance.to_dict()
# create an instance of Neo4jCaptureDataChange from a dict
neo4j_capture_data_change_from_dict = Neo4jCaptureDataChange.from_dict(neo4j_capture_data_change_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


