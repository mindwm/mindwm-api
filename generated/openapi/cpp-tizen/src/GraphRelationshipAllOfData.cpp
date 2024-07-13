#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GraphRelationship_allOf_data.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GraphRelationship_allOf_data::GraphRelationship_allOf_data()
{
	//__init();
}

GraphRelationship_allOf_data::~GraphRelationship_allOf_data()
{
	//__cleanup();
}

void
GraphRelationship_allOf_data::__init()
{
	//headers = null;
	//message_key = std::string();
	//meta = new Neo4jCaptureDataChange_meta();
	//offset = int(0);
	//partition = int(0);
	//source_type = std::string();
	//timestamp = null;
	//topic = std::string();
	//schema = new Neo4jCaptureDataChange_schema();
	//payload = new Neo4jCaptureDataChangeRelationshipPayload();
}

void
GraphRelationship_allOf_data::__cleanup()
{
	//if(headers != NULL) {
	//
	//delete headers;
	//headers = NULL;
	//}
	//if(message_key != NULL) {
	//
	//delete message_key;
	//message_key = NULL;
	//}
	//if(meta != NULL) {
	//
	//delete meta;
	//meta = NULL;
	//}
	//if(offset != NULL) {
	//
	//delete offset;
	//offset = NULL;
	//}
	//if(partition != NULL) {
	//
	//delete partition;
	//partition = NULL;
	//}
	//if(source_type != NULL) {
	//
	//delete source_type;
	//source_type = NULL;
	//}
	//if(timestamp != NULL) {
	//
	//delete timestamp;
	//timestamp = NULL;
	//}
	//if(topic != NULL) {
	//
	//delete topic;
	//topic = NULL;
	//}
	//if(schema != NULL) {
	//
	//delete schema;
	//schema = NULL;
	//}
	//if(payload != NULL) {
	//
	//delete payload;
	//payload = NULL;
	//}
	//
}

