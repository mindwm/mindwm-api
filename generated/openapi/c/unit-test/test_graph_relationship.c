#ifndef graph_relationship_TEST
#define graph_relationship_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define graph_relationship_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/graph_relationship.h"
graph_relationship_t* instantiate_graph_relationship(int include_optional);

#include "test_graph_relationship_all_of_data.c"


graph_relationship_t* instantiate_graph_relationship(int include_optional) {
  graph_relationship_t* graph_relationship = NULL;
  if (include_optional) {
    graph_relationship = graph_relationship_create(
      "0",
      mindwm_api_graph_relationship_SOURCE_graph.relationship,
      "0",
      mindwm_api_graph_relationship_TYPE_created,
      "0",
      "0",
      "0",
      "2013-10-20T19:20:30+01:00",
      null,
      "0"
    );
  } else {
    graph_relationship = graph_relationship_create(
      "0",
      mindwm_api_graph_relationship_SOURCE_graph.relationship,
      "0",
      mindwm_api_graph_relationship_TYPE_created,
      "0",
      "0",
      "0",
      "2013-10-20T19:20:30+01:00",
      null,
      "0"
    );
  }

  return graph_relationship;
}


#ifdef graph_relationship_MAIN

void test_graph_relationship(int include_optional) {
    graph_relationship_t* graph_relationship_1 = instantiate_graph_relationship(include_optional);

	cJSON* jsongraph_relationship_1 = graph_relationship_convertToJSON(graph_relationship_1);
	printf("graph_relationship :\n%s\n", cJSON_Print(jsongraph_relationship_1));
	graph_relationship_t* graph_relationship_2 = graph_relationship_parseFromJSON(jsongraph_relationship_1);
	cJSON* jsongraph_relationship_2 = graph_relationship_convertToJSON(graph_relationship_2);
	printf("repeating graph_relationship:\n%s\n", cJSON_Print(jsongraph_relationship_2));
}

int main() {
  test_graph_relationship(1);
  test_graph_relationship(0);

  printf("Hello world \n");
  return 0;
}

#endif // graph_relationship_MAIN
#endif // graph_relationship_TEST
