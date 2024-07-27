#ifndef neo4j_change_data_capture_node_payload_after_TEST
#define neo4j_change_data_capture_node_payload_after_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define neo4j_change_data_capture_node_payload_after_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/neo4j_change_data_capture_node_payload_after.h"
neo4j_change_data_capture_node_payload_after_t* instantiate_neo4j_change_data_capture_node_payload_after(int include_optional);



neo4j_change_data_capture_node_payload_after_t* instantiate_neo4j_change_data_capture_node_payload_after(int include_optional) {
  neo4j_change_data_capture_node_payload_after_t* neo4j_change_data_capture_node_payload_after = NULL;
  if (include_optional) {
    neo4j_change_data_capture_node_payload_after = neo4j_change_data_capture_node_payload_after_create(
      list_createList(),
      list_createList()
    );
  } else {
    neo4j_change_data_capture_node_payload_after = neo4j_change_data_capture_node_payload_after_create(
      list_createList(),
      list_createList()
    );
  }

  return neo4j_change_data_capture_node_payload_after;
}


#ifdef neo4j_change_data_capture_node_payload_after_MAIN

void test_neo4j_change_data_capture_node_payload_after(int include_optional) {
    neo4j_change_data_capture_node_payload_after_t* neo4j_change_data_capture_node_payload_after_1 = instantiate_neo4j_change_data_capture_node_payload_after(include_optional);

	cJSON* jsonneo4j_change_data_capture_node_payload_after_1 = neo4j_change_data_capture_node_payload_after_convertToJSON(neo4j_change_data_capture_node_payload_after_1);
	printf("neo4j_change_data_capture_node_payload_after :\n%s\n", cJSON_Print(jsonneo4j_change_data_capture_node_payload_after_1));
	neo4j_change_data_capture_node_payload_after_t* neo4j_change_data_capture_node_payload_after_2 = neo4j_change_data_capture_node_payload_after_parseFromJSON(jsonneo4j_change_data_capture_node_payload_after_1);
	cJSON* jsonneo4j_change_data_capture_node_payload_after_2 = neo4j_change_data_capture_node_payload_after_convertToJSON(neo4j_change_data_capture_node_payload_after_2);
	printf("repeating neo4j_change_data_capture_node_payload_after:\n%s\n", cJSON_Print(jsonneo4j_change_data_capture_node_payload_after_2));
}

int main() {
  test_neo4j_change_data_capture_node_payload_after(1);
  test_neo4j_change_data_capture_node_payload_after(0);

  printf("Hello world \n");
  return 0;
}

#endif // neo4j_change_data_capture_node_payload_after_MAIN
#endif // neo4j_change_data_capture_node_payload_after_TEST
