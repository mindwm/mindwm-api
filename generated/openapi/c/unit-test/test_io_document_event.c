#ifndef io_document_event_TEST
#define io_document_event_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define io_document_event_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/io_document_event.h"
io_document_event_t* instantiate_io_document_event(int include_optional);



io_document_event_t* instantiate_io_document_event(int include_optional) {
  io_document_event_t* io_document_event = NULL;
  if (include_optional) {
    io_document_event = io_document_event_create(
      "0",
      "0",
      "0",
      "IoDocument",
      "0",
      "0",
      "IoDocument",
      "2013-10-20T19:20:30+01:00",
      list_createList(),
      "0"
    );
  } else {
    io_document_event = io_document_event_create(
      "0",
      "0",
      "0",
      "IoDocument",
      "0",
      "0",
      "IoDocument",
      "2013-10-20T19:20:30+01:00",
      list_createList(),
      "0"
    );
  }

  return io_document_event;
}


#ifdef io_document_event_MAIN

void test_io_document_event(int include_optional) {
    io_document_event_t* io_document_event_1 = instantiate_io_document_event(include_optional);

	cJSON* jsonio_document_event_1 = io_document_event_convertToJSON(io_document_event_1);
	printf("io_document_event :\n%s\n", cJSON_Print(jsonio_document_event_1));
	io_document_event_t* io_document_event_2 = io_document_event_parseFromJSON(jsonio_document_event_1);
	cJSON* jsonio_document_event_2 = io_document_event_convertToJSON(io_document_event_2);
	printf("repeating io_document_event:\n%s\n", cJSON_Print(jsonio_document_event_2));
}

int main() {
  test_io_document_event(1);
  test_io_document_event(0);

  printf("Hello world \n");
  return 0;
}

#endif // io_document_event_MAIN
#endif // io_document_event_TEST
