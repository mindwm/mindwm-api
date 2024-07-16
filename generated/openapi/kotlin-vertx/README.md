# MindWM - Kotlin Server library for Mindwm API

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

 - [MindWM.models.Clipboard](docs/Clipboard.md)
 - [MindWM.models.ClipboardPayload](docs/ClipboardPayload.md)
 - [MindWM.models.ClipboardPayloadContext](docs/ClipboardPayloadContext.md)
 - [MindWM.models.CloudEvent](docs/CloudEvent.md)
 - [MindWM.models.CloudEventData](docs/CloudEventData.md)
 - [MindWM.models.GraphNode](docs/GraphNode.md)
 - [MindWM.models.GraphNodeAllOfData](docs/GraphNodeAllOfData.md)
 - [MindWM.models.GraphRelationship](docs/GraphRelationship.md)
 - [MindWM.models.GraphRelationshipAllOfData](docs/GraphRelationshipAllOfData.md)
 - [MindWM.models.IoDocument](docs/IoDocument.md)
 - [MindWM.models.Neo4jCaptureDataChange](docs/Neo4jCaptureDataChange.md)
 - [MindWM.models.Neo4jCaptureDataChangeMeta](docs/Neo4jCaptureDataChangeMeta.md)
 - [MindWM.models.Neo4jCaptureDataChangeMetaSource](docs/Neo4jCaptureDataChangeMetaSource.md)
 - [MindWM.models.Neo4jCaptureDataChangeNodePayload](docs/Neo4jCaptureDataChangeNodePayload.md)
 - [MindWM.models.Neo4jCaptureDataChangeNodePayloadAfter](docs/Neo4jCaptureDataChangeNodePayloadAfter.md)
 - [MindWM.models.Neo4jCaptureDataChangePayload](docs/Neo4jCaptureDataChangePayload.md)
 - [MindWM.models.Neo4jCaptureDataChangeRelationshipPayload](docs/Neo4jCaptureDataChangeRelationshipPayload.md)
 - [MindWM.models.Neo4jCaptureDataChangeRelationshipPayloadEnd](docs/Neo4jCaptureDataChangeRelationshipPayloadEnd.md)
 - [MindWM.models.Neo4jCaptureDataChangeSchema](docs/Neo4jCaptureDataChangeSchema.md)
 - [MindWM.models.TmuxPaneIoDocument](docs/TmuxPaneIoDocument.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.

