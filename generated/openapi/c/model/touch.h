/*
 * touch.h
 *
 * 
 */

#ifndef _touch_H_
#define _touch_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct touch_t touch_t;




typedef struct touch_t {
    list_t *ids; //primitive container

} touch_t;

touch_t *touch_create(
    list_t *ids
);

void touch_free(touch_t *touch);

touch_t *touch_parseFromJSON(cJSON *touchJSON);

cJSON *touch_convertToJSON(touch_t *touch);

#endif /* _touch_H_ */

