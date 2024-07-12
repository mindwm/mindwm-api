
# Table `IoDocument`
(mapped from: IoDocument)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Identifies the event. | 
**source** | source | text NOT NULL |  | **kotlin.String** |  | 
**specversion** | specversion | text NOT NULL |  | **kotlin.String** | The version of the CloudEvents specification which the event uses. | 
**type** | type | text NOT NULL |  | **kotlin.String** |  | 
**datacontenttype** | datacontenttype | text |  | **kotlin.String** | Content type of the data value. Must adhere to RFC 2046 format. |  [optional]
**dataschema** | dataschema | text |  | [**java.net.URI**](java.net.URI.md) | Identifies the schema that data adheres to. |  [optional]
**subject** | subject | text |  | **kotlin.String** | Describes the subject of the event in the context of the event producer (identified by source). |  [optional]
**time** | time | datetime |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Timestamp of when the occurrence happened. Must adhere to RFC 3339. |  [optional]
**data** | data | long |  | [**TmuxPaneIoDocument**](TmuxPaneIoDocument.md) |  |  [optional] [foreignkey]
**dataBase64** | data_base64 | text |  | **kotlin.String** | Base64 encoded event payload. Must adhere to RFC4648. |  [optional]












