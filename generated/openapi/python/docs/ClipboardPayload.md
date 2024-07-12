# ClipboardPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | **List[int]** | Starting position of clipboard selection [x,y] | [optional] 
**stop** | **List[int]** | Ending position of clipboard selection [x,y] | [optional] 
**data** | **str** | Clipboard data | [optional] 
**type** | **str** | Clipboard type | [optional] 
**context** | [**ClipboardPayloadContext**](ClipboardPayloadContext.md) |  | [optional] 

## Example

```python
from MindwWM.models.clipboard_payload import ClipboardPayload

# TODO update the JSON string below
json = "{}"
# create an instance of ClipboardPayload from a JSON string
clipboard_payload_instance = ClipboardPayload.from_json(json)
# print the JSON string representation of the object
print(ClipboardPayload.to_json())

# convert the object into a dict
clipboard_payload_dict = clipboard_payload_instance.to_dict()
# create an instance of ClipboardPayload from a dict
clipboard_payload_from_dict = ClipboardPayload.from_dict(clipboard_payload_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


