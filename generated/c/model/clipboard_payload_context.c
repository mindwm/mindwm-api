#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "clipboard_payload_context.h"



clipboard_payload_context_t *clipboard_payload_context_create(
    char *window
    ) {
    clipboard_payload_context_t *clipboard_payload_context_local_var = malloc(sizeof(clipboard_payload_context_t));
    if (!clipboard_payload_context_local_var) {
        return NULL;
    }
    clipboard_payload_context_local_var->window = window;

    return clipboard_payload_context_local_var;
}


void clipboard_payload_context_free(clipboard_payload_context_t *clipboard_payload_context) {
    if(NULL == clipboard_payload_context){
        return ;
    }
    listEntry_t *listEntry;
    if (clipboard_payload_context->window) {
        free(clipboard_payload_context->window);
        clipboard_payload_context->window = NULL;
    }
    free(clipboard_payload_context);
}

cJSON *clipboard_payload_context_convertToJSON(clipboard_payload_context_t *clipboard_payload_context) {
    cJSON *item = cJSON_CreateObject();

    // clipboard_payload_context->window
    if(clipboard_payload_context->window) {
    if(cJSON_AddStringToObject(item, "window", clipboard_payload_context->window) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

clipboard_payload_context_t *clipboard_payload_context_parseFromJSON(cJSON *clipboard_payload_contextJSON){

    clipboard_payload_context_t *clipboard_payload_context_local_var = NULL;

    // clipboard_payload_context->window
    cJSON *window = cJSON_GetObjectItemCaseSensitive(clipboard_payload_contextJSON, "window");
    if (window) { 
    if(!cJSON_IsString(window) && !cJSON_IsNull(window))
    {
    goto end; //String
    }
    }


    clipboard_payload_context_local_var = clipboard_payload_context_create (
        window && !cJSON_IsNull(window) ? strdup(window->valuestring) : NULL
        );

    return clipboard_payload_context_local_var;
end:
    return NULL;

}
