# CloudEvent

CloudEvents Specification JSON Schema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Identifies the event. | 
**source** | **str** | Identifies the context in which an event happened. | 
**specversion** | **str** | The version of the CloudEvents specification which the event uses. | 
**type** | **str** | Describes the type of event related to the originating occurrence. | 
**datacontenttype** | **str** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] 
**dataschema** | **str** | Identifies the schema that data adheres to. | [optional] 
**subject** | **str** | Describes the subject of the event in the context of the event producer (identified by source). | [optional] 
**time** | **datetime** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] 
**data** | [**CloudEventData**](CloudEventData.md) |  | [optional] 
**data_base64** | **str** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] 

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


