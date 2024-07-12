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
 * CloudEvent.h
 *
 * CloudEvents Specification JSON Schema
 */

#ifndef CloudEvent_H_
#define CloudEvent_H_



#include "CloudEvent_data.h"
#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// CloudEvents Specification JSON Schema
/// </summary>
class  CloudEvent 
{
public:
    CloudEvent() = default;
    explicit CloudEvent(boost::property_tree::ptree const& pt);
    virtual ~CloudEvent() = default;

    CloudEvent(const CloudEvent& other) = default; // copy constructor
    CloudEvent(CloudEvent&& other) noexcept = default; // move constructor

    CloudEvent& operator=(const CloudEvent& other) = default; // copy assignment
    CloudEvent& operator=(CloudEvent&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CloudEvent members

    /// <summary>
    /// Identifies the event.
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// Identifies the context in which an event happened.
    /// </summary>
    std::string getSource() const;
    void setSource(std::string value);

    /// <summary>
    /// The version of the CloudEvents specification which the event uses.
    /// </summary>
    std::string getSpecversion() const;
    void setSpecversion(std::string value);

    /// <summary>
    /// Describes the type of event related to the originating occurrence.
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
    CloudEvent_data getData() const;
    void setData(CloudEvent_data value);

    /// <summary>
    /// Base64 encoded event payload. Must adhere to RFC4648.
    /// </summary>
    std::string getDataBase64() const;
    void setDataBase64(std::string value);

protected:
    std::string m_Id = "";
    std::string m_Source = "";
    std::string m_Specversion = "";
    std::string m_Type = "";
    std::string m_Datacontenttype = "";
    std::string m_Dataschema = "";
    std::string m_Subject = "";
    std::string m_Time = "";
    CloudEvent_data m_Data;
    std::string m_Data_base64 = "";
};

std::vector<CloudEvent> createCloudEventVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CloudEvent>(const CloudEvent& val) {
    return val.toPropertyTree();
}

template<>
inline CloudEvent fromPt<CloudEvent>(const boost::property_tree::ptree& pt) {
    CloudEvent ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CloudEvent_H_ */
