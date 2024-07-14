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



#include "Neo4jCaptureDataChangeNodePayload_after.h"

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

Neo4jCaptureDataChangeNodePayload_after::Neo4jCaptureDataChangeNodePayload_after(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string Neo4jCaptureDataChangeNodePayload_after::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void Neo4jCaptureDataChangeNodePayload_after::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree Neo4jCaptureDataChangeNodePayload_after::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Labels
    tmp_node.clear();
	if (!m_Labels.empty()) {
        tmp_node = toPt(m_Labels);
		pt.add_child("labels", tmp_node);
		tmp_node.clear();
	}
	// generate tree for Properties
    if (!m_Properties.empty()) {
        tmp_node = toPt(m_Properties);
        pt.add_child("properties", tmp_node);
    }
    tmp_node.clear();
	return pt;
}

void Neo4jCaptureDataChangeNodePayload_after::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Labels into member
	if (pt.get_child_optional("labels")) {
        m_Labels = fromPt<std::vector<std::string>>(pt.get_child("labels"));
	}
    if (pt.get_child_optional("properties")) {
        m_Properties = fromPt<std::map<std::string, AnyType>>(pt.get_child("properties"));
    }
}

std::vector<std::string> Neo4jCaptureDataChangeNodePayload_after::getLabels() const
{
    return m_Labels;
}

void Neo4jCaptureDataChangeNodePayload_after::setLabels(std::vector<std::string> value)
{
    m_Labels = value;
}


std::map<std::string, AnyType> Neo4jCaptureDataChangeNodePayload_after::getProperties() const
{
    return m_Properties;
}

void Neo4jCaptureDataChangeNodePayload_after::setProperties(std::map<std::string, AnyType> value)
{
    m_Properties = value;
}



std::vector<Neo4jCaptureDataChangeNodePayload_after> createNeo4jCaptureDataChangeNodePayload_afterVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<Neo4jCaptureDataChangeNodePayload_after>();
    for (const auto& child: pt) {
        vec.emplace_back(Neo4jCaptureDataChangeNodePayload_after(child.second));
    }

    return vec;
}

}
}
}
}
