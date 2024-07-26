#ifndef touch_TEST
#define touch_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define touch_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/touch.h"
touch_t* instantiate_touch(int include_optional);



touch_t* instantiate_touch(int include_optional) {
  touch_t* touch = NULL;
  if (include_optional) {
    touch = touch_create(
      list_createList()
    );
  } else {
    touch = touch_create(
      list_createList()
    );
  }

  return touch;
}


#ifdef touch_MAIN

void test_touch(int include_optional) {
    touch_t* touch_1 = instantiate_touch(include_optional);

	cJSON* jsontouch_1 = touch_convertToJSON(touch_1);
	printf("touch :\n%s\n", cJSON_Print(jsontouch_1));
	touch_t* touch_2 = touch_parseFromJSON(jsontouch_1);
	cJSON* jsontouch_2 = touch_convertToJSON(touch_2);
	printf("repeating touch:\n%s\n", cJSON_Print(jsontouch_2));
}

int main() {
  test_touch(1);
  test_touch(0);

  printf("Hello world \n");
  return 0;
}

#endif // touch_MAIN
#endif // touch_TEST
