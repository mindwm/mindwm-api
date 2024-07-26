#ifndef touch_event_TEST
#define touch_event_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define touch_event_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/touch_event.h"
touch_event_t* instantiate_touch_event(int include_optional);

#include "test_touch.c"


touch_event_t* instantiate_touch_event(int include_optional) {
  touch_event_t* touch_event = NULL;
  if (include_optional) {
    touch_event = touch_event_create(
      "0",
      "0",
      "0",
      "touch",
      "0",
      "0",
      "node",
      "2013-10-20T19:20:30+01:00",
       // false, not to have infinite recursion
      instantiate_touch(0),
      "0"
    );
  } else {
    touch_event = touch_event_create(
      "0",
      "0",
      "0",
      "touch",
      "0",
      "0",
      "node",
      "2013-10-20T19:20:30+01:00",
      NULL,
      "0"
    );
  }

  return touch_event;
}


#ifdef touch_event_MAIN

void test_touch_event(int include_optional) {
    touch_event_t* touch_event_1 = instantiate_touch_event(include_optional);

	cJSON* jsontouch_event_1 = touch_event_convertToJSON(touch_event_1);
	printf("touch_event :\n%s\n", cJSON_Print(jsontouch_event_1));
	touch_event_t* touch_event_2 = touch_event_parseFromJSON(jsontouch_event_1);
	cJSON* jsontouch_event_2 = touch_event_convertToJSON(touch_event_2);
	printf("repeating touch_event:\n%s\n", cJSON_Print(jsontouch_event_2));
}

int main() {
  test_touch_event(1);
  test_touch_event(0);

  printf("Hello world \n");
  return 0;
}

#endif // touch_event_MAIN
#endif // touch_event_TEST
