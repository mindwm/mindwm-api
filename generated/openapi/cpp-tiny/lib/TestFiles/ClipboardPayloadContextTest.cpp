
#include "ClipboardPayload_context.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ClipboardPayload_context_window_is_assigned_from_json()
{


    bourne::json input =
    {
        "window", "hello"
    };

    ClipboardPayload_context obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getWindow().c_str());






}



void test_ClipboardPayload_context_window_is_converted_to_json()
{

    bourne::json input =
    {
        "window", "hello"
    };

    ClipboardPayload_context obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["window"] == output["window"]);



}


