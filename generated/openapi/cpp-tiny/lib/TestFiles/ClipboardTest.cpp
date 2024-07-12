
#include "Clipboard.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Clipboard_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    Clipboard obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}


void test_Clipboard_source_is_assigned_from_json()
{


    bourne::json input =
    {
        "source", "hello"
    };

    Clipboard obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSource().c_str());






}



void test_Clipboard_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    Clipboard obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_Clipboard_specversion_is_assigned_from_json()
{


    bourne::json input =
    {
        "specversion", "hello"
    };

    Clipboard obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSpecversion().c_str());






}


void test_Clipboard_datacontenttype_is_assigned_from_json()
{


    bourne::json input =
    {
        "datacontenttype", "hello"
    };

    Clipboard obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDatacontenttype().c_str());






}


void test_Clipboard_dataschema_is_assigned_from_json()
{


    bourne::json input =
    {
        "dataschema", "hello"
    };

    Clipboard obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDataschema().c_str());






}


void test_Clipboard_subject_is_assigned_from_json()
{


    bourne::json input =
    {
        "subject", "hello"
    };

    Clipboard obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSubject().c_str());






}


void test_Clipboard_time_is_assigned_from_json()
{








}


void test_Clipboard_data_base64_is_assigned_from_json()
{


    bourne::json input =
    {
        "data_base64", "hello"
    };

    Clipboard obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDataBase64().c_str());






}



void test_Clipboard_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    Clipboard obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


void test_Clipboard_source_is_converted_to_json()
{

    bourne::json input =
    {
        "source", "hello"
    };

    Clipboard obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["source"] == output["source"]);



}



void test_Clipboard_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    Clipboard obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_Clipboard_specversion_is_converted_to_json()
{

    bourne::json input =
    {
        "specversion", "hello"
    };

    Clipboard obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["specversion"] == output["specversion"]);



}


void test_Clipboard_datacontenttype_is_converted_to_json()
{

    bourne::json input =
    {
        "datacontenttype", "hello"
    };

    Clipboard obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["datacontenttype"] == output["datacontenttype"]);



}


void test_Clipboard_dataschema_is_converted_to_json()
{

    bourne::json input =
    {
        "dataschema", "hello"
    };

    Clipboard obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["dataschema"] == output["dataschema"]);



}


void test_Clipboard_subject_is_converted_to_json()
{

    bourne::json input =
    {
        "subject", "hello"
    };

    Clipboard obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["subject"] == output["subject"]);



}


void test_Clipboard_time_is_converted_to_json()
{




}


void test_Clipboard_data_base64_is_converted_to_json()
{

    bourne::json input =
    {
        "data_base64", "hello"
    };

    Clipboard obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["data_base64"] == output["data_base64"]);



}


