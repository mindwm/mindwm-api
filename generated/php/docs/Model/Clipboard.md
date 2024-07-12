# # Clipboard

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** |  | [optional]
**source** | **string** |  | [optional]
**data** | [**\OpenAPI\Client\Model\ClipboardPayload**](ClipboardPayload.md) |  | [optional]
**id** | **string** | Identifies the event. |
**specversion** | **string** | The version of the CloudEvents specification which the event uses. |
**datacontenttype** | **string** | Content type of the data value. Must adhere to RFC 2046 format. | [optional]
**dataschema** | **string** | Identifies the schema that data adheres to. | [optional]
**subject** | **string** | Describes the subject of the event in the context of the event producer (identified by source). | [optional]
**time** | **\DateTime** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional]
**data_base64** | **string** | Base64 encoded event payload. Must adhere to RFC4648. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
