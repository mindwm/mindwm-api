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



#include "Neo4jCaptureDataChangeNodePayload.h"

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

Neo4jCaptureDataChangeNodePayload::Neo4jCaptureDataChangeNodePayload(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string Neo4jCaptureDataChangeNodePayload::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void Neo4jCaptureDataChangeNodePayload::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree Neo4jCaptureDataChangeNodePayload::toPropertyTree()
{
    return toPropertyTree_internal();
}

void Neo4jCaptureDataChangeNodePayload::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string Neo4jCaptureDataChangeNodePayload::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void Neo4jCaptureDataChangeNodePayload::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree Neo4jCaptureDataChangeNodePayload::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	if (m_After != nullptr) {
		pt.add_child("after", m_After->toPropertyTree());
	}
	pt.put("before", m_Before);
	pt.put("id", m_Id);
	pt.put("type", m_Type);
	return pt;
}

void Neo4jCaptureDataChangeNodePayload::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("after")) {
		m_After = std::make_shared<Neo4jCaptureDataChangeNodePayload_after>();
		m_After->fromPropertyTree(pt.get_child("after"));
	}
	m_Before = pt.get("before", "");
	m_Id = pt.get("id", "");
	m_Type = pt.get("type", "");
}

std::shared_ptr<Neo4jCaptureDataChangeNodePayload_after> Neo4jCaptureDataChangeNodePayload::getAfter() const
{
    return m_After;
}

void Neo4jCaptureDataChangeNodePayload::setAfter(std::shared_ptr<Neo4jCaptureDataChangeNodePayload_after> value)
{
	m_After = value;
}
std::string Neo4jCaptureDataChangeNodePayload::getBefore() const
{
    return m_Before;
}

void Neo4jCaptureDataChangeNodePayload::setBefore(std::string value)
{
	m_Before = value;
}
std::string Neo4jCaptureDataChangeNodePayload::getId() const
{
    return m_Id;
}

void Neo4jCaptureDataChangeNodePayload::setId(std::string value)
{
	m_Id = value;
}
std::string Neo4jCaptureDataChangeNodePayload::getType() const
{
    return m_Type;
}

void Neo4jCaptureDataChangeNodePayload::setType(std::string value)
{
	m_Type = value;
}

std::vector<Neo4jCaptureDataChangeNodePayload> createNeo4jCaptureDataChangeNodePayloadVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<Neo4jCaptureDataChangeNodePayload>();
    for (const auto& child: pt) {
        vec.emplace_back(Neo4jCaptureDataChangeNodePayload(child.second));
    }

    return vec;
}

}
}
}
}
