
#include "Neo4jCaptureDataChangeRelationshipPayload.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_Neo4jCaptureDataChangeRelationshipPayload_before_is_assigned_from_json()
{


    bourne::json input =
    {
        "before", "hello"
    };

    Neo4jCaptureDataChangeRelationshipPayload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getBefore().c_str());






}



void test_Neo4jCaptureDataChangeRelationshipPayload_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    Neo4jCaptureDataChangeRelationshipPayload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_Neo4jCaptureDataChangeRelationshipPayload_label_is_assigned_from_json()
{


    bourne::json input =
    {
        "label", "hello"
    };

    Neo4jCaptureDataChangeRelationshipPayload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLabel().c_str());






}



void test_Neo4jCaptureDataChangeRelationshipPayload_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    Neo4jCaptureDataChangeRelationshipPayload obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}




void test_Neo4jCaptureDataChangeRelationshipPayload_before_is_converted_to_json()
{

    bourne::json input =
    {
        "before", "hello"
    };

    Neo4jCaptureDataChangeRelationshipPayload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["before"] == output["before"]);



}



void test_Neo4jCaptureDataChangeRelationshipPayload_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    Neo4jCaptureDataChangeRelationshipPayload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_Neo4jCaptureDataChangeRelationshipPayload_label_is_converted_to_json()
{

    bourne::json input =
    {
        "label", "hello"
    };

    Neo4jCaptureDataChangeRelationshipPayload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["label"] == output["label"]);



}



void test_Neo4jCaptureDataChangeRelationshipPayload_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    Neo4jCaptureDataChangeRelationshipPayload obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


