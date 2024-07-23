# IoDocument


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | **str** | User input | 
**output** | **str** | Command output (mix of stdout &amp; stderr) | 
**ps1** | **str** | ps1 (prompt) AFTER the input and output | 

## Example

```python
from MindWM.models.io_document import IoDocument

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


