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

/*
 * GraphRelationship_allOf_data.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_GraphRelationship_allOf_data_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_GraphRelationship_allOf_data_H_


#include "MindWM/ModelBase.h"

#include "MindWM/model/Neo4jCaptureDataChange_schema.h"
#include "MindWM/model/Neo4jCaptureDataChange_meta.h"
#include "MindWM/model/Neo4jCaptureDataChangeRelationshipPayload.h"
#include <cpprest/details/basic_types.h>
#include "MindWM/Object.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class Neo4jCaptureDataChange_meta;
class Neo4jCaptureDataChange_schema;
class Neo4jCaptureDataChangeRelationshipPayload;


/// <summary>
/// 
/// </summary>
class  GraphRelationship_allOf_data
    : public ModelBase
{
public:
    GraphRelationship_allOf_data();
    virtual ~GraphRelationship_allOf_data();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// GraphRelationship_allOf_data members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Object> getHeaders() const;
    bool headersIsSet() const;
    void unsetHeaders();

    void setHeaders(const std::shared_ptr<Object>& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getMessageKey() const;
    bool messageKeyIsSet() const;
    void unsetMessage_key();

    void setMessageKey(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Neo4jCaptureDataChange_meta> getMeta() const;
    bool metaIsSet() const;
    void unsetMeta();

    void setMeta(const std::shared_ptr<Neo4jCaptureDataChange_meta>& value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getOffset() const;
    bool offsetIsSet() const;
    void unsetOffset();

    void setOffset(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getPartition() const;
    bool partitionIsSet() const;
    void unsetPartition();

    void setPartition(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getSourceType() const;
    bool sourceTypeIsSet() const;
    void unsetSource_type();

    void setSourceType(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::datetime getTimestamp() const;
    bool timestampIsSet() const;
    void unsetTimestamp();

    void setTimestamp(const utility::datetime& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getTopic() const;
    bool topicIsSet() const;
    void unsetTopic();

    void setTopic(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Neo4jCaptureDataChange_schema> getSchema() const;
    bool schemaIsSet() const;
    void unsetSchema();

    void setSchema(const std::shared_ptr<Neo4jCaptureDataChange_schema>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Neo4jCaptureDataChangeRelationshipPayload> getPayload() const;
    bool payloadIsSet() const;
    void unsetPayload();

    void setPayload(const std::shared_ptr<Neo4jCaptureDataChangeRelationshipPayload>& value);


protected:
    std::shared_ptr<Object> m_Headers;
    bool m_HeadersIsSet;
    utility::string_t m_Message_key;
    bool m_Message_keyIsSet;
    std::shared_ptr<Neo4jCaptureDataChange_meta> m_Meta;
    bool m_MetaIsSet;
    int32_t m_Offset;
    bool m_OffsetIsSet;
    int32_t m_Partition;
    bool m_PartitionIsSet;
    utility::string_t m_Source_type;
    bool m_Source_typeIsSet;
    utility::datetime m_Timestamp;
    bool m_TimestampIsSet;
    utility::string_t m_Topic;
    bool m_TopicIsSet;
    std::shared_ptr<Neo4jCaptureDataChange_schema> m_Schema;
    bool m_SchemaIsSet;
    std::shared_ptr<Neo4jCaptureDataChangeRelationshipPayload> m_Payload;
    bool m_PayloadIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_GraphRelationship_allOf_data_H_ */