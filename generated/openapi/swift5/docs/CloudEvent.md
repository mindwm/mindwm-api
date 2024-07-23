# CloudEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifies the event. | 
**source** | **String** | Identifies the context in which an event happened. | 
**specversion** | **String** | The version of the CloudEvents specification which the event uses. | 
**type** | **String** | Describes the type of event related to the originating occurrence. | 
**datacontenttype** | **String** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] 
**dataschema** | **String** | Identifies the schema that data adheres to. | [optional] 
**subject** | **String** | Describes the subject of the event in the context of the event producer (identified by source). | [optional] 
**time** | **Date** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] 
**data** | **AnyCodable** | The event payload. | [optional] 
**dataBase64** | **String** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

