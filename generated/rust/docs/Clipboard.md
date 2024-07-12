# Clipboard

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**r#type** | Option<**String**> |  | [optional]
**source** | Option<**String**> |  | [optional]
**data** | Option<[**models::ClipboardPayload**](ClipboardPayload.md)> |  | [optional]
**id** | **String** | Identifies the event. | 
**specversion** | **String** | The version of the CloudEvents specification which the event uses. | 
**datacontenttype** | Option<**String**> | Content type of the data value. Must adhere to RFC 2046 format. | [optional]
**dataschema** | Option<**String**> | Identifies the schema that data adheres to. | [optional]
**subject** | Option<**String**> | Describes the subject of the event in the context of the event producer (identified by source). | [optional]
**time** | Option<**String**> | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional]
**data_base64** | Option<**String**> | Base64 encoded event payload. Must adhere to RFC4648. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

