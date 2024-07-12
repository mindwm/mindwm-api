/**
 * Mindwm API
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * The version of the OpenAPI document: 0.1.0
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.7.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "MindwWM/model/CloudEvent_data.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CloudEvent_data::CloudEvent_data()
{
}

CloudEvent_data::~CloudEvent_data()
{
}

void CloudEvent_data::validate()
{
    // TODO: implement validation
}

web::json::value CloudEvent_data::toJson() const
{

    web::json::value val = web::json::value::object();
    

    return val;
}

bool CloudEvent_data::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    return ok;
}

void CloudEvent_data::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
}

bool CloudEvent_data::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    return ok;
}

}
}
}
}

