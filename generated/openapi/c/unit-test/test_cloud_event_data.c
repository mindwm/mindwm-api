#ifndef cloud_event_data_TEST
#define cloud_event_data_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define cloud_event_data_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/cloud_event_data.h"
cloud_event_data_t* instantiate_cloud_event_data(int include_optional);



cloud_event_data_t* instantiate_cloud_event_data(int include_optional) {
  cloud_event_data_t* cloud_event_data = NULL;
  if (include_optional) {
    cloud_event_data = cloud_event_data_create(
    );
  } else {
    cloud_event_data = cloud_event_data_create(
    );
  }

  return cloud_event_data;
}


#ifdef cloud_event_data_MAIN

void test_cloud_event_data(int include_optional) {
    cloud_event_data_t* cloud_event_data_1 = instantiate_cloud_event_data(include_optional);

	cJSON* jsoncloud_event_data_1 = cloud_event_data_convertToJSON(cloud_event_data_1);
	printf("cloud_event_data :\n%s\n", cJSON_Print(jsoncloud_event_data_1));
	cloud_event_data_t* cloud_event_data_2 = cloud_event_data_parseFromJSON(jsoncloud_event_data_1);
	cJSON* jsoncloud_event_data_2 = cloud_event_data_convertToJSON(cloud_event_data_2);
	printf("repeating cloud_event_data:\n%s\n", cJSON_Print(jsoncloud_event_data_2));
}

int main() {
  test_cloud_event_data(1);
  test_cloud_event_data(0);

  printf("Hello world \n");
  return 0;
}

#endif // cloud_event_data_MAIN
#endif // cloud_event_data_TEST
