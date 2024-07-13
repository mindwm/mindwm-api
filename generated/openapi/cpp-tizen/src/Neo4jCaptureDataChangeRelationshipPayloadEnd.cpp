#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Neo4jCaptureDataChangeRelationshipPayload_end.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Neo4jCaptureDataChangeRelationshipPayload_end::Neo4jCaptureDataChangeRelationshipPayload_end()
{
	//__init();
}

Neo4jCaptureDataChangeRelationshipPayload_end::~Neo4jCaptureDataChangeRelationshipPayload_end()
{
	//__cleanup();
}

void
Neo4jCaptureDataChangeRelationshipPayload_end::__init()
{
	//id = std::string();
	//new std::map()std::map> ids;
	//new std::list()std::list> labels;
}

void
Neo4jCaptureDataChangeRelationshipPayload_end::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(ids != NULL) {
	//ids.RemoveAll(true);
	//delete ids;
	//ids = NULL;
	//}
	//if(labels != NULL) {
	//labels.RemoveAll(true);
	//delete labels;
	//labels = NULL;
	//}
	//
}

void
Neo4jCaptureDataChangeRelationshipPayload_end::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *idsKey = "ids";
	node = json_object_get_member(pJsonObject, idsKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			ids = new_map;
		}
		
	}
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
}

Neo4jCaptureDataChangeRelationshipPayload_end::Neo4jCaptureDataChangeRelationshipPayload_end(char* json)
{
	this->fromJson(json);
}

char*
Neo4jCaptureDataChangeRelationshipPayload_end::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getIds());
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

	const gchar *idsKey = "ids";
	json_object_set_member(pJsonObject, idsKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Neo4jCaptureDataChangeRelationshipPayload_end::getId()
{
	return id;
}

void
Neo4jCaptureDataChangeRelationshipPayload_end::setId(std::string  id)
{
	this->id = id;
}

std::map<string, string>
Neo4jCaptureDataChangeRelationshipPayload_end::getIds()
{
	return ids;
}

void
Neo4jCaptureDataChangeRelationshipPayload_end::setIds(std::map <string, string> ids)
{
	this->ids = ids;
}

std::list<std::string>
Neo4jCaptureDataChangeRelationshipPayload_end::getLabels()
{
	return labels;
}

void
Neo4jCaptureDataChangeRelationshipPayload_end::setLabels(std::list <std::string> labels)
{
	this->labels = labels;
}


