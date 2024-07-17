# MindWM.Model.IoDocument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifies the event. | 
**Source** | **string** |  | 
**Specversion** | **string** | The version of the CloudEvents specification which the event uses. | 
**Type** | **string** |  | [default to "IoDocument"]
**Datacontenttype** | **string** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] 
**Dataschema** | **string** | Identifies the schema that data adheres to. | [optional] 
**Subject** | **string** |  | [optional] [default to "IoDocument"]
**Time** | **DateTime** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] 
**Data** | [**TmuxPaneIoDocument**](TmuxPaneIoDocument.md) |  | [optional] 
**DataBase64** | **string** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

