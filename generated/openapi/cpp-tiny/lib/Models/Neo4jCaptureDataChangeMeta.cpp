

#include "Neo4jCaptureDataChange_meta.h"

using namespace Tiny;

Neo4jCaptureDataChange_meta::Neo4jCaptureDataChange_meta()
{
	operation = std::string();
	source = Neo4jCaptureDataChange_meta_source();
	timestamp = int(0);
	txEventId = int(0);
	txEventsCount = int(0);
	txId = int(0);
	username = std::string();
}

Neo4jCaptureDataChange_meta::Neo4jCaptureDataChange_meta(std::string jsonString)
{
	this->fromJson(jsonString);
}

Neo4jCaptureDataChange_meta::~Neo4jCaptureDataChange_meta()
{

}

void
Neo4jCaptureDataChange_meta::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *operationKey = "operation";

    if(object.has_key(operationKey))
    {
        bourne::json value = object[operationKey];



        jsonToValue(&operation, value, "std::string");


    }

    const char *sourceKey = "source";

    if(object.has_key(sourceKey))
    {
        bourne::json value = object[sourceKey];




        Neo4jCaptureDataChange_meta_source* obj = &source;
		obj->fromJson(value.dump());

    }

    const char *timestampKey = "timestamp";

    if(object.has_key(timestampKey))
    {
        bourne::json value = object[timestampKey];



        jsonToValue(&timestamp, value, "int");


    }

    const char *txEventIdKey = "txEventId";

    if(object.has_key(txEventIdKey))
    {
        bourne::json value = object[txEventIdKey];



        jsonToValue(&txEventId, value, "int");


    }

    const char *txEventsCountKey = "txEventsCount";

    if(object.has_key(txEventsCountKey))
    {
        bourne::json value = object[txEventsCountKey];



        jsonToValue(&txEventsCount, value, "int");


    }

    const char *txIdKey = "txId";

    if(object.has_key(txIdKey))
    {
        bourne::json value = object[txIdKey];



        jsonToValue(&txId, value, "int");


    }

    const char *usernameKey = "username";

    if(object.has_key(usernameKey))
    {
        bourne::json value = object[usernameKey];



        jsonToValue(&username, value, "std::string");


    }


}

bourne::json
Neo4jCaptureDataChange_meta::toJson()
{
    bourne::json object = bourne::json::object();





    object["operation"] = getOperation();







	object["source"] = getSource().toJson();





    object["timestamp"] = getTimestamp();






    object["txEventId"] = getTxEventId();






    object["txEventsCount"] = getTxEventsCount();






    object["txId"] = getTxId();






    object["username"] = getUsername();



    return object;

}

std::string
Neo4jCaptureDataChange_meta::getOperation()
{
	return operation;
}

void
Neo4jCaptureDataChange_meta::setOperation(std::string  operation)
{
	this->operation = operation;
}

Neo4jCaptureDataChange_meta_source
Neo4jCaptureDataChange_meta::getSource()
{
	return source;
}

void
Neo4jCaptureDataChange_meta::setSource(Neo4jCaptureDataChange_meta_source  source)
{
	this->source = source;
}

int
Neo4jCaptureDataChange_meta::getTimestamp()
{
	return timestamp;
}

void
Neo4jCaptureDataChange_meta::setTimestamp(int  timestamp)
{
	this->timestamp = timestamp;
}

int
Neo4jCaptureDataChange_meta::getTxEventId()
{
	return txEventId;
}

void
Neo4jCaptureDataChange_meta::setTxEventId(int  txEventId)
{
	this->txEventId = txEventId;
}

int
Neo4jCaptureDataChange_meta::getTxEventsCount()
{
	return txEventsCount;
}

void
Neo4jCaptureDataChange_meta::setTxEventsCount(int  txEventsCount)
{
	this->txEventsCount = txEventsCount;
}

int
Neo4jCaptureDataChange_meta::getTxId()
{
	return txId;
}

void
Neo4jCaptureDataChange_meta::setTxId(int  txId)
{
	this->txId = txId;
}

std::string
Neo4jCaptureDataChange_meta::getUsername()
{
	return username;
}

void
Neo4jCaptureDataChange_meta::setUsername(std::string  username)
{
	this->username = username;
}



