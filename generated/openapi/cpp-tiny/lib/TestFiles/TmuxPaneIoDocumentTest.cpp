
#include "TmuxPaneIoDocument.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TmuxPaneIoDocument_input_is_assigned_from_json()
{


    bourne::json input =
    {
        "input", "hello"
    };

    TmuxPaneIoDocument obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getInput().c_str());






}


void test_TmuxPaneIoDocument_output_is_assigned_from_json()
{


    bourne::json input =
    {
        "output", "hello"
    };

    TmuxPaneIoDocument obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getOutput().c_str());






}


void test_TmuxPaneIoDocument_ps1_is_assigned_from_json()
{


    bourne::json input =
    {
        "ps1", "hello"
    };

    TmuxPaneIoDocument obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPs1().c_str());






}



void test_TmuxPaneIoDocument_input_is_converted_to_json()
{

    bourne::json input =
    {
        "input", "hello"
    };

    TmuxPaneIoDocument obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["input"] == output["input"]);



}


void test_TmuxPaneIoDocument_output_is_converted_to_json()
{

    bourne::json input =
    {
        "output", "hello"
    };

    TmuxPaneIoDocument obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["output"] == output["output"]);



}


void test_TmuxPaneIoDocument_ps1_is_converted_to_json()
{

    bourne::json input =
    {
        "ps1", "hello"
    };

    TmuxPaneIoDocument obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ps1"] == output["ps1"]);



}


