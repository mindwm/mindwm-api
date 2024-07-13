

#include "Neo4jCaptureDataChangeNodePayload_after.h"

using namespace Tiny;

Neo4jCaptureDataChangeNodePayload_after::Neo4jCaptureDataChangeNodePayload_after()
{
	labels = std::list<std::string>();
	properties = null<AnyType>();
}

Neo4jCaptureDataChangeNodePayload_after::Neo4jCaptureDataChangeNodePayload_after(std::string jsonString)
{
	this->fromJson(jsonString);
}

Neo4jCaptureDataChangeNodePayload_after::~Neo4jCaptureDataChangeNodePayload_after()
{

}

void
Neo4jCaptureDataChangeNodePayload_after::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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

    const char *propertiesKey = "properties";

    if(object.has_key(propertiesKey))
    {
        bourne::json value = object[propertiesKey];


    }


}

bourne::json
Neo4jCaptureDataChangeNodePayload_after::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> labels_list = getLabels();
    bourne::json labels_arr = bourne::json::array();

    for(auto& var : labels_list)
    {
        labels_arr.append(var);
    }
    object["labels"] = labels_arr;









    return object;

}

std::list<std::string>
Neo4jCaptureDataChangeNodePayload_after::getLabels()
{
	return labels;
}

void
Neo4jCaptureDataChangeNodePayload_after::setLabels(std::list <std::string> labels)
{
	this->labels = labels;
}

Map<string, string>
Neo4jCaptureDataChangeNodePayload_after::getProperties()
{
	return properties;
}

void
Neo4jCaptureDataChangeNodePayload_after::setProperties(Map <string, string> properties)
{
	this->properties = properties;
}



