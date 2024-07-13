

#include "Neo4jCaptureDataChange_payload.h"

using namespace Tiny;

Neo4jCaptureDataChange_payload::Neo4jCaptureDataChange_payload()
{
	after = null;
	before = std::string();
	id = std::string();
	type = std::string();
	end = Neo4jCaptureDataChangeRelationshipPayload_end();
	label = std::string();
	start = Neo4jCaptureDataChangeRelationshipPayload_end();
}

Neo4jCaptureDataChange_payload::Neo4jCaptureDataChange_payload(std::string jsonString)
{
	this->fromJson(jsonString);
}

Neo4jCaptureDataChange_payload::~Neo4jCaptureDataChange_payload()
{

}

void
Neo4jCaptureDataChange_payload::fromJson(std::string jsonObj)
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

    const char *endKey = "end";

    if(object.has_key(endKey))
    {
        bourne::json value = object[endKey];




        Neo4jCaptureDataChangeRelationshipPayload_end* obj = &end;
		obj->fromJson(value.dump());

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


}

bourne::json
Neo4jCaptureDataChange_payload::toJson()
{
    bourne::json object = bourne::json::object();






	object["after"] = getAfter().toJson();





    object["before"] = getBefore();






    object["id"] = getId();






    object["type"] = getType();







	object["end"] = getEnd().toJson();





    object["label"] = getLabel();







	object["start"] = getStart().toJson();


    return object;

}

Object
Neo4jCaptureDataChange_payload::getAfter()
{
	return after;
}

void
Neo4jCaptureDataChange_payload::setAfter(Object  after)
{
	this->after = after;
}

std::string
Neo4jCaptureDataChange_payload::getBefore()
{
	return before;
}

void
Neo4jCaptureDataChange_payload::setBefore(std::string  before)
{
	this->before = before;
}

std::string
Neo4jCaptureDataChange_payload::getId()
{
	return id;
}

void
Neo4jCaptureDataChange_payload::setId(std::string  id)
{
	this->id = id;
}

std::string
Neo4jCaptureDataChange_payload::getType()
{
	return type;
}

void
Neo4jCaptureDataChange_payload::setType(std::string  type)
{
	this->type = type;
}

Neo4jCaptureDataChangeRelationshipPayload_end
Neo4jCaptureDataChange_payload::getEnd()
{
	return end;
}

void
Neo4jCaptureDataChange_payload::setEnd(Neo4jCaptureDataChangeRelationshipPayload_end  end)
{
	this->end = end;
}

std::string
Neo4jCaptureDataChange_payload::getLabel()
{
	return label;
}

void
Neo4jCaptureDataChange_payload::setLabel(std::string  label)
{
	this->label = label;
}

Neo4jCaptureDataChangeRelationshipPayload_end
Neo4jCaptureDataChange_payload::getStart()
{
	return start;
}

void
Neo4jCaptureDataChange_payload::setStart(Neo4jCaptureDataChangeRelationshipPayload_end  start)
{
	this->start = start;
}



