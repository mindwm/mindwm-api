
# IoDocument

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | Identifies the event. |  |
| **source** | **kotlin.String** |  |  |
| **specversion** | **kotlin.String** | The version of the CloudEvents specification which the event uses. |  |
| **type** | **kotlin.String** |  |  |
| **datacontenttype** | **kotlin.String** | Content type of the data value. Must adhere to RFC 2046 format. |  [optional] |
| **dataschema** | [**java.net.URI**](java.net.URI.md) | Identifies the schema that data adheres to. |  [optional] |
| **subject** | **kotlin.String** |  |  [optional] |
| **time** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Timestamp of when the occurrence happened. Must adhere to RFC 3339. |  [optional] |
| **&#x60;data&#x60;** | [**TmuxPaneIoDocument**](TmuxPaneIoDocument.md) |  |  [optional] |
| **dataBase64** | **kotlin.String** | Base64 encoded event payload. Must adhere to RFC4648. |  [optional] |



