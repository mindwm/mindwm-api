# Neo4jChangeDataCaptureSchema


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**constraints** | **Dict[str, object]** |  | [optional] 
**properties** | **Dict[str, object]** |  | [optional] 

## Example

```python
from MindWM.models.neo4j_change_data_capture_schema import Neo4jChangeDataCaptureSchema

# TODO update the JSON string below
json = "{}"
# create an instance of Neo4jChangeDataCaptureSchema from a JSON string
neo4j_change_data_capture_schema_instance = Neo4jChangeDataCaptureSchema.from_json(json)
# print the JSON string representation of the object
print Neo4jChangeDataCaptureSchema.to_json()

# convert the object into a dict
neo4j_change_data_capture_schema_dict = neo4j_change_data_capture_schema_instance.to_dict()
# create an instance of Neo4jChangeDataCaptureSchema from a dict
neo4j_change_data_capture_schema_from_dict = Neo4jChangeDataCaptureSchema.from_dict(neo4j_change_data_capture_schema_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


