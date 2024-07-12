#ifndef cloud_event_TEST
#define cloud_event_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define cloud_event_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/cloud_event.h"
cloud_event_t* instantiate_cloud_event(int include_optional);

#include "test_cloud_event_data.c"


cloud_event_t* instantiate_cloud_event(int include_optional) {
  cloud_event_t* cloud_event = NULL;
  if (include_optional) {
    cloud_event = cloud_event_create(
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "2013-10-20T19:20:30+01:00",
       // false, not to have infinite recursion
      instantiate_cloud_event_data(0),
      "0"
    );
  } else {
    cloud_event = cloud_event_create(
      "0",
      "0",
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

  return cloud_event;
}


#ifdef cloud_event_MAIN

void test_cloud_event(int include_optional) {
    cloud_event_t* cloud_event_1 = instantiate_cloud_event(include_optional);

	cJSON* jsoncloud_event_1 = cloud_event_convertToJSON(cloud_event_1);
	printf("cloud_event :\n%s\n", cJSON_Print(jsoncloud_event_1));
	cloud_event_t* cloud_event_2 = cloud_event_parseFromJSON(jsoncloud_event_1);
	cJSON* jsoncloud_event_2 = cloud_event_convertToJSON(cloud_event_2);
	printf("repeating cloud_event:\n%s\n", cJSON_Print(jsoncloud_event_2));
}

int main() {
  test_cloud_event(1);
  test_cloud_event(0);

  printf("Hello world \n");
  return 0;
}

#endif // cloud_event_MAIN
#endif // cloud_event_TEST