void
GraphRelationship_allOf_data::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *headersKey = "headers";
	node = json_object_get_member(pJsonObject, headersKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&headers, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&headers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *message_keyKey = "message_key";
	node = json_object_get_member(pJsonObject, message_keyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message_key, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *metaKey = "meta";
	node = json_object_get_member(pJsonObject, metaKey);
	if (node !=NULL) {
	

		if (isprimitive("Neo4jCaptureDataChange_meta")) {
			jsonToValue(&meta, node, "Neo4jCaptureDataChange_meta", "Neo4jCaptureDataChange_meta");
		} else {
			
			Neo4jCaptureDataChange_meta* obj = static_cast<Neo4jCaptureDataChange_meta*> (&meta);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *offsetKey = "offset";
	node = json_object_get_member(pJsonObject, offsetKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&offset, node, "int", "");
		} else {
			
		}
	}
	const gchar *partitionKey = "partition";
	node = json_object_get_member(pJsonObject, partitionKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&partition, node, "int", "");
		} else {
			
		}
	}
	const gchar *source_typeKey = "source_type";
	node = json_object_get_member(pJsonObject, source_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&source_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *timestampKey = "timestamp";
	node = json_object_get_member(pJsonObject, timestampKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&timestamp, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *topicKey = "topic";
	node = json_object_get_member(pJsonObject, topicKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&topic, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *schemaKey = "schema";
	node = json_object_get_member(pJsonObject, schemaKey);
	if (node !=NULL) {
	

		if (isprimitive("Neo4jCaptureDataChange_schema")) {
			jsonToValue(&schema, node, "Neo4jCaptureDataChange_schema", "Neo4jCaptureDataChange_schema");
		} else {
			
			Neo4jCaptureDataChange_schema* obj = static_cast<Neo4jCaptureDataChange_schema*> (&schema);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *payloadKey = "payload";
	node = json_object_get_member(pJsonObject, payloadKey);
	if (node !=NULL) {
	

		if (isprimitive("Neo4jCaptureDataChangeRelationshipPayload")) {
			jsonToValue(&payload, node, "Neo4jCaptureDataChangeRelationshipPayload", "Neo4jCaptureDataChangeRelationshipPayload");
		} else {
			
			Neo4jCaptureDataChangeRelationshipPayload* obj = static_cast<Neo4jCaptureDataChangeRelationshipPayload*> (&payload);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GraphRelationship_allOf_data::GraphRelationship_allOf_data(char* json)
{
	this->fromJson(json);
}

char*
GraphRelationship_allOf_data::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getHeaders();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getHeaders());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *headersKey = "headers";
	json_object_set_member(pJsonObject, headersKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMessageKey();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *message_keyKey = "message_key";
	json_object_set_member(pJsonObject, message_keyKey, node);
	if (isprimitive("Neo4jCaptureDataChange_meta")) {
		Neo4jCaptureDataChange_meta obj = getMeta();
		node = converttoJson(&obj, "Neo4jCaptureDataChange_meta", "");
	}
	else {
		
		Neo4jCaptureDataChange_meta obj = static_cast<Neo4jCaptureDataChange_meta> (getMeta());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *metaKey = "meta";
	json_object_set_member(pJsonObject, metaKey, node);
	if (isprimitive("int")) {
		int obj = getOffset();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *offsetKey = "offset";
	json_object_set_member(pJsonObject, offsetKey, node);
	if (isprimitive("int")) {
		int obj = getPartition();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *partitionKey = "partition";
	json_object_set_member(pJsonObject, partitionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSourceType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *source_typeKey = "source_type";
	json_object_set_member(pJsonObject, source_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTimestamp();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *timestampKey = "timestamp";
	json_object_set_member(pJsonObject, timestampKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTopic();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *topicKey = "topic";
	json_object_set_member(pJsonObject, topicKey, node);
	if (isprimitive("Neo4jCaptureDataChange_schema")) {
		Neo4jCaptureDataChange_schema obj = getSchema();
		node = converttoJson(&obj, "Neo4jCaptureDataChange_schema", "");
	}
	else {
		
		Neo4jCaptureDataChange_schema obj = static_cast<Neo4jCaptureDataChange_schema> (getSchema());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *schemaKey = "schema";
	json_object_set_member(pJsonObject, schemaKey, node);
	if (isprimitive("Neo4jCaptureDataChangeRelationshipPayload")) {
		Neo4jCaptureDataChangeRelationshipPayload obj = getPayload();
		node = converttoJson(&obj, "Neo4jCaptureDataChangeRelationshipPayload", "");
	}
	else {
		
		Neo4jCaptureDataChangeRelationshipPayload obj = static_cast<Neo4jCaptureDataChangeRelationshipPayload> (getPayload());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *payloadKey = "payload";
	json_object_set_member(pJsonObject, payloadKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
GraphRelationship_allOf_data::getHeaders()
{
	return headers;
}

void
GraphRelationship_allOf_data::setHeaders(std::string  headers)
{
	this->headers = headers;
}

std::string
GraphRelationship_allOf_data::getMessageKey()
{
	return message_key;
}

void
GraphRelationship_allOf_data::setMessageKey(std::string  message_key)
{
	this->message_key = message_key;
}

Neo4jCaptureDataChange_meta
GraphRelationship_allOf_data::getMeta()
{
	return meta;
}

void
GraphRelationship_allOf_data::setMeta(Neo4jCaptureDataChange_meta  meta)
{
	this->meta = meta;
}

int
GraphRelationship_allOf_data::getOffset()
{
	return offset;
}

void
GraphRelationship_allOf_data::setOffset(int  offset)
{
	this->offset = offset;
}

int
GraphRelationship_allOf_data::getPartition()
{
	return partition;
}

void
GraphRelationship_allOf_data::setPartition(int  partition)
{
	this->partition = partition;
}

std::string
GraphRelationship_allOf_data::getSourceType()
{
	return source_type;
}

void
GraphRelationship_allOf_data::setSourceType(std::string  source_type)
{
	this->source_type = source_type;
}

std::string
GraphRelationship_allOf_data::getTimestamp()
{
	return timestamp;
}

void
GraphRelationship_allOf_data::setTimestamp(std::string  timestamp)
{
	this->timestamp = timestamp;
}

std::string
GraphRelationship_allOf_data::getTopic()
{
	return topic;
}

void
GraphRelationship_allOf_data::setTopic(std::string  topic)
{
	this->topic = topic;
}

Neo4jCaptureDataChange_schema
GraphRelationship_allOf_data::getSchema()
{
	return schema;
}

void
GraphRelationship_allOf_data::setSchema(Neo4jCaptureDataChange_schema  schema)
{
	this->schema = schema;
}

Neo4jCaptureDataChangeRelationshipPayload
GraphRelationship_allOf_data::getPayload()
{
	return payload;
}

void
GraphRelationship_allOf_data::setPayload(Neo4jCaptureDataChangeRelationshipPayload  payload)
{
	this->payload = payload;
}


