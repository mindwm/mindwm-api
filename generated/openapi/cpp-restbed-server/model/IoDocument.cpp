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



#include "IoDocument.h"

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

IoDocument::IoDocument(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string IoDocument::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void IoDocument::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree IoDocument::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("type", m_Type);
	pt.put("source", m_Source);
	pt.put("id", m_Id);
	pt.put("specversion", m_Specversion);
	pt.put("datacontenttype", m_Datacontenttype);
	pt.put("dataschema", m_Dataschema);
	pt.put("subject", m_Subject);
	pt.put("time", m_Time);
	pt.put("data_base64", m_Data_base64);
	return pt;
}

void IoDocument::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Type = pt.get("type", "");
	m_Source = pt.get("source", "");
	m_Id = pt.get("id", "");
	m_Specversion = pt.get("specversion", "");
	m_Datacontenttype = pt.get("datacontenttype", "");
	m_Dataschema = pt.get("dataschema", "");
	m_Subject = pt.get("subject", "IoDocument");
	m_Time = pt.get("time", "");
	m_Data_base64 = pt.get("data_base64", "");
}

std::string IoDocument::getType() const
{
    return m_Type;
}

void IoDocument::setType(std::string value)
{
    m_Type = value;
}


std::string IoDocument::getSource() const
{
    return m_Source;
}

void IoDocument::setSource(std::string value)
{
    m_Source = value;
}


TmuxPaneIoDocument IoDocument::getData() const
{
    return m_Data;
}

void IoDocument::setData(TmuxPaneIoDocument value)
{
    m_Data = value;
}


std::string IoDocument::getId() const
{
    return m_Id;
}

void IoDocument::setId(std::string value)
{
    m_Id = value;
}


std::string IoDocument::getSpecversion() const
{
    return m_Specversion;
}

void IoDocument::setSpecversion(std::string value)
{
    m_Specversion = value;
}


std::string IoDocument::getDatacontenttype() const
{
    return m_Datacontenttype;
}

void IoDocument::setDatacontenttype(std::string value)
{
    m_Datacontenttype = value;
}


std::string IoDocument::getDataschema() const
{
    return m_Dataschema;
}

void IoDocument::setDataschema(std::string value)
{
    m_Dataschema = value;
}


std::string IoDocument::getSubject() const
{
    return m_Subject;
}

void IoDocument::setSubject(std::string value)
{
    m_Subject = value;
}


std::string IoDocument::getTime() const
{
    return m_Time;
}

void IoDocument::setTime(std::string value)
{
    m_Time = value;
}


std::string IoDocument::getDataBase64() const
{
    return m_Data_base64;
}

void IoDocument::setDataBase64(std::string value)
{
    m_Data_base64 = value;
}



std::vector<IoDocument> createIoDocumentVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<IoDocument>();
    for (const auto& child: pt) {
        vec.emplace_back(IoDocument(child.second));
    }

    return vec;
}

}
}
}
}

