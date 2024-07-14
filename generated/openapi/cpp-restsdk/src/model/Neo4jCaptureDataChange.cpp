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



#include "MindwWM/model/Neo4jCaptureDataChange.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Neo4jCaptureDataChange::Neo4jCaptureDataChange()
{
    m_HeadersIsSet = false;
    m_Message_key = utility::conversions::to_string_t("");
    m_Message_keyIsSet = false;
    m_MetaIsSet = false;
    m_Offset = 0;
    m_OffsetIsSet = false;
    m_Partition = 0;
    m_PartitionIsSet = false;
    m_Source_type = utility::conversions::to_string_t("");
    m_Source_typeIsSet = false;
    m_Timestamp = utility::datetime();
    m_TimestampIsSet = false;
    m_Topic = utility::conversions::to_string_t("");
    m_TopicIsSet = false;
    m_SchemaIsSet = false;
    m_PayloadIsSet = false;
}

Neo4jCaptureDataChange::~Neo4jCaptureDataChange()
{
}

void Neo4jCaptureDataChange::validate()
{
    // TODO: implement validation
}

web::json::value Neo4jCaptureDataChange::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_HeadersIsSet)
    {
        val[utility::conversions::to_string_t(U("headers"))] = ModelBase::toJson(m_Headers);
    }
    if(m_Message_keyIsSet)
    {
        val[utility::conversions::to_string_t(U("message_key"))] = ModelBase::toJson(m_Message_key);
    }
    if(m_MetaIsSet)
    {
        val[utility::conversions::to_string_t(U("meta"))] = ModelBase::toJson(m_Meta);
    }
    if(m_OffsetIsSet)
    {
        val[utility::conversions::to_string_t(U("offset"))] = ModelBase::toJson(m_Offset);
    }
    if(m_PartitionIsSet)
    {
        val[utility::conversions::to_string_t(U("partition"))] = ModelBase::toJson(m_Partition);
    }
    if(m_Source_typeIsSet)
    {
        val[utility::conversions::to_string_t(U("source_type"))] = ModelBase::toJson(m_Source_type);
    }
    if(m_TimestampIsSet)
    {
        val[utility::conversions::to_string_t(U("timestamp"))] = ModelBase::toJson(m_Timestamp);
    }
    if(m_TopicIsSet)
    {
        val[utility::conversions::to_string_t(U("topic"))] = ModelBase::toJson(m_Topic);
    }
    if(m_SchemaIsSet)
    {
        val[utility::conversions::to_string_t(U("schema"))] = ModelBase::toJson(m_Schema);
    }
    if(m_PayloadIsSet)
    {
        val[utility::conversions::to_string_t(U("payload"))] = ModelBase::toJson(m_Payload);
    }

    return val;
}

bool Neo4jCaptureDataChange::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("headers"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("headers")));
        if(!fieldValue.is_null())
        {
            std::map<utility::string_t, std::shared_ptr<AnyType>> refVal_setHeaders;
            ok &= ModelBase::fromJson(fieldValue, refVal_setHeaders);
            setHeaders(refVal_setHeaders);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("message_key"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("message_key")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setMessageKey;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMessageKey);
            setMessageKey(refVal_setMessageKey);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("meta"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("meta")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Neo4jCaptureDataChange_meta> refVal_setMeta;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMeta);
            setMeta(refVal_setMeta);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("offset"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("offset")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setOffset;
            ok &= ModelBase::fromJson(fieldValue, refVal_setOffset);
            setOffset(refVal_setOffset);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("partition"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("partition")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setPartition;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPartition);
            setPartition(refVal_setPartition);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("source_type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("source_type")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setSourceType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSourceType);
            setSourceType(refVal_setSourceType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("timestamp"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("timestamp")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setTimestamp;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTimestamp);
            setTimestamp(refVal_setTimestamp);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("topic"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("topic")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTopic;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTopic);
            setTopic(refVal_setTopic);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("schema"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("schema")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Neo4jCaptureDataChange_schema> refVal_setSchema;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSchema);
            setSchema(refVal_setSchema);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("payload"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("payload")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Neo4jCaptureDataChange_payload> refVal_setPayload;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPayload);
            setPayload(refVal_setPayload);
        }
    }
    return ok;
}

void Neo4jCaptureDataChange::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_HeadersIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("headers")), m_Headers));
    }
    if(m_Message_keyIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("message_key")), m_Message_key));
    }
    if(m_MetaIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("meta")), m_Meta));
    }
    if(m_OffsetIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("offset")), m_Offset));
    }
    if(m_PartitionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("partition")), m_Partition));
    }
    if(m_Source_typeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("source_type")), m_Source_type));
    }
    if(m_TimestampIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("timestamp")), m_Timestamp));
    }
    if(m_TopicIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("topic")), m_Topic));
    }
    if(m_SchemaIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("schema")), m_Schema));
    }
    if(m_PayloadIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("payload")), m_Payload));
    }
}

