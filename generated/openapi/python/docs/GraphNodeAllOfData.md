# GraphNodeAllOfData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headers** | **object** |  | 
**message_key** | **str** |  | 
**meta** | [**Neo4jCaptureDataChangeMeta**](Neo4jCaptureDataChangeMeta.md) |  | 
**offset** | **int** |  | 
**partition** | **int** |  | 
**source_type** | **str** |  | 
**timestamp** | **datetime** |  | 
**topic** | **str** |  | 
**var_schema** | [**Neo4jCaptureDataChangeSchema**](Neo4jCaptureDataChangeSchema.md) |  | 
**payload** | [**Neo4jCaptureDataChangeNodePayload**](Neo4jCaptureDataChangeNodePayload.md) |  | 

## Example

```python
from MindwWM.models.graph_node_all_of_data import GraphNodeAllOfData

# TODO update the JSON string below
json = "{}"
# create an instance of GraphNodeAllOfData from a JSON string
graph_node_all_of_data_instance = GraphNodeAllOfData.from_json(json)
# print the JSON string representation of the object
print(GraphNodeAllOfData.to_json())

# convert the object into a dict
graph_node_all_of_data_dict = graph_node_all_of_data_instance.to_dict()
# create an instance of GraphNodeAllOfData from a dict
graph_node_all_of_data_from_dict = GraphNodeAllOfData.from_dict(graph_node_all_of_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


