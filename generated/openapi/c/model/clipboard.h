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
#include "clipboard_context.h"
#include "vector2int.h"

// Enum CLIPBOARDTYPE for clipboard

typedef enum  { mindwm_api_clipboard_CLIPBOARDTYPE_NULL = 0, mindwm_api_clipboard_CLIPBOARDTYPE_Primary, mindwm_api_clipboard_CLIPBOARDTYPE_Secondary, mindwm_api_clipboard_CLIPBOARDTYPE_Clipboard } mindwm_api_clipboard_CLIPBOARDTYPE_e;

char* clipboard_clipboard_type_ToString(mindwm_api_clipboard_CLIPBOARDTYPE_e clipboard_type);

mindwm_api_clipboard_CLIPBOARDTYPE_e clipboard_clipboard_type_FromString(char* clipboard_type);



typedef struct clipboard_t {
    struct clipboard_context_t *context; //model
    mindwm_api_clipboard_CLIPBOARDTYPE_e clipboard_type; //enum
    char *content; // string
    struct vector2int_t *selection_start; //model
    struct vector2int_t *selection_end; //model

} clipboard_t;

clipboard_t *clipboard_create(
    clipboard_context_t *context,
    mindwm_api_clipboard_CLIPBOARDTYPE_e clipboard_type,
    char *content,
    vector2int_t *selection_start,
    vector2int_t *selection_end
);

void clipboard_free(clipboard_t *clipboard);

clipboard_t *clipboard_parseFromJSON(cJSON *clipboardJSON);

cJSON *clipboard_convertToJSON(clipboard_t *clipboard);

#endif /* _clipboard_H_ */

