#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Neo4jCaptureDataChange_meta_source.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Neo4jCaptureDataChange_meta_source::Neo4jCaptureDataChange_meta_source()
{
	//__init();
}

Neo4jCaptureDataChange_meta_source::~Neo4jCaptureDataChange_meta_source()
{
	//__cleanup();
}

void
Neo4jCaptureDataChange_meta_source::__init()
{
	//hostname = std::string();
}

void
Neo4jCaptureDataChange_meta_source::__cleanup()
{
	//if(hostname != NULL) {
	//
	//delete hostname;
	//hostname = NULL;
	//}
	//
}

void
Neo4jCaptureDataChange_meta_source::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *hostnameKey = "hostname";
	node = json_object_get_member(pJsonObject, hostnameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&hostname, node, "std::string", "");
		} else {
			
		}
	}
}

Neo4jCaptureDataChange_meta_source::Neo4jCaptureDataChange_meta_source(char* json)
{
	this->fromJson(json);
}

char*
Neo4jCaptureDataChange_meta_source::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getHostname();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *hostnameKey = "hostname";
	json_object_set_member(pJsonObject, hostnameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Neo4jCaptureDataChange_meta_source::getHostname()
{
	return hostname;
}

void
Neo4jCaptureDataChange_meta_source::setHostname(std::string  hostname)
{
	this->hostname = hostname;
}


