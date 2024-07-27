# Neo4jChangeDataCapturePayload


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**after** | **object** |  | 
**before** | **str** |  | 
**id** | **str** |  | 
**type** | **str** |  | 
**end** | [**Neo4jChangeDataCaptureRelationshipPayloadEnd**](Neo4jChangeDataCaptureRelationshipPayloadEnd.md) |  | 
**label** | **str** |  | 
**start** | [**Neo4jChangeDataCaptureRelationshipPayloadEnd**](Neo4jChangeDataCaptureRelationshipPayloadEnd.md) |  | 

## Example

```python
from MindWM.models.neo4j_change_data_capture_payload import Neo4jChangeDataCapturePayload

# TODO update the JSON string below
json = "{}"
# create an instance of Neo4jChangeDataCapturePayload from a JSON string
neo4j_change_data_capture_payload_instance = Neo4jChangeDataCapturePayload.from_json(json)
# print the JSON string representation of the object
print Neo4jChangeDataCapturePayload.to_json()

# convert the object into a dict
neo4j_change_data_capture_payload_dict = neo4j_change_data_capture_payload_instance.to_dict()
# create an instance of Neo4jChangeDataCapturePayload from a dict
neo4j_change_data_capture_payload_from_dict = Neo4jChangeDataCapturePayload.from_dict(neo4j_change_data_capture_payload_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


