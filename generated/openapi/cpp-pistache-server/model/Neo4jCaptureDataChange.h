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
 * Neo4jCaptureDataChange.h
 *
 * 
 */

#ifndef Neo4jCaptureDataChange_H_
#define Neo4jCaptureDataChange_H_


#include "Neo4jCaptureDataChange_payload.h"
#include <nlohmann/json.hpp>
#include <string>
#include "Neo4jCaptureDataChange_meta.h"
#include <map>
#include "Neo4jCaptureDataChange_schema.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  Neo4jCaptureDataChange
{
public:
    Neo4jCaptureDataChange();
    virtual ~Neo4jCaptureDataChange() = default;


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

    bool operator==(const Neo4jCaptureDataChange& rhs) const;
    bool operator!=(const Neo4jCaptureDataChange& rhs) const;

    /////////////////////////////////////////////
    /// Neo4jCaptureDataChange members

    /// <summary>
    /// 
    /// </summary>
    std::map<std::string, nlohmann::json> getHeaders() const;
    void setHeaders(std::map<std::string, nlohmann::json> const& value);
    /// <summary>
    /// 
    /// </summary>
    std::string getMessageKey() const;
    void setMessageKey(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::Neo4jCaptureDataChange_meta getMeta() const;
    void setMeta(org::openapitools::server::model::Neo4jCaptureDataChange_meta const& value);
    /// <summary>
    /// 
    /// </summary>
    int32_t getOffset() const;
    void setOffset(int32_t const value);
    /// <summary>
    /// 
    /// </summary>
    int32_t getPartition() const;
    void setPartition(int32_t const value);
    /// <summary>
    /// 
    /// </summary>
    std::string getSourceType() const;
    void setSourceType(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    std::string getTimestamp() const;
    void setTimestamp(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    std::string getTopic() const;
    void setTopic(std::string const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::Neo4jCaptureDataChange_schema getSchema() const;
    void setSchema(org::openapitools::server::model::Neo4jCaptureDataChange_schema const& value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::Neo4jCaptureDataChange_payload getPayload() const;
    void setPayload(org::openapitools::server::model::Neo4jCaptureDataChange_payload const& value);

    friend  void to_json(nlohmann::json& j, const Neo4jCaptureDataChange& o);
    friend  void from_json(const nlohmann::json& j, Neo4jCaptureDataChange& o);
protected:
    std::map<std::string, nlohmann::json> m_Headers;

    std::string m_Message_key;

    org::openapitools::server::model::Neo4jCaptureDataChange_meta m_Meta;

    int32_t m_Offset;

    int32_t m_Partition;

    std::string m_Source_type;

    std::string m_Timestamp;

    std::string m_Topic;

    org::openapitools::server::model::Neo4jCaptureDataChange_schema m_Schema;

    org::openapitools::server::model::Neo4jCaptureDataChange_payload m_Payload;

    
};

} // namespace org::openapitools::server::model

#endif /* Neo4jCaptureDataChange_H_ */
