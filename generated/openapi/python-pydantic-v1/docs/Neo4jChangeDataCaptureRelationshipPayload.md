# Neo4jChangeDataCaptureRelationshipPayload


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**after** | **object** |  | 
**before** | **str** |  | 
**end** | [**Neo4jChangeDataCaptureRelationshipPayloadEnd**](Neo4jChangeDataCaptureRelationshipPayloadEnd.md) |  | 
**id** | **str** |  | 
**label** | **str** |  | 
**start** | [**Neo4jChangeDataCaptureRelationshipPayloadEnd**](Neo4jChangeDataCaptureRelationshipPayloadEnd.md) |  | 
**type** | **str** |  | 

## Example

```python
from MindWM.models.neo4j_change_data_capture_relationship_payload import Neo4jChangeDataCaptureRelationshipPayload

# TODO update the JSON string below
json = "{}"
# create an instance of Neo4jChangeDataCaptureRelationshipPayload from a JSON string
neo4j_change_data_capture_relationship_payload_instance = Neo4jChangeDataCaptureRelationshipPayload.from_json(json)
# print the JSON string representation of the object
print Neo4jChangeDataCaptureRelationshipPayload.to_json()

# convert the object into a dict
neo4j_change_data_capture_relationship_payload_dict = neo4j_change_data_capture_relationship_payload_instance.to_dict()
# create an instance of Neo4jChangeDataCaptureRelationshipPayload from a dict
neo4j_change_data_capture_relationship_payload_from_dict = Neo4jChangeDataCaptureRelationshipPayload.from_dict(neo4j_change_data_capture_relationship_payload_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


