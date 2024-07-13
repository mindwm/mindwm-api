
#include "Neo4jCaptureDataChange_payload.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_Neo4jCaptureDataChange_payload_before_is_assigned_from_json()
{


    bourne::json input =
    {
        "before", "hello"
    };

    Neo4jCaptureDataChange_payload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBefore().c_str());






}


void test_Neo4jCaptureDataChange_payload_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    Neo4jCaptureDataChange_payload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_Neo4jCaptureDataChange_payload_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    Neo4jCaptureDataChange_payload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}



void test_Neo4jCaptureDataChange_payload_label_is_assigned_from_json()
{


    bourne::json input =
    {
        "label", "hello"
    };

    Neo4jCaptureDataChange_payload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLabel().c_str());






}





void test_Neo4jCaptureDataChange_payload_before_is_converted_to_json()
{

    bourne::json input =
    {
        "before", "hello"
    };

    Neo4jCaptureDataChange_payload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["before"] == output["before"]);



}


void test_Neo4jCaptureDataChange_payload_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    Neo4jCaptureDataChange_payload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_Neo4jCaptureDataChange_payload_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    Neo4jCaptureDataChange_payload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}



void test_Neo4jCaptureDataChange_payload_label_is_converted_to_json()
{

    bourne::json input =
    {
        "label", "hello"
    };

    Neo4jCaptureDataChange_payload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["label"] == output["label"]);



}



