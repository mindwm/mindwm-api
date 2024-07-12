

#include "CloudEvent_data.h"

using namespace Tiny;

CloudEvent_data::CloudEvent_data()
{
}

CloudEvent_data::CloudEvent_data(std::string jsonString)
{
	this->fromJson(jsonString);
}

CloudEvent_data::~CloudEvent_data()
{

}

void
CloudEvent_data::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CloudEvent_data::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



