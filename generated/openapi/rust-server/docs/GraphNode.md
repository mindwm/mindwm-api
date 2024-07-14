# GraphNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifies the event. | 
**source** | **String** |  | 
**specversion** | **String** | The version of the CloudEvents specification which the event uses. | 
**r#type** | **String** |  | 
**datacontenttype** | **String** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] [default to None]
**dataschema** | **String** | Identifies the schema that data adheres to. | [optional] [default to None]
**subject** | **String** | Describes the subject of the event in the context of the event producer (identified by source). | [optional] [default to None]
**time** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] [default to None]
**data** | [***models::GraphNodeAllOfData**](GraphNode_allOf_data.md) |  | [optional] [default to None]
**data_base64** | **String** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

