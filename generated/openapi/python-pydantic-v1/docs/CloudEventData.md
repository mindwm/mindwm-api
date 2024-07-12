# CloudEventData

The event payload.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from MindwWM.models.cloud_event_data import CloudEventData

# TODO update the JSON string below
json = "{}"
# create an instance of CloudEventData from a JSON string
cloud_event_data_instance = CloudEventData.from_json(json)
# print the JSON string representation of the object
print CloudEventData.to_json()

# convert the object into a dict
cloud_event_data_dict = cloud_event_data_instance.to_dict()
# create an instance of CloudEventData from a dict
cloud_event_data_from_dict = CloudEventData.from_dict(cloud_event_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


