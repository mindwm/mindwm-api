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

#include "OpenAPICloudEvent.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPICloudEvent::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id);
	Writer->WriteIdentifierPrefix(TEXT("source")); WriteJsonValue(Writer, Source);
	Writer->WriteIdentifierPrefix(TEXT("specversion")); WriteJsonValue(Writer, Specversion);
	Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type);
	if (Datacontenttype.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("datacontenttype")); WriteJsonValue(Writer, Datacontenttype.GetValue());
	}
	if (Dataschema.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("dataschema")); WriteJsonValue(Writer, Dataschema.GetValue());
	}
	if (Subject.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("subject")); WriteJsonValue(Writer, Subject.GetValue());
	}
	if (Time.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("time")); WriteJsonValue(Writer, Time.GetValue());
	}
	if (Data.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("data")); WriteJsonValue(Writer, Data.GetValue());
	}
	if (DataBase64.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("data_base64")); WriteJsonValue(Writer, DataBase64.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPICloudEvent::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("source"), Source);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("specversion"), Specversion);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("type"), Type);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("datacontenttype"), Datacontenttype);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("dataschema"), Dataschema);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("subject"), Subject);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("time"), Time);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("data"), Data);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("data_base64"), DataBase64);

	return ParseSuccess;
}

}