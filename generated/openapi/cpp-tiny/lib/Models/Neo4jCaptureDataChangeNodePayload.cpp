

#include "Neo4jCaptureDataChangeNodePayload.h"

using namespace Tiny;

Neo4jCaptureDataChangeNodePayload::Neo4jCaptureDataChangeNodePayload()
{
	after = Neo4jCaptureDataChangeNodePayload_after();
	before = std::string();
	id = std::string();
	type = std::string();
}

Neo4jCaptureDataChangeNodePayload::Neo4jCaptureDataChangeNodePayload(std::string jsonString)
{
	this->fromJson(jsonString);
}

Neo4jCaptureDataChangeNodePayload::~Neo4jCaptureDataChangeNodePayload()
{

}

void
Neo4jCaptureDataChangeNodePayload::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *afterKey = "after";

    if(object.has_key(afterKey))
    {
        bourne::json value = object[afterKey];




        Neo4jCaptureDataChangeNodePayload_after* obj = &after;
		obj->fromJson(value.dump());

    }

    const char *beforeKey = "before";

    if(object.has_key(beforeKey))
    {
        bourne::json value = object[beforeKey];



        jsonToValue(&before, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }


}

bourne::json
Neo4jCaptureDataChangeNodePayload::toJson()
{
    bourne::json object = bourne::json::object();






	object["after"] = getAfter().toJson();





    object["before"] = getBefore();






    object["id"] = getId();






    object["type"] = getType();



    return object;

}

Neo4jCaptureDataChangeNodePayload_after
Neo4jCaptureDataChangeNodePayload::getAfter()
{
	return after;
}

void
Neo4jCaptureDataChangeNodePayload::setAfter(Neo4jCaptureDataChangeNodePayload_after  after)
{
	this->after = after;
}

std::string
Neo4jCaptureDataChangeNodePayload::getBefore()
{
	return before;
}

void
Neo4jCaptureDataChangeNodePayload::setBefore(std::string  before)
{
	this->before = before;
}

std::string
Neo4jCaptureDataChangeNodePayload::getId()
{
	return id;
}

void
Neo4jCaptureDataChangeNodePayload::setId(std::string  id)
{
	this->id = id;
}

std::string
Neo4jCaptureDataChangeNodePayload::getType()
{
	return type;
}

void
Neo4jCaptureDataChangeNodePayload::setType(std::string  type)
{
	this->type = type;
}



