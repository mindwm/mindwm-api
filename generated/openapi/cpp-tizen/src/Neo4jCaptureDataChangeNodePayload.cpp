#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Neo4jCaptureDataChangeNodePayload.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Neo4jCaptureDataChangeNodePayload::Neo4jCaptureDataChangeNodePayload()
{
	//__init();
}

Neo4jCaptureDataChangeNodePayload::~Neo4jCaptureDataChangeNodePayload()
{
	//__cleanup();
}

void
Neo4jCaptureDataChangeNodePayload::__init()
{
	//after = new Neo4jCaptureDataChangeNodePayload_after();
	//before = std::string();
	//id = std::string();
	//type = std::string();
}

void
Neo4jCaptureDataChangeNodePayload::__cleanup()
{
	//if(after != NULL) {
	//
	//delete after;
	//after = NULL;
	//}
	//if(before != NULL) {
	//
	//delete before;
	//before = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//
}

void
Neo4jCaptureDataChangeNodePayload::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *afterKey = "after";
	node = json_object_get_member(pJsonObject, afterKey);
	if (node !=NULL) {
	

		if (isprimitive("Neo4jCaptureDataChangeNodePayload_after")) {
			jsonToValue(&after, node, "Neo4jCaptureDataChangeNodePayload_after", "Neo4jCaptureDataChangeNodePayload_after");
		} else {
			
			Neo4jCaptureDataChangeNodePayload_after* obj = static_cast<Neo4jCaptureDataChangeNodePayload_after*> (&after);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *beforeKey = "before";
	node = json_object_get_member(pJsonObject, beforeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&before, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
}

Neo4jCaptureDataChangeNodePayload::Neo4jCaptureDataChangeNodePayload(char* json)
{
	this->fromJson(json);
}

char*
Neo4jCaptureDataChangeNodePayload::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Neo4jCaptureDataChangeNodePayload_after")) {
		Neo4jCaptureDataChangeNodePayload_after obj = getAfter();
		node = converttoJson(&obj, "Neo4jCaptureDataChangeNodePayload_after", "");
	}
	else {
		
		Neo4jCaptureDataChangeNodePayload_after obj = static_cast<Neo4jCaptureDataChangeNodePayload_after> (getAfter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *afterKey = "after";
	json_object_set_member(pJsonObject, afterKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBefore();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *beforeKey = "before";
	json_object_set_member(pJsonObject, beforeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Neo4jCaptureDataChangeNodePayload_after
Neo4jCaptureDataChangeNodePayload::getAfter()
{
	return after;
}

void
Neo4jCaptureDataChangeNodePayload::setAfter(Neo4jCaptureDataChangeNodePayload_after  after)
{
	this->after = after;
}

std::string
Neo4jCaptureDataChangeNodePayload::getBefore()
{
	return before;
}

void
Neo4jCaptureDataChangeNodePayload::setBefore(std::string  before)
{
	this->before = before;
}

std::string
Neo4jCaptureDataChangeNodePayload::getId()
{
	return id;
}

void
Neo4jCaptureDataChangeNodePayload::setId(std::string  id)
{
	this->id = id;
}

std::string
Neo4jCaptureDataChangeNodePayload::getType()
{
	return type;
}

void
Neo4jCaptureDataChangeNodePayload::setType(std::string  type)
{
	this->type = type;
}


