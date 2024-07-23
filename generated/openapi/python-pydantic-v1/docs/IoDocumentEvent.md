# IoDocumentEvent


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
**data** | [**IoDocument**](IoDocument.md) |  | [optional] 
**data_base64** | **str** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] 

## Example

```python
from MindWM.models.io_document_event import IoDocumentEvent

# TODO update the JSON string below
json = "{}"
# create an instance of IoDocumentEvent from a JSON string
io_document_event_instance = IoDocumentEvent.from_json(json)
# print the JSON string representation of the object
print IoDocumentEvent.to_json()

# convert the object into a dict
io_document_event_dict = io_document_event_instance.to_dict()
# create an instance of IoDocumentEvent from a dict
io_document_event_from_dict = IoDocumentEvent.from_dict(io_document_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


