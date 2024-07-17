#ifndef clipboard_TEST
#define clipboard_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define clipboard_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/clipboard.h"
clipboard_t* instantiate_clipboard(int include_optional);

#include "test_clipboard_payload.c"


clipboard_t* instantiate_clipboard(int include_optional) {
  clipboard_t* clipboard = NULL;
  if (include_optional) {
    clipboard = clipboard_create(
      "0",
      "a",
      "0",
      "0",
      "0",
      "0",
      "0",
      "2013-10-20T19:20:30+01:00",
       // false, not to have infinite recursion
      instantiate_clipboard_payload(0),
      "0"
    );
  } else {
    clipboard = clipboard_create(
      "0",
      "a",
      "0",
      "0",
      "0",
      "0",
      "0",
      "2013-10-20T19:20:30+01:00",
      NULL,
      "0"
    );
  }

  return clipboard;
}


#ifdef clipboard_MAIN

void test_clipboard(int include_optional) {
    clipboard_t* clipboard_1 = instantiate_clipboard(include_optional);

	cJSON* jsonclipboard_1 = clipboard_convertToJSON(clipboard_1);
	printf("clipboard :\n%s\n", cJSON_Print(jsonclipboard_1));
	clipboard_t* clipboard_2 = clipboard_parseFromJSON(jsonclipboard_1);
	cJSON* jsonclipboard_2 = clipboard_convertToJSON(clipboard_2);
	printf("repeating clipboard:\n%s\n", cJSON_Print(jsonclipboard_2));
}

int main() {
  test_clipboard(1);
  test_clipboard(0);

  printf("Hello world \n");
  return 0;
}

#endif // clipboard_MAIN
#endif // clipboard_TEST
