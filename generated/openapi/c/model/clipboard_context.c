#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "clipboard_context.h"



clipboard_context_t *clipboard_context_create(
    double window_id
    ) {
    clipboard_context_t *clipboard_context_local_var = malloc(sizeof(clipboard_context_t));
    if (!clipboard_context_local_var) {
        return NULL;
    }
    clipboard_context_local_var->window_id = window_id;

    return clipboard_context_local_var;
}


void clipboard_context_free(clipboard_context_t *clipboard_context) {
    if(NULL == clipboard_context){
        return ;
    }
    listEntry_t *listEntry;
    free(clipboard_context);
}

cJSON *clipboard_context_convertToJSON(clipboard_context_t *clipboard_context) {
    cJSON *item = cJSON_CreateObject();

    // clipboard_context->window_id
    if (!clipboard_context->window_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "windowId", clipboard_context->window_id) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

clipboard_context_t *clipboard_context_parseFromJSON(cJSON *clipboard_contextJSON){

    clipboard_context_t *clipboard_context_local_var = NULL;

    // clipboard_context->window_id
    cJSON *window_id = cJSON_GetObjectItemCaseSensitive(clipboard_contextJSON, "windowId");
    if (!window_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(window_id))
    {
    goto end; //Numeric
    }


    clipboard_context_local_var = clipboard_context_create (
        window_id->valuedouble
        );

    return clipboard_context_local_var;
end:
    return NULL;

}
