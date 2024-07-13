
# Table `Neo4jCaptureDataChange_payload`
(mapped from: Neo4jCaptureDataChangePayload)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**after** | after | blob NOT NULL |  | [**kotlin.Any**](.md) |  | 
**before** | before | text NOT NULL |  | **kotlin.String** |  | 
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** |  | 
**type** | type | text NOT NULL |  | **kotlin.String** |  | 
**end** | end | long NOT NULL |  | [**Neo4jCaptureDataChangeRelationshipPayloadEnd**](Neo4jCaptureDataChangeRelationshipPayloadEnd.md) |  |  [foreignkey]
**label** | label | text NOT NULL |  | **kotlin.String** |  | 
**start** | start | long NOT NULL |  | [**Neo4jCaptureDataChangeRelationshipPayloadEnd**](Neo4jCaptureDataChangeRelationshipPayloadEnd.md) |  |  [foreignkey]









