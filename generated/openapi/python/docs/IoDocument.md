# IoDocument


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Identifies the event. | 
**source** | **str** |  | 
**specversion** | **str** | The version of the CloudEvents specification which the event uses. | 
**type** | **str** |  | [default to 'IoDocument']
**datacontenttype** | **str** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] 
**dataschema** | **str** | Identifies the schema that data adheres to. | [optional] 
**subject** | **str** |  | [optional] [default to 'IoDocument']
**time** | **datetime** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] 
**data** | [**TmuxPaneIoDocument**](TmuxPaneIoDocument.md) |  | [optional] 
**data_base64** | **str** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] 

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


