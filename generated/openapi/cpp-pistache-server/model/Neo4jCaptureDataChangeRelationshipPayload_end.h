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
 * Neo4jCaptureDataChangeRelationshipPayload_end.h
 *
 * 
 */

#ifndef Neo4jCaptureDataChangeRelationshipPayload_end_H_
#define Neo4jCaptureDataChangeRelationshipPayload_end_H_


#include <nlohmann/json.hpp>
#include <string>
#include <map>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  Neo4jCaptureDataChangeRelationshipPayload_end
{
public:
    Neo4jCaptureDataChangeRelationshipPayload_end();
    virtual ~Neo4jCaptureDataChangeRelationshipPayload_end() = default;


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

    bool operator==(const Neo4jCaptureDataChangeRelationshipPayload_end& rhs) const;
    bool operator!=(const Neo4jCaptureDataChangeRelationshipPayload_end& rhs) const;

    /////////////////////////////////////////////
    /// Neo4jCaptureDataChangeRelationshipPayload_end members

    /// <summary>
    /// 
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    std::map<std::string, nlohmann::json> getIds() const;
    void setIds(std::map<std::string, nlohmann::json> const& value);
    /// <summary>
    /// 
    /// </summary>
    std::vector<std::string> getLabels() const;
    void setLabels(std::vector<std::string> const& value);

    friend  void to_json(nlohmann::json& j, const Neo4jCaptureDataChangeRelationshipPayload_end& o);
    friend  void from_json(const nlohmann::json& j, Neo4jCaptureDataChangeRelationshipPayload_end& o);
protected:
    std::string m_Id;

    std::map<std::string, nlohmann::json> m_Ids;

    std::vector<std::string> m_Labels;

    
};

} // namespace org::openapitools::server::model

#endif /* Neo4jCaptureDataChangeRelationshipPayload_end_H_ */
