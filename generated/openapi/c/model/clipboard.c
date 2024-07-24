#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "clipboard.h"


char* clipboard_clipboard_type_ToString(mindwm_api_clipboard_CLIPBOARDTYPE_e clipboard_type) {
    char* clipboard_typeArray[] =  { "NULL", "Primary", "Secondary", "Clipboard" };
    return clipboard_typeArray[clipboard_type];
}

mindwm_api_clipboard_CLIPBOARDTYPE_e clipboard_clipboard_type_FromString(char* clipboard_type){
    int stringToReturn = 0;
    char *clipboard_typeArray[] =  { "NULL", "Primary", "Secondary", "Clipboard" };
    size_t sizeofArray = sizeof(clipboard_typeArray) / sizeof(clipboard_typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(clipboard_type, clipboard_typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

clipboard_t *clipboard_create(
    clipboard_context_t *context,
    mindwm_api_clipboard_CLIPBOARDTYPE_e clipboard_type,
    char *content,
    vector2int_t *selection_start,
    vector2int_t *selection_end
    ) {
    clipboard_t *clipboard_local_var = malloc(sizeof(clipboard_t));
    if (!clipboard_local_var) {
        return NULL;
    }
    clipboard_local_var->context = context;
    clipboard_local_var->clipboard_type = clipboard_type;
    clipboard_local_var->content = content;
    clipboard_local_var->selection_start = selection_start;
    clipboard_local_var->selection_end = selection_end;

    return clipboard_local_var;
}


void clipboard_free(clipboard_t *clipboard) {
    if(NULL == clipboard){
        return ;
    }
    listEntry_t *listEntry;
    if (clipboard->context) {
        clipboard_context_free(clipboard->context);
        clipboard->context = NULL;
    }
    if (clipboard->content) {
        free(clipboard->content);
        clipboard->content = NULL;
    }
    if (clipboard->selection_start) {
        vector2int_free(clipboard->selection_start);
        clipboard->selection_start = NULL;
    }
    if (clipboard->selection_end) {
        vector2int_free(clipboard->selection_end);
        clipboard->selection_end = NULL;
    }
    free(clipboard);
}

cJSON *clipboard_convertToJSON(clipboard_t *clipboard) {
    cJSON *item = cJSON_CreateObject();

    // clipboard->context
    if (!clipboard->context) {
        goto fail;
    }
    cJSON *context_local_JSON = clipboard_context_convertToJSON(clipboard->context);
    if(context_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "context", context_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // clipboard->clipboard_type
    if (mindwm_api_clipboard_CLIPBOARDTYPE_NULL == clipboard->clipboard_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "clipboardType", clipboard_typeclipboard_ToString(clipboard->clipboard_type)) == NULL)
    {
    goto fail; //Enum
    }


    // clipboard->content
    if (!clipboard->content) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "content", clipboard->content) == NULL) {
    goto fail; //String
    }


    // clipboard->selection_start
    if(clipboard->selection_start) {
    cJSON *selection_start_local_JSON = vector2int_convertToJSON(clipboard->selection_start);
    if(selection_start_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "selectionStart", selection_start_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // clipboard->selection_end
    if(clipboard->selection_end) {
    cJSON *selection_end_local_JSON = vector2int_convertToJSON(clipboard->selection_end);
    if(selection_end_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "selectionEnd", selection_end_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

clipboard_t *clipboard_parseFromJSON(cJSON *clipboardJSON){

    clipboard_t *clipboard_local_var = NULL;

    // define the local variable for clipboard->context
    clipboard_context_t *context_local_nonprim = NULL;

    // define the local variable for clipboard->selection_start
    vector2int_t *selection_start_local_nonprim = NULL;

    // define the local variable for clipboard->selection_end
    vector2int_t *selection_end_local_nonprim = NULL;

    // clipboard->context
    cJSON *context = cJSON_GetObjectItemCaseSensitive(clipboardJSON, "context");
    if (!context) {
        goto end;
    }

    
    context_local_nonprim = clipboard_context_parseFromJSON(context); //nonprimitive

    // clipboard->clipboard_type
    cJSON *clipboard_type = cJSON_GetObjectItemCaseSensitive(clipboardJSON, "clipboardType");
    if (!clipboard_type) {
        goto end;
    }

    mindwm_api_clipboard_CLIPBOARDTYPE_e clipboard_typeVariable;
    
    if(!cJSON_IsString(clipboard_type))
    {
    goto end; //Enum
    }
    clipboard_typeVariable = clipboard_clipboard_type_FromString(clipboard_type->valuestring);

    // clipboard->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(clipboardJSON, "content");
    if (!content) {
        goto end;
    }

    
    if(!cJSON_IsString(content))
    {
    goto end; //String
    }

    // clipboard->selection_start
    cJSON *selection_start = cJSON_GetObjectItemCaseSensitive(clipboardJSON, "selectionStart");
    if (selection_start) { 
    selection_start_local_nonprim = vector2int_parseFromJSON(selection_start); //nonprimitive
    }

    // clipboard->selection_end
    cJSON *selection_end = cJSON_GetObjectItemCaseSensitive(clipboardJSON, "selectionEnd");
    if (selection_end) { 
    selection_end_local_nonprim = vector2int_parseFromJSON(selection_end); //nonprimitive
    }


    clipboard_local_var = clipboard_create (
        context_local_nonprim,
        clipboard_typeVariable,
        strdup(content->valuestring),
        selection_start ? selection_start_local_nonprim : NULL,
        selection_end ? selection_end_local_nonprim : NULL
        );

    return clipboard_local_var;
end:
    if (context_local_nonprim) {
        clipboard_context_free(context_local_nonprim);
        context_local_nonprim = NULL;
    }
    if (selection_start_local_nonprim) {
        vector2int_free(selection_start_local_nonprim);
        selection_start_local_nonprim = NULL;
    }
    if (selection_end_local_nonprim) {
        vector2int_free(selection_end_local_nonprim);
        selection_end_local_nonprim = NULL;
    }
    return NULL;

}
