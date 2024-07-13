

# GraphNode


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifies the event. |  |
|**source** | [**SourceEnum**](#SourceEnum) |  |  |
|**specversion** | **String** | The version of the CloudEvents specification which the event uses. |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**datacontenttype** | **String** | Content type of the data value. Must adhere to RFC 2046 format. |  [optional] |
|**dataschema** | **URI** | Identifies the schema that data adheres to. |  [optional] |
|**subject** | **String** | Describes the subject of the event in the context of the event producer (identified by source). |  [optional] |
|**time** | **OffsetDateTime** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. |  [optional] |
|**data** | [**GraphNodeAllOfData**](GraphNodeAllOfData.md) |  |  [optional] |
|**dataBase64** | **String** | Base64 encoded event payload. Must adhere to RFC4648. |  [optional] |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| GRAPH_NODE | &quot;graph.node&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| UPDATED | &quot;updated&quot; |
| DELETED | &quot;deleted&quot; |



