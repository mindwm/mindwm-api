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
 * TmuxPaneIoDocument.h
 *
 * 
 */

#ifndef TmuxPaneIoDocument_H_
#define TmuxPaneIoDocument_H_



#include <string>
#include <map>
#include "AnyType.h"
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
class  TmuxPaneIoDocument 
{
public:
    TmuxPaneIoDocument() = default;
    explicit TmuxPaneIoDocument(boost::property_tree::ptree const& pt);
    virtual ~TmuxPaneIoDocument() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// TmuxPaneIoDocument members

    /// <summary>
    /// User input
    /// </summary>
    std::string getInput() const;
    void setInput(std::string value);

    /// <summary>
    /// Command output (mix of stdout &amp; stderr)
    /// </summary>
    std::string getOutput() const;
    void setOutput(std::string value);

    /// <summary>
    /// ps1 (prompt) AFTER the input and output
    /// </summary>
    std::string getPs1() const;
    void setPs1(std::string value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::string m_Input = "";
    std::string m_Output = "";
    std::string m_Ps1 = "";
};

std::vector<TmuxPaneIoDocument> createTmuxPaneIoDocumentVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* TmuxPaneIoDocument_H_ */