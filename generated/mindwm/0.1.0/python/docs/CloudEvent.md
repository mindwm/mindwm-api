# CloudEvent

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
from mindwm.models.cloud_event import CloudEvent

# TODO update the JSON string below
json = "{}"
# create an instance of CloudEvent from a JSON string
cloud_event_instance = CloudEvent.from_json(json)
# print the JSON string representation of the object
print(CloudEvent.to_json())

# convert the object into a dict
cloud_event_dict = cloud_event_instance.to_dict()
# create an instance of CloudEvent from a dict
cloud_event_from_dict = CloudEvent.from_dict(cloud_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


