# TmuxPaneIoDocument


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | **str** | User input | 
**output** | **str** | Command output (mix of stdout &amp; stderr) | 
**ps1** | **str** | ps1 (prompt) AFTER the input and output | 

## Example

```python
from MindWM.models.tmux_pane_io_document import TmuxPaneIoDocument

# TODO update the JSON string below
json = "{}"
# create an instance of TmuxPaneIoDocument from a JSON string
tmux_pane_io_document_instance = TmuxPaneIoDocument.from_json(json)
# print the JSON string representation of the object
print(TmuxPaneIoDocument.to_json())

# convert the object into a dict
tmux_pane_io_document_dict = tmux_pane_io_document_instance.to_dict()
# create an instance of TmuxPaneIoDocument from a dict
tmux_pane_io_document_from_dict = TmuxPaneIoDocument.from_dict(tmux_pane_io_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


