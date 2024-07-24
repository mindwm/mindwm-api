#ifndef vector2int_TEST
#define vector2int_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define vector2int_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/vector2int.h"
vector2int_t* instantiate_vector2int(int include_optional);



vector2int_t* instantiate_vector2int(int include_optional) {
  vector2int_t* vector2int = NULL;
  if (include_optional) {
    vector2int = vector2int_create(
      0,
      0
    );
  } else {
    vector2int = vector2int_create(
      0,
      0
    );
  }

  return vector2int;
}


#ifdef vector2int_MAIN

void test_vector2int(int include_optional) {
    vector2int_t* vector2int_1 = instantiate_vector2int(include_optional);

	cJSON* jsonvector2int_1 = vector2int_convertToJSON(vector2int_1);
	printf("vector2int :\n%s\n", cJSON_Print(jsonvector2int_1));
	vector2int_t* vector2int_2 = vector2int_parseFromJSON(jsonvector2int_1);
	cJSON* jsonvector2int_2 = vector2int_convertToJSON(vector2int_2);
	printf("repeating vector2int:\n%s\n", cJSON_Print(jsonvector2int_2));
}

int main() {
  test_vector2int(1);
  test_vector2int(0);

  printf("Hello world \n");
  return 0;
}

#endif // vector2int_MAIN
#endif // vector2int_TEST
