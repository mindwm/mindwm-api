#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Neo4jCaptureDataChangeNodePayload_after.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Neo4jCaptureDataChangeNodePayload_after::Neo4jCaptureDataChangeNodePayload_after()
{
	//__init();
}

Neo4jCaptureDataChangeNodePayload_after::~Neo4jCaptureDataChangeNodePayload_after()
{
	//__cleanup();
}

void
Neo4jCaptureDataChangeNodePayload_after::__init()
{
	//new std::list()std::list> labels;
	//new std::map()std::map> properties;
}

void
Neo4jCaptureDataChangeNodePayload_after::__cleanup()
{
	//if(labels != NULL) {
	//labels.RemoveAll(true);
	//delete labels;
	//labels = NULL;
	//}
	//if(properties != NULL) {
	//properties.RemoveAll(true);
	//delete properties;
	//properties = NULL;
	//}
	//
}

void
Neo4jCaptureDataChangeNodePayload_after::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *labelsKey = "labels";
	node = json_object_get_member(pJsonObject, labelsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			labels = new_list;
		}
		
	}
	const gchar *propertiesKey = "properties";
	node = json_object_get_member(pJsonObject, propertiesKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			properties = new_map;
		}
		
	}
}

Neo4jCaptureDataChangeNodePayload_after::Neo4jCaptureDataChangeNodePayload_after(char* json)
{
	this->fromJson(json);
}

char*
Neo4jCaptureDataChangeNodePayload_after::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getLabels());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getLabels());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *labelsKey = "labels";
	json_object_set_member(pJsonObject, labelsKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getProperties());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *propertiesKey = "properties";
	json_object_set_member(pJsonObject, propertiesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
Neo4jCaptureDataChangeNodePayload_after::getLabels()
{
	return labels;
}

void
Neo4jCaptureDataChangeNodePayload_after::setLabels(std::list <std::string> labels)
{
	this->labels = labels;
}

std::map<string, string>
Neo4jCaptureDataChangeNodePayload_after::getProperties()
{
	return properties;
}

void
Neo4jCaptureDataChangeNodePayload_after::setProperties(std::map <string, string> properties)
{
	this->properties = properties;
}


