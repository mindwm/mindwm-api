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
 - [MindwWM.models.IoDocument](docs/IoDocument.md)
 - [MindwWM.models.TmuxPaneIoDocument](docs/TmuxPaneIoDocument.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.

