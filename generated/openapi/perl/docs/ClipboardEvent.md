# WWW::OpenAPIClient::Object::ClipboardEvent

## Load the model package
```perl
use WWW::OpenAPIClient::Object::ClipboardEvent;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Identifies the event. | 
**source** | **string** |  | 
**specversion** | **string** | The version of the CloudEvents specification which the event uses. | 
**type** | **string** |  | [default to &#39;Clipboard&#39;]
**datacontenttype** | **string** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] 
**dataschema** | **string** | Identifies the schema that data adheres to. | [optional] 
**subject** | **string** |  | [optional] [default to &#39;Clipboard&#39;]
**time** | **DATE_TIME** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] 
**data** | [**Clipboard**](Clipboard.md) |  | [optional] 
**data_base64** | **string** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


