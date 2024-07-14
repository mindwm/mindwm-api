# GraphRelationship

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **String!** | Identifies the event. | [default to null]
**source** | **String!** |  | [default to null]
**specversion** | **String!** | The version of the CloudEvents specification which the event uses. | [default to null]
**Type_** | **String!** |  | [default to null]
**datacontenttype** | **String!** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] [default to null]
**dataschema** | **String!** | Identifies the schema that data adheres to. | [optional] [default to null]
**subject** | **String!** | Describes the subject of the event in the context of the event producer (identified by source). | [optional] [default to null]
**time** | **String!** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] [default to null]
**data** | [***GraphRelationshipAllOfData**](GraphRelationship_allOf_data.md) |  | [optional] [default to null]
**dataBase64** | **String!** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

