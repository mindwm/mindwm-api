#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ClipboardPayload_context.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ClipboardPayload_context::ClipboardPayload_context()
{
	//__init();
}

ClipboardPayload_context::~ClipboardPayload_context()
{
	//__cleanup();
}

void
ClipboardPayload_context::__init()
{
	//window = std::string();
}

void
ClipboardPayload_context::__cleanup()
{
	//if(window != NULL) {
	//
	//delete window;
	//window = NULL;
	//}
	//
}

void
ClipboardPayload_context::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *windowKey = "window";
	node = json_object_get_member(pJsonObject, windowKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&window, node, "std::string", "");
		} else {
			
		}
	}
}

ClipboardPayload_context::ClipboardPayload_context(char* json)
{
	this->fromJson(json);
}

char*
ClipboardPayload_context::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getWindow();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *windowKey = "window";
	json_object_set_member(pJsonObject, windowKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ClipboardPayload_context::getWindow()
{
	return window;
}

void
ClipboardPayload_context::setWindow(std::string  window)
{
	this->window = window;
}


