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

#include "OpenAPINeo4jCaptureDataChangeRelationshipPayloadEnd.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPINeo4jCaptureDataChangeRelationshipPayloadEnd::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id);
	Writer->WriteIdentifierPrefix(TEXT("ids")); WriteJsonValue(Writer, Ids);
	Writer->WriteIdentifierPrefix(TEXT("labels")); WriteJsonValue(Writer, Labels);
	Writer->WriteObjectEnd();
}

bool OpenAPINeo4jCaptureDataChangeRelationshipPayloadEnd::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("ids"), Ids);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("labels"), Labels);

	return ParseSuccess;
}

}
