

#include "Neo4jCaptureDataChange.h"

using namespace Tiny;

Neo4jCaptureDataChange::Neo4jCaptureDataChange()
{
	headers = null<AnyType>();
	message_key = std::string();
	meta = Neo4jCaptureDataChange_meta();
	offset = int(0);
	partition = int(0);
	source_type = std::string();
	timestamp = std::string();
	topic = std::string();
	schema = Neo4jCaptureDataChange_schema();
	payload = Neo4jCaptureDataChange_payload();
}

Neo4jCaptureDataChange::Neo4jCaptureDataChange(std::string jsonString)
{
	this->fromJson(jsonString);
}

Neo4jCaptureDataChange::~Neo4jCaptureDataChange()
{

}

void
Neo4jCaptureDataChange::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *headersKey = "headers";

    if(object.has_key(headersKey))
    {
        bourne::json value = object[headersKey];


    }

    const char *message_keyKey = "message_key";

    if(object.has_key(message_keyKey))
    {
        bourne::json value = object[message_keyKey];



        jsonToValue(&message_key, value, "std::string");


    }

    const char *metaKey = "meta";

    if(object.has_key(metaKey))
    {
        bourne::json value = object[metaKey];




        Neo4jCaptureDataChange_meta* obj = &meta;
		obj->fromJson(value.dump());

    }

    const char *offsetKey = "offset";

    if(object.has_key(offsetKey))
    {
        bourne::json value = object[offsetKey];



        jsonToValue(&offset, value, "int");


    }

    const char *partitionKey = "partition";

    if(object.has_key(partitionKey))
    {
        bourne::json value = object[partitionKey];



        jsonToValue(&partition, value, "int");


    }

    const char *source_typeKey = "source_type";

    if(object.has_key(source_typeKey))
    {
        bourne::json value = object[source_typeKey];



        jsonToValue(&source_type, value, "std::string");


    }

    const char *timestampKey = "timestamp";

    if(object.has_key(timestampKey))
    {
        bourne::json value = object[timestampKey];



        jsonToValue(&timestamp, value, "std::string");


    }

    const char *topicKey = "topic";

    if(object.has_key(topicKey))
    {
        bourne::json value = object[topicKey];



        jsonToValue(&topic, value, "std::string");


    }

    const char *schemaKey = "schema";

    if(object.has_key(schemaKey))
    {
        bourne::json value = object[schemaKey];




        Neo4jCaptureDataChange_schema* obj = &schema;
		obj->fromJson(value.dump());

    }

    const char *payloadKey = "payload";

    if(object.has_key(payloadKey))
    {
        bourne::json value = object[payloadKey];




        Neo4jCaptureDataChange_payload* obj = &payload;
		obj->fromJson(value.dump());

    }


}

bourne::json
Neo4jCaptureDataChange::toJson()
{
    bourne::json object = bourne::json::object();








    object["message_key"] = getMessageKey();







	object["meta"] = getMeta().toJson();





    object["offset"] = getOffset();






    object["partition"] = getPartition();






    object["source_type"] = getSourceType();






    object["timestamp"] = getTimestamp();






    object["topic"] = getTopic();







	object["schema"] = getSchema().toJson();






	object["payload"] = getPayload().toJson();


    return object;

}

Map<string, string>
Neo4jCaptureDataChange::getHeaders()
{
	return headers;
}

void
Neo4jCaptureDataChange::setHeaders(Map <string, string> headers)
{
	this->headers = headers;
}

std::string
Neo4jCaptureDataChange::getMessageKey()
{
	return message_key;
}

void
Neo4jCaptureDataChange::setMessageKey(std::string  message_key)
{
	this->message_key = message_key;
}

Neo4jCaptureDataChange_meta
Neo4jCaptureDataChange::getMeta()
{
	return meta;
}

void
Neo4jCaptureDataChange::setMeta(Neo4jCaptureDataChange_meta  meta)
{
	this->meta = meta;
}

int
Neo4jCaptureDataChange::getOffset()
{
	return offset;
}

void
Neo4jCaptureDataChange::setOffset(int  offset)
{
	this->offset = offset;
}

int
Neo4jCaptureDataChange::getPartition()
{
	return partition;
}

void
Neo4jCaptureDataChange::setPartition(int  partition)
{
	this->partition = partition;
}

std::string
Neo4jCaptureDataChange::getSourceType()
{
	return source_type;
}

void
Neo4jCaptureDataChange::setSourceType(std::string  source_type)
{
	this->source_type = source_type;
}

std::string
Neo4jCaptureDataChange::getTimestamp()
{
	return timestamp;
}

void
Neo4jCaptureDataChange::setTimestamp(std::string  timestamp)
{
	this->timestamp = timestamp;
}

std::string
Neo4jCaptureDataChange::getTopic()
{
	return topic;
}

void
Neo4jCaptureDataChange::setTopic(std::string  topic)
{
	this->topic = topic;
}

Neo4jCaptureDataChange_schema
Neo4jCaptureDataChange::getSchema()
{
	return schema;
}

void
Neo4jCaptureDataChange::setSchema(Neo4jCaptureDataChange_schema  schema)
{
	this->schema = schema;
}

Neo4jCaptureDataChange_payload
Neo4jCaptureDataChange::getPayload()
{
	return payload;
}

void
Neo4jCaptureDataChange::setPayload(Neo4jCaptureDataChange_payload  payload)
{
	this->payload = payload;
}



