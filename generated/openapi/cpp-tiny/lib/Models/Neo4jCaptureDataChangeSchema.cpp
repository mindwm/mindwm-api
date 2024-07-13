

#include "Neo4jCaptureDataChange_schema.h"

using namespace Tiny;

Neo4jCaptureDataChange_schema::Neo4jCaptureDataChange_schema()
{
	constraints = null<AnyType>();
	properties = null<AnyType>();
}

Neo4jCaptureDataChange_schema::Neo4jCaptureDataChange_schema(std::string jsonString)
{
	this->fromJson(jsonString);
}

Neo4jCaptureDataChange_schema::~Neo4jCaptureDataChange_schema()
{

}

void
Neo4jCaptureDataChange_schema::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *constraintsKey = "constraints";

    if(object.has_key(constraintsKey))
    {
        bourne::json value = object[constraintsKey];


    }

    const char *propertiesKey = "properties";

    if(object.has_key(propertiesKey))
    {
        bourne::json value = object[propertiesKey];


    }


}

bourne::json
Neo4jCaptureDataChange_schema::toJson()
{
    bourne::json object = bourne::json::object();








    return object;

}

Map<string, string>
Neo4jCaptureDataChange_schema::getConstraints()
{
	return constraints;
}

void
Neo4jCaptureDataChange_schema::setConstraints(Map <string, string> constraints)
{
	this->constraints = constraints;
}

Map<string, string>
Neo4jCaptureDataChange_schema::getProperties()
{
	return properties;
}

void
Neo4jCaptureDataChange_schema::setProperties(Map <string, string> properties)
{
	this->properties = properties;
}



