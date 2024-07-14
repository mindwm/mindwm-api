/**
 * Mindwm API
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPICloudEventData.h"
#include "OpenAPIURI.h"

namespace OpenAPI
{

/*
 * OpenAPICloudEvent
 *
 * CloudEvents Specification JSON Schema
 */
class OPENAPI_API OpenAPICloudEvent : public Model
{
public:
    virtual ~OpenAPICloudEvent() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Identifies the event. */
	FString Id;
	/* Identifies the context in which an event happened. */
	FString Source;
	/* The version of the CloudEvents specification which the event uses. */
	FString Specversion;
	/* Describes the type of event related to the originating occurrence. */
	FString Type;
	/* Content type of the data value. Must adhere to RFC 2046 format. */
	TOptional<FString> Datacontenttype;
	/* Identifies the schema that data adheres to. */
	TOptional<OpenAPIURI> Dataschema;
	/* Describes the subject of the event in the context of the event producer (identified by source). */
	TOptional<FString> Subject;
	/* Timestamp of when the occurrence happened. Must adhere to RFC 3339. */
	TOptional<FDateTime> Time;
	TOptional<OpenAPICloudEventData> Data;
	/* Base64 encoded event payload. Must adhere to RFC4648. */
	TOptional<FString> DataBase64;
};

}