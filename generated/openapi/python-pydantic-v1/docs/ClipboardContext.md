# ClipboardContext


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**window_id** | **float** | Xorg window_id | 

## Example

```python
from MindWM.models.clipboard_context import ClipboardContext

# TODO update the JSON string below
json = "{}"
# create an instance of ClipboardContext from a JSON string
clipboard_context_instance = ClipboardContext.from_json(json)
# print the JSON string representation of the object
print ClipboardContext.to_json()

# convert the object into a dict
clipboard_context_dict = clipboard_context_instance.to_dict()
# create an instance of ClipboardContext from a dict
clipboard_context_from_dict = ClipboardContext.from_dict(clipboard_context_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


