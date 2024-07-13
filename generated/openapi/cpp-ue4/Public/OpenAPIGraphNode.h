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
#include "OpenAPIGraphNodeAllOfData.h"
#include "OpenAPIURI.h"

namespace OpenAPI
{

/*
 * OpenAPIGraphNode
 *
 * 
 */
class OPENAPI_API OpenAPIGraphNode : public Model
{
public:
    virtual ~OpenAPIGraphNode() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* Identifies the event. */
	FString Id;
	enum class SourceEnum
	{
		GraphNode,
  	};

	static FString EnumToString(const SourceEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, SourceEnum& EnumValue);
	SourceEnum Source;
	/* The version of the CloudEvents specification which the event uses. */
	FString Specversion;
	enum class TypeEnum
	{
		Created,
		Updated,
		Deleted,
  	};

	static FString EnumToString(const TypeEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, TypeEnum& EnumValue);
	TypeEnum Type;
	/* Content type of the data value. Must adhere to RFC 2046 format. */
	TOptional<FString> Datacontenttype;
	/* Identifies the schema that data adheres to. */
	TOptional<OpenAPIURI> Dataschema;
	/* Describes the subject of the event in the context of the event producer (identified by source). */
	TOptional<FString> Subject;
	/* Timestamp of when the occurrence happened. Must adhere to RFC 3339. */
	TOptional<FDateTime> Time;
	TOptional<OpenAPIGraphNodeAllOfData> Data;
	/* Base64 encoded event payload. Must adhere to RFC4648. */
	TOptional<FString> DataBase64;
};

}
