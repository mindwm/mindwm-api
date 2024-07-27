#ifndef neo4j_change_data_capture_meta_source_TEST
#define neo4j_change_data_capture_meta_source_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define neo4j_change_data_capture_meta_source_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/neo4j_change_data_capture_meta_source.h"
neo4j_change_data_capture_meta_source_t* instantiate_neo4j_change_data_capture_meta_source(int include_optional);



neo4j_change_data_capture_meta_source_t* instantiate_neo4j_change_data_capture_meta_source(int include_optional) {
  neo4j_change_data_capture_meta_source_t* neo4j_change_data_capture_meta_source = NULL;
  if (include_optional) {
    neo4j_change_data_capture_meta_source = neo4j_change_data_capture_meta_source_create(
      "0"
    );
  } else {
    neo4j_change_data_capture_meta_source = neo4j_change_data_capture_meta_source_create(
      "0"
    );
  }

  return neo4j_change_data_capture_meta_source;
}


#ifdef neo4j_change_data_capture_meta_source_MAIN

void test_neo4j_change_data_capture_meta_source(int include_optional) {
    neo4j_change_data_capture_meta_source_t* neo4j_change_data_capture_meta_source_1 = instantiate_neo4j_change_data_capture_meta_source(include_optional);

	cJSON* jsonneo4j_change_data_capture_meta_source_1 = neo4j_change_data_capture_meta_source_convertToJSON(neo4j_change_data_capture_meta_source_1);
	printf("neo4j_change_data_capture_meta_source :\n%s\n", cJSON_Print(jsonneo4j_change_data_capture_meta_source_1));
	neo4j_change_data_capture_meta_source_t* neo4j_change_data_capture_meta_source_2 = neo4j_change_data_capture_meta_source_parseFromJSON(jsonneo4j_change_data_capture_meta_source_1);
	cJSON* jsonneo4j_change_data_capture_meta_source_2 = neo4j_change_data_capture_meta_source_convertToJSON(neo4j_change_data_capture_meta_source_2);
	printf("repeating neo4j_change_data_capture_meta_source:\n%s\n", cJSON_Print(jsonneo4j_change_data_capture_meta_source_2));
}

int main() {
  test_neo4j_change_data_capture_meta_source(1);
  test_neo4j_change_data_capture_meta_source(0);

  printf("Hello world \n");
  return 0;
}

#endif // neo4j_change_data_capture_meta_source_MAIN
#endif // neo4j_change_data_capture_meta_source_TEST
