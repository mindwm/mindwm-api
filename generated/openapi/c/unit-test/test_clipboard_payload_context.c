#ifndef clipboard_payload_context_TEST
#define clipboard_payload_context_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define clipboard_payload_context_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/clipboard_payload_context.h"
clipboard_payload_context_t* instantiate_clipboard_payload_context(int include_optional);



clipboard_payload_context_t* instantiate_clipboard_payload_context(int include_optional) {
  clipboard_payload_context_t* clipboard_payload_context = NULL;
  if (include_optional) {
    clipboard_payload_context = clipboard_payload_context_create(
      "0"
    );
  } else {
    clipboard_payload_context = clipboard_payload_context_create(
      "0"
    );
  }

  return clipboard_payload_context;
}


#ifdef clipboard_payload_context_MAIN

void test_clipboard_payload_context(int include_optional) {
    clipboard_payload_context_t* clipboard_payload_context_1 = instantiate_clipboard_payload_context(include_optional);

	cJSON* jsonclipboard_payload_context_1 = clipboard_payload_context_convertToJSON(clipboard_payload_context_1);
	printf("clipboard_payload_context :\n%s\n", cJSON_Print(jsonclipboard_payload_context_1));
	clipboard_payload_context_t* clipboard_payload_context_2 = clipboard_payload_context_parseFromJSON(jsonclipboard_payload_context_1);
	cJSON* jsonclipboard_payload_context_2 = clipboard_payload_context_convertToJSON(clipboard_payload_context_2);
	printf("repeating clipboard_payload_context:\n%s\n", cJSON_Print(jsonclipboard_payload_context_2));
}

int main() {
  test_clipboard_payload_context(1);
  test_clipboard_payload_context(0);

  printf("Hello world \n");
  return 0;
}

#endif // clipboard_payload_context_MAIN
#endif // clipboard_payload_context_TEST
