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



#include "TmuxPaneIoDocument.h"

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

TmuxPaneIoDocument::TmuxPaneIoDocument(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string TmuxPaneIoDocument::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void TmuxPaneIoDocument::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree TmuxPaneIoDocument::toPropertyTree()
{
    return toPropertyTree_internal();
}

void TmuxPaneIoDocument::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string TmuxPaneIoDocument::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void TmuxPaneIoDocument::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree TmuxPaneIoDocument::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("input", m_Input);
	pt.put("output", m_Output);
	pt.put("ps1", m_Ps1);
	return pt;
}

void TmuxPaneIoDocument::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_Input = pt.get("input", "");
	m_Output = pt.get("output", "");
	m_Ps1 = pt.get("ps1", "");
}

std::string TmuxPaneIoDocument::getInput() const
{
    return m_Input;
}

void TmuxPaneIoDocument::setInput(std::string value)
{
	m_Input = value;
}
std::string TmuxPaneIoDocument::getOutput() const
{
    return m_Output;
}

void TmuxPaneIoDocument::setOutput(std::string value)
{
	m_Output = value;
}
std::string TmuxPaneIoDocument::getPs1() const
{
    return m_Ps1;
}

void TmuxPaneIoDocument::setPs1(std::string value)
{
	m_Ps1 = value;
}

std::vector<TmuxPaneIoDocument> createTmuxPaneIoDocumentVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<TmuxPaneIoDocument>();
    for (const auto& child: pt) {
        vec.emplace_back(TmuxPaneIoDocument(child.second));
    }

    return vec;
}

}
}
}
}
