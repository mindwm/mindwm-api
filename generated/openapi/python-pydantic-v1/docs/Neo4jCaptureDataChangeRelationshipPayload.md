# Neo4jCaptureDataChangeRelationshipPayload


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**after** | **object** |  | 
**before** | **str** |  | 
**end** | [**Neo4jCaptureDataChangeRelationshipPayloadEnd**](Neo4jCaptureDataChangeRelationshipPayloadEnd.md) |  | 
**id** | **str** |  | 
**label** | **str** |  | 
**start** | [**Neo4jCaptureDataChangeRelationshipPayloadEnd**](Neo4jCaptureDataChangeRelationshipPayloadEnd.md) |  | 
**type** | **str** |  | 

## Example

```python
from MindwWM.models.neo4j_capture_data_change_relationship_payload import Neo4jCaptureDataChangeRelationshipPayload

# TODO update the JSON string below
json = "{}"
# create an instance of Neo4jCaptureDataChangeRelationshipPayload from a JSON string
neo4j_capture_data_change_relationship_payload_instance = Neo4jCaptureDataChangeRelationshipPayload.from_json(json)
# print the JSON string representation of the object
print Neo4jCaptureDataChangeRelationshipPayload.to_json()

# convert the object into a dict
neo4j_capture_data_change_relationship_payload_dict = neo4j_capture_data_change_relationship_payload_instance.to_dict()
# create an instance of Neo4jCaptureDataChangeRelationshipPayload from a dict
neo4j_capture_data_change_relationship_payload_from_dict = Neo4jCaptureDataChangeRelationshipPayload.from_dict(neo4j_capture_data_change_relationship_payload_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


