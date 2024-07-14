

# GraphNode

The class is defined in **[GraphNode.java](../../src/main/java/org/openapitools/model/GraphNode.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` | Identifies the event. | 
**source** | [**SourceEnum**](#SourceEnum) |  | 
**specversion** | `String` | The version of the CloudEvents specification which the event uses. | 
**type** | [**TypeEnum**](#TypeEnum) |  | 
**datacontenttype** | `String` | Content type of the data value. Must adhere to RFC 2046 format. |  [optional property]
**dataschema** | `URI` | Identifies the schema that data adheres to. |  [optional property]
**subject** | `String` | Describes the subject of the event in the context of the event producer (identified by source). |  [optional property]
**time** | `OffsetDateTime` | Timestamp of when the occurrence happened. Must adhere to RFC 3339. |  [optional property]
**data** | [`GraphNodeAllOfData`](GraphNodeAllOfData.md) |  |  [optional property]
**dataBase64** | `String` | Base64 encoded event payload. Must adhere to RFC4648. |  [optional property]


## SourceEnum

Name | Value
---- | -----
NODE | `"graph.node"`
RELATIONSHIP | `"graph.relationship"`


## TypeEnum

Name | Value
---- | -----
CREATED | `"created"`
UPDATED | `"updated"`
DELETED | `"deleted"`








