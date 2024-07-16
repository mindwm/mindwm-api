# ClipboardPayloadContext

Selection context

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**window** | **str** | window id | [optional] 

## Example

```python
from MindWM.models.clipboard_payload_context import ClipboardPayloadContext

# TODO update the JSON string below
json = "{}"
# create an instance of ClipboardPayloadContext from a JSON string
clipboard_payload_context_instance = ClipboardPayloadContext.from_json(json)
# print the JSON string representation of the object
print ClipboardPayloadContext.to_json()

# convert the object into a dict
clipboard_payload_context_dict = clipboard_payload_context_instance.to_dict()
# create an instance of ClipboardPayloadContext from a dict
clipboard_payload_context_from_dict = ClipboardPayloadContext.from_dict(clipboard_payload_context_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


