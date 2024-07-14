# cloud_event_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | Identifies the event. | 
**source** | **char \*** | Identifies the context in which an event happened. | 
**specversion** | **char \*** | The version of the CloudEvents specification which the event uses. | 
**type** | **char \*** | Describes the type of event related to the originating occurrence. | 
**datacontenttype** | **char \*** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] 
**dataschema** | **char \*** | Identifies the schema that data adheres to. | [optional] 
**subject** | **char \*** | Describes the subject of the event in the context of the event producer (identified by source). | [optional] 
**time** | **char \*** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] 
**data** | [**cloud_event_data_t**](cloud_event_data.md) \* |  | [optional] 
**data_base64** | **char \*** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

