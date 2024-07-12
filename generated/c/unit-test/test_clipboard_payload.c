#ifndef clipboard_payload_TEST
#define clipboard_payload_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define clipboard_payload_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/clipboard_payload.h"
clipboard_payload_t* instantiate_clipboard_payload(int include_optional);

#include "test_clipboard_payload_context.c"


clipboard_payload_t* instantiate_clipboard_payload(int include_optional) {
  clipboard_payload_t* clipboard_payload = NULL;
  if (include_optional) {
    clipboard_payload = clipboard_payload_create(
      list_createList(),
      list_createList(),
      "0",
      mindwm_api_clipboard_payload_TYPE_primary,
       // false, not to have infinite recursion
      instantiate_clipboard_payload_context(0)
    );
  } else {
    clipboard_payload = clipboard_payload_create(
      list_createList(),
      list_createList(),
      "0",
      mindwm_api_clipboard_payload_TYPE_primary,
      NULL
    );
  }

  return clipboard_payload;
}


#ifdef clipboard_payload_MAIN

void test_clipboard_payload(int include_optional) {
    clipboard_payload_t* clipboard_payload_1 = instantiate_clipboard_payload(include_optional);

	cJSON* jsonclipboard_payload_1 = clipboard_payload_convertToJSON(clipboard_payload_1);
	printf("clipboard_payload :\n%s\n", cJSON_Print(jsonclipboard_payload_1));
	clipboard_payload_t* clipboard_payload_2 = clipboard_payload_parseFromJSON(jsonclipboard_payload_1);
	cJSON* jsonclipboard_payload_2 = clipboard_payload_convertToJSON(clipboard_payload_2);
	printf("repeating clipboard_payload:\n%s\n", cJSON_Print(jsonclipboard_payload_2));
}

int main() {
  test_clipboard_payload(1);
  test_clipboard_payload(0);

  printf("Hello world \n");
  return 0;
}

#endif // clipboard_payload_MAIN
#endif // clipboard_payload_TEST
