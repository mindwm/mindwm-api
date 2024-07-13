# openapi-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/openapi-android-client-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

```

## Documentation for API Endpoints

All URIs are relative to *https://mindwmw.io/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------


## Documentation for Models

 - [Clipboard](docs/Clipboard.md)
 - [ClipboardPayload](docs/ClipboardPayload.md)
 - [ClipboardPayloadContext](docs/ClipboardPayloadContext.md)
 - [CloudEvent](docs/CloudEvent.md)
 - [CloudEventData](docs/CloudEventData.md)
 - [GraphNode](docs/GraphNode.md)
 - [GraphNodeAllOfData](docs/GraphNodeAllOfData.md)
 - [GraphRelationship](docs/GraphRelationship.md)
 - [GraphRelationshipAllOfData](docs/GraphRelationshipAllOfData.md)
 - [IoDocument](docs/IoDocument.md)
 - [Neo4jCaptureDataChange](docs/Neo4jCaptureDataChange.md)
 - [Neo4jCaptureDataChangeMeta](docs/Neo4jCaptureDataChangeMeta.md)
 - [Neo4jCaptureDataChangeMetaSource](docs/Neo4jCaptureDataChangeMetaSource.md)
 - [Neo4jCaptureDataChangeNodePayload](docs/Neo4jCaptureDataChangeNodePayload.md)
 - [Neo4jCaptureDataChangeNodePayloadAfter](docs/Neo4jCaptureDataChangeNodePayloadAfter.md)
 - [Neo4jCaptureDataChangePayload](docs/Neo4jCaptureDataChangePayload.md)
 - [Neo4jCaptureDataChangeRelationshipPayload](docs/Neo4jCaptureDataChangeRelationshipPayload.md)
 - [Neo4jCaptureDataChangeRelationshipPayloadEnd](docs/Neo4jCaptureDataChangeRelationshipPayloadEnd.md)
 - [Neo4jCaptureDataChangeSchema](docs/Neo4jCaptureDataChangeSchema.md)
 - [TmuxPaneIoDocument](docs/TmuxPaneIoDocument.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


