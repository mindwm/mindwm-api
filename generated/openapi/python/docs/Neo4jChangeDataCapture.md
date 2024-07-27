# Neo4jChangeDataCapture


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headers** | **Dict[str, object]** |  | 
**message_key** | **str** |  | 
**meta** | [**Neo4jChangeDataCaptureMeta**](Neo4jChangeDataCaptureMeta.md) |  | 
**offset** | **int** |  | 
**partition** | **int** |  | 
**source_type** | **str** |  | 
**timestamp** | **datetime** |  | 
**topic** | **str** |  | 
**var_schema** | [**Neo4jChangeDataCaptureSchema**](Neo4jChangeDataCaptureSchema.md) |  | 
**payload** | [**Neo4jChangeDataCapturePayload**](Neo4jChangeDataCapturePayload.md) |  | 

## Example

```python
from MindWM.models.neo4j_change_data_capture import Neo4jChangeDataCapture

# TODO update the JSON string below
json = "{}"
# create an instance of Neo4jChangeDataCapture from a JSON string
neo4j_change_data_capture_instance = Neo4jChangeDataCapture.from_json(json)
# print the JSON string representation of the object
print(Neo4jChangeDataCapture.to_json())

# convert the object into a dict
neo4j_change_data_capture_dict = neo4j_change_data_capture_instance.to_dict()
# create an instance of Neo4jChangeDataCapture from a dict
neo4j_change_data_capture_from_dict = Neo4jChangeDataCapture.from_dict(neo4j_change_data_capture_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


