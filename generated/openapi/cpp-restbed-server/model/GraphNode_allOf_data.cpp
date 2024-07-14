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
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <boost/lexical_cast.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include "helpers.h"

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


std::string GraphNode_allOf_data::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void GraphNode_allOf_data::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GraphNode_allOf_data::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("message_key", m_Message_key);
	pt.add_child("meta", m_Meta.toPropertyTree());
	pt.put("offset", m_Offset);
	pt.put("partition", m_Partition);
	pt.put("source_type", m_Source_type);
	pt.put("timestamp", m_Timestamp);
	pt.put("topic", m_Topic);
	pt.add_child("schema", m_Schema.toPropertyTree());
	pt.add_child("payload", m_Payload.toPropertyTree());
	return pt;
}

void GraphNode_allOf_data::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Message_key = pt.get("message_key", "");
	if (pt.get_child_optional("meta")) {
        m_Meta = fromPt<Neo4jCaptureDataChange_meta>(pt.get_child("meta"));
	}
	m_Offset = pt.get("offset", 0);
	m_Partition = pt.get("partition", 0);
	m_Source_type = pt.get("source_type", "");
	m_Timestamp = pt.get("timestamp", "");
	m_Topic = pt.get("topic", "");
	if (pt.get_child_optional("schema")) {
        m_Schema = fromPt<Neo4jCaptureDataChange_schema>(pt.get_child("schema"));
	}
	if (pt.get_child_optional("payload")) {
        m_Payload = fromPt<Neo4jCaptureDataChangeNodePayload>(pt.get_child("payload"));
	}
}

std::string GraphNode_allOf_data::getHeaders() const
{
    return m_Headers;
}

void GraphNode_allOf_data::setHeaders(std::string value)
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


Neo4jCaptureDataChange_meta GraphNode_allOf_data::getMeta() const
{
    return m_Meta;
}

void GraphNode_allOf_data::setMeta(Neo4jCaptureDataChange_meta value)
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


Neo4jCaptureDataChange_schema GraphNode_allOf_data::getSchema() const
{
    return m_Schema;
}

void GraphNode_allOf_data::setSchema(Neo4jCaptureDataChange_schema value)
{
    m_Schema = value;
}


Neo4jCaptureDataChangeNodePayload GraphNode_allOf_data::getPayload() const
{
    return m_Payload;
}

void GraphNode_allOf_data::setPayload(Neo4jCaptureDataChangeNodePayload value)
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
