/*
 * clipboard_event.h
 *
 * 
 */

#ifndef _clipboard_event_H_
#define _clipboard_event_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct clipboard_event_t clipboard_event_t;

#include "any_type.h"
#include "clipboard.h"



typedef struct clipboard_event_t {
    char *id; // string
    char *source; // string
    char *specversion; // string
    char *type; // string
    char *datacontenttype; // string
    char *dataschema; // string
    char *subject; // string
    char *time; //date time
    struct clipboard_t *data; //model
    char *data_base64; // string

} clipboard_event_t;

clipboard_event_t *clipboard_event_create(
    char *id,
    char *source,
    char *specversion,
    char *type,
    char *datacontenttype,
    char *dataschema,
    char *subject,
    char *time,
    clipboard_t *data,
    char *data_base64
);

void clipboard_event_free(clipboard_event_t *clipboard_event);

clipboard_event_t *clipboard_event_parseFromJSON(cJSON *clipboard_eventJSON);

cJSON *clipboard_event_convertToJSON(clipboard_event_t *clipboard_event);

#endif /* _clipboard_event_H_ */

