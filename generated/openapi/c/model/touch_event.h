/*
 * touch_event.h
 *
 * 
 */

#ifndef _touch_event_H_
#define _touch_event_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct touch_event_t touch_event_t;

#include "any_type.h"
#include "touch.h"



typedef struct touch_event_t {
    char *id; // string
    char *source; // string
    char *specversion; // string
    char *type; // string
    char *datacontenttype; // string
    char *dataschema; // string
    char *subject; // string
    char *time; //date time
    struct touch_t *data; //model
    char *data_base64; // string
    char *knativebrokerttl; // string

} touch_event_t;

touch_event_t *touch_event_create(
    char *id,
    char *source,
    char *specversion,
    char *type,
    char *datacontenttype,
    char *dataschema,
    char *subject,
    char *time,
    touch_t *data,
    char *data_base64,
    char *knativebrokerttl
);

void touch_event_free(touch_event_t *touch_event);

touch_event_t *touch_event_parseFromJSON(cJSON *touch_eventJSON);

cJSON *touch_event_convertToJSON(touch_event_t *touch_event);

#endif /* _touch_event_H_ */

