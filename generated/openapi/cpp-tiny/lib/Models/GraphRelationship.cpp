

#include "GraphRelationship.h"

using namespace Tiny;

GraphRelationship::GraphRelationship()
{
	id = std::string();
	source = std::string();
	specversion = std::string();
	type = std::string();
	datacontenttype = std::string();
	dataschema = std::string();
	subject = std::string();
	time = std::string();
	data = GraphRelationship_allOf_data();
	data_base64 = std::string();
}

GraphRelationship::GraphRelationship(std::string jsonString)
{
	this->fromJson(jsonString);
}

GraphRelationship::~GraphRelationship()
{

}

void
GraphRelationship::fromJson(std::string jsonObj)
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




        GraphRelationship_allOf_data* obj = &data;
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
GraphRelationship::toJson()
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