bool Neo4jCaptureDataChange::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("headers"))))
    {
        std::map<utility::string_t, std::shared_ptr<AnyType>> refVal_setHeaders;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("headers"))), refVal_setHeaders );
        setHeaders(refVal_setHeaders);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("message_key"))))
    {
        utility::string_t refVal_setMessageKey;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("message_key"))), refVal_setMessageKey );
        setMessageKey(refVal_setMessageKey);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("meta"))))
    {
        std::shared_ptr<Neo4jCaptureDataChange_meta> refVal_setMeta;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("meta"))), refVal_setMeta );
        setMeta(refVal_setMeta);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("offset"))))
    {
        int32_t refVal_setOffset;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("offset"))), refVal_setOffset );
        setOffset(refVal_setOffset);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("partition"))))
    {
        int32_t refVal_setPartition;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("partition"))), refVal_setPartition );
        setPartition(refVal_setPartition);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("source_type"))))
    {
        utility::string_t refVal_setSourceType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("source_type"))), refVal_setSourceType );
        setSourceType(refVal_setSourceType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("timestamp"))))
    {
        utility::datetime refVal_setTimestamp;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("timestamp"))), refVal_setTimestamp );
        setTimestamp(refVal_setTimestamp);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("topic"))))
    {
        utility::string_t refVal_setTopic;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("topic"))), refVal_setTopic );
        setTopic(refVal_setTopic);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("schema"))))
    {
        std::shared_ptr<Neo4jCaptureDataChange_schema> refVal_setSchema;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("schema"))), refVal_setSchema );
        setSchema(refVal_setSchema);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("payload"))))
    {
        std::shared_ptr<Neo4jCaptureDataChange_payload> refVal_setPayload;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("payload"))), refVal_setPayload );
        setPayload(refVal_setPayload);
    }
    return ok;
}

std::map<utility::string_t, std::shared_ptr<AnyType>>& Neo4jCaptureDataChange::getHeaders()
{
    return m_Headers;
}

void Neo4jCaptureDataChange::setHeaders(const std::map<utility::string_t, std::shared_ptr<AnyType>>& value)
{
    m_Headers = value;
    m_HeadersIsSet = true;
}

bool Neo4jCaptureDataChange::headersIsSet() const
{
    return m_HeadersIsSet;
}

void Neo4jCaptureDataChange::unsetHeaders()
{
    m_HeadersIsSet = false;
}
utility::string_t Neo4jCaptureDataChange::getMessageKey() const
{
    return m_Message_key;
}

void Neo4jCaptureDataChange::setMessageKey(const utility::string_t& value)
{
    m_Message_key = value;
    m_Message_keyIsSet = true;
}

bool Neo4jCaptureDataChange::messageKeyIsSet() const
{
    return m_Message_keyIsSet;
}

void Neo4jCaptureDataChange::unsetMessage_key()
{
    m_Message_keyIsSet = false;
}
std::shared_ptr<Neo4jCaptureDataChange_meta> Neo4jCaptureDataChange::getMeta() const
{
    return m_Meta;
}

