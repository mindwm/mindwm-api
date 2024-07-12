

# Clipboard

The class is defined in **[Clipboard.java](../../src/main/java/org/openapitools/model/Clipboard.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | `String` |  |  [optional property]
**source** | `String` |  |  [optional property]
**data** | [`ClipboardPayload`](ClipboardPayload.md) |  |  [optional property]
**id** | `String` | Identifies the event. | 
**specversion** | `String` | The version of the CloudEvents specification which the event uses. | 
**datacontenttype** | `String` | Content type of the data value. Must adhere to RFC 2046 format. |  [optional property]
**dataschema** | `URI` | Identifies the schema that data adheres to. |  [optional property]
**subject** | `String` | Describes the subject of the event in the context of the event producer (identified by source). |  [optional property]
**time** | `OffsetDateTime` | Timestamp of when the occurrence happened. Must adhere to RFC 3339. |  [optional property]
**dataBase64** | `String` | Base64 encoded event payload. Must adhere to RFC4648. |  [optional property]












