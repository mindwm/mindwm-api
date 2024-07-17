/*
 * clipboard.h
 *
 * 
 */

#ifndef _clipboard_H_
#define _clipboard_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct clipboard_t clipboard_t;

#include "any_type.h"
#include "clipboard_payload.h"



typedef struct clipboard_t {
    char *id; // string
    char *source; // string
    char *specversion; // string
    char *type; // string
    char *datacontenttype; // string
    char *dataschema; // string
    char *subject; // string
    char *time; //date time
    struct clipboard_payload_t *data; //model
    char *data_base64; // string

} clipboard_t;

clipboard_t *clipboard_create(
    char *id,
    char *source,
    char *specversion,
    char *type,
    char *datacontenttype,
    char *dataschema,
    char *subject,
    char *time,
    clipboard_payload_t *data,
    char *data_base64
);

void clipboard_free(clipboard_t *clipboard);

clipboard_t *clipboard_parseFromJSON(cJSON *clipboardJSON);

cJSON *clipboard_convertToJSON(clipboard_t *clipboard);

#endif /* _clipboard_H_ */

