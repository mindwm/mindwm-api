#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TmuxPaneIoDocument.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TmuxPaneIoDocument::TmuxPaneIoDocument()
{
	//__init();
}

TmuxPaneIoDocument::~TmuxPaneIoDocument()
{
	//__cleanup();
}

void
TmuxPaneIoDocument::__init()
{
	//input = std::string();
	//output = std::string();
	//ps1 = std::string();
}

void
TmuxPaneIoDocument::__cleanup()
{
	//if(input != NULL) {
	//
	//delete input;
	//input = NULL;
	//}
	//if(output != NULL) {
	//
	//delete output;
	//output = NULL;
	//}
	//if(ps1 != NULL) {
	//
	//delete ps1;
	//ps1 = NULL;
	//}
	//
}

void
TmuxPaneIoDocument::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *inputKey = "input";
	node = json_object_get_member(pJsonObject, inputKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&input, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *outputKey = "output";
	node = json_object_get_member(pJsonObject, outputKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&output, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *ps1Key = "ps1";
	node = json_object_get_member(pJsonObject, ps1Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ps1, node, "std::string", "");
		} else {
			
		}
	}
}

TmuxPaneIoDocument::TmuxPaneIoDocument(char* json)
{
	this->fromJson(json);
}

char*
TmuxPaneIoDocument::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getInput();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *inputKey = "input";
	json_object_set_member(pJsonObject, inputKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOutput();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *outputKey = "output";
	json_object_set_member(pJsonObject, outputKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPs1();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ps1Key = "ps1";
	json_object_set_member(pJsonObject, ps1Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
TmuxPaneIoDocument::getInput()
{
	return input;
}

void
TmuxPaneIoDocument::setInput(std::string  input)
{
	this->input = input;
}

std::string
TmuxPaneIoDocument::getOutput()
{
	return output;
}

void
TmuxPaneIoDocument::setOutput(std::string  output)
{
	this->output = output;
}

std::string
TmuxPaneIoDocument::getPs1()
{
	return ps1;
}

void
TmuxPaneIoDocument::setPs1(std::string  ps1)
{
	this->ps1 = ps1;
}


