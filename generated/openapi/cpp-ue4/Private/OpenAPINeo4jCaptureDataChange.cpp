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

#include "OpenAPINeo4jCaptureDataChange.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPINeo4jCaptureDataChange::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("headers")); WriteJsonValue(Writer, Headers);
	Writer->WriteIdentifierPrefix(TEXT("message_key")); WriteJsonValue(Writer, MessageKey);
	Writer->WriteIdentifierPrefix(TEXT("meta")); WriteJsonValue(Writer, Meta);
	Writer->WriteIdentifierPrefix(TEXT("offset")); WriteJsonValue(Writer, Offset);
	Writer->WriteIdentifierPrefix(TEXT("partition")); WriteJsonValue(Writer, Partition);
	Writer->WriteIdentifierPrefix(TEXT("source_type")); WriteJsonValue(Writer, SourceType);
	Writer->WriteIdentifierPrefix(TEXT("timestamp")); WriteJsonValue(Writer, Timestamp);
	Writer->WriteIdentifierPrefix(TEXT("topic")); WriteJsonValue(Writer, Topic);
	Writer->WriteIdentifierPrefix(TEXT("schema")); WriteJsonValue(Writer, Schema);
	Writer->WriteIdentifierPrefix(TEXT("payload")); WriteJsonValue(Writer, Payload);
	Writer->WriteObjectEnd();
}

bool OpenAPINeo4jCaptureDataChange::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("headers"), Headers);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("message_key"), MessageKey);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("meta"), Meta);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("offset"), Offset);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("partition"), Partition);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("source_type"), SourceType);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("timestamp"), Timestamp);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("topic"), Topic);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("schema"), Schema);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("payload"), Payload);

	return ParseSuccess;
}

}
