# GraphNode


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifies the event. | [default to nothing]
**source** | **String** |  | [default to nothing]
**specversion** | **String** | The version of the CloudEvents specification which the event uses. | [default to nothing]
**type** | **String** |  | [default to nothing]
**datacontenttype** | **String** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] [default to nothing]
**dataschema** | **String** | Identifies the schema that data adheres to. | [optional] [default to nothing]
**subject** | **String** | Describes the subject of the event in the context of the event producer (identified by source). | [optional] [default to nothing]
**time** | **ZonedDateTime** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] [default to nothing]
**data** | [***GraphNodeAllOfData**](GraphNodeAllOfData.md) |  | [optional] [default to nothing]
**data_base64** | **String** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


