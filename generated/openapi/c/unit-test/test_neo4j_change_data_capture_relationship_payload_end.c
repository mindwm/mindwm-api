#ifndef neo4j_change_data_capture_relationship_payload_end_TEST
#define neo4j_change_data_capture_relationship_payload_end_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define neo4j_change_data_capture_relationship_payload_end_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/neo4j_change_data_capture_relationship_payload_end.h"
neo4j_change_data_capture_relationship_payload_end_t* instantiate_neo4j_change_data_capture_relationship_payload_end(int include_optional);



neo4j_change_data_capture_relationship_payload_end_t* instantiate_neo4j_change_data_capture_relationship_payload_end(int include_optional) {
  neo4j_change_data_capture_relationship_payload_end_t* neo4j_change_data_capture_relationship_payload_end = NULL;
  if (include_optional) {
    neo4j_change_data_capture_relationship_payload_end = neo4j_change_data_capture_relationship_payload_end_create(
      "0",
      list_createList(),
      list_createList()
    );
  } else {
    neo4j_change_data_capture_relationship_payload_end = neo4j_change_data_capture_relationship_payload_end_create(
      "0",
      list_createList(),
      list_createList()
    );
  }

  return neo4j_change_data_capture_relationship_payload_end;
}


#ifdef neo4j_change_data_capture_relationship_payload_end_MAIN

void test_neo4j_change_data_capture_relationship_payload_end(int include_optional) {
    neo4j_change_data_capture_relationship_payload_end_t* neo4j_change_data_capture_relationship_payload_end_1 = instantiate_neo4j_change_data_capture_relationship_payload_end(include_optional);

	cJSON* jsonneo4j_change_data_capture_relationship_payload_end_1 = neo4j_change_data_capture_relationship_payload_end_convertToJSON(neo4j_change_data_capture_relationship_payload_end_1);
	printf("neo4j_change_data_capture_relationship_payload_end :\n%s\n", cJSON_Print(jsonneo4j_change_data_capture_relationship_payload_end_1));
	neo4j_change_data_capture_relationship_payload_end_t* neo4j_change_data_capture_relationship_payload_end_2 = neo4j_change_data_capture_relationship_payload_end_parseFromJSON(jsonneo4j_change_data_capture_relationship_payload_end_1);
	cJSON* jsonneo4j_change_data_capture_relationship_payload_end_2 = neo4j_change_data_capture_relationship_payload_end_convertToJSON(neo4j_change_data_capture_relationship_payload_end_2);
	printf("repeating neo4j_change_data_capture_relationship_payload_end:\n%s\n", cJSON_Print(jsonneo4j_change_data_capture_relationship_payload_end_2));
}

int main() {
  test_neo4j_change_data_capture_relationship_payload_end(1);
  test_neo4j_change_data_capture_relationship_payload_end(0);

  printf("Hello world \n");
  return 0;
}

#endif // neo4j_change_data_capture_relationship_payload_end_MAIN
#endif // neo4j_change_data_capture_relationship_payload_end_TEST
