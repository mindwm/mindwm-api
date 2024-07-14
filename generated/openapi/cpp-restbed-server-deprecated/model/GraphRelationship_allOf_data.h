/**
 * Mindwm API
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * The version of the OpenAPI document: 0.1.0
 * 
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

#ifndef GraphRelationship_allOf_data_H_
#define GraphRelationship_allOf_data_H_



#include "Neo4jCaptureDataChangeRelationshipPayload.h"
#include <string>
#include "Neo4jCaptureDataChange_meta.h"
#include "Object.h"
#include "Neo4jCaptureDataChange_schema.h"
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  GraphRelationship_allOf_data : public Neo4jCaptureDataChange
{
public:
    GraphRelationship_allOf_data() = default;
    explicit GraphRelationship_allOf_data(boost::property_tree::ptree const& pt);
    virtual ~GraphRelationship_allOf_data() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// GraphRelationship_allOf_data members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Object> getHeaders() const;
    void setHeaders(std::shared_ptr<Object> value);

    /// <summary>
    /// 
    /// </summary>
    std::string getMessageKey() const;
    void setMessageKey(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Neo4jCaptureDataChange_meta> getMeta() const;
    void setMeta(std::shared_ptr<Neo4jCaptureDataChange_meta> value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getOffset() const;
    void setOffset(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getPartition() const;
    void setPartition(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    std::string getSourceType() const;
    void setSourceType(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getTimestamp() const;
    void setTimestamp(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getTopic() const;
    void setTopic(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Neo4jCaptureDataChange_schema> getSchema() const;
    void setSchema(std::shared_ptr<Neo4jCaptureDataChange_schema> value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Neo4jCaptureDataChangeRelationshipPayload> getPayload() const;
    void setPayload(std::shared_ptr<Neo4jCaptureDataChangeRelationshipPayload> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::shared_ptr<Object> m_Headers = nullptr;
    std::string m_Message_key = "";
    std::shared_ptr<Neo4jCaptureDataChange_meta> m_Meta;
    int32_t m_Offset = 0;
    int32_t m_Partition = 0;
    std::string m_Source_type = "";
    std::string m_Timestamp = "";
    std::string m_Topic = "";
    std::shared_ptr<Neo4jCaptureDataChange_schema> m_Schema;
    std::shared_ptr<Neo4jCaptureDataChangeRelationshipPayload> m_Payload;
};

std::vector<GraphRelationship_allOf_data> createGraphRelationship_allOf_dataVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* GraphRelationship_allOf_data_H_ */