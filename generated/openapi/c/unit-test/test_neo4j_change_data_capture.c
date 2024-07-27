#ifndef neo4j_change_data_capture_TEST
#define neo4j_change_data_capture_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define neo4j_change_data_capture_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/neo4j_change_data_capture.h"
neo4j_change_data_capture_t* instantiate_neo4j_change_data_capture(int include_optional);

#include "test_neo4j_change_data_capture_meta.c"
#include "test_neo4j_change_data_capture_schema.c"
#include "test_neo4j_change_data_capture_payload.c"


neo4j_change_data_capture_t* instantiate_neo4j_change_data_capture(int include_optional) {
  neo4j_change_data_capture_t* neo4j_change_data_capture = NULL;
  if (include_optional) {
    neo4j_change_data_capture = neo4j_change_data_capture_create(
      list_createList(),
      "0",
       // false, not to have infinite recursion
      instantiate_neo4j_change_data_capture_meta(0),
      56,
      56,
      "0",
      "2013-10-20T19:20:30+01:00",
      "0",
       // false, not to have infinite recursion
      instantiate_neo4j_change_data_capture_schema(0),
       // false, not to have infinite recursion
      instantiate_neo4j_change_data_capture_payload(0)
    );
  } else {
    neo4j_change_data_capture = neo4j_change_data_capture_create(
      list_createList(),
      "0",
      NULL,
      56,
      56,
      "0",
      "2013-10-20T19:20:30+01:00",
      "0",
      NULL,
      NULL
    );
  }

  return neo4j_change_data_capture;
}


#ifdef neo4j_change_data_capture_MAIN

void test_neo4j_change_data_capture(int include_optional) {
    neo4j_change_data_capture_t* neo4j_change_data_capture_1 = instantiate_neo4j_change_data_capture(include_optional);

	cJSON* jsonneo4j_change_data_capture_1 = neo4j_change_data_capture_convertToJSON(neo4j_change_data_capture_1);
	printf("neo4j_change_data_capture :\n%s\n", cJSON_Print(jsonneo4j_change_data_capture_1));
	neo4j_change_data_capture_t* neo4j_change_data_capture_2 = neo4j_change_data_capture_parseFromJSON(jsonneo4j_change_data_capture_1);
	cJSON* jsonneo4j_change_data_capture_2 = neo4j_change_data_capture_convertToJSON(neo4j_change_data_capture_2);
	printf("repeating neo4j_change_data_capture:\n%s\n", cJSON_Print(jsonneo4j_change_data_capture_2));
}

int main() {
  test_neo4j_change_data_capture(1);
  test_neo4j_change_data_capture(0);

  printf("Hello world \n");
  return 0;
}

#endif // neo4j_change_data_capture_MAIN
#endif // neo4j_change_data_capture_TEST
