# GraphRelationship


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Identifies the event. | 
**source** | **str** |  | 
**specversion** | **str** | The version of the CloudEvents specification which the event uses. | 
**type** | **str** |  | 
**datacontenttype** | **str** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] 
**dataschema** | **str** | Identifies the schema that data adheres to. | [optional] 
**subject** | **str** | Describes the subject of the event in the context of the event producer (identified by source). | [optional] 
**time** | **datetime** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] 
**data** | [**GraphRelationshipAllOfData**](GraphRelationshipAllOfData.md) |  | [optional] 
**data_base64** | **str** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] 

## Example

```python
from MindWM.models.graph_relationship import GraphRelationship

# TODO update the JSON string below
json = "{}"
# create an instance of GraphRelationship from a JSON string
graph_relationship_instance = GraphRelationship.from_json(json)
# print the JSON string representation of the object
print(GraphRelationship.to_json())

# convert the object into a dict
graph_relationship_dict = graph_relationship_instance.to_dict()
# create an instance of GraphRelationship from a dict
graph_relationship_from_dict = GraphRelationship.from_dict(graph_relationship_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


