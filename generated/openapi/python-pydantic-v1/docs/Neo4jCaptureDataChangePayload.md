# Neo4jCaptureDataChangePayload


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**after** | **object** |  | 
**before** | **str** |  | 
**id** | **str** |  | 
**type** | **str** |  | 
**end** | [**Neo4jCaptureDataChangeRelationshipPayloadEnd**](Neo4jCaptureDataChangeRelationshipPayloadEnd.md) |  | 
**label** | **str** |  | 
**start** | [**Neo4jCaptureDataChangeRelationshipPayloadEnd**](Neo4jCaptureDataChangeRelationshipPayloadEnd.md) |  | 

## Example

```python
from MindwWM.models.neo4j_capture_data_change_payload import Neo4jCaptureDataChangePayload

# TODO update the JSON string below
json = "{}"
# create an instance of Neo4jCaptureDataChangePayload from a JSON string
neo4j_capture_data_change_payload_instance = Neo4jCaptureDataChangePayload.from_json(json)
# print the JSON string representation of the object
print Neo4jCaptureDataChangePayload.to_json()

# convert the object into a dict
neo4j_capture_data_change_payload_dict = neo4j_capture_data_change_payload_instance.to_dict()
# create an instance of Neo4jCaptureDataChangePayload from a dict
neo4j_capture_data_change_payload_from_dict = Neo4jCaptureDataChangePayload.from_dict(neo4j_capture_data_change_payload_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


