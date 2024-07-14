
# Table `Neo4jCaptureDataChange`
(mapped from: Neo4jCaptureDataChange)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**headers** | headers | blob NOT NULL |  | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  | 
**messageKey** | message_key | text NOT NULL |  | **kotlin.String** |  | 
**meta** | meta | long NOT NULL |  | [**Neo4jCaptureDataChangeMeta**](Neo4jCaptureDataChangeMeta.md) |  |  [foreignkey]
**offset** | offset | int NOT NULL |  | **kotlin.Int** |  | 
**partition** | partition | int NOT NULL |  | **kotlin.Int** |  | 
**sourceType** | source_type | text NOT NULL |  | **kotlin.String** |  | 
**timestamp** | timestamp | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  | 
**topic** | topic | text NOT NULL |  | **kotlin.String** |  | 
**schema** | schema | long NOT NULL |  | [**Neo4jCaptureDataChangeSchema**](Neo4jCaptureDataChangeSchema.md) |  |  [foreignkey]
**payload** | payload | long NOT NULL |  | [**Neo4jCaptureDataChangePayload**](Neo4jCaptureDataChangePayload.md) |  |  [foreignkey]











