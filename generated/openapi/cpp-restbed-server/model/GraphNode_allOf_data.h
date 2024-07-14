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
 * GraphNode_allOf_data.h
 *
 * 
 */

#ifndef GraphNode_allOf_data_H_
#define GraphNode_allOf_data_H_



#include <string>
#include "Neo4jCaptureDataChangeNodePayload.h"
#include "Neo4jCaptureDataChange_meta.h"
#include "Neo4jCaptureDataChange_schema.h"
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "Neo4jCaptureDataChange.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  GraphNode_allOf_data : public Neo4jCaptureDataChange
{
public:
    GraphNode_allOf_data() = default;
    explicit GraphNode_allOf_data(boost::property_tree::ptree const& pt);
    virtual ~GraphNode_allOf_data() = default;

    GraphNode_allOf_data(const GraphNode_allOf_data& other) = default; // copy constructor
    GraphNode_allOf_data(GraphNode_allOf_data&& other) noexcept = default; // move constructor

    GraphNode_allOf_data& operator=(const GraphNode_allOf_data& other) = default; // copy assignment
    GraphNode_allOf_data& operator=(GraphNode_allOf_data&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// GraphNode_allOf_data members

    /// <summary>
    /// 
    /// </summary>
    std::string getHeaders() const;
    void setHeaders(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getMessageKey() const;
    void setMessageKey(std::string value);

    /// <summary>
    /// 
    /// </summary>
    Neo4jCaptureDataChange_meta getMeta() const;
    void setMeta(Neo4jCaptureDataChange_meta value);

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
    Neo4jCaptureDataChange_schema getSchema() const;
    void setSchema(Neo4jCaptureDataChange_schema value);

    /// <summary>
    /// 
    /// </summary>
    Neo4jCaptureDataChangeNodePayload getPayload() const;
    void setPayload(Neo4jCaptureDataChangeNodePayload value);

protected:
    std::string m_Headers = nullptr;
    std::string m_Message_key = "";
    Neo4jCaptureDataChange_meta m_Meta;
    int32_t m_Offset = 0;
    int32_t m_Partition = 0;
    std::string m_Source_type = "";
    std::string m_Timestamp = "";
    std::string m_Topic = "";
    Neo4jCaptureDataChange_schema m_Schema;
    Neo4jCaptureDataChangeNodePayload m_Payload;
};

std::vector<GraphNode_allOf_data> createGraphNode_allOf_dataVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<GraphNode_allOf_data>(const GraphNode_allOf_data& val) {
    return val.toPropertyTree();
}

template<>
inline GraphNode_allOf_data fromPt<GraphNode_allOf_data>(const boost::property_tree::ptree& pt) {
    GraphNode_allOf_data ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* GraphNode_allOf_data_H_ */