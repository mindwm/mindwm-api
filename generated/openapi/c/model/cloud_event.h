/*
 * cloud_event.h
 *
 * CloudEvents Specification JSON Schema
 */

#ifndef _cloud_event_H_
#define _cloud_event_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct cloud_event_t cloud_event_t;

#include "object.h"



typedef struct cloud_event_t {
    char *id; // string
    char *source; // string
    char *specversion; // string
    char *type; // string
    char *datacontenttype; // string
    char *dataschema; // string
    char *subject; // string
    char *time; //date time
    object_t *data; //object
    char *data_base64; // string

} cloud_event_t;

cloud_event_t *cloud_event_create(
    char *id,
    char *source,
    char *specversion,
    char *type,
    char *datacontenttype,
    char *dataschema,
    char *subject,
    char *time,
    object_t *data,
    char *data_base64
);

void cloud_event_free(cloud_event_t *cloud_event);

cloud_event_t *cloud_event_parseFromJSON(cJSON *cloud_eventJSON);

cJSON *cloud_event_convertToJSON(cloud_event_t *cloud_event);

#endif /* _cloud_event_H_ */

