

#include "Neo4jCaptureDataChangeRelationshipPayload_end.h"

using namespace Tiny;

Neo4jCaptureDataChangeRelationshipPayload_end::Neo4jCaptureDataChangeRelationshipPayload_end()
{
	id = std::string();
	ids = null<AnyType>();
	labels = std::list<std::string>();
}

Neo4jCaptureDataChangeRelationshipPayload_end::Neo4jCaptureDataChangeRelationshipPayload_end(std::string jsonString)
{
	this->fromJson(jsonString);
}

Neo4jCaptureDataChangeRelationshipPayload_end::~Neo4jCaptureDataChangeRelationshipPayload_end()
{

}

void
Neo4jCaptureDataChangeRelationshipPayload_end::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *idsKey = "ids";

    if(object.has_key(idsKey))
    {
        bourne::json value = object[idsKey];


    }

    const char *labelsKey = "labels";

    if(object.has_key(labelsKey))
    {
        bourne::json value = object[labelsKey];


        std::list<std::string> labels_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            labels_list.push_back(element);
        }
        labels = labels_list;


    }


}

bourne::json
Neo4jCaptureDataChangeRelationshipPayload_end::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();








    std::list<std::string> labels_list = getLabels();
    bourne::json labels_arr = bourne::json::array();

    for(auto& var : labels_list)
    {
        labels_arr.append(var);
    }
    object["labels"] = labels_arr;






    return object;

}

std::string
Neo4jCaptureDataChangeRelationshipPayload_end::getId()
{
	return id;
}

void
Neo4jCaptureDataChangeRelationshipPayload_end::setId(std::string  id)
{
	this->id = id;
}

Map<string, string>
Neo4jCaptureDataChangeRelationshipPayload_end::getIds()
{
	return ids;
}

void
Neo4jCaptureDataChangeRelationshipPayload_end::setIds(Map <string, string> ids)
{
	this->ids = ids;
}

std::list<std::string>
Neo4jCaptureDataChangeRelationshipPayload_end::getLabels()
{
	return labels;
}

void
Neo4jCaptureDataChangeRelationshipPayload_end::setLabels(std::list <std::string> labels)
{
	this->labels = labels;
}



