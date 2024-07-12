/*
 * clipboard_payload_context.h
 *
 * Selection context
 */

#ifndef _clipboard_payload_context_H_
#define _clipboard_payload_context_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct clipboard_payload_context_t clipboard_payload_context_t;




typedef struct clipboard_payload_context_t {
    char *window; // string

} clipboard_payload_context_t;

clipboard_payload_context_t *clipboard_payload_context_create(
    char *window
);

void clipboard_payload_context_free(clipboard_payload_context_t *clipboard_payload_context);

clipboard_payload_context_t *clipboard_payload_context_parseFromJSON(cJSON *clipboard_payload_contextJSON);

cJSON *clipboard_payload_context_convertToJSON(clipboard_payload_context_t *clipboard_payload_context);

#endif /* _clipboard_payload_context_H_ */

