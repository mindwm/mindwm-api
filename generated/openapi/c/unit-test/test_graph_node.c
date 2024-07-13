#ifndef graph_node_TEST
#define graph_node_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define graph_node_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/graph_node.h"
graph_node_t* instantiate_graph_node(int include_optional);

#include "test_graph_node_all_of_data.c"


graph_node_t* instantiate_graph_node(int include_optional) {
  graph_node_t* graph_node = NULL;
  if (include_optional) {
    graph_node = graph_node_create(
      "0",
      mindwm_api_graph_node_SOURCE_graph.node,
      "0",
      mindwm_api_graph_node_TYPE_created,
      "0",
      "0",
      "0",
      "2013-10-20T19:20:30+01:00",
      null,
      "0"
    );
  } else {
    graph_node = graph_node_create(
      "0",
      mindwm_api_graph_node_SOURCE_graph.node,
      "0",
      mindwm_api_graph_node_TYPE_created,
      "0",
      "0",
      "0",
      "2013-10-20T19:20:30+01:00",
      null,
      "0"
    );
  }

  return graph_node;
}


#ifdef graph_node_MAIN

void test_graph_node(int include_optional) {
    graph_node_t* graph_node_1 = instantiate_graph_node(include_optional);

	cJSON* jsongraph_node_1 = graph_node_convertToJSON(graph_node_1);
	printf("graph_node :\n%s\n", cJSON_Print(jsongraph_node_1));
	graph_node_t* graph_node_2 = graph_node_parseFromJSON(jsongraph_node_1);
	cJSON* jsongraph_node_2 = graph_node_convertToJSON(graph_node_2);
	printf("repeating graph_node:\n%s\n", cJSON_Print(jsongraph_node_2));
}

int main() {
  test_graph_node(1);
  test_graph_node(0);

  printf("Hello world \n");
  return 0;
}

#endif // graph_node_MAIN
#endif // graph_node_TEST
