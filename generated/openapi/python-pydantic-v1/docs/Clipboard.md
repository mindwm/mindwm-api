# Clipboard


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | [**ClipboardContext**](ClipboardContext.md) |  | 
**clipboard_type** | **str** | Type of clipboard | 
**content** | **str** | Clipboard content | 
**selection_start** | [**Vector2int**](Vector2int.md) |  | [optional] 
**selection_end** | [**Vector2int**](Vector2int.md) |  | [optional] 

## Example

```python
from MindWM.models.clipboard import Clipboard

# TODO update the JSON string below
json = "{}"
# create an instance of Clipboard from a JSON string
clipboard_instance = Clipboard.from_json(json)
# print the JSON string representation of the object
print Clipboard.to_json()

# convert the object into a dict
clipboard_dict = clipboard_instance.to_dict()
# create an instance of Clipboard from a dict
clipboard_from_dict = Clipboard.from_dict(clipboard_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


