#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Neo4jCaptureDataChange_payload.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Neo4jCaptureDataChange_payload::Neo4jCaptureDataChange_payload()
{
	//__init();
}

Neo4jCaptureDataChange_payload::~Neo4jCaptureDataChange_payload()
{
	//__cleanup();
}

void
Neo4jCaptureDataChange_payload::__init()
{
	//after = null;
	//before = std::string();
	//id = std::string();
	//type = std::string();
	//end = new Neo4jCaptureDataChangeRelationshipPayload_end();
	//label = std::string();
	//start = new Neo4jCaptureDataChangeRelationshipPayload_end();
}

void
Neo4jCaptureDataChange_payload::__cleanup()
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
	//if(end != NULL) {
	//
	//delete end;
	//end = NULL;
	//}
	//if(label != NULL) {
	//
	//delete label;
	//label = NULL;
	//}
	//if(start != NULL) {
	//
	//delete start;
	//start = NULL;
	//}
	//
}

void
Neo4jCaptureDataChange_payload::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *afterKey = "after";
	node = json_object_get_member(pJsonObject, afterKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&after, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&after);
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
	const gchar *endKey = "end";
	node = json_object_get_member(pJsonObject, endKey);
	if (node !=NULL) {
	

		if (isprimitive("Neo4jCaptureDataChangeRelationshipPayload_end")) {
			jsonToValue(&end, node, "Neo4jCaptureDataChangeRelationshipPayload_end", "Neo4jCaptureDataChangeRelationshipPayload_end");
		} else {
			
			Neo4jCaptureDataChangeRelationshipPayload_end* obj = static_cast<Neo4jCaptureDataChangeRelationshipPayload_end*> (&end);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *labelKey = "label";
	node = json_object_get_member(pJsonObject, labelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&label, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *startKey = "start";
	node = json_object_get_member(pJsonObject, startKey);
	if (node !=NULL) {
	

		if (isprimitive("Neo4jCaptureDataChangeRelationshipPayload_end")) {
			jsonToValue(&start, node, "Neo4jCaptureDataChangeRelationshipPayload_end", "Neo4jCaptureDataChangeRelationshipPayload_end");
		} else {
			
			Neo4jCaptureDataChangeRelationshipPayload_end* obj = static_cast<Neo4jCaptureDataChangeRelationshipPayload_end*> (&start);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Neo4jCaptureDataChange_payload::Neo4jCaptureDataChange_payload(char* json)
{
	this->fromJson(json);
}

char*
Neo4jCaptureDataChange_payload::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAfter();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getAfter());
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
	if (isprimitive("Neo4jCaptureDataChangeRelationshipPayload_end")) {
		Neo4jCaptureDataChangeRelationshipPayload_end obj = getEnd();
		node = converttoJson(&obj, "Neo4jCaptureDataChangeRelationshipPayload_end", "");
	}
	else {
		
		Neo4jCaptureDataChangeRelationshipPayload_end obj = static_cast<Neo4jCaptureDataChangeRelationshipPayload_end> (getEnd());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *endKey = "end";
	json_object_set_member(pJsonObject, endKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLabel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *labelKey = "label";
	json_object_set_member(pJsonObject, labelKey, node);
	if (isprimitive("Neo4jCaptureDataChangeRelationshipPayload_end")) {
		Neo4jCaptureDataChangeRelationshipPayload_end obj = getStart();
		node = converttoJson(&obj, "Neo4jCaptureDataChangeRelationshipPayload_end", "");
	}
	else {
		
		Neo4jCaptureDataChangeRelationshipPayload_end obj = static_cast<Neo4jCaptureDataChangeRelationshipPayload_end> (getStart());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *startKey = "start";
	json_object_set_member(pJsonObject, startKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Neo4jCaptureDataChange_payload::getAfter()
{
	return after;
}

void
Neo4jCaptureDataChange_payload::setAfter(std::string  after)
{
	this->after = after;
}

std::string
Neo4jCaptureDataChange_payload::getBefore()
{
	return before;
}

void
Neo4jCaptureDataChange_payload::setBefore(std::string  before)
{
	this->before = before;
}

std::string
Neo4jCaptureDataChange_payload::getId()
{
	return id;
}

void
Neo4jCaptureDataChange_payload::setId(std::string  id)
{
	this->id = id;
}

std::string
Neo4jCaptureDataChange_payload::getType()
{
	return type;
}

void
Neo4jCaptureDataChange_payload::setType(std::string  type)
{
	this->type = type;
}

Neo4jCaptureDataChangeRelationshipPayload_end
Neo4jCaptureDataChange_payload::getEnd()
{
	return end;
}

void
Neo4jCaptureDataChange_payload::setEnd(Neo4jCaptureDataChangeRelationshipPayload_end  end)
{
	this->end = end;
}

std::string
Neo4jCaptureDataChange_payload::getLabel()
{
	return label;
}

void
Neo4jCaptureDataChange_payload::setLabel(std::string  label)
{
	this->label = label;
}

Neo4jCaptureDataChangeRelationshipPayload_end
Neo4jCaptureDataChange_payload::getStart()
{
	return start;
}

void
Neo4jCaptureDataChange_payload::setStart(Neo4jCaptureDataChangeRelationshipPayload_end  start)
{
	this->start = start;
}


