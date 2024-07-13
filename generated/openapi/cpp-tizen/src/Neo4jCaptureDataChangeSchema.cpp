#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Neo4jCaptureDataChange_schema.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Neo4jCaptureDataChange_schema::Neo4jCaptureDataChange_schema()
{
	//__init();
}

Neo4jCaptureDataChange_schema::~Neo4jCaptureDataChange_schema()
{
	//__cleanup();
}

void
Neo4jCaptureDataChange_schema::__init()
{
	//new std::map()std::map> constraints;
	//new std::map()std::map> properties;
}

void
Neo4jCaptureDataChange_schema::__cleanup()
{
	//if(constraints != NULL) {
	//constraints.RemoveAll(true);
	//delete constraints;
	//constraints = NULL;
	//}
	//if(properties != NULL) {
	//properties.RemoveAll(true);
	//delete properties;
	//properties = NULL;
	//}
	//
}

void
Neo4jCaptureDataChange_schema::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *constraintsKey = "constraints";
	node = json_object_get_member(pJsonObject, constraintsKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			constraints = new_map;
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

Neo4jCaptureDataChange_schema::Neo4jCaptureDataChange_schema(char* json)
{
	this->fromJson(json);
}

char*
Neo4jCaptureDataChange_schema::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getConstraints());
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

	const gchar *constraintsKey = "constraints";
	json_object_set_member(pJsonObject, constraintsKey, node);


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

std::map<string, string>
Neo4jCaptureDataChange_schema::getConstraints()
{
	return constraints;
}

void
Neo4jCaptureDataChange_schema::setConstraints(std::map <string, string> constraints)
{
	this->constraints = constraints;
}

std::map<string, string>
Neo4jCaptureDataChange_schema::getProperties()
{
	return properties;
}

void
Neo4jCaptureDataChange_schema::setProperties(std::map <string, string> properties)
{
	this->properties = properties;
}


