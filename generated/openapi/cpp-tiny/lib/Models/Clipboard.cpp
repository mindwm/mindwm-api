

#include "Clipboard.h"

using namespace Tiny;

Clipboard::Clipboard()
{
	id = std::string();
	source = std::string();
	specversion = std::string();
	type = std::string();
	datacontenttype = std::string();
	dataschema = std::string();
	subject = std::string();
	time = std::string();
	data = ClipboardPayload();
	data_base64 = std::string();
}

Clipboard::Clipboard(std::string jsonString)
{
	this->fromJson(jsonString);
}

Clipboard::~Clipboard()
{

}

void
Clipboard::fromJson(std::string jsonObj)
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




        ClipboardPayload* obj = &data;
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
Clipboard::toJson()
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
Clipboard::getId()
{
	return id;
}

void
Clipboard::setId(std::string  id)
{
	this->id = id;
}

std::string
Clipboard::getSource()
{
	return source;
}

void
Clipboard::setSource(std::string  source)
{
	this->source = source;
}

std::string
Clipboard::getSpecversion()
{
	return specversion;
}

void
Clipboard::setSpecversion(std::string  specversion)
{
	this->specversion = specversion;
}

std::string
Clipboard::getType()
{
	return type;
}

void
Clipboard::setType(std::string  type)
{
	this->type = type;
}

std::string
Clipboard::getDatacontenttype()
{
	return datacontenttype;
}

void
Clipboard::setDatacontenttype(std::string  datacontenttype)
{
	this->datacontenttype = datacontenttype;
}

std::string
Clipboard::getDataschema()
{
	return dataschema;
}

void
Clipboard::setDataschema(std::string  dataschema)
{
	this->dataschema = dataschema;
}

std::string
Clipboard::getSubject()
{
	return subject;
}

void
Clipboard::setSubject(std::string  subject)
{
	this->subject = subject;
}

std::string
Clipboard::getTime()
{
	return time;
}

void
Clipboard::setTime(std::string  time)
{
	this->time = time;
}

ClipboardPayload
Clipboard::getData()
{
	return data;
}

void
Clipboard::setData(ClipboardPayload  data)
{
	this->data = data;
}

std::string
Clipboard::getDataBase64()
{
	return data_base64;
}

void
Clipboard::setDataBase64(std::string  data_base64)
{
	this->data_base64 = data_base64;
}



