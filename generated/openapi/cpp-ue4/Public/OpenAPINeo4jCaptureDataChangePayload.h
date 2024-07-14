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
#include "OpenAPINeo4jCaptureDataChangeNodePayload.h"
#include "OpenAPINeo4jCaptureDataChangeRelationshipPayload.h"
#include "OpenAPINeo4jCaptureDataChangeRelationshipPayloadEnd.h"

namespace OpenAPI
{

/*
 * OpenAPINeo4jCaptureDataChangePayload
 *
 * 
 */
class OPENAPI_API OpenAPINeo4jCaptureDataChangePayload : public Model
{
public:
    virtual ~OpenAPINeo4jCaptureDataChangePayload() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	TSharedPtr<FJsonObject> After;
	FString Before;
	FString Id;
	FString Type;
	OpenAPINeo4jCaptureDataChangeRelationshipPayloadEnd End;
	FString Label;
	OpenAPINeo4jCaptureDataChangeRelationshipPayloadEnd Start;
};

}