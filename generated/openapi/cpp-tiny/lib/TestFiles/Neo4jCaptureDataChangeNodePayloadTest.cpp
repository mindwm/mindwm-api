
#include "Neo4jCaptureDataChangeNodePayload.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_Neo4jCaptureDataChangeNodePayload_before_is_assigned_from_json()
{


    bourne::json input =
    {
        "before", "hello"
    };

    Neo4jCaptureDataChangeNodePayload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBefore().c_str());






}


void test_Neo4jCaptureDataChangeNodePayload_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    Neo4jCaptureDataChangeNodePayload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_Neo4jCaptureDataChangeNodePayload_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    Neo4jCaptureDataChangeNodePayload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}




void test_Neo4jCaptureDataChangeNodePayload_before_is_converted_to_json()
{

    bourne::json input =
    {
        "before", "hello"
    };

    Neo4jCaptureDataChangeNodePayload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["before"] == output["before"]);



}


void test_Neo4jCaptureDataChangeNodePayload_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    Neo4jCaptureDataChangeNodePayload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_Neo4jCaptureDataChangeNodePayload_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    Neo4jCaptureDataChangeNodePayload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


