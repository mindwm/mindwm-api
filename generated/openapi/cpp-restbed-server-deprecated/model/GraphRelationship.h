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
 * GraphRelationship.h
 *
 * 
 */

#ifndef GraphRelationship_H_
#define GraphRelationship_H_



#include "GraphRelationship_allOf_data.h"
#include <string>
#include <map>
#include <vector>
#include "AnyType.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  GraphRelationship : public CloudEvent
{
public:
    GraphRelationship() = default;
    explicit GraphRelationship(boost::property_tree::ptree const& pt);
    virtual ~GraphRelationship() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// GraphRelationship members

    /// <summary>
    /// Identifies the event.
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getSource() const;
    void setSource(std::string value);

    /// <summary>
    /// The version of the CloudEvents specification which the event uses.
    /// </summary>
    std::string getSpecversion() const;
    void setSpecversion(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::string getType() const;
    void setType(std::string value);

    /// <summary>
    /// Content type of the data value. Must adhere to RFC 2046 format.
    /// </summary>
    std::string getDatacontenttype() const;
    void setDatacontenttype(std::string value);

    /// <summary>
    /// Identifies the schema that data adheres to.
    /// </summary>
    std::string getDataschema() const;
    void setDataschema(std::string value);

    /// <summary>
    /// Describes the subject of the event in the context of the event producer (identified by source).
    /// </summary>
    std::string getSubject() const;
    void setSubject(std::string value);

    /// <summary>
    /// Timestamp of when the occurrence happened. Must adhere to RFC 3339.
    /// </summary>
    std::string getTime() const;
    void setTime(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<GraphRelationship_allOf_data> getData() const;
    void setData(std::shared_ptr<GraphRelationship_allOf_data> value);

    /// <summary>
    /// Base64 encoded event payload. Must adhere to RFC4648.
    /// </summary>
    std::string getDataBase64() const;
    void setDataBase64(std::string value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::string m_Id = "";
    std::string m_Source = "";
    std::string m_Specversion = "";
    std::string m_Type = "";
    std::string m_Datacontenttype = "";
    std::string m_Dataschema = "";
    std::string m_Subject = "";
    std::string m_Time = "";
    std::shared_ptr<GraphRelationship_allOf_data> m_Data;
    std::string m_Data_base64 = "";
    const std::array<std::string, 1> m_SourceEnum = {
          "graph.relationship"
    };

    const std::array<std::string, 3> m_TypeEnum = {
          "created","updated","deleted"
    };

};

std::vector<GraphRelationship> createGraphRelationshipVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* GraphRelationship_H_ */