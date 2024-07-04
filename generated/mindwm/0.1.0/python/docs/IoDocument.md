# IoDocument


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_input** | **str** | user input | [optional] 
**output** | **str** | command output (mix of stdout/stderr) | [optional] 
**fullcmd** | **str** | Full input command | [optional] 

## Example

```python
from mindwm.models.io_document import IoDocument

# TODO update the JSON string below
json = "{}"
# create an instance of IoDocument from a JSON string
io_document_instance = IoDocument.from_json(json)
# print the JSON string representation of the object
print(IoDocument.to_json())

# convert the object into a dict
io_document_dict = io_document_instance.to_dict()
# create an instance of IoDocument from a dict
io_document_from_dict = IoDocument.from_dict(io_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


