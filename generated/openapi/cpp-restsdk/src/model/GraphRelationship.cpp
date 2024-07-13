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



#include "MindwWM/model/GraphRelationship.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



GraphRelationship::GraphRelationship()
{
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Source = utility::conversions::to_string_t("");
    m_SourceIsSet = false;
    m_Specversion = utility::conversions::to_string_t("");
    m_SpecversionIsSet = false;
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
    m_Datacontenttype = utility::conversions::to_string_t("");
    m_DatacontenttypeIsSet = false;
    m_Dataschema = utility::conversions::to_string_t("");
    m_DataschemaIsSet = false;
    m_Subject = utility::conversions::to_string_t("");
    m_SubjectIsSet = false;
    m_Time = utility::datetime();
    m_TimeIsSet = false;
    m_DataIsSet = false;
    m_Data_base64 = utility::conversions::to_string_t("");
    m_Data_base64IsSet = false;
}

GraphRelationship::~GraphRelationship()
{
}

void GraphRelationship::validate()
{
    // TODO: implement validation
}

web::json::value GraphRelationship::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_SourceIsSet)
    {
        val[utility::conversions::to_string_t(U("source"))] = ModelBase::toJson(m_Source);
    }
    if(m_SpecversionIsSet)
    {
        val[utility::conversions::to_string_t(U("specversion"))] = ModelBase::toJson(m_Specversion);
    }
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }
    if(m_DatacontenttypeIsSet)
    {
        val[utility::conversions::to_string_t(U("datacontenttype"))] = ModelBase::toJson(m_Datacontenttype);
    }
    if(m_DataschemaIsSet)
    {
        val[utility::conversions::to_string_t(U("dataschema"))] = ModelBase::toJson(m_Dataschema);
    }
    if(m_SubjectIsSet)
    {
        val[utility::conversions::to_string_t(U("subject"))] = ModelBase::toJson(m_Subject);
    }
    if(m_TimeIsSet)
    {
        val[utility::conversions::to_string_t(U("time"))] = ModelBase::toJson(m_Time);
    }
    if(m_DataIsSet)
    {
        val[utility::conversions::to_string_t(U("data"))] = ModelBase::toJson(m_Data);
    }
    if(m_Data_base64IsSet)
    {
        val[utility::conversions::to_string_t(U("data_base64"))] = ModelBase::toJson(m_Data_base64);
    }

    return val;
}

bool GraphRelationship::fromJson(const web::json::value& val)
{
    bool ok = true;
    
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
    if(val.has_field(utility::conversions::to_string_t(U("source"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("source")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setSource;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSource);
            setSource(refVal_setSource);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("specversion"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("specversion")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setSpecversion;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSpecversion);
            setSpecversion(refVal_setSpecversion);
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
    if(val.has_field(utility::conversions::to_string_t(U("datacontenttype"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("datacontenttype")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setDatacontenttype;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDatacontenttype);
            setDatacontenttype(refVal_setDatacontenttype);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("dataschema"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("dataschema")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setDataschema;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDataschema);
            setDataschema(refVal_setDataschema);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("subject"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("subject")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setSubject;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSubject);
            setSubject(refVal_setSubject);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("time")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTime);
            setTime(refVal_setTime);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("data"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("data")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<GraphRelationship_allOf_data> refVal_setData;
            ok &= ModelBase::fromJson(fieldValue, refVal_setData);
            setData(refVal_setData);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("data_base64"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("data_base64")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setDataBase64;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDataBase64);
            setDataBase64(refVal_setDataBase64);
        }
    }
    return ok;
}

void GraphRelationship::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_SourceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("source")), m_Source));
    }
    if(m_SpecversionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("specversion")), m_Specversion));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("type")), m_Type));
    }
    if(m_DatacontenttypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("datacontenttype")), m_Datacontenttype));
    }
    if(m_DataschemaIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("dataschema")), m_Dataschema));
    }
    if(m_SubjectIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("subject")), m_Subject));
    }
    if(m_TimeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("time")), m_Time));
    }
    if(m_DataIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("data")), m_Data));
    }
    if(m_Data_base64IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("data_base64")), m_Data_base64));
    }
}

