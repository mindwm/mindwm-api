

#include "ClipboardPayload_context.h"

using namespace Tiny;

ClipboardPayload_context::ClipboardPayload_context()
{
	window = std::string();
}

ClipboardPayload_context::ClipboardPayload_context(std::string jsonString)
{
	this->fromJson(jsonString);
}

ClipboardPayload_context::~ClipboardPayload_context()
{

}

void
ClipboardPayload_context::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *windowKey = "window";

    if(object.has_key(windowKey))
    {
        bourne::json value = object[windowKey];



        jsonToValue(&window, value, "std::string");


    }


}

bourne::json
ClipboardPayload_context::toJson()
{
    bourne::json object = bourne::json::object();





    object["window"] = getWindow();



    return object;

}

std::string
ClipboardPayload_context::getWindow()
{
	return window;
}

void
ClipboardPayload_context::setWindow(std::string  window)
{
	this->window = window;
}



