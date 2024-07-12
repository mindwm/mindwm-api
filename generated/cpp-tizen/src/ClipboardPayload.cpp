#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ClipboardPayload.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ClipboardPayload::ClipboardPayload()
{
	//__init();
}

ClipboardPayload::~ClipboardPayload()
{
	//__cleanup();
}

void
ClipboardPayload::__init()
{
	//new std::list()std::list> start;
	//new std::list()std::list> stop;
	//data = std::string();
	//type = std::string();
	//context = new ClipboardPayload_context();
}

void
ClipboardPayload::__cleanup()
{
	//if(start != NULL) {
	//start.RemoveAll(true);
	//delete start;
	//start = NULL;
	//}
	//if(stop != NULL) {
	//stop.RemoveAll(true);
	//delete stop;
	//stop = NULL;
	//}
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(context != NULL) {
	//
	//delete context;
	//context = NULL;
	//}
	//
}

void
ClipboardPayload::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *startKey = "start";
	node = json_object_get_member(pJsonObject, startKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<int> new_list;
			int inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("int")) {
					jsonToValue(&inst, temp_json, "int", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			start = new_list;
		}
		
	}
	const gchar *stopKey = "stop";
	node = json_object_get_member(pJsonObject, stopKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<int> new_list;
			int inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("int")) {
					jsonToValue(&inst, temp_json, "int", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			stop = new_list;
		}
		
	}
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&data, node, "std::string", "");
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
	const gchar *contextKey = "context";
	node = json_object_get_member(pJsonObject, contextKey);
	if (node !=NULL) {
	

		if (isprimitive("ClipboardPayload_context")) {
			jsonToValue(&context, node, "ClipboardPayload_context", "ClipboardPayload_context");
		} else {
			
			ClipboardPayload_context* obj = static_cast<ClipboardPayload_context*> (&context);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ClipboardPayload::ClipboardPayload(char* json)
{
	this->fromJson(json);
}

char*
ClipboardPayload::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		list<int> new_list = static_cast<list <int> > (getStart());
		node = converttoJson(&new_list, "int", "array");
	} else {
		node = json_node_alloc();
		list<int> new_list = static_cast<list <int> > (getStart());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *startKey = "start";
	json_object_set_member(pJsonObject, startKey, node);
	if (isprimitive("int")) {
		list<int> new_list = static_cast<list <int> > (getStop());
		node = converttoJson(&new_list, "int", "array");
	} else {
		node = json_node_alloc();
		list<int> new_list = static_cast<list <int> > (getStop());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *stopKey = "stop";
	json_object_set_member(pJsonObject, stopKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getData();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("ClipboardPayload_context")) {
		ClipboardPayload_context obj = getContext();
		node = converttoJson(&obj, "ClipboardPayload_context", "");
	}
	else {
		
		ClipboardPayload_context obj = static_cast<ClipboardPayload_context> (getContext());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *contextKey = "context";
	json_object_set_member(pJsonObject, contextKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<int>
ClipboardPayload::getStart()
{
	return start;
}

void
ClipboardPayload::setStart(std::list <int> start)
{
	this->start = start;
}

std::list<int>
ClipboardPayload::getStop()
{
	return stop;
}

void
ClipboardPayload::setStop(std::list <int> stop)
{
	this->stop = stop;
}

std::string
ClipboardPayload::getData()
{
	return data;
}

void
ClipboardPayload::setData(std::string  data)
{
	this->data = data;
}

std::string
ClipboardPayload::getType()
{
	return type;
}

void
ClipboardPayload::setType(std::string  type)
{
	this->type = type;
}

ClipboardPayload_context
ClipboardPayload::getContext()
{
	return context;
}

void
ClipboardPayload::setContext(ClipboardPayload_context  context)
{
	this->context = context;
}


