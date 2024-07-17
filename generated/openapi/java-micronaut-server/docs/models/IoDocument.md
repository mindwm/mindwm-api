

# IoDocument

The class is defined in **[IoDocument.java](../../src/main/java/org/openapitools/model/IoDocument.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` | Identifies the event. | 
**source** | `String` |  | 
**specversion** | `String` | The version of the CloudEvents specification which the event uses. | 
**type** | `String` |  | 
**datacontenttype** | `String` | Content type of the data value. Must adhere to RFC 2046 format. |  [optional property]
**dataschema** | `URI` | Identifies the schema that data adheres to. |  [optional property]
**subject** | `String` |  |  [optional property]
**time** | `OffsetDateTime` | Timestamp of when the occurrence happened. Must adhere to RFC 3339. |  [optional property]
**data** | `TmuxPaneIoDocument` |  |  [optional property]
**dataBase64** | `String` | Base64 encoded event payload. Must adhere to RFC4648. |  [optional property]












