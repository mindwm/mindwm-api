# MindwWM - Kotlin database library for Mindwm API

## Requires


## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Supports Mapper using API model classes.
* Supports SQLite types.

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

