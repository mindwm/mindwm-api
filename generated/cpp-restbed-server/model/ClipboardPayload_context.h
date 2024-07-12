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
 * ClipboardPayload_context.h
 *
 * Selection context
 */

#ifndef ClipboardPayload_context_H_
#define ClipboardPayload_context_H_



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
/// Selection context
/// </summary>
class  ClipboardPayload_context 
{
public:
    ClipboardPayload_context() = default;
    explicit ClipboardPayload_context(boost::property_tree::ptree const& pt);
    virtual ~ClipboardPayload_context() = default;

    ClipboardPayload_context(const ClipboardPayload_context& other) = default; // copy constructor
    ClipboardPayload_context(ClipboardPayload_context&& other) noexcept = default; // move constructor

    ClipboardPayload_context& operator=(const ClipboardPayload_context& other) = default; // copy assignment
    ClipboardPayload_context& operator=(ClipboardPayload_context&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ClipboardPayload_context members

    /// <summary>
    /// window id
    /// </summary>
    std::string getWindow() const;
    void setWindow(std::string value);

protected:
    std::string m_Window = "";
};

std::vector<ClipboardPayload_context> createClipboardPayload_contextVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ClipboardPayload_context>(const ClipboardPayload_context& val) {
    return val.toPropertyTree();
}

template<>
inline ClipboardPayload_context fromPt<ClipboardPayload_context>(const boost::property_tree::ptree& pt) {
    ClipboardPayload_context ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ClipboardPayload_context_H_ */
