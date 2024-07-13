#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Neo4jCaptureDataChange_meta.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Neo4jCaptureDataChange_meta::Neo4jCaptureDataChange_meta()
{
	//__init();
}

Neo4jCaptureDataChange_meta::~Neo4jCaptureDataChange_meta()
{
	//__cleanup();
}

void
Neo4jCaptureDataChange_meta::__init()
{
	//operation = std::string();
	//source = new Neo4jCaptureDataChange_meta_source();
	//timestamp = int(0);
	//txEventId = int(0);
	//txEventsCount = int(0);
	//txId = int(0);
	//username = std::string();
}

void
Neo4jCaptureDataChange_meta::__cleanup()
{
	//if(operation != NULL) {
	//
	//delete operation;
	//operation = NULL;
	//}
	//if(source != NULL) {
	//
	//delete source;
	//source = NULL;
	//}
	//if(timestamp != NULL) {
	//
	//delete timestamp;
	//timestamp = NULL;
	//}
	//if(txEventId != NULL) {
	//
	//delete txEventId;
	//txEventId = NULL;
	//}
	//if(txEventsCount != NULL) {
	//
	//delete txEventsCount;
	//txEventsCount = NULL;
	//}
	//if(txId != NULL) {
	//
	//delete txId;
	//txId = NULL;
	//}
	//if(username != NULL) {
	//
	//delete username;
	//username = NULL;
	//}
	//
}

void
Neo4jCaptureDataChange_meta::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *operationKey = "operation";
	node = json_object_get_member(pJsonObject, operationKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&operation, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *sourceKey = "source";
	node = json_object_get_member(pJsonObject, sourceKey);
	if (node !=NULL) {
	

		if (isprimitive("Neo4jCaptureDataChange_meta_source")) {
			jsonToValue(&source, node, "Neo4jCaptureDataChange_meta_source", "Neo4jCaptureDataChange_meta_source");
		} else {
			
			Neo4jCaptureDataChange_meta_source* obj = static_cast<Neo4jCaptureDataChange_meta_source*> (&source);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *timestampKey = "timestamp";
	node = json_object_get_member(pJsonObject, timestampKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&timestamp, node, "int", "");
		} else {
			
		}
	}
	const gchar *txEventIdKey = "txEventId";
	node = json_object_get_member(pJsonObject, txEventIdKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&txEventId, node, "int", "");
		} else {
			
		}
	}
	const gchar *txEventsCountKey = "txEventsCount";
	node = json_object_get_member(pJsonObject, txEventsCountKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&txEventsCount, node, "int", "");
		} else {
			
		}
	}
	const gchar *txIdKey = "txId";
	node = json_object_get_member(pJsonObject, txIdKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&txId, node, "int", "");
		} else {
			
		}
	}
	const gchar *usernameKey = "username";
	node = json_object_get_member(pJsonObject, usernameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&username, node, "std::string", "");
		} else {
			
		}
	}
}

Neo4jCaptureDataChange_meta::Neo4jCaptureDataChange_meta(char* json)
{
	this->fromJson(json);
}

char*
Neo4jCaptureDataChange_meta::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getOperation();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *operationKey = "operation";
	json_object_set_member(pJsonObject, operationKey, node);
	if (isprimitive("Neo4jCaptureDataChange_meta_source")) {
		Neo4jCaptureDataChange_meta_source obj = getSource();
		node = converttoJson(&obj, "Neo4jCaptureDataChange_meta_source", "");
	}
	else {
		
		Neo4jCaptureDataChange_meta_source obj = static_cast<Neo4jCaptureDataChange_meta_source> (getSource());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sourceKey = "source";
	json_object_set_member(pJsonObject, sourceKey, node);
	if (isprimitive("int")) {
		int obj = getTimestamp();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *timestampKey = "timestamp";
	json_object_set_member(pJsonObject, timestampKey, node);
	if (isprimitive("int")) {
		int obj = getTxEventId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *txEventIdKey = "txEventId";
	json_object_set_member(pJsonObject, txEventIdKey, node);
	if (isprimitive("int")) {
		int obj = getTxEventsCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *txEventsCountKey = "txEventsCount";
	json_object_set_member(pJsonObject, txEventsCountKey, node);
	if (isprimitive("int")) {
		int obj = getTxId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *txIdKey = "txId";
	json_object_set_member(pJsonObject, txIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUsername();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *usernameKey = "username";
	json_object_set_member(pJsonObject, usernameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Neo4jCaptureDataChange_meta::getOperation()
{
	return operation;
}

void
Neo4jCaptureDataChange_meta::setOperation(std::string  operation)
{
	this->operation = operation;
}

Neo4jCaptureDataChange_meta_source
Neo4jCaptureDataChange_meta::getSource()
{
	return source;
}

void
Neo4jCaptureDataChange_meta::setSource(Neo4jCaptureDataChange_meta_source  source)
{
	this->source = source;
}

int
Neo4jCaptureDataChange_meta::getTimestamp()
{
	return timestamp;
}

void
Neo4jCaptureDataChange_meta::setTimestamp(int  timestamp)
{
	this->timestamp = timestamp;
}

int
Neo4jCaptureDataChange_meta::getTxEventId()
{
	return txEventId;
}

void
Neo4jCaptureDataChange_meta::setTxEventId(int  txEventId)
{
	this->txEventId = txEventId;
}

int
Neo4jCaptureDataChange_meta::getTxEventsCount()
{
	return txEventsCount;
}

void
Neo4jCaptureDataChange_meta::setTxEventsCount(int  txEventsCount)
{
	this->txEventsCount = txEventsCount;
}

int
Neo4jCaptureDataChange_meta::getTxId()
{
	return txId;
}

void
Neo4jCaptureDataChange_meta::setTxId(int  txId)
{
	this->txId = txId;
}

std::string
Neo4jCaptureDataChange_meta::getUsername()
{
	return username;
}

void
Neo4jCaptureDataChange_meta::setUsername(std::string  username)
{
	this->username = username;
}


