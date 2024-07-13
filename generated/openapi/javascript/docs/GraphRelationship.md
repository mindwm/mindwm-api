# MindwmApi.GraphRelationship

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifies the event. | 
**source** | **String** |  | 
**specversion** | **String** | The version of the CloudEvents specification which the event uses. | 
**type** | **String** |  | 
**datacontenttype** | **String** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] 
**dataschema** | **String** | Identifies the schema that data adheres to. | [optional] 
**subject** | **String** | Describes the subject of the event in the context of the event producer (identified by source). | [optional] 
**time** | **Date** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] 
**data** | [**GraphRelationshipAllOfData**](GraphRelationshipAllOfData.md) |  | [optional] 
**dataBase64** | **String** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] 



## Enum: SourceEnum


* `graph.relationship` (value: `"graph.relationship"`)





## Enum: TypeEnum


* `created` (value: `"created"`)

* `updated` (value: `"updated"`)

* `deleted` (value: `"deleted"`)




