
# Table `Neo4jCaptureDataChangeRelationshipPayload`
(mapped from: Neo4jCaptureDataChangeRelationshipPayload)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**after** | after | blob NOT NULL |  | [**kotlin.Any**](.md) |  | 
**before** | before | text NOT NULL |  | **kotlin.String** |  | 
**end** | end | long NOT NULL |  | [**Neo4jCaptureDataChangeRelationshipPayloadEnd**](Neo4jCaptureDataChangeRelationshipPayloadEnd.md) |  |  [foreignkey]
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** |  | 
**label** | label | text NOT NULL |  | **kotlin.String** |  | 
**start** | start | long NOT NULL |  | [**Neo4jCaptureDataChangeRelationshipPayloadEnd**](Neo4jCaptureDataChangeRelationshipPayloadEnd.md) |  |  [foreignkey]
**type** | type | text NOT NULL |  | **kotlin.String** |  | 









