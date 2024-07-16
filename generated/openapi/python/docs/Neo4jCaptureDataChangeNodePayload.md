# Neo4jCaptureDataChangeNodePayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**after** | [**Neo4jCaptureDataChangeNodePayloadAfter**](Neo4jCaptureDataChangeNodePayloadAfter.md) |  | 
**before** | **str** |  | 
**id** | **str** |  | 
**type** | **str** |  | 

## Example

```python
from MindWM.models.neo4j_capture_data_change_node_payload import Neo4jCaptureDataChangeNodePayload

# TODO update the JSON string below
json = "{}"
# create an instance of Neo4jCaptureDataChangeNodePayload from a JSON string
neo4j_capture_data_change_node_payload_instance = Neo4jCaptureDataChangeNodePayload.from_json(json)
# print the JSON string representation of the object
print(Neo4jCaptureDataChangeNodePayload.to_json())

# convert the object into a dict
neo4j_capture_data_change_node_payload_dict = neo4j_capture_data_change_node_payload_instance.to_dict()
# create an instance of Neo4jCaptureDataChangeNodePayload from a dict
neo4j_capture_data_change_node_payload_from_dict = Neo4jCaptureDataChangeNodePayload.from_dict(neo4j_capture_data_change_node_payload_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


