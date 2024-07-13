# MindwWM - Kotlin Server library for Mindwm API

## Requires

* Kotlin 1.3.10
* Maven 3.3

## Build

```
mvn clean package
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://mindwmw.io/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------


<a id="documentation-for-models"></a>
## Documentation for Models

 - [MindwWM.models.Clipboard](docs/Clipboard.md)
 - [MindwWM.models.ClipboardPayload](docs/ClipboardPayload.md)
 - [MindwWM.models.ClipboardPayloadContext](docs/ClipboardPayloadContext.md)
 - [MindwWM.models.CloudEvent](docs/CloudEvent.md)
 - [MindwWM.models.CloudEventData](docs/CloudEventData.md)
 - [MindwWM.models.GraphNode](docs/GraphNode.md)
 - [MindwWM.models.GraphNodeAllOfData](docs/GraphNodeAllOfData.md)
 - [MindwWM.models.GraphRelationship](docs/GraphRelationship.md)
 - [MindwWM.models.GraphRelationshipAllOfData](docs/GraphRelationshipAllOfData.md)
 - [MindwWM.models.IoDocument](docs/IoDocument.md)
 - [MindwWM.models.Neo4jCaptureDataChange](docs/Neo4jCaptureDataChange.md)
 - [MindwWM.models.Neo4jCaptureDataChangeMeta](docs/Neo4jCaptureDataChangeMeta.md)
 - [MindwWM.models.Neo4jCaptureDataChangeMetaSource](docs/Neo4jCaptureDataChangeMetaSource.md)
 - [MindwWM.models.Neo4jCaptureDataChangeNodePayload](docs/Neo4jCaptureDataChangeNodePayload.md)
 - [MindwWM.models.Neo4jCaptureDataChangeNodePayloadAfter](docs/Neo4jCaptureDataChangeNodePayloadAfter.md)
 - [MindwWM.models.Neo4jCaptureDataChangePayload](docs/Neo4jCaptureDataChangePayload.md)
 - [MindwWM.models.Neo4jCaptureDataChangeRelationshipPayload](docs/Neo4jCaptureDataChangeRelationshipPayload.md)
 - [MindwWM.models.Neo4jCaptureDataChangeRelationshipPayloadEnd](docs/Neo4jCaptureDataChangeRelationshipPayloadEnd.md)
 - [MindwWM.models.Neo4jCaptureDataChangeSchema](docs/Neo4jCaptureDataChangeSchema.md)
 - [MindwWM.models.TmuxPaneIoDocument](docs/TmuxPaneIoDocument.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.

