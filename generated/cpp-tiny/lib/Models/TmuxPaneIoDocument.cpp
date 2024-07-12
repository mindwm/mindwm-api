

#include "TmuxPaneIoDocument.h"

using namespace Tiny;

TmuxPaneIoDocument::TmuxPaneIoDocument()
{
	input = std::string();
	output = std::string();
	ps1 = std::string();
}

TmuxPaneIoDocument::TmuxPaneIoDocument(std::string jsonString)
{
	this->fromJson(jsonString);
}

TmuxPaneIoDocument::~TmuxPaneIoDocument()
{

}

void
TmuxPaneIoDocument::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *inputKey = "input";

    if(object.has_key(inputKey))
    {
        bourne::json value = object[inputKey];



        jsonToValue(&input, value, "std::string");


    }

    const char *outputKey = "output";

    if(object.has_key(outputKey))
    {
        bourne::json value = object[outputKey];



        jsonToValue(&output, value, "std::string");


    }

    const char *ps1Key = "ps1";

    if(object.has_key(ps1Key))
    {
        bourne::json value = object[ps1Key];



        jsonToValue(&ps1, value, "std::string");


    }


}

bourne::json
TmuxPaneIoDocument::toJson()
{
    bourne::json object = bourne::json::object();





    object["input"] = getInput();






    object["output"] = getOutput();






    object["ps1"] = getPs1();



    return object;

}

std::string
TmuxPaneIoDocument::getInput()
{
	return input;
}

void
TmuxPaneIoDocument::setInput(std::string  input)
{
	this->input = input;
}

std::string
TmuxPaneIoDocument::getOutput()
{
	return output;
}

void
TmuxPaneIoDocument::setOutput(std::string  output)
{
	this->output = output;
}

std::string
TmuxPaneIoDocument::getPs1()
{
	return ps1;
}

void
TmuxPaneIoDocument::setPs1(std::string  ps1)
{
	this->ps1 = ps1;
}



