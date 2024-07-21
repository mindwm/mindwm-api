# CLOUD_EVENT

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | Identifies the event. | [default to null]
**source** | [**STRING_32**](STRING_32.md) | Identifies the context in which an event happened. | [default to null]
**specversion** | [**STRING_32**](STRING_32.md) | The version of the CloudEvents specification which the event uses. | [default to null]
**type** | [**STRING_32**](STRING_32.md) | Describes the type of event related to the originating occurrence. | [default to null]
**datacontenttype** | [**STRING_32**](STRING_32.md) | Content type of the data value. Must adhere to RFC 2046 format. | [optional] [default to null]
**dataschema** | [**STRING**](STRING.md) | Identifies the schema that data adheres to. | [optional] [default to null]
**subject** | [**STRING_32**](STRING_32.md) | Describes the subject of the event in the context of the event producer (identified by source). | [optional] [default to null]
**time** | [**DATE_TIME**](DATE_TIME.md) | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] [default to null]
**data** | [**ANY**](.md) | The event payload. | [optional] [default to null]
**data_base64** | [**STRING_32**](STRING_32.md) | Base64 encoded event payload. Must adhere to RFC4648. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


