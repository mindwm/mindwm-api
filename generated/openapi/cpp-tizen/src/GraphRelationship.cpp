#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GraphRelationship.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GraphRelationship::GraphRelationship()
{
	//__init();
}

GraphRelationship::~GraphRelationship()
{
	//__cleanup();
}

void
GraphRelationship::__init()
{
	//id = std::string();
	//source = std::string();
	//specversion = std::string();
	//type = std::string();
	//datacontenttype = std::string();
	//dataschema = std::string();
	//subject = std::string();
	//time = null;
	//data = new GraphRelationship_allOf_data();
	//data_base64 = std::string();
}

void
GraphRelationship::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(source != NULL) {
	//
	//delete source;
	//source = NULL;
	//}
	//if(specversion != NULL) {
	//
	//delete specversion;
	//specversion = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(datacontenttype != NULL) {
	//
	//delete datacontenttype;
	//datacontenttype = NULL;
	//}
	//if(dataschema != NULL) {
	//
	//delete dataschema;
	//dataschema = NULL;
	//}
	//if(subject != NULL) {
	//
	//delete subject;
	//subject = NULL;
	//}
	//if(time != NULL) {
	//
	//delete time;
	//time = NULL;
	//}
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//if(data_base64 != NULL) {
	//
	//delete data_base64;
	//data_base64 = NULL;
	//}
	//
}

void
GraphRelationship::fromJson(char* jsonStr)
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
	const gchar *sourceKey = "source";
	node = json_object_get_member(pJsonObject, sourceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&source, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *specversionKey = "specversion";
	node = json_object_get_member(pJsonObject, specversionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&specversion, node, "std::string", "");
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
	const gchar *datacontenttypeKey = "datacontenttype";
	node = json_object_get_member(pJsonObject, datacontenttypeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&datacontenttype, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dataschemaKey = "dataschema";
	node = json_object_get_member(pJsonObject, dataschemaKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&dataschema, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *subjectKey = "subject";
	node = json_object_get_member(pJsonObject, subjectKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&subject, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *timeKey = "time";
	node = json_object_get_member(pJsonObject, timeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&time, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("GraphRelationship_allOf_data")) {
			jsonToValue(&data, node, "GraphRelationship_allOf_data", "GraphRelationship_allOf_data");
		} else {
			
			GraphRelationship_allOf_data* obj = static_cast<GraphRelationship_allOf_data*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *data_base64Key = "data_base64";
	node = json_object_get_member(pJsonObject, data_base64Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&data_base64, node, "std::string", "");
		} else {
			
		}
	}
}

GraphRelationship::GraphRelationship(char* json)
{
	this->fromJson(json);
}

char*
GraphRelationship::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getSource();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *sourceKey = "source";
	json_object_set_member(pJsonObject, sourceKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSpecversion();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *specversionKey = "specversion";
	json_object_set_member(pJsonObject, specversionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDatacontenttype();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *datacontenttypeKey = "datacontenttype";
	json_object_set_member(pJsonObject, datacontenttypeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDataschema();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dataschemaKey = "dataschema";
	json_object_set_member(pJsonObject, dataschemaKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSubject();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *subjectKey = "subject";
	json_object_set_member(pJsonObject, subjectKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *timeKey = "time";
	json_object_set_member(pJsonObject, timeKey, node);
	if (isprimitive("GraphRelationship_allOf_data")) {
		GraphRelationship_allOf_data obj = getData();
		node = converttoJson(&obj, "GraphRelationship_allOf_data", "");
	}
	else {
		
		GraphRelationship_allOf_data obj = static_cast<GraphRelationship_allOf_data> (getData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDataBase64();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *data_base64Key = "data_base64";
	json_object_set_member(pJsonObject, data_base64Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
GraphRelationship::getId()
{
	return id;
}

void
GraphRelationship::setId(std::string  id)
{
	this->id = id;
}

std::string
GraphRelationship::getSource()
{
	return source;
}

void
GraphRelationship::setSource(std::string  source)
{
	this->source = source;
}

std::string
GraphRelationship::getSpecversion()
{
	return specversion;
}

void
GraphRelationship::setSpecversion(std::string  specversion)
{
	this->specversion = specversion;
}

std::string
GraphRelationship::getType()
{
	return type;
}

void
GraphRelationship::setType(std::string  type)
{
	this->type = type;
}

std::string
GraphRelationship::getDatacontenttype()
{
	return datacontenttype;
}

void
GraphRelationship::setDatacontenttype(std::string  datacontenttype)
{
	this->datacontenttype = datacontenttype;
}

std::string
GraphRelationship::getDataschema()
{
	return dataschema;
}

void
GraphRelationship::setDataschema(std::string  dataschema)
{
	this->dataschema = dataschema;
}

std::string
GraphRelationship::getSubject()
{
	return subject;
}

void
GraphRelationship::setSubject(std::string  subject)
{
	this->subject = subject;
}

std::string
GraphRelationship::getTime()
{
	return time;
}

void
GraphRelationship::setTime(std::string  time)
{
	this->time = time;
}

GraphRelationship_allOf_data
GraphRelationship::getData()
{
	return data;
}

void
GraphRelationship::setData(GraphRelationship_allOf_data  data)
{
	this->data = data;
}

std::string
GraphRelationship::getDataBase64()
{
	return data_base64;
}

void
GraphRelationship::setDataBase64(std::string  data_base64)
{
	this->data_base64 = data_base64;
}


