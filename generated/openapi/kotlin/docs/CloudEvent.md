
# CloudEvent

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | Identifies the event. |  |
| **source** | **kotlin.String** | Identifies the context in which an event happened. |  |
| **specversion** | **kotlin.String** | The version of the CloudEvents specification which the event uses. |  |
| **type** | **kotlin.String** | Describes the type of event related to the originating occurrence. |  |
| **datacontenttype** | **kotlin.String** | Content type of the data value. Must adhere to RFC 2046 format. |  [optional] |
| **dataschema** | [**java.net.URI**](java.net.URI.md) | Identifies the schema that data adheres to. |  [optional] |
| **subject** | **kotlin.String** | Describes the subject of the event in the context of the event producer (identified by source). |  [optional] |
| **time** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp of when the occurrence happened. Must adhere to RFC 3339. |  [optional] |
| **&#x60;data&#x60;** | [**CloudEventData**](CloudEventData.md) |  |  [optional] |
| **dataBase64** | **kotlin.String** | Base64 encoded event payload. Must adhere to RFC4648. |  [optional] |



