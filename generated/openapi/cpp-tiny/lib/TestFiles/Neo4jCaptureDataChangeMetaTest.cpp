
#include "Neo4jCaptureDataChange_meta.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Neo4jCaptureDataChange_meta_operation_is_assigned_from_json()
{


    bourne::json input =
    {
        "operation", "hello"
    };

    Neo4jCaptureDataChange_meta obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOperation().c_str());






}



void test_Neo4jCaptureDataChange_meta_timestamp_is_assigned_from_json()
{
    bourne::json input =
    {
        "timestamp", 1
    };

    Neo4jCaptureDataChange_meta obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTimestamp());








}


void test_Neo4jCaptureDataChange_meta_txEventId_is_assigned_from_json()
{
    bourne::json input =
    {
        "txEventId", 1
    };

    Neo4jCaptureDataChange_meta obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTxEventId());








}


void test_Neo4jCaptureDataChange_meta_txEventsCount_is_assigned_from_json()
{
    bourne::json input =
    {
        "txEventsCount", 1
    };

    Neo4jCaptureDataChange_meta obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTxEventsCount());








}


void test_Neo4jCaptureDataChange_meta_txId_is_assigned_from_json()
{
    bourne::json input =
    {
        "txId", 1
    };

    Neo4jCaptureDataChange_meta obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getTxId());








}


void test_Neo4jCaptureDataChange_meta_username_is_assigned_from_json()
{


    bourne::json input =
    {
        "username", "hello"
    };

    Neo4jCaptureDataChange_meta obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUsername().c_str());






}



void test_Neo4jCaptureDataChange_meta_operation_is_converted_to_json()
{

    bourne::json input =
    {
        "operation", "hello"
    };

    Neo4jCaptureDataChange_meta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["operation"] == output["operation"]);



}



void test_Neo4jCaptureDataChange_meta_timestamp_is_converted_to_json()
{
    bourne::json input =
    {
        "timestamp", 1
    };

    Neo4jCaptureDataChange_meta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["timestamp"] == output["timestamp"]);




}


void test_Neo4jCaptureDataChange_meta_txEventId_is_converted_to_json()
{
    bourne::json input =
    {
        "txEventId", 1
    };

    Neo4jCaptureDataChange_meta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["txEventId"] == output["txEventId"]);




}


void test_Neo4jCaptureDataChange_meta_txEventsCount_is_converted_to_json()
{
    bourne::json input =
    {
        "txEventsCount", 1
    };

    Neo4jCaptureDataChange_meta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["txEventsCount"] == output["txEventsCount"]);




}


void test_Neo4jCaptureDataChange_meta_txId_is_converted_to_json()
{
    bourne::json input =
    {
        "txId", 1
    };

    Neo4jCaptureDataChange_meta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["txId"] == output["txId"]);




}


void test_Neo4jCaptureDataChange_meta_username_is_converted_to_json()
{

    bourne::json input =
    {
        "username", "hello"
    };

    Neo4jCaptureDataChange_meta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["username"] == output["username"]);



}


