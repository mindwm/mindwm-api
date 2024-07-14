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



#include "GraphNode.h"

#include <string>
#include <vector>
#include <sstream>
#include <stdexcept>
#include <algorithm>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

GraphNode::GraphNode(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string GraphNode::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void GraphNode::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree GraphNode::toPropertyTree()
{
    return toPropertyTree_internal();
}

void GraphNode::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string GraphNode::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void GraphNode::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GraphNode::toPropertyTree_internal()
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
	if (m_Data != nullptr) {
		pt.add_child("data", m_Data->toPropertyTree());
	}
	pt.put("data_base64", m_Data_base64);
	return pt;
}

void GraphNode::fromPropertyTree_internal(ptree const &pt)
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
		m_Data = std::make_shared<GraphNode_allOf_data>();
		m_Data->fromPropertyTree(pt.get_child("data"));
	}
	m_Data_base64 = pt.get("data_base64", "");
}

std::string GraphNode::getId() const
{
    return m_Id;
}

void GraphNode::setId(std::string value)
{
	m_Id = value;
}
std::string GraphNode::getSource() const
{
    return m_Source;
}

void GraphNode::setSource(std::string value)
{
	if (std::find(m_SourceEnum.begin(), m_SourceEnum.end(), value) != m_SourceEnum.end()) {
		m_Source = value;
	} else {
		throw std::runtime_error("Value " + value + " not allowed");
	}
}
std::string GraphNode::getSpecversion() const
{
    return m_Specversion;
}

void GraphNode::setSpecversion(std::string value)
{
	m_Specversion = value;
}
std::string GraphNode::getType() const
{
    return m_Type;
}

void GraphNode::setType(std::string value)
{
	if (std::find(m_TypeEnum.begin(), m_TypeEnum.end(), value) != m_TypeEnum.end()) {
		m_Type = value;
	} else {
		throw std::runtime_error("Value " + value + " not allowed");
	}
}
std::string GraphNode::getDatacontenttype() const
{
    return m_Datacontenttype;
}

void GraphNode::setDatacontenttype(std::string value)
{
	m_Datacontenttype = value;
}
std::string GraphNode::getDataschema() const
{
    return m_Dataschema;
}

void GraphNode::setDataschema(std::string value)
{
	m_Dataschema = value;
}
std::string GraphNode::getSubject() const
{
    return m_Subject;
}

void GraphNode::setSubject(std::string value)
{
	m_Subject = value;
}
std::string GraphNode::getTime() const
{
    return m_Time;
}

void GraphNode::setTime(std::string value)
{
	m_Time = value;
}
std::shared_ptr<GraphNode_allOf_data> GraphNode::getData() const
{
    return m_Data;
}

void GraphNode::setData(std::shared_ptr<GraphNode_allOf_data> value)
{
	m_Data = value;
}
std::string GraphNode::getDataBase64() const
{
    return m_Data_base64;
}

void GraphNode::setDataBase64(std::string value)
{
	m_Data_base64 = value;
}

std::vector<GraphNode> createGraphNodeVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GraphNode>();
    for (const auto& child: pt) {
        vec.emplace_back(GraphNode(child.second));
    }

    return vec;
}

}
}
}
}
