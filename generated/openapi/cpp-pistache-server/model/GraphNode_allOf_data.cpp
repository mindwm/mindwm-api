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


#include "GraphNode_allOf_data.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

GraphNode_allOf_data::GraphNode_allOf_data()
{
    m_Message_key = "";
    m_Offset = 0;
    m_Partition = 0;
    m_Source_type = "";
    m_Timestamp = "";
    m_Topic = "";
    
}

void GraphNode_allOf_data::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool GraphNode_allOf_data::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool GraphNode_allOf_data::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "GraphNode_allOf_data" : pathPrefix;

                
    if (!m_Meta.validate(msg, _pathPrefix + ".meta")) {
        msg << _pathPrefix << ": Meta is invalid;";
        success = false;
    }                        
    if (!m_Schema.validate(msg, _pathPrefix + ".schema")) {
        msg << _pathPrefix << ": Schema is invalid;";
        success = false;
    }    
    if (!m_Payload.validate(msg, _pathPrefix + ".payload")) {
        msg << _pathPrefix << ": Payload is invalid;";
        success = false;
    }
    return success;
}

bool GraphNode_allOf_data::operator==(const GraphNode_allOf_data& rhs) const
{
    return
    
    
    (getHeaders() == rhs.getHeaders())
     &&
    
    (getMessageKey() == rhs.getMessageKey())
     &&
    
    (getMeta() == rhs.getMeta())
     &&
    
    (getOffset() == rhs.getOffset())
     &&
    
    (getPartition() == rhs.getPartition())
     &&
    
    (getSourceType() == rhs.getSourceType())
     &&
    
    (getTimestamp() == rhs.getTimestamp())
     &&
    
    (getTopic() == rhs.getTopic())
     &&
    
    (getSchema() == rhs.getSchema())
     &&
    
    (getPayload() == rhs.getPayload())
    
    
    ;
}

bool GraphNode_allOf_data::operator!=(const GraphNode_allOf_data& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const GraphNode_allOf_data& o)
{
    j = nlohmann::json::object();
    j["headers"] = o.m_Headers;
    j["message_key"] = o.m_Message_key;
    j["meta"] = o.m_Meta;
    j["offset"] = o.m_Offset;
    j["partition"] = o.m_Partition;
    j["source_type"] = o.m_Source_type;
    j["timestamp"] = o.m_Timestamp;
    j["topic"] = o.m_Topic;
    j["schema"] = o.m_Schema;
    j["payload"] = o.m_Payload;
    
}

void from_json(const nlohmann::json& j, GraphNode_allOf_data& o)
{
    j.at("headers").get_to(o.m_Headers);
    j.at("message_key").get_to(o.m_Message_key);
    j.at("meta").get_to(o.m_Meta);
    j.at("offset").get_to(o.m_Offset);
    j.at("partition").get_to(o.m_Partition);
    j.at("source_type").get_to(o.m_Source_type);
    j.at("timestamp").get_to(o.m_Timestamp);
    j.at("topic").get_to(o.m_Topic);
    j.at("schema").get_to(o.m_Schema);
    j.at("payload").get_to(o.m_Payload);
    
}

nlohmann::json GraphNode_allOf_data::getHeaders() const
{
    return m_Headers;
}
void GraphNode_allOf_data::setHeaders(nlohmann::json const& value)
{
    m_Headers = value;
}
std::string GraphNode_allOf_data::getMessageKey() const
{
    return m_Message_key;
}
void GraphNode_allOf_data::setMessageKey(std::string const& value)
{
    m_Message_key = value;
}
org::openapitools::server::model::Neo4jCaptureDataChange_meta GraphNode_allOf_data::getMeta() const
{
    return m_Meta;
}
void GraphNode_allOf_data::setMeta(org::openapitools::server::model::Neo4jCaptureDataChange_meta const& value)
{
    m_Meta = value;
}
int32_t GraphNode_allOf_data::getOffset() const
{
    return m_Offset;
}
void GraphNode_allOf_data::setOffset(int32_t const value)
{
    m_Offset = value;
}
int32_t GraphNode_allOf_data::getPartition() const
{
    return m_Partition;
}
void GraphNode_allOf_data::setPartition(int32_t const value)
{
    m_Partition = value;
}
std::string GraphNode_allOf_data::getSourceType() const
{
    return m_Source_type;
}
void GraphNode_allOf_data::setSourceType(std::string const& value)
{
    m_Source_type = value;
}
std::string GraphNode_allOf_data::getTimestamp() const
{
    return m_Timestamp;
}
void GraphNode_allOf_data::setTimestamp(std::string const& value)
{
    m_Timestamp = value;
}
std::string GraphNode_allOf_data::getTopic() const
{
    return m_Topic;
}
void GraphNode_allOf_data::setTopic(std::string const& value)
{
    m_Topic = value;
}
org::openapitools::server::model::Neo4jCaptureDataChange_schema GraphNode_allOf_data::getSchema() const
{
    return m_Schema;
}
void GraphNode_allOf_data::setSchema(org::openapitools::server::model::Neo4jCaptureDataChange_schema const& value)
{
    m_Schema = value;
}
org::openapitools::server::model::Neo4jCaptureDataChangeNodePayload GraphNode_allOf_data::getPayload() const
{
    return m_Payload;
}
void GraphNode_allOf_data::setPayload(org::openapitools::server::model::Neo4jCaptureDataChangeNodePayload const& value)
{
    m_Payload = value;
}


} // namespace org::openapitools::server::model

