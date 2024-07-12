

# IoDocument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  |  [optional]
**source** | **String** |  |  [optional]
**data** | [**TmuxPaneIoDocument**](TmuxPaneIoDocument.md) |  |  [optional]
**id** | **String** | Identifies the event. | 
**specversion** | **String** | The version of the CloudEvents specification which the event uses. | 
**datacontenttype** | **String** | Content type of the data value. Must adhere to RFC 2046 format. |  [optional]
**dataschema** | [**URI**](URI.md) | Identifies the schema that data adheres to. |  [optional]
**subject** | **String** |  |  [optional]
**time** | [**Date**](Date.md) | Timestamp of when the occurrence happened. Must adhere to RFC 3339. |  [optional]
**dataBase64** | **String** | Base64 encoded event payload. Must adhere to RFC4648. |  [optional]




