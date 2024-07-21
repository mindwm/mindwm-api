# MindWM - Kotlin database library for Mindwm API

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

 - [MindWM.models.Clipboard](docs/Clipboard.md)
 - [MindWM.models.ClipboardPayload](docs/ClipboardPayload.md)
 - [MindWM.models.ClipboardPayloadContext](docs/ClipboardPayloadContext.md)
 - [MindWM.models.CloudEvent](docs/CloudEvent.md)
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

