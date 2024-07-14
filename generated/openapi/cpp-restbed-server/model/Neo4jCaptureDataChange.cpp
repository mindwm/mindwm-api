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



#include "Neo4jCaptureDataChange.h"

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

Neo4jCaptureDataChange::Neo4jCaptureDataChange(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string Neo4jCaptureDataChange::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void Neo4jCaptureDataChange::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree Neo4jCaptureDataChange::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Headers
    if (!m_Headers.empty()) {
        tmp_node = toPt(m_Headers);
        pt.add_child("headers", tmp_node);
    }
    tmp_node.clear();
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

void Neo4jCaptureDataChange::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
    if (pt.get_child_optional("headers")) {
        m_Headers = fromPt<std::map<std::string, AnyType>>(pt.get_child("headers"));
    }
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
        m_Payload = fromPt<Neo4jCaptureDataChange_payload>(pt.get_child("payload"));
	}
}

std::map<std::string, AnyType> Neo4jCaptureDataChange::getHeaders() const
{
    return m_Headers;
}

void Neo4jCaptureDataChange::setHeaders(std::map<std::string, AnyType> value)
{
    m_Headers = value;
}


std::string Neo4jCaptureDataChange::getMessageKey() const
{
    return m_Message_key;
}

void Neo4jCaptureDataChange::setMessageKey(std::string value)
{
    m_Message_key = value;
}


Neo4jCaptureDataChange_meta Neo4jCaptureDataChange::getMeta() const
{
    return m_Meta;
}

void Neo4jCaptureDataChange::setMeta(Neo4jCaptureDataChange_meta value)
{
    m_Meta = value;
}


int32_t Neo4jCaptureDataChange::getOffset() const
{
    return m_Offset;
}

void Neo4jCaptureDataChange::setOffset(int32_t value)
{
    m_Offset = value;
}


int32_t Neo4jCaptureDataChange::getPartition() const
{
    return m_Partition;
}

void Neo4jCaptureDataChange::setPartition(int32_t value)
{
    m_Partition = value;
}


std::string Neo4jCaptureDataChange::getSourceType() const
{
    return m_Source_type;
}

void Neo4jCaptureDataChange::setSourceType(std::string value)
{
    m_Source_type = value;
}


std::string Neo4jCaptureDataChange::getTimestamp() const
{
    return m_Timestamp;
}

void Neo4jCaptureDataChange::setTimestamp(std::string value)
{
    m_Timestamp = value;
}


std::string Neo4jCaptureDataChange::getTopic() const
{
    return m_Topic;
}

void Neo4jCaptureDataChange::setTopic(std::string value)
{
    m_Topic = value;
}


Neo4jCaptureDataChange_schema Neo4jCaptureDataChange::getSchema() const
{
    return m_Schema;
}

void Neo4jCaptureDataChange::setSchema(Neo4jCaptureDataChange_schema value)
{
    m_Schema = value;
}


Neo4jCaptureDataChange_payload Neo4jCaptureDataChange::getPayload() const
{
    return m_Payload;
}

void Neo4jCaptureDataChange::setPayload(Neo4jCaptureDataChange_payload value)
{
    m_Payload = value;
}



std::vector<Neo4jCaptureDataChange> createNeo4jCaptureDataChangeVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<Neo4jCaptureDataChange>();
    for (const auto& child: pt) {
        vec.emplace_back(Neo4jCaptureDataChange(child.second));
    }

    return vec;
}

}
}
}
}
