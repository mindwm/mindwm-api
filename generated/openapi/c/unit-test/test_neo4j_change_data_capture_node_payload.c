#ifndef neo4j_change_data_capture_node_payload_TEST
#define neo4j_change_data_capture_node_payload_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define neo4j_change_data_capture_node_payload_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/neo4j_change_data_capture_node_payload.h"
neo4j_change_data_capture_node_payload_t* instantiate_neo4j_change_data_capture_node_payload(int include_optional);

#include "test_neo4j_change_data_capture_node_payload_after.c"


neo4j_change_data_capture_node_payload_t* instantiate_neo4j_change_data_capture_node_payload(int include_optional) {
  neo4j_change_data_capture_node_payload_t* neo4j_change_data_capture_node_payload = NULL;
  if (include_optional) {
    neo4j_change_data_capture_node_payload = neo4j_change_data_capture_node_payload_create(
       // false, not to have infinite recursion
      instantiate_neo4j_change_data_capture_node_payload_after(0),
      "0",
      "0",
      "0"
    );
  } else {
    neo4j_change_data_capture_node_payload = neo4j_change_data_capture_node_payload_create(
      NULL,
      "0",
      "0",
      "0"
    );
  }

  return neo4j_change_data_capture_node_payload;
}


#ifdef neo4j_change_data_capture_node_payload_MAIN

void test_neo4j_change_data_capture_node_payload(int include_optional) {
    neo4j_change_data_capture_node_payload_t* neo4j_change_data_capture_node_payload_1 = instantiate_neo4j_change_data_capture_node_payload(include_optional);

	cJSON* jsonneo4j_change_data_capture_node_payload_1 = neo4j_change_data_capture_node_payload_convertToJSON(neo4j_change_data_capture_node_payload_1);
	printf("neo4j_change_data_capture_node_payload :\n%s\n", cJSON_Print(jsonneo4j_change_data_capture_node_payload_1));
	neo4j_change_data_capture_node_payload_t* neo4j_change_data_capture_node_payload_2 = neo4j_change_data_capture_node_payload_parseFromJSON(jsonneo4j_change_data_capture_node_payload_1);
	cJSON* jsonneo4j_change_data_capture_node_payload_2 = neo4j_change_data_capture_node_payload_convertToJSON(neo4j_change_data_capture_node_payload_2);
	printf("repeating neo4j_change_data_capture_node_payload:\n%s\n", cJSON_Print(jsonneo4j_change_data_capture_node_payload_2));
}

int main() {
  test_neo4j_change_data_capture_node_payload(1);
  test_neo4j_change_data_capture_node_payload(0);

  printf("Hello world \n");
  return 0;
}

#endif // neo4j_change_data_capture_node_payload_MAIN
#endif // neo4j_change_data_capture_node_payload_TEST
