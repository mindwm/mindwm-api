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



#include "GraphRelationship.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <algorithm>
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

GraphRelationship::GraphRelationship(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string GraphRelationship::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void GraphRelationship::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GraphRelationship::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("source", m_Source);
	pt.put("specversion", m_Specversion);
	pt.put("type", m_Type);
	pt.put("datacontenttype", m_Datacontenttype);
	pt.put("dataschema", m_Dataschema);
	pt.put("subject", m_Subject);
	pt.put("time", m_Time);
	pt.add_child("data", m_Data.toPropertyTree());
	pt.put("data_base64", m_Data_base64);
	return pt;
}

void GraphRelationship::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", "");
	setSource(pt.get("source", ""));
	m_Specversion = pt.get("specversion", "");
	setType(pt.get("type", ""));
	m_Datacontenttype = pt.get("datacontenttype", "");
	m_Dataschema = pt.get("dataschema", "");
	m_Subject = pt.get("subject", "");
	m_Time = pt.get("time", "");
	if (pt.get_child_optional("data")) {
        m_Data = fromPt<GraphRelationship_allOf_data>(pt.get_child("data"));
	}
	m_Data_base64 = pt.get("data_base64", "");
}

std::string GraphRelationship::getId() const
{
    return m_Id;
}

void GraphRelationship::setId(std::string value)
{
    m_Id = value;
}


std::string GraphRelationship::getSource() const
{
    return m_Source;
}

void GraphRelationship::setSource(std::string value)
{
    static const std::array<std::string, 1> allowedValues = {
        "graph.relationship"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Source = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


std::string GraphRelationship::getSpecversion() const
{
    return m_Specversion;
}

void GraphRelationship::setSpecversion(std::string value)
{
    m_Specversion = value;
}


std::string GraphRelationship::getType() const
{
    return m_Type;
}

void GraphRelationship::setType(std::string value)
{
    static const std::array<std::string, 3> allowedValues = {
        "created", "updated", "deleted"
    };

    if (std::find(allowedValues.begin(), allowedValues.end(), value) != allowedValues.end()) {
		m_Type = value;
	} else {
		throw std::runtime_error("Value " + boost::lexical_cast<std::string>(value) + " not allowed");
	}
}


std::string GraphRelationship::getDatacontenttype() const
{
    return m_Datacontenttype;
}

void GraphRelationship::setDatacontenttype(std::string value)
{
    m_Datacontenttype = value;
}


std::string GraphRelationship::getDataschema() const
{
    return m_Dataschema;
}

void GraphRelationship::setDataschema(std::string value)
{
    m_Dataschema = value;
}


std::string GraphRelationship::getSubject() const
{
    return m_Subject;
}

void GraphRelationship::setSubject(std::string value)
{
    m_Subject = value;
}


std::string GraphRelationship::getTime() const
{
    return m_Time;
}

void GraphRelationship::setTime(std::string value)
{
    m_Time = value;
}


GraphRelationship_allOf_data GraphRelationship::getData() const
{
    return m_Data;
}

void GraphRelationship::setData(GraphRelationship_allOf_data value)
{
    m_Data = value;
}


std::string GraphRelationship::getDataBase64() const
{
    return m_Data_base64;
}

void GraphRelationship::setDataBase64(std::string value)
{
    m_Data_base64 = value;
}



std::vector<GraphRelationship> createGraphRelationshipVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GraphRelationship>();
    for (const auto& child: pt) {
        vec.emplace_back(GraphRelationship(child.second));
    }

    return vec;
}

}
}
}
}
