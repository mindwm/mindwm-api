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



#include "GraphNode_allOf_data.h"

#include <string>
#include <vector>
#include <sstream>
#include <stdexcept>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

GraphNode_allOf_data::GraphNode_allOf_data(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string GraphNode_allOf_data::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void GraphNode_allOf_data::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree GraphNode_allOf_data::toPropertyTree()
{
    return toPropertyTree_internal();
}

void GraphNode_allOf_data::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string GraphNode_allOf_data::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void GraphNode_allOf_data::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GraphNode_allOf_data::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("message_key", m_Message_key);
	if (m_Meta != nullptr) {
		pt.add_child("meta", m_Meta->toPropertyTree());
	}
	pt.put("offset", m_Offset);
	pt.put("partition", m_Partition);
	pt.put("source_type", m_Source_type);
	pt.put("timestamp", m_Timestamp);
	pt.put("topic", m_Topic);
	if (m_Schema != nullptr) {
		pt.add_child("schema", m_Schema->toPropertyTree());
	}
	if (m_Payload != nullptr) {
		pt.add_child("payload", m_Payload->toPropertyTree());
	}
	return pt;
}

void GraphNode_allOf_data::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_Message_key = pt.get("message_key", "");
	if (pt.get_child_optional("meta")) {
		m_Meta = std::make_shared<Neo4jCaptureDataChange_meta>();
		m_Meta->fromPropertyTree(pt.get_child("meta"));
	}
	m_Offset = pt.get("offset", 0);
	m_Partition = pt.get("partition", 0);
	m_Source_type = pt.get("source_type", "");
	m_Timestamp = pt.get("timestamp", "");
	m_Topic = pt.get("topic", "");
	if (pt.get_child_optional("schema")) {
		m_Schema = std::make_shared<Neo4jCaptureDataChange_schema>();
		m_Schema->fromPropertyTree(pt.get_child("schema"));
	}
	if (pt.get_child_optional("payload")) {
		m_Payload = std::make_shared<Neo4jCaptureDataChangeNodePayload>();
		m_Payload->fromPropertyTree(pt.get_child("payload"));
	}
}

std::shared_ptr<Object> GraphNode_allOf_data::getHeaders() const
{
    return m_Headers;
}

void GraphNode_allOf_data::setHeaders(std::shared_ptr<Object> value)
{
	m_Headers = value;
}
std::string GraphNode_allOf_data::getMessageKey() const
{
    return m_Message_key;
}

void GraphNode_allOf_data::setMessageKey(std::string value)
{
	m_Message_key = value;
}
std::shared_ptr<Neo4jCaptureDataChange_meta> GraphNode_allOf_data::getMeta() const
{
    return m_Meta;
}

void GraphNode_allOf_data::setMeta(std::shared_ptr<Neo4jCaptureDataChange_meta> value)
{
	m_Meta = value;
}
int32_t GraphNode_allOf_data::getOffset() const
{
    return m_Offset;
}

void GraphNode_allOf_data::setOffset(int32_t value)
{
	m_Offset = value;
}
int32_t GraphNode_allOf_data::getPartition() const
{
    return m_Partition;
}

void GraphNode_allOf_data::setPartition(int32_t value)
{
	m_Partition = value;
}
std::string GraphNode_allOf_data::getSourceType() const
{
    return m_Source_type;
}

void GraphNode_allOf_data::setSourceType(std::string value)
{
	m_Source_type = value;
}
std::string GraphNode_allOf_data::getTimestamp() const
{
    return m_Timestamp;
}

void GraphNode_allOf_data::setTimestamp(std::string value)
{
	m_Timestamp = value;
}
std::string GraphNode_allOf_data::getTopic() const
{
    return m_Topic;
}

void GraphNode_allOf_data::setTopic(std::string value)
{
	m_Topic = value;
}
std::shared_ptr<Neo4jCaptureDataChange_schema> GraphNode_allOf_data::getSchema() const
{
    return m_Schema;
}

void GraphNode_allOf_data::setSchema(std::shared_ptr<Neo4jCaptureDataChange_schema> value)
{
	m_Schema = value;
}
std::shared_ptr<Neo4jCaptureDataChangeNodePayload> GraphNode_allOf_data::getPayload() const
{
    return m_Payload;
}

void GraphNode_allOf_data::setPayload(std::shared_ptr<Neo4jCaptureDataChangeNodePayload> value)
{
	m_Payload = value;
}

std::vector<GraphNode_allOf_data> createGraphNode_allOf_dataVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GraphNode_allOf_data>();
    for (const auto& child: pt) {
        vec.emplace_back(GraphNode_allOf_data(child.second));
    }

    return vec;
}

}
}
}
}
