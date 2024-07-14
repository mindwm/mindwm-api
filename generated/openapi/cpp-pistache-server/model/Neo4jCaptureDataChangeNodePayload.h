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
 * Neo4jCaptureDataChangeNodePayload.h
 *
 * 
 */

#ifndef Neo4jCaptureDataChangeNodePayload_H_
#define Neo4jCaptureDataChangeNodePayload_H_


#include <string>
#include "Neo4jCaptureDataChangeNodePayload_after.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  Neo4jCaptureDataChangeNodePayload
{
public:
    Neo4jCaptureDataChangeNodePayload();
    virtual ~Neo4jCaptureDataChangeNodePayload() = default;


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

    bool operator==(const Neo4jCaptureDataChangeNodePayload& rhs) const;
    bool operator!=(const Neo4jCaptureDataChangeNodePayload& rhs) const;

    /////////////////////////////////////////////
    /// Neo4jCaptureDataChangeNodePayload members

    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::Neo4jCaptureDataChangeNodePayload_after getAfter() const;
    void setAfter(org::openapitools::server::model::Neo4jCaptureDataChangeNodePayload_after const& value);
    /// <summary>
    /// 
    /// </summary>
    std::string getBefore() const;
    void setBefore(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    std::string getType() const;
    void setType(std::string const& value);

    friend  void to_json(nlohmann::json& j, const Neo4jCaptureDataChangeNodePayload& o);
    friend  void from_json(const nlohmann::json& j, Neo4jCaptureDataChangeNodePayload& o);
protected:
    org::openapitools::server::model::Neo4jCaptureDataChangeNodePayload_after m_After;

    std::string m_Before;

    std::string m_Id;

    std::string m_Type;

    
};

} // namespace org::openapitools::server::model

#endif /* Neo4jCaptureDataChangeNodePayload_H_ */