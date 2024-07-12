/*
 * clipboard_payload.h
 *
 * 
 */

#ifndef _clipboard_payload_H_
#define _clipboard_payload_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct clipboard_payload_t clipboard_payload_t;

#include "clipboard_payload_context.h"

// Enum TYPE for clipboard_payload

typedef enum  { mindwm_api_clipboard_payload_TYPE_NULL = 0, mindwm_api_clipboard_payload_TYPE_primary, mindwm_api_clipboard_payload_TYPE_secondary, mindwm_api_clipboard_payload_TYPE_clipboard } mindwm_api_clipboard_payload_TYPE_e;

char* clipboard_payload_type_ToString(mindwm_api_clipboard_payload_TYPE_e type);

mindwm_api_clipboard_payload_TYPE_e clipboard_payload_type_FromString(char* type);



typedef struct clipboard_payload_t {
    list_t *start; //primitive container
    list_t *stop; //primitive container
    char *data; // string
    mindwm_api_clipboard_payload_TYPE_e type; //enum
    struct clipboard_payload_context_t *context; //model

} clipboard_payload_t;

clipboard_payload_t *clipboard_payload_create(
    list_t *start,
    list_t *stop,
    char *data,
    mindwm_api_clipboard_payload_TYPE_e type,
    clipboard_payload_context_t *context
);

void clipboard_payload_free(clipboard_payload_t *clipboard_payload);

clipboard_payload_t *clipboard_payload_parseFromJSON(cJSON *clipboard_payloadJSON);

cJSON *clipboard_payload_convertToJSON(clipboard_payload_t *clipboard_payload);

#endif /* _clipboard_payload_H_ */

