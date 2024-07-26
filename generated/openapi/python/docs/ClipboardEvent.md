# ClipboardEvent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Identifies the event. | 
**source** | **str** |  | 
**specversion** | **str** | The version of the CloudEvents specification which the event uses. | 
**type** | **str** |  | [default to 'Clipboard']
**datacontenttype** | **str** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] 
**dataschema** | **str** | Identifies the schema that data adheres to. | [optional] 
**subject** | **str** |  | [optional] [default to 'Clipboard']
**time** | **datetime** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] 
**data** | [**Clipboard**](Clipboard.md) |  | [optional] 
**data_base64** | **str** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] 
**knativebrokerttl** | **str** | knative broker ttl, workaround for https://github.com/knative-extensions/eventing-natss/issues/518 | [optional] [default to '255']

## Example

```python
from MindWM.models.clipboard_event import ClipboardEvent

# TODO update the JSON string below
json = "{}"
# create an instance of ClipboardEvent from a JSON string
clipboard_event_instance = ClipboardEvent.from_json(json)
# print the JSON string representation of the object
print(ClipboardEvent.to_json())

# convert the object into a dict
clipboard_event_dict = clipboard_event_instance.to_dict()
# create an instance of ClipboardEvent from a dict
clipboard_event_from_dict = ClipboardEvent.from_dict(clipboard_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


