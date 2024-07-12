# Cloudevents

CloudEvents Specification JSON Schema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**source** | **str** |  | 
**specversion** | **str** |  | 
**type** | **str** |  | 
**datacontenttype** | **object** |  | [optional] 
**dataschema** | **object** |  | [optional] 
**subject** | **object** |  | [optional] 
**time** | **object** |  | [optional] 
**data** | **object** |  | [optional] 
**data_base64** | **object** |  | [optional] 

## Example

```python
from mindwm.models.cloudevents import Cloudevents

# TODO update the JSON string below
json = "{}"
# create an instance of Cloudevents from a JSON string
cloudevents_instance = Cloudevents.from_json(json)
# print the JSON string representation of the object
print(Cloudevents.to_json())

# convert the object into a dict
cloudevents_dict = cloudevents_instance.to_dict()
# create an instance of Cloudevents from a dict
cloudevents_from_dict = Cloudevents.from_dict(cloudevents_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


