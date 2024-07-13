#ifndef graph_relationship_all_of_data_TEST
#define graph_relationship_all_of_data_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define graph_relationship_all_of_data_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/graph_relationship_all_of_data.h"
graph_relationship_all_of_data_t* instantiate_graph_relationship_all_of_data(int include_optional);

#include "test_neo4j_capture_data_change_meta.c"
#include "test_neo4j_capture_data_change_schema.c"
#include "test_neo4j_capture_data_change_relationship_payload.c"


graph_relationship_all_of_data_t* instantiate_graph_relationship_all_of_data(int include_optional) {
  graph_relationship_all_of_data_t* graph_relationship_all_of_data = NULL;
  if (include_optional) {
    graph_relationship_all_of_data = graph_relationship_all_of_data_create(
      0,
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
      instantiate_neo4j_capture_data_change_relationship_payload(0)
    );
  } else {
    graph_relationship_all_of_data = graph_relationship_all_of_data_create(
      0,
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

  return graph_relationship_all_of_data;
}


#ifdef graph_relationship_all_of_data_MAIN

void test_graph_relationship_all_of_data(int include_optional) {
    graph_relationship_all_of_data_t* graph_relationship_all_of_data_1 = instantiate_graph_relationship_all_of_data(include_optional);

	cJSON* jsongraph_relationship_all_of_data_1 = graph_relationship_all_of_data_convertToJSON(graph_relationship_all_of_data_1);
	printf("graph_relationship_all_of_data :\n%s\n", cJSON_Print(jsongraph_relationship_all_of_data_1));
	graph_relationship_all_of_data_t* graph_relationship_all_of_data_2 = graph_relationship_all_of_data_parseFromJSON(jsongraph_relationship_all_of_data_1);
	cJSON* jsongraph_relationship_all_of_data_2 = graph_relationship_all_of_data_convertToJSON(graph_relationship_all_of_data_2);
	printf("repeating graph_relationship_all_of_data:\n%s\n", cJSON_Print(jsongraph_relationship_all_of_data_2));
}

int main() {
  test_graph_relationship_all_of_data(1);
  test_graph_relationship_all_of_data(0);

  printf("Hello world \n");
  return 0;
}

#endif // graph_relationship_all_of_data_MAIN
#endif // graph_relationship_all_of_data_TEST
