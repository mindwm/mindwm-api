
#include "GraphNode_allOf_data.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_GraphNode_allOf_data_message_key_is_assigned_from_json()
{


    bourne::json input =
    {
        "message_key", "hello"
    };

    GraphNode_allOf_data obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessageKey().c_str());






}



void test_GraphNode_allOf_data_offset_is_assigned_from_json()
{
    bourne::json input =
    {
        "offset", 1
    };

    GraphNode_allOf_data obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOffset());








}


void test_GraphNode_allOf_data_partition_is_assigned_from_json()
{
    bourne::json input =
    {
        "partition", 1
    };

    GraphNode_allOf_data obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPartition());








}


void test_GraphNode_allOf_data_source_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "source_type", "hello"
    };

    GraphNode_allOf_data obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSourceType().c_str());






}


void test_GraphNode_allOf_data_timestamp_is_assigned_from_json()
{








}


void test_GraphNode_allOf_data_topic_is_assigned_from_json()
{


    bourne::json input =
    {
        "topic", "hello"
    };

    GraphNode_allOf_data obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getTopic().c_str());






}






void test_GraphNode_allOf_data_message_key_is_converted_to_json()
{

    bourne::json input =
    {
        "message_key", "hello"
    };

    GraphNode_allOf_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message_key"] == output["message_key"]);



}



void test_GraphNode_allOf_data_offset_is_converted_to_json()
{
    bourne::json input =
    {
        "offset", 1
    };

    GraphNode_allOf_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["offset"] == output["offset"]);




}


void test_GraphNode_allOf_data_partition_is_converted_to_json()
{
    bourne::json input =
    {
        "partition", 1
    };

    GraphNode_allOf_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["partition"] == output["partition"]);




}


void test_GraphNode_allOf_data_source_type_is_converted_to_json()
{

    bourne::json input =
    {
        "source_type", "hello"
    };

    GraphNode_allOf_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["source_type"] == output["source_type"]);



}


void test_GraphNode_allOf_data_timestamp_is_converted_to_json()
{




}


void test_GraphNode_allOf_data_topic_is_converted_to_json()
{

    bourne::json input =
    {
        "topic", "hello"
    };

    GraphNode_allOf_data obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["topic"] == output["topic"]);



}