bool GraphRelationship::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("source"))))
    {
        utility::string_t refVal_setSource;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("source"))), refVal_setSource );
        setSource(refVal_setSource);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("specversion"))))
    {
        utility::string_t refVal_setSpecversion;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("specversion"))), refVal_setSpecversion );
        setSpecversion(refVal_setSpecversion);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("type"))))
    {
        utility::string_t refVal_setType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("type"))), refVal_setType );
        setType(refVal_setType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("datacontenttype"))))
    {
        utility::string_t refVal_setDatacontenttype;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("datacontenttype"))), refVal_setDatacontenttype );
        setDatacontenttype(refVal_setDatacontenttype);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("dataschema"))))
    {
        utility::string_t refVal_setDataschema;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("dataschema"))), refVal_setDataschema );
        setDataschema(refVal_setDataschema);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("subject"))))
    {
        utility::string_t refVal_setSubject;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("subject"))), refVal_setSubject );
        setSubject(refVal_setSubject);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("time"))))
    {
        utility::datetime refVal_setTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("time"))), refVal_setTime );
        setTime(refVal_setTime);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("data"))))
    {
        std::shared_ptr<GraphRelationship_allOf_data> refVal_setData;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("data"))), refVal_setData );
        setData(refVal_setData);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("data_base64"))))
    {
        utility::string_t refVal_setDataBase64;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("data_base64"))), refVal_setDataBase64 );
        setDataBase64(refVal_setDataBase64);
    }
    return ok;
}

utility::string_t GraphRelationship::getId() const
{
    return m_Id;
}

void GraphRelationship::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool GraphRelationship::idIsSet() const
{
    return m_IdIsSet;
}

void GraphRelationship::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t GraphRelationship::getSource() const
{
    return m_Source;
}

void GraphRelationship::setSource(const utility::string_t& value)
{
    m_Source = value;
    m_SourceIsSet = true;
}

bool GraphRelationship::sourceIsSet() const
{
    return m_SourceIsSet;
}

void GraphRelationship::unsetSource()
{
    m_SourceIsSet = false;
}
utility::string_t GraphRelationship::getSpecversion() const
{
    return m_Specversion;
}

void GraphRelationship::setSpecversion(const utility::string_t& value)
{
    m_Specversion = value;
    m_SpecversionIsSet = true;
}

bool GraphRelationship::specversionIsSet() const
{
    return m_SpecversionIsSet;
}

void GraphRelationship::unsetSpecversion()
{
    m_SpecversionIsSet = false;
}
utility::string_t GraphRelationship::getType() const
{
    return m_Type;
}

void GraphRelationship::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool GraphRelationship::typeIsSet() const
{
    return m_TypeIsSet;
}

void GraphRelationship::unsetType()
{
    m_TypeIsSet = false;
}
utility::string_t GraphRelationship::getDatacontenttype() const
{
    return m_Datacontenttype;
}

void GraphRelationship::setDatacontenttype(const utility::string_t& value)
{
    m_Datacontenttype = value;
    m_DatacontenttypeIsSet = true;
}

bool GraphRelationship::datacontenttypeIsSet() const
{
    return m_DatacontenttypeIsSet;
}

void GraphRelationship::unsetDatacontenttype()
{
    m_DatacontenttypeIsSet = false;
}
utility::string_t GraphRelationship::getDataschema() const
{
    return m_Dataschema;
}

void GraphRelationship::setDataschema(const utility::string_t& value)
{
    m_Dataschema = value;
    m_DataschemaIsSet = true;
}

bool GraphRelationship::dataschemaIsSet() const
{
    return m_DataschemaIsSet;
}

void GraphRelationship::unsetDataschema()
{
    m_DataschemaIsSet = false;
}
utility::string_t GraphRelationship::getSubject() const
{
    return m_Subject;
}

void GraphRelationship::setSubject(const utility::string_t& value)
{
    m_Subject = value;
    m_SubjectIsSet = true;
}

bool GraphRelationship::subjectIsSet() const
{
    return m_SubjectIsSet;
}

void GraphRelationship::unsetSubject()
{
    m_SubjectIsSet = false;
}
utility::datetime GraphRelationship::getTime() const
{
    return m_Time;
}

void GraphRelationship::setTime(const utility::datetime& value)
{
    m_Time = value;
    m_TimeIsSet = true;
}

bool GraphRelationship::timeIsSet() const
{
    return m_TimeIsSet;
}

void GraphRelationship::unsetTime()
{
    m_TimeIsSet = false;
}
std::shared_ptr<GraphRelationship_allOf_data> GraphRelationship::getData() const
{
    return m_Data;
}

void GraphRelationship::setData(const std::shared_ptr<GraphRelationship_allOf_data>& value)
{
    m_Data = value;
    m_DataIsSet = true;
}

bool GraphRelationship::dataIsSet() const
{
    return m_DataIsSet;
}

void GraphRelationship::unsetData()
{
    m_DataIsSet = false;
}
utility::string_t GraphRelationship::getDataBase64() const
{
    return m_Data_base64;
}

void GraphRelationship::setDataBase64(const utility::string_t& value)
{
    m_Data_base64 = value;
    m_Data_base64IsSet = true;
}

bool GraphRelationship::dataBase64IsSet() const
{
    return m_Data_base64IsSet;
}

void GraphRelationship::unsetData_base64()
{
    m_Data_base64IsSet = false;
}
}
}
}
}


