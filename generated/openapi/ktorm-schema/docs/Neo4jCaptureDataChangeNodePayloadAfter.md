
# Table `Neo4jCaptureDataChangeNodePayload_after`
(mapped from: Neo4jCaptureDataChangeNodePayloadAfter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**labels** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  | 
**properties** | properties | blob NOT NULL |  | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  | 


# **Table `Neo4jCaptureDataChangeNodePayloadAfterLabels`**
(mapped from: Neo4jCaptureDataChangeNodePayloadAfterLabels)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
neo4jCaptureDataChangeNodePayloadAfter | neo4jCaptureDataChangeNodePayloadAfter | long | | kotlin.Long | Primary Key | *one*
labels | labels | text | | kotlin.String | Foreign Key | *many*




