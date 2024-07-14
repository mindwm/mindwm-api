/**
* Mindwm API
* This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
*
* The version of the OpenAPI document: 0.1.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
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


#include <nlohmann/json.hpp>
#include <string>
#include <map>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  TmuxPaneIoDocument
{
public:
    TmuxPaneIoDocument();
    virtual ~TmuxPaneIoDocument() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const TmuxPaneIoDocument& rhs) const;
    bool operator!=(const TmuxPaneIoDocument& rhs) const;

    /////////////////////////////////////////////
    /// TmuxPaneIoDocument members

    /// <summary>
    /// User input
    /// </summary>
    std::string getInput() const;
    void setInput(std::string const& value);
    /// <summary>
    /// Command output (mix of stdout &amp; stderr)
    /// </summary>
    std::string getOutput() const;
    void setOutput(std::string const& value);
    /// <summary>
    /// ps1 (prompt) AFTER the input and output
    /// </summary>
    std::string getPs1() const;
    void setPs1(std::string const& value);

    friend  void to_json(nlohmann::json& j, const TmuxPaneIoDocument& o);
    friend  void from_json(const nlohmann::json& j, TmuxPaneIoDocument& o);
protected:
    std::string m_Input;

    std::string m_Output;

    std::string m_Ps1;

    
};

} // namespace org::openapitools::server::model

#endif /* TmuxPaneIoDocument_H_ */