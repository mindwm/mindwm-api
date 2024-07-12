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
 - [MindwWM.models.IoDocument](docs/IoDocument.md)
 - [MindwWM.models.TmuxPaneIoDocument](docs/TmuxPaneIoDocument.md)