void Neo4jCaptureDataChange::setMeta(const std::shared_ptr<Neo4jCaptureDataChange_meta>& value)
{
    m_Meta = value;
    m_MetaIsSet = true;
}

bool Neo4jCaptureDataChange::metaIsSet() const
{
    return m_MetaIsSet;
}

void Neo4jCaptureDataChange::unsetMeta()
{
    m_MetaIsSet = false;
}
int32_t Neo4jCaptureDataChange::getOffset() const
{
    return m_Offset;
}

void Neo4jCaptureDataChange::setOffset(int32_t value)
{
    m_Offset = value;
    m_OffsetIsSet = true;
}

bool Neo4jCaptureDataChange::offsetIsSet() const
{
    return m_OffsetIsSet;
}

void Neo4jCaptureDataChange::unsetOffset()
{
    m_OffsetIsSet = false;
}
int32_t Neo4jCaptureDataChange::getPartition() const
{
    return m_Partition;
}

void Neo4jCaptureDataChange::setPartition(int32_t value)
{
    m_Partition = value;
    m_PartitionIsSet = true;
}

bool Neo4jCaptureDataChange::partitionIsSet() const
{
    return m_PartitionIsSet;
}

void Neo4jCaptureDataChange::unsetPartition()
{
    m_PartitionIsSet = false;
}
utility::string_t Neo4jCaptureDataChange::getSourceType() const
{
    return m_Source_type;
}

void Neo4jCaptureDataChange::setSourceType(const utility::string_t& value)
{
    m_Source_type = value;
    m_Source_typeIsSet = true;
}

bool Neo4jCaptureDataChange::sourceTypeIsSet() const
{
    return m_Source_typeIsSet;
}

void Neo4jCaptureDataChange::unsetSource_type()
{
    m_Source_typeIsSet = false;
}
utility::datetime Neo4jCaptureDataChange::getTimestamp() const
{
    return m_Timestamp;
}

void Neo4jCaptureDataChange::setTimestamp(const utility::datetime& value)
{
    m_Timestamp = value;
    m_TimestampIsSet = true;
}

bool Neo4jCaptureDataChange::timestampIsSet() const
{
    return m_TimestampIsSet;
}

void Neo4jCaptureDataChange::unsetTimestamp()
{
    m_TimestampIsSet = false;
}
utility::string_t Neo4jCaptureDataChange::getTopic() const
{
    return m_Topic;
}

void Neo4jCaptureDataChange::setTopic(const utility::string_t& value)
{
    m_Topic = value;
    m_TopicIsSet = true;
}

bool Neo4jCaptureDataChange::topicIsSet() const
{
    return m_TopicIsSet;
}

void Neo4jCaptureDataChange::unsetTopic()
{
    m_TopicIsSet = false;
}
std::shared_ptr<Neo4jCaptureDataChange_schema> Neo4jCaptureDataChange::getSchema() const
{
    return m_Schema;
}

void Neo4jCaptureDataChange::setSchema(const std::shared_ptr<Neo4jCaptureDataChange_schema>& value)
{
    m_Schema = value;
    m_SchemaIsSet = true;
}

bool Neo4jCaptureDataChange::schemaIsSet() const
{
    return m_SchemaIsSet;
}

void Neo4jCaptureDataChange::unsetSchema()
{
    m_SchemaIsSet = false;
}
std::shared_ptr<Neo4jCaptureDataChange_payload> Neo4jCaptureDataChange::getPayload() const
{
    return m_Payload;
}

void Neo4jCaptureDataChange::setPayload(const std::shared_ptr<Neo4jCaptureDataChange_payload>& value)
{
    m_Payload = value;
    m_PayloadIsSet = true;
}

bool Neo4jCaptureDataChange::payloadIsSet() const
{
    return m_PayloadIsSet;
}

void Neo4jCaptureDataChange::unsetPayload()
{
    m_PayloadIsSet = false;
}
}
}
}
}

