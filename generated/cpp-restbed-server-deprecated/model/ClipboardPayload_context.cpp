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



#include "ClipboardPayload_context.h"

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

ClipboardPayload_context::ClipboardPayload_context(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string ClipboardPayload_context::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void ClipboardPayload_context::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree ClipboardPayload_context::toPropertyTree()
{
    return toPropertyTree_internal();
}

void ClipboardPayload_context::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string ClipboardPayload_context::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void ClipboardPayload_context::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ClipboardPayload_context::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("window", m_Window);
	return pt;
}

void ClipboardPayload_context::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_Window = pt.get("window", "");
}

std::string ClipboardPayload_context::getWindow() const
{
    return m_Window;
}

void ClipboardPayload_context::setWindow(std::string value)
{
	m_Window = value;
}

std::vector<ClipboardPayload_context> createClipboardPayload_contextVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ClipboardPayload_context>();
    for (const auto& child: pt) {
        vec.emplace_back(ClipboardPayload_context(child.second));
    }

    return vec;
}

}
}
}
}

