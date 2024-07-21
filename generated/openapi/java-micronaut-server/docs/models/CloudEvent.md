

# CloudEvent

CloudEvents Specification JSON Schema

The class is defined in **[CloudEvent.java](../../src/main/java/org/openapitools/model/CloudEvent.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` | Identifies the event. | 
**source** | `String` | Identifies the context in which an event happened. | 
**specversion** | `String` | The version of the CloudEvents specification which the event uses. | 
**type** | `String` | Describes the type of event related to the originating occurrence. | 
**datacontenttype** | `String` | Content type of the data value. Must adhere to RFC 2046 format. |  [optional property]
**dataschema** | `URI` | Identifies the schema that data adheres to. |  [optional property]
**subject** | `String` | Describes the subject of the event in the context of the event producer (identified by source). |  [optional property]
**time** | `OffsetDateTime` | Timestamp of when the occurrence happened. Must adhere to RFC 3339. |  [optional property]
**data** | `Object` | The event payload. |  [optional property]
**dataBase64** | `String` | Base64 encoded event payload. Must adhere to RFC4648. |  [optional property]












