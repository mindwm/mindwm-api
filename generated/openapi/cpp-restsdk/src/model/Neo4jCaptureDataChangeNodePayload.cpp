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



#include "MindWM/model/Neo4jCaptureDataChangeNodePayload.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Neo4jCaptureDataChangeNodePayload::Neo4jCaptureDataChangeNodePayload()
{
    m_AfterIsSet = false;
    m_Before = utility::conversions::to_string_t("");
    m_BeforeIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
}

Neo4jCaptureDataChangeNodePayload::~Neo4jCaptureDataChangeNodePayload()
{
}

void Neo4jCaptureDataChangeNodePayload::validate()
{
    // TODO: implement validation
}

web::json::value Neo4jCaptureDataChangeNodePayload::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_AfterIsSet)
    {
        val[utility::conversions::to_string_t(U("after"))] = ModelBase::toJson(m_After);
    }
    if(m_BeforeIsSet)
    {
        val[utility::conversions::to_string_t(U("before"))] = ModelBase::toJson(m_Before);
    }
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }

    return val;
}

bool Neo4jCaptureDataChangeNodePayload::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("after"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("after")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Neo4jCaptureDataChangeNodePayload_after> refVal_setAfter;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAfter);
            setAfter(refVal_setAfter);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("before"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("before")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setBefore;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBefore);
            setBefore(refVal_setBefore);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setId);
            setId(refVal_setId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("type")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setType);
            setType(refVal_setType);
        }
    }
    return ok;
}

void Neo4jCaptureDataChangeNodePayload::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_AfterIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("after")), m_After));
    }
    if(m_BeforeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("before")), m_Before));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("type")), m_Type));
    }
}

bool Neo4jCaptureDataChangeNodePayload::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("after"))))
    {
        std::shared_ptr<Neo4jCaptureDataChangeNodePayload_after> refVal_setAfter;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("after"))), refVal_setAfter );
        setAfter(refVal_setAfter);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("before"))))
    {
        utility::string_t refVal_setBefore;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("before"))), refVal_setBefore );
        setBefore(refVal_setBefore);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("type"))))
    {
        utility::string_t refVal_setType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("type"))), refVal_setType );
        setType(refVal_setType);
    }
    return ok;
}

std::shared_ptr<Neo4jCaptureDataChangeNodePayload_after> Neo4jCaptureDataChangeNodePayload::getAfter() const
{
    return m_After;
}

void Neo4jCaptureDataChangeNodePayload::setAfter(const std::shared_ptr<Neo4jCaptureDataChangeNodePayload_after>& value)
{
    m_After = value;
    m_AfterIsSet = true;
}

bool Neo4jCaptureDataChangeNodePayload::afterIsSet() const
{
    return m_AfterIsSet;
}

void Neo4jCaptureDataChangeNodePayload::unsetAfter()
{
    m_AfterIsSet = false;
}
utility::string_t Neo4jCaptureDataChangeNodePayload::getBefore() const
{
    return m_Before;
}

void Neo4jCaptureDataChangeNodePayload::setBefore(const utility::string_t& value)
{
    m_Before = value;
    m_BeforeIsSet = true;
}

bool Neo4jCaptureDataChangeNodePayload::beforeIsSet() const
{
    return m_BeforeIsSet;
}

void Neo4jCaptureDataChangeNodePayload::unsetBefore()
{
    m_BeforeIsSet = false;
}
utility::string_t Neo4jCaptureDataChangeNodePayload::getId() const
{
    return m_Id;
}

void Neo4jCaptureDataChangeNodePayload::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Neo4jCaptureDataChangeNodePayload::idIsSet() const
{
    return m_IdIsSet;
}

void Neo4jCaptureDataChangeNodePayload::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Neo4jCaptureDataChangeNodePayload::getType() const
{
    return m_Type;
}

void Neo4jCaptureDataChangeNodePayload::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool Neo4jCaptureDataChangeNodePayload::typeIsSet() const
{
    return m_TypeIsSet;
}

void Neo4jCaptureDataChangeNodePayload::unsetType()
{
    m_TypeIsSet = false;
}
}
}
}
}


