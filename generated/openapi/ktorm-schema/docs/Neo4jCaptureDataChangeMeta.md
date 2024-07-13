
# Table `Neo4jCaptureDataChange_meta`
(mapped from: Neo4jCaptureDataChangeMeta)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**operation** | operation | text NOT NULL |  | **kotlin.String** |  | 
**source** | source | long NOT NULL |  | [**Neo4jCaptureDataChangeMetaSource**](Neo4jCaptureDataChangeMetaSource.md) |  |  [foreignkey]
**timestamp** | timestamp | int NOT NULL |  | **kotlin.Int** |  | 
**txEventId** | txEventId | int NOT NULL |  | **kotlin.Int** |  | 
**txEventsCount** | txEventsCount | int NOT NULL |  | **kotlin.Int** |  | 
**txId** | txId | int NOT NULL |  | **kotlin.Int** |  | 
**username** | username | text NOT NULL |  | **kotlin.String** |  | 









