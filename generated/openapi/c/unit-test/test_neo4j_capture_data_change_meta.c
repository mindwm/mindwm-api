#ifndef neo4j_capture_data_change_meta_TEST
#define neo4j_capture_data_change_meta_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define neo4j_capture_data_change_meta_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/neo4j_capture_data_change_meta.h"
neo4j_capture_data_change_meta_t* instantiate_neo4j_capture_data_change_meta(int include_optional);

#include "test_neo4j_capture_data_change_meta_source.c"


neo4j_capture_data_change_meta_t* instantiate_neo4j_capture_data_change_meta(int include_optional) {
  neo4j_capture_data_change_meta_t* neo4j_capture_data_change_meta = NULL;
  if (include_optional) {
    neo4j_capture_data_change_meta = neo4j_capture_data_change_meta_create(
      "0",
       // false, not to have infinite recursion
      instantiate_neo4j_capture_data_change_meta_source(0),
      56,
      56,
      56,
      56,
      "0"
    );
  } else {
    neo4j_capture_data_change_meta = neo4j_capture_data_change_meta_create(
      "0",
      NULL,
      56,
      56,
      56,
      56,
      "0"
    );
  }

  return neo4j_capture_data_change_meta;
}


#ifdef neo4j_capture_data_change_meta_MAIN

void test_neo4j_capture_data_change_meta(int include_optional) {
    neo4j_capture_data_change_meta_t* neo4j_capture_data_change_meta_1 = instantiate_neo4j_capture_data_change_meta(include_optional);

	cJSON* jsonneo4j_capture_data_change_meta_1 = neo4j_capture_data_change_meta_convertToJSON(neo4j_capture_data_change_meta_1);
	printf("neo4j_capture_data_change_meta :\n%s\n", cJSON_Print(jsonneo4j_capture_data_change_meta_1));
	neo4j_capture_data_change_meta_t* neo4j_capture_data_change_meta_2 = neo4j_capture_data_change_meta_parseFromJSON(jsonneo4j_capture_data_change_meta_1);
	cJSON* jsonneo4j_capture_data_change_meta_2 = neo4j_capture_data_change_meta_convertToJSON(neo4j_capture_data_change_meta_2);
	printf("repeating neo4j_capture_data_change_meta:\n%s\n", cJSON_Print(jsonneo4j_capture_data_change_meta_2));
}

int main() {
  test_neo4j_capture_data_change_meta(1);
  test_neo4j_capture_data_change_meta(0);

  printf("Hello world \n");
  return 0;
}

#endif // neo4j_capture_data_change_meta_MAIN
#endif // neo4j_capture_data_change_meta_TEST
