#ifndef neo4j_capture_data_change_schema_TEST
#define neo4j_capture_data_change_schema_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define neo4j_capture_data_change_schema_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/neo4j_capture_data_change_schema.h"
neo4j_capture_data_change_schema_t* instantiate_neo4j_capture_data_change_schema(int include_optional);



neo4j_capture_data_change_schema_t* instantiate_neo4j_capture_data_change_schema(int include_optional) {
  neo4j_capture_data_change_schema_t* neo4j_capture_data_change_schema = NULL;
  if (include_optional) {
    neo4j_capture_data_change_schema = neo4j_capture_data_change_schema_create(
      list_createList(),
      list_createList()
    );
  } else {
    neo4j_capture_data_change_schema = neo4j_capture_data_change_schema_create(
      list_createList(),
      list_createList()
    );
  }

  return neo4j_capture_data_change_schema;
}


#ifdef neo4j_capture_data_change_schema_MAIN

void test_neo4j_capture_data_change_schema(int include_optional) {
    neo4j_capture_data_change_schema_t* neo4j_capture_data_change_schema_1 = instantiate_neo4j_capture_data_change_schema(include_optional);

	cJSON* jsonneo4j_capture_data_change_schema_1 = neo4j_capture_data_change_schema_convertToJSON(neo4j_capture_data_change_schema_1);
	printf("neo4j_capture_data_change_schema :\n%s\n", cJSON_Print(jsonneo4j_capture_data_change_schema_1));
	neo4j_capture_data_change_schema_t* neo4j_capture_data_change_schema_2 = neo4j_capture_data_change_schema_parseFromJSON(jsonneo4j_capture_data_change_schema_1);
	cJSON* jsonneo4j_capture_data_change_schema_2 = neo4j_capture_data_change_schema_convertToJSON(neo4j_capture_data_change_schema_2);
	printf("repeating neo4j_capture_data_change_schema:\n%s\n", cJSON_Print(jsonneo4j_capture_data_change_schema_2));
}

int main() {
  test_neo4j_capture_data_change_schema(1);
  test_neo4j_capture_data_change_schema(0);

  printf("Hello world \n");
  return 0;
}

#endif // neo4j_capture_data_change_schema_MAIN
#endif // neo4j_capture_data_change_schema_TEST
