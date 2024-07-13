
# Table `Neo4jCaptureDataChangeRelationshipPayload_end`
(mapped from: Neo4jCaptureDataChangeRelationshipPayloadEnd)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** |  | 
**ids** | ids | blob NOT NULL |  | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  | 
**labels** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  | 




# **Table `Neo4jCaptureDataChangeRelationshipPayloadEndLabels`**
(mapped from: Neo4jCaptureDataChangeRelationshipPayloadEndLabels)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
neo4jCaptureDataChangeRelationshipPayloadEnd | neo4jCaptureDataChangeRelationshipPayloadEnd | long | | kotlin.Long | Primary Key | *one*
labels | labels | text | | kotlin.String | Foreign Key | *many*



