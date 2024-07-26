#ifndef clipboard_event_TEST
#define clipboard_event_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define clipboard_event_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/clipboard_event.h"
clipboard_event_t* instantiate_clipboard_event(int include_optional);

#include "test_clipboard.c"


clipboard_event_t* instantiate_clipboard_event(int include_optional) {
  clipboard_event_t* clipboard_event = NULL;
  if (include_optional) {
    clipboard_event = clipboard_event_create(
      "0",
      "0",
      "0",
      "Clipboard",
      "0",
      "0",
      "Clipboard",
      "2013-10-20T19:20:30+01:00",
      list_createList(),
      "0",
      "255"
    );
  } else {
    clipboard_event = clipboard_event_create(
      "0",
      "0",
      "0",
      "Clipboard",
      "0",
      "0",
      "Clipboard",
      "2013-10-20T19:20:30+01:00",
      list_createList(),
      "0",
      "255"
    );
  }

  return clipboard_event;
}


#ifdef clipboard_event_MAIN

void test_clipboard_event(int include_optional) {
    clipboard_event_t* clipboard_event_1 = instantiate_clipboard_event(include_optional);

	cJSON* jsonclipboard_event_1 = clipboard_event_convertToJSON(clipboard_event_1);
	printf("clipboard_event :\n%s\n", cJSON_Print(jsonclipboard_event_1));
	clipboard_event_t* clipboard_event_2 = clipboard_event_parseFromJSON(jsonclipboard_event_1);
	cJSON* jsonclipboard_event_2 = clipboard_event_convertToJSON(clipboard_event_2);
	printf("repeating clipboard_event:\n%s\n", cJSON_Print(jsonclipboard_event_2));
}

int main() {
  test_clipboard_event(1);
  test_clipboard_event(0);

  printf("Hello world \n");
  return 0;
}

#endif // clipboard_event_MAIN
#endif // clipboard_event_TEST
