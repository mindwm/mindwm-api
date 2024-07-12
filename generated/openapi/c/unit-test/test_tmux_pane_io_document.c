#ifndef tmux_pane_io_document_TEST
#define tmux_pane_io_document_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define tmux_pane_io_document_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/tmux_pane_io_document.h"
tmux_pane_io_document_t* instantiate_tmux_pane_io_document(int include_optional);



tmux_pane_io_document_t* instantiate_tmux_pane_io_document(int include_optional) {
  tmux_pane_io_document_t* tmux_pane_io_document = NULL;
  if (include_optional) {
    tmux_pane_io_document = tmux_pane_io_document_create(
      "0",
      "0",
      "0"
    );
  } else {
    tmux_pane_io_document = tmux_pane_io_document_create(
      "0",
      "0",
      "0"
    );
  }

  return tmux_pane_io_document;
}


#ifdef tmux_pane_io_document_MAIN

void test_tmux_pane_io_document(int include_optional) {
    tmux_pane_io_document_t* tmux_pane_io_document_1 = instantiate_tmux_pane_io_document(include_optional);

	cJSON* jsontmux_pane_io_document_1 = tmux_pane_io_document_convertToJSON(tmux_pane_io_document_1);
	printf("tmux_pane_io_document :\n%s\n", cJSON_Print(jsontmux_pane_io_document_1));
	tmux_pane_io_document_t* tmux_pane_io_document_2 = tmux_pane_io_document_parseFromJSON(jsontmux_pane_io_document_1);
	cJSON* jsontmux_pane_io_document_2 = tmux_pane_io_document_convertToJSON(tmux_pane_io_document_2);
	printf("repeating tmux_pane_io_document:\n%s\n", cJSON_Print(jsontmux_pane_io_document_2));
}

int main() {
  test_tmux_pane_io_document(1);
  test_tmux_pane_io_document(0);

  printf("Hello world \n");
  return 0;
}

#endif // tmux_pane_io_document_MAIN
#endif // tmux_pane_io_document_TEST
