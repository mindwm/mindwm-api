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
 * Neo4jCaptureDataChangeRelationshipPayload.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Neo4jCaptureDataChangeRelationshipPayload_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Neo4jCaptureDataChangeRelationshipPayload_H_


#include "MindwWM/ModelBase.h"

#include "MindwWM/Object.h"
#include <cpprest/details/basic_types.h>
#include "MindwWM/model/Neo4jCaptureDataChangeRelationshipPayload_end.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class Neo4jCaptureDataChangeRelationshipPayload_end;


/// <summary>
/// 
/// </summary>
class  Neo4jCaptureDataChangeRelationshipPayload
    : public ModelBase
{
public:
    Neo4jCaptureDataChangeRelationshipPayload();
    virtual ~Neo4jCaptureDataChangeRelationshipPayload();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Neo4jCaptureDataChangeRelationshipPayload members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Object> getAfter() const;
    bool afterIsSet() const;
    void unsetAfter();

    void setAfter(const std::shared_ptr<Object>& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getBefore() const;
    bool beforeIsSet() const;
    void unsetBefore();

    void setBefore(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Neo4jCaptureDataChangeRelationshipPayload_end> getEnd() const;
    bool endIsSet() const;
    void unsetEnd();

    void setEnd(const std::shared_ptr<Neo4jCaptureDataChangeRelationshipPayload_end>& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getLabel() const;
    bool labelIsSet() const;
    void unsetLabel();

    void setLabel(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Neo4jCaptureDataChangeRelationshipPayload_end> getStart() const;
    bool startIsSet() const;
    void unsetStart();

    void setStart(const std::shared_ptr<Neo4jCaptureDataChangeRelationshipPayload_end>& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(const utility::string_t& value);


protected:
    std::shared_ptr<Object> m_After;
    bool m_AfterIsSet;
    utility::string_t m_Before;
    bool m_BeforeIsSet;
    std::shared_ptr<Neo4jCaptureDataChangeRelationshipPayload_end> m_End;
    bool m_EndIsSet;
    utility::string_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Label;
    bool m_LabelIsSet;
    std::shared_ptr<Neo4jCaptureDataChangeRelationshipPayload_end> m_Start;
    bool m_StartIsSet;
    utility::string_t m_Type;
    bool m_TypeIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Neo4jCaptureDataChangeRelationshipPayload_H_ */
