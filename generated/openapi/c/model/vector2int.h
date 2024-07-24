/*
 * vector2int.h
 *
 * 
 */

#ifndef _vector2int_H_
#define _vector2int_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct vector2int_t vector2int_t;




typedef struct vector2int_t {
    double x; //numeric
    double y; //numeric

} vector2int_t;

vector2int_t *vector2int_create(
    double x,
    double y
);

void vector2int_free(vector2int_t *vector2int);

vector2int_t *vector2int_parseFromJSON(cJSON *vector2intJSON);

cJSON *vector2int_convertToJSON(vector2int_t *vector2int);

#endif /* _vector2int_H_ */

