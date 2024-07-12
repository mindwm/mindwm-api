#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "IoDocument.h"

using namespace std;
using namespace Tizen::ArtikCloud;

IoDocument::IoDocument()
{
	//__init();
}

IoDocument::~IoDocument()
{
	//__cleanup();
}

void
IoDocument::__init()
{
	//type = std::string();
	//source = std::string();
	//data = new TmuxPaneIoDocument();
	//id = std::string();
	//specversion = std::string();
	//datacontenttype = std::string();
	//dataschema = std::string();
	//subject = std::string();
	//time = null;
	//data_base64 = std::string();
}

void
IoDocument::__cleanup()
{
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(source != NULL) {
	//
	//delete source;
	//source = NULL;
	//}
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(specversion != NULL) {
	//
	//delete specversion;
	//specversion = NULL;
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
	//if(data_base64 != NULL) {
	//
	//delete data_base64;
	//data_base64 = NULL;
	//}
	//
}

void
IoDocument::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
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
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("TmuxPaneIoDocument")) {
			jsonToValue(&data, node, "TmuxPaneIoDocument", "TmuxPaneIoDocument");
		} else {
			
			TmuxPaneIoDocument* obj = static_cast<TmuxPaneIoDocument*> (&data);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *specversionKey = "specversion";
	node = json_object_get_member(pJsonObject, specversionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&specversion, node, "std::string", "");
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
	const gchar *data_base64Key = "data_base64";
	node = json_object_get_member(pJsonObject, data_base64Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&data_base64, node, "std::string", "");
		} else {
			
		}
	}
}

IoDocument::IoDocument(char* json)
{
	this->fromJson(json);
}

char*
IoDocument::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSource();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *sourceKey = "source";
	json_object_set_member(pJsonObject, sourceKey, node);
	if (isprimitive("TmuxPaneIoDocument")) {
		TmuxPaneIoDocument obj = getData();
		node = converttoJson(&obj, "TmuxPaneIoDocument", "");
	}
	else {
		
		TmuxPaneIoDocument obj = static_cast<TmuxPaneIoDocument> (getData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSpecversion();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *specversionKey = "specversion";
	json_object_set_member(pJsonObject, specversionKey, node);
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
IoDocument::getType()
{
	return type;
}

void
IoDocument::setType(std::string  type)
{
	this->type = type;
}

std::string
IoDocument::getSource()
{
	return source;
}

void
IoDocument::setSource(std::string  source)
{
	this->source = source;
}

TmuxPaneIoDocument
IoDocument::getData()
{
	return data;
}

void
IoDocument::setData(TmuxPaneIoDocument  data)
{
	this->data = data;
}

std::string
IoDocument::getId()
{
	return id;
}

void
IoDocument::setId(std::string  id)
{
	this->id = id;
}

std::string
IoDocument::getSpecversion()
{
	return specversion;
}

void
IoDocument::setSpecversion(std::string  specversion)
{
	this->specversion = specversion;
}

std::string
IoDocument::getDatacontenttype()
{
	return datacontenttype;
}

void
IoDocument::setDatacontenttype(std::string  datacontenttype)
{
	this->datacontenttype = datacontenttype;
}

std::string
IoDocument::getDataschema()
{
	return dataschema;
}

void
IoDocument::setDataschema(std::string  dataschema)
{
	this->dataschema = dataschema;
}

std::string
IoDocument::getSubject()
{
	return subject;
}

void
IoDocument::setSubject(std::string  subject)
{
	this->subject = subject;
}

std::string
IoDocument::getTime()
{
	return time;
}

void
IoDocument::setTime(std::string  time)
{
	this->time = time;
}

std::string
IoDocument::getDataBase64()
{
	return data_base64;
}

void
IoDocument::setDataBase64(std::string  data_base64)
{
	this->data_base64 = data_base64;
}


