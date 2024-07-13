

#include "Neo4jCaptureDataChange_meta_source.h"

using namespace Tiny;

Neo4jCaptureDataChange_meta_source::Neo4jCaptureDataChange_meta_source()
{
	hostname = std::string();
}

Neo4jCaptureDataChange_meta_source::Neo4jCaptureDataChange_meta_source(std::string jsonString)
{
	this->fromJson(jsonString);
}

Neo4jCaptureDataChange_meta_source::~Neo4jCaptureDataChange_meta_source()
{

}

void
Neo4jCaptureDataChange_meta_source::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hostnameKey = "hostname";

    if(object.has_key(hostnameKey))
    {
        bourne::json value = object[hostnameKey];



        jsonToValue(&hostname, value, "std::string");


    }


}

bourne::json
Neo4jCaptureDataChange_meta_source::toJson()
{
    bourne::json object = bourne::json::object();





    object["hostname"] = getHostname();



    return object;

}

std::string
Neo4jCaptureDataChange_meta_source::getHostname()
{
	return hostname;
}

void
Neo4jCaptureDataChange_meta_source::setHostname(std::string  hostname)
{
	this->hostname = hostname;
}



