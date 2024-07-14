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



#include "MindwWM/model/Neo4jCaptureDataChange_meta_source.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Neo4jCaptureDataChange_meta_source::Neo4jCaptureDataChange_meta_source()
{
    m_Hostname = utility::conversions::to_string_t("");
    m_HostnameIsSet = false;
}

Neo4jCaptureDataChange_meta_source::~Neo4jCaptureDataChange_meta_source()
{
}

void Neo4jCaptureDataChange_meta_source::validate()
{
    // TODO: implement validation
}

web::json::value Neo4jCaptureDataChange_meta_source::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_HostnameIsSet)
    {
        val[utility::conversions::to_string_t(U("hostname"))] = ModelBase::toJson(m_Hostname);
    }

    return val;
}

bool Neo4jCaptureDataChange_meta_source::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("hostname"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("hostname")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setHostname;
            ok &= ModelBase::fromJson(fieldValue, refVal_setHostname);
            setHostname(refVal_setHostname);
        }
    }
    return ok;
}

void Neo4jCaptureDataChange_meta_source::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_HostnameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("hostname")), m_Hostname));
    }
}

bool Neo4jCaptureDataChange_meta_source::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("hostname"))))
    {
        utility::string_t refVal_setHostname;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("hostname"))), refVal_setHostname );
        setHostname(refVal_setHostname);
    }
    return ok;
}

utility::string_t Neo4jCaptureDataChange_meta_source::getHostname() const
{
    return m_Hostname;
}

void Neo4jCaptureDataChange_meta_source::setHostname(const utility::string_t& value)
{
    m_Hostname = value;
    m_HostnameIsSet = true;
}

bool Neo4jCaptureDataChange_meta_source::hostnameIsSet() const
{
    return m_HostnameIsSet;
}

void Neo4jCaptureDataChange_meta_source::unsetHostname()
{
    m_HostnameIsSet = false;
}
}
}
}
}

