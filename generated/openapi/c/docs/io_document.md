# io_document_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | Identifies the event. | 
**source** | **char \*** |  | 
**specversion** | **char \*** | The version of the CloudEvents specification which the event uses. | 
**type** | **char \*** |  | [default to 'IoDocument']
**datacontenttype** | **char \*** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] 
**dataschema** | **char \*** | Identifies the schema that data adheres to. | [optional] 
**subject** | **char \*** |  | [optional] [default to 'IoDocument']
**time** | **char \*** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] 
**data** | [**object_t**](.md) \* | The event payload. | [optional] 
**data_base64** | **char \*** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


