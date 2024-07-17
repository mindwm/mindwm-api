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



#include "Clipboard.h"

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

Clipboard::Clipboard(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string Clipboard::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void Clipboard::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree Clipboard::toPropertyTree()
{
    return toPropertyTree_internal();
}

void Clipboard::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string Clipboard::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void Clipboard::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree Clipboard::toPropertyTree_internal()
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

void Clipboard::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", "");
	m_Source = pt.get("source", "");
	m_Specversion = pt.get("specversion", "");
	m_Type = pt.get("type", "");
	m_Datacontenttype = pt.get("datacontenttype", "");
	m_Dataschema = pt.get("dataschema", "");
	m_Subject = pt.get("subject", "");
	m_Time = pt.get("time", "");
	if (pt.get_child_optional("data")) {
		m_Data = std::make_shared<ClipboardPayload>();
		m_Data->fromPropertyTree(pt.get_child("data"));
	}
	m_Data_base64 = pt.get("data_base64", "");
}

std::string Clipboard::getId() const
{
    return m_Id;
}

void Clipboard::setId(std::string value)
{
	m_Id = value;
}
std::string Clipboard::getSource() const
{
    return m_Source;
}

void Clipboard::setSource(std::string value)
{
	m_Source = value;
}
std::string Clipboard::getSpecversion() const
{
    return m_Specversion;
}

void Clipboard::setSpecversion(std::string value)
{
	m_Specversion = value;
}
std::string Clipboard::getType() const
{
    return m_Type;
}

void Clipboard::setType(std::string value)
{
	m_Type = value;
}
std::string Clipboard::getDatacontenttype() const
{
    return m_Datacontenttype;
}

void Clipboard::setDatacontenttype(std::string value)
{
	m_Datacontenttype = value;
}
std::string Clipboard::getDataschema() const
{
    return m_Dataschema;
}

void Clipboard::setDataschema(std::string value)
{
	m_Dataschema = value;
}
std::string Clipboard::getSubject() const
{
    return m_Subject;
}

void Clipboard::setSubject(std::string value)
{
	m_Subject = value;
}
std::string Clipboard::getTime() const
{
    return m_Time;
}

void Clipboard::setTime(std::string value)
{
	m_Time = value;
}
std::shared_ptr<ClipboardPayload> Clipboard::getData() const
{
    return m_Data;
}

void Clipboard::setData(std::shared_ptr<ClipboardPayload> value)
{
	m_Data = value;
}
std::string Clipboard::getDataBase64() const
{
    return m_Data_base64;
}

void Clipboard::setDataBase64(std::string value)
{
	m_Data_base64 = value;
}

std::vector<Clipboard> createClipboardVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<Clipboard>();
    for (const auto& child: pt) {
        vec.emplace_back(Clipboard(child.second));
    }

    return vec;
}

}
}
}
}

