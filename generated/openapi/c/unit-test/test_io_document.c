#ifndef io_document_TEST
#define io_document_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define io_document_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/io_document.h"
io_document_t* instantiate_io_document(int include_optional);



io_document_t* instantiate_io_document(int include_optional) {
  io_document_t* io_document = NULL;
  if (include_optional) {
    io_document = io_document_create(
      "0",
      "0",
      "0",
      "IoDocument",
      "0",
      "0",
      "IoDocument",
      "2013-10-20T19:20:30+01:00",
      0,
      "0"
    );
  } else {
    io_document = io_document_create(
      "0",
      "0",
      "0",
      "IoDocument",
      "0",
      "0",
      "IoDocument",
      "2013-10-20T19:20:30+01:00",
      0,
      "0"
    );
  }

  return io_document;
}


#ifdef io_document_MAIN

void test_io_document(int include_optional) {
    io_document_t* io_document_1 = instantiate_io_document(include_optional);

	cJSON* jsonio_document_1 = io_document_convertToJSON(io_document_1);
	printf("io_document :\n%s\n", cJSON_Print(jsonio_document_1));
	io_document_t* io_document_2 = io_document_parseFromJSON(jsonio_document_1);
	cJSON* jsonio_document_2 = io_document_convertToJSON(io_document_2);
	printf("repeating io_document:\n%s\n", cJSON_Print(jsonio_document_2));
}

int main() {
  test_io_document(1);
  test_io_document(0);

  printf("Hello world \n");
  return 0;
}

#endif // io_document_MAIN
#endif // io_document_TEST
