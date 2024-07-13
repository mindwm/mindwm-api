

#include "Neo4jCaptureDataChangeRelationshipPayload.h"

using namespace Tiny;

Neo4jCaptureDataChangeRelationshipPayload::Neo4jCaptureDataChangeRelationshipPayload()
{
	after = null;
	before = std::string();
	end = Neo4jCaptureDataChangeRelationshipPayload_end();
	id = std::string();
	label = std::string();
	start = Neo4jCaptureDataChangeRelationshipPayload_end();
	type = std::string();
}

Neo4jCaptureDataChangeRelationshipPayload::Neo4jCaptureDataChangeRelationshipPayload(std::string jsonString)
{
	this->fromJson(jsonString);
}

Neo4jCaptureDataChangeRelationshipPayload::~Neo4jCaptureDataChangeRelationshipPayload()
{

}

void
Neo4jCaptureDataChangeRelationshipPayload::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *afterKey = "after";

    if(object.has_key(afterKey))
    {
        bourne::json value = object[afterKey];




        Object* obj = &after;
		obj->fromJson(value.dump());

    }

    const char *beforeKey = "before";

    if(object.has_key(beforeKey))
    {
        bourne::json value = object[beforeKey];



        jsonToValue(&before, value, "std::string");


    }

    const char *endKey = "end";

    if(object.has_key(endKey))
    {
        bourne::json value = object[endKey];




        Neo4jCaptureDataChangeRelationshipPayload_end* obj = &end;
		obj->fromJson(value.dump());

    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *labelKey = "label";

    if(object.has_key(labelKey))
    {
        bourne::json value = object[labelKey];



        jsonToValue(&label, value, "std::string");


    }

    const char *startKey = "start";

    if(object.has_key(startKey))
    {
        bourne::json value = object[startKey];




        Neo4jCaptureDataChangeRelationshipPayload_end* obj = &start;
		obj->fromJson(value.dump());

    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }


}

bourne::json
Neo4jCaptureDataChangeRelationshipPayload::toJson()
{
    bourne::json object = bourne::json::object();






	object["after"] = getAfter().toJson();





    object["before"] = getBefore();







	object["end"] = getEnd().toJson();





    object["id"] = getId();






    object["label"] = getLabel();







	object["start"] = getStart().toJson();





    object["type"] = getType();



    return object;

}

Object
Neo4jCaptureDataChangeRelationshipPayload::getAfter()
{
	return after;
}

void
Neo4jCaptureDataChangeRelationshipPayload::setAfter(Object  after)
{
	this->after = after;
}

std::string
Neo4jCaptureDataChangeRelationshipPayload::getBefore()
{
	return before;
}

void
Neo4jCaptureDataChangeRelationshipPayload::setBefore(std::string  before)
{
	this->before = before;
}

Neo4jCaptureDataChangeRelationshipPayload_end
Neo4jCaptureDataChangeRelationshipPayload::getEnd()
{
	return end;
}

void
Neo4jCaptureDataChangeRelationshipPayload::setEnd(Neo4jCaptureDataChangeRelationshipPayload_end  end)
{
	this->end = end;
}

std::string
Neo4jCaptureDataChangeRelationshipPayload::getId()
{
	return id;
}

void
Neo4jCaptureDataChangeRelationshipPayload::setId(std::string  id)
{
	this->id = id;
}

std::string
Neo4jCaptureDataChangeRelationshipPayload::getLabel()
{
	return label;
}

void
Neo4jCaptureDataChangeRelationshipPayload::setLabel(std::string  label)
{
	this->label = label;
}

Neo4jCaptureDataChangeRelationshipPayload_end
Neo4jCaptureDataChangeRelationshipPayload::getStart()
{
	return start;
}

void
Neo4jCaptureDataChangeRelationshipPayload::setStart(Neo4jCaptureDataChangeRelationshipPayload_end  start)
{
	this->start = start;
}

std::string
Neo4jCaptureDataChangeRelationshipPayload::getType()
{
	return type;
}

void
Neo4jCaptureDataChangeRelationshipPayload::setType(std::string  type)
{
	this->type = type;
}



