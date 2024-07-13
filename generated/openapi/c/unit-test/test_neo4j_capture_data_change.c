#ifndef neo4j_capture_data_change_TEST
#define neo4j_capture_data_change_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define neo4j_capture_data_change_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/neo4j_capture_data_change.h"
neo4j_capture_data_change_t* instantiate_neo4j_capture_data_change(int include_optional);

#include "test_neo4j_capture_data_change_meta.c"
#include "test_neo4j_capture_data_change_schema.c"
#include "test_neo4j_capture_data_change_payload.c"


neo4j_capture_data_change_t* instantiate_neo4j_capture_data_change(int include_optional) {
  neo4j_capture_data_change_t* neo4j_capture_data_change = NULL;
  if (include_optional) {
    neo4j_capture_data_change = neo4j_capture_data_change_create(
      list_createList(),
      "0",
       // false, not to have infinite recursion
      instantiate_neo4j_capture_data_change_meta(0),
      56,
      56,
      "0",
      "2013-10-20T19:20:30+01:00",
      "0",
       // false, not to have infinite recursion
      instantiate_neo4j_capture_data_change_schema(0),
       // false, not to have infinite recursion
      instantiate_neo4j_capture_data_change_payload(0)
    );
  } else {
    neo4j_capture_data_change = neo4j_capture_data_change_create(
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

  return neo4j_capture_data_change;
}


#ifdef neo4j_capture_data_change_MAIN

void test_neo4j_capture_data_change(int include_optional) {
    neo4j_capture_data_change_t* neo4j_capture_data_change_1 = instantiate_neo4j_capture_data_change(include_optional);

	cJSON* jsonneo4j_capture_data_change_1 = neo4j_capture_data_change_convertToJSON(neo4j_capture_data_change_1);
	printf("neo4j_capture_data_change :\n%s\n", cJSON_Print(jsonneo4j_capture_data_change_1));
	neo4j_capture_data_change_t* neo4j_capture_data_change_2 = neo4j_capture_data_change_parseFromJSON(jsonneo4j_capture_data_change_1);
	cJSON* jsonneo4j_capture_data_change_2 = neo4j_capture_data_change_convertToJSON(neo4j_capture_data_change_2);
	printf("repeating neo4j_capture_data_change:\n%s\n", cJSON_Print(jsonneo4j_capture_data_change_2));
}

int main() {
  test_neo4j_capture_data_change(1);
  test_neo4j_capture_data_change(0);

  printf("Hello world \n");
  return 0;
}

#endif // neo4j_capture_data_change_MAIN
#endif // neo4j_capture_data_change_TEST
