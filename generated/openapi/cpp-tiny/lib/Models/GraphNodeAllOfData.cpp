

#include "GraphNode_allOf_data.h"

using namespace Tiny;

GraphNode_allOf_data::GraphNode_allOf_data()
{
	headers = null;
	message_key = std::string();
	meta = Neo4jCaptureDataChange_meta();
	offset = int(0);
	partition = int(0);
	source_type = std::string();
	timestamp = std::string();
	topic = std::string();
	schema = Neo4jCaptureDataChange_schema();
	payload = Neo4jCaptureDataChangeNodePayload();
}

GraphNode_allOf_data::GraphNode_allOf_data(std::string jsonString)
{
	this->fromJson(jsonString);
}

GraphNode_allOf_data::~GraphNode_allOf_data()
{

}

void
GraphNode_allOf_data::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *headersKey = "headers";

    if(object.has_key(headersKey))
    {
        bourne::json value = object[headersKey];




        Object* obj = &headers;
		obj->fromJson(value.dump());

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




        Neo4jCaptureDataChangeNodePayload* obj = &payload;
		obj->fromJson(value.dump());

    }


}

bourne::json
GraphNode_allOf_data::toJson()
{
    bourne::json object = bourne::json::object();






	object["headers"] = getHeaders().toJson();





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

Object
GraphNode_allOf_data::getHeaders()
{
	return headers;
}

void
GraphNode_allOf_data::setHeaders(Object  headers)
{
	this->headers = headers;
}

std::string
GraphNode_allOf_data::getMessageKey()
{
	return message_key;
}

void
GraphNode_allOf_data::setMessageKey(std::string  message_key)
{
	this->message_key = message_key;
}

Neo4jCaptureDataChange_meta
GraphNode_allOf_data::getMeta()
{
	return meta;
}

void
GraphNode_allOf_data::setMeta(Neo4jCaptureDataChange_meta  meta)
{
	this->meta = meta;
}

int
GraphNode_allOf_data::getOffset()
{
	return offset;
}

void
GraphNode_allOf_data::setOffset(int  offset)
{
	this->offset = offset;
}

int
GraphNode_allOf_data::getPartition()
{
	return partition;
}

void
GraphNode_allOf_data::setPartition(int  partition)
{
	this->partition = partition;
}

std::string
GraphNode_allOf_data::getSourceType()
{
	return source_type;
}

void
GraphNode_allOf_data::setSourceType(std::string  source_type)
{
	this->source_type = source_type;
}

std::string
GraphNode_allOf_data::getTimestamp()
{
	return timestamp;
}

void
GraphNode_allOf_data::setTimestamp(std::string  timestamp)
{
	this->timestamp = timestamp;
}

std::string
GraphNode_allOf_data::getTopic()
{
	return topic;
}

void
GraphNode_allOf_data::setTopic(std::string  topic)
{
	this->topic = topic;
}

Neo4jCaptureDataChange_schema
GraphNode_allOf_data::getSchema()
{
	return schema;
}

void
GraphNode_allOf_data::setSchema(Neo4jCaptureDataChange_schema  schema)
{
	this->schema = schema;
}

Neo4jCaptureDataChangeNodePayload
GraphNode_allOf_data::getPayload()
{
	return payload;
}

void
GraphNode_allOf_data::setPayload(Neo4jCaptureDataChangeNodePayload  payload)
{
	this->payload = payload;
}



