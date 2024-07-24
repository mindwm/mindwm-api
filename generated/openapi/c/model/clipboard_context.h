/*
 * clipboard_context.h
 *
 * 
 */

#ifndef _clipboard_context_H_
#define _clipboard_context_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct clipboard_context_t clipboard_context_t;




typedef struct clipboard_context_t {
    double window_id; //numeric

} clipboard_context_t;

clipboard_context_t *clipboard_context_create(
    double window_id
);

void clipboard_context_free(clipboard_context_t *clipboard_context);

clipboard_context_t *clipboard_context_parseFromJSON(cJSON *clipboard_contextJSON);

cJSON *clipboard_context_convertToJSON(clipboard_context_t *clipboard_context);

#endif /* _clipboard_context_H_ */

