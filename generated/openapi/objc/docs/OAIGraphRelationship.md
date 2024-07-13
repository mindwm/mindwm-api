# OAIGraphRelationship

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** | Identifies the event. | 
**source** | **NSString*** |  | 
**specversion** | **NSString*** | The version of the CloudEvents specification which the event uses. | 
**type** | **NSString*** |  | 
**datacontenttype** | **NSString*** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] 
**dataschema** | **NSString*** | Identifies the schema that data adheres to. | [optional] 
**subject** | **NSString*** | Describes the subject of the event in the context of the event producer (identified by source). | [optional] 
**time** | **NSDate*** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] 
**data** | [**OAIGraphRelationshipAllOfData***](OAIGraphRelationshipAllOfData.md) |  | [optional] 
**dataBase64** | **NSString*** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


