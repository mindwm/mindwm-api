

#include "GraphNode.h"

using namespace Tiny;

GraphNode::GraphNode()
{
	id = std::string();
	source = std::string();
	specversion = std::string();
	type = std::string();
	datacontenttype = std::string();
	dataschema = std::string();
	subject = std::string();
	time = std::string();
	data = GraphNode_allOf_data();
	data_base64 = std::string();
}

GraphNode::GraphNode(std::string jsonString)
{
	this->fromJson(jsonString);
}

GraphNode::~GraphNode()
{

}

void
GraphNode::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *sourceKey = "source";

    if(object.has_key(sourceKey))
    {
        bourne::json value = object[sourceKey];



        jsonToValue(&source, value, "std::string");


    }

    const char *specversionKey = "specversion";

    if(object.has_key(specversionKey))
    {
        bourne::json value = object[specversionKey];



        jsonToValue(&specversion, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *datacontenttypeKey = "datacontenttype";

    if(object.has_key(datacontenttypeKey))
    {
        bourne::json value = object[datacontenttypeKey];



        jsonToValue(&datacontenttype, value, "std::string");


    }

    const char *dataschemaKey = "dataschema";

    if(object.has_key(dataschemaKey))
    {
        bourne::json value = object[dataschemaKey];



        jsonToValue(&dataschema, value, "std::string");


    }

    const char *subjectKey = "subject";

    if(object.has_key(subjectKey))
    {
        bourne::json value = object[subjectKey];



        jsonToValue(&subject, value, "std::string");


    }

    const char *timeKey = "time";

    if(object.has_key(timeKey))
    {
        bourne::json value = object[timeKey];



        jsonToValue(&time, value, "std::string");


    }

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        GraphNode_allOf_data* obj = &data;
		obj->fromJson(value.dump());

    }

    const char *data_base64Key = "data_base64";

    if(object.has_key(data_base64Key))
    {
        bourne::json value = object[data_base64Key];



        jsonToValue(&data_base64, value, "std::string");


    }


}

bourne::json
GraphNode::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["source"] = getSource();






    object["specversion"] = getSpecversion();






    object["type"] = getType();






    object["datacontenttype"] = getDatacontenttype();






    object["dataschema"] = getDataschema();






    object["subject"] = getSubject();






    object["time"] = getTime();







	object["data"] = getData().toJson();





    object["data_base64"] = getDataBase64();



    return object;

}

std::string
GraphNode::getId()
{
	return id;
}

void
GraphNode::setId(std::string  id)
{
	this->id = id;
}

std::string
GraphNode::getSource()
{
	return source;
}

void
GraphNode::setSource(std::string  source)
{
	this->source = source;
}

std::string
GraphNode::getSpecversion()
{
	return specversion;
}

void
GraphNode::setSpecversion(std::string  specversion)
{
	this->specversion = specversion;
}

std::string
GraphNode::getType()
{
	return type;
}

void
GraphNode::setType(std::string  type)
{
	this->type = type;
}

std::string
GraphNode::getDatacontenttype()
{
	return datacontenttype;
}

void
GraphNode::setDatacontenttype(std::string  datacontenttype)
{
	this->datacontenttype = datacontenttype;
}

std::string
GraphNode::getDataschema()
{
	return dataschema;
}

void
GraphNode::setDataschema(std::string  dataschema)
{
	this->dataschema = dataschema;
}

std::string
GraphNode::getSubject()
{
	return subject;
}

void
GraphNode::setSubject(std::string  subject)
{
	this->subject = subject;
}

std::string
GraphNode::getTime()
{
	return time;
}

void
GraphNode::setTime(std::string  time)
{
	this->time = time;
}

GraphNode_allOf_data
GraphNode::getData()
{
	return data;
}

void
GraphNode::setData(GraphNode_allOf_data  data)
{
	this->data = data;
}

std::string
GraphNode::getDataBase64()
{
	return data_base64;
}

void
GraphNode::setDataBase64(std::string  data_base64)
{
	this->data_base64 = data_base64;
}



