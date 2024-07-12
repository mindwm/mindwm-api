

#include "ClipboardPayload.h"

using namespace Tiny;

ClipboardPayload::ClipboardPayload()
{
	start = std::list<int>();
	stop = std::list<int>();
	data = std::string();
	type = std::string();
	context = ClipboardPayload_context();
}

ClipboardPayload::ClipboardPayload(std::string jsonString)
{
	this->fromJson(jsonString);
}

ClipboardPayload::~ClipboardPayload()
{

}

void
ClipboardPayload::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *startKey = "start";

    if(object.has_key(startKey))
    {
        bourne::json value = object[startKey];


        std::list<int> start_list;
        int element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "int");


            start_list.push_back(element);
        }
        start = start_list;


    }

    const char *stopKey = "stop";

    if(object.has_key(stopKey))
    {
        bourne::json value = object[stopKey];


        std::list<int> stop_list;
        int element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "int");


            stop_list.push_back(element);
        }
        stop = stop_list;


    }

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];



        jsonToValue(&data, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }

    const char *contextKey = "context";

    if(object.has_key(contextKey))
    {
        bourne::json value = object[contextKey];




        ClipboardPayload_context* obj = &context;
		obj->fromJson(value.dump());

    }


}

bourne::json
ClipboardPayload::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<int> start_list = getStart();
    bourne::json start_arr = bourne::json::array();

    for(auto& var : start_list)
    {
        start_arr.append(var);
    }
    object["start"] = start_arr;








    std::list<int> stop_list = getStop();
    bourne::json stop_arr = bourne::json::array();

    for(auto& var : stop_list)
    {
        stop_arr.append(var);
    }
    object["stop"] = stop_arr;









    object["data"] = getData();






    object["type"] = getType();







	object["context"] = getContext().toJson();


    return object;

}

std::list<int>
ClipboardPayload::getStart()
{
	return start;
}

void
ClipboardPayload::setStart(std::list <int> start)
{
	this->start = start;
}

std::list<int>
ClipboardPayload::getStop()
{
	return stop;
}

void
ClipboardPayload::setStop(std::list <int> stop)
{
	this->stop = stop;
}

std::string
ClipboardPayload::getData()
{
	return data;
}

void
ClipboardPayload::setData(std::string  data)
{
	this->data = data;
}

std::string
ClipboardPayload::getType()
{
	return type;
}

void
ClipboardPayload::setType(std::string  type)
{
	this->type = type;
}

ClipboardPayload_context
ClipboardPayload::getContext()
{
	return context;
}

void
ClipboardPayload::setContext(ClipboardPayload_context  context)
{
	this->context = context;
}



