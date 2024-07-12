#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "clipboard_payload.h"


char* clipboard_payload_type_ToString(mindwm_api_clipboard_payload_TYPE_e type) {
    char* typeArray[] =  { "NULL", "primary", "secondary", "clipboard" };
    return typeArray[type];
}

mindwm_api_clipboard_payload_TYPE_e clipboard_payload_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "primary", "secondary", "clipboard" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

clipboard_payload_t *clipboard_payload_create(
    list_t *start,
    list_t *stop,
    char *data,
    mindwm_api_clipboard_payload_TYPE_e type,
    clipboard_payload_context_t *context
    ) {
    clipboard_payload_t *clipboard_payload_local_var = malloc(sizeof(clipboard_payload_t));
    if (!clipboard_payload_local_var) {
        return NULL;
    }
    clipboard_payload_local_var->start = start;
    clipboard_payload_local_var->stop = stop;
    clipboard_payload_local_var->data = data;
    clipboard_payload_local_var->type = type;
    clipboard_payload_local_var->context = context;

    return clipboard_payload_local_var;
}


void clipboard_payload_free(clipboard_payload_t *clipboard_payload) {
    if(NULL == clipboard_payload){
        return ;
    }
    listEntry_t *listEntry;
    if (clipboard_payload->start) {
        list_ForEach(listEntry, clipboard_payload->start) {
            free(listEntry->data);
        }
        list_freeList(clipboard_payload->start);
        clipboard_payload->start = NULL;
    }
    if (clipboard_payload->stop) {
        list_ForEach(listEntry, clipboard_payload->stop) {
            free(listEntry->data);
        }
        list_freeList(clipboard_payload->stop);
        clipboard_payload->stop = NULL;
    }
    if (clipboard_payload->data) {
        free(clipboard_payload->data);
        clipboard_payload->data = NULL;
    }
    if (clipboard_payload->context) {
        clipboard_payload_context_free(clipboard_payload->context);
        clipboard_payload->context = NULL;
    }
    free(clipboard_payload);
}

cJSON *clipboard_payload_convertToJSON(clipboard_payload_t *clipboard_payload) {
    cJSON *item = cJSON_CreateObject();

    // clipboard_payload->start
    if(clipboard_payload->start) {
    cJSON *start = cJSON_AddArrayToObject(item, "start");
    if(start == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *startListEntry;
    list_ForEach(startListEntry, clipboard_payload->start) {
    if(cJSON_AddNumberToObject(start, "", *(double *)startListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // clipboard_payload->stop
    if(clipboard_payload->stop) {
    cJSON *stop = cJSON_AddArrayToObject(item, "stop");
    if(stop == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *stopListEntry;
    list_ForEach(stopListEntry, clipboard_payload->stop) {
    if(cJSON_AddNumberToObject(stop, "", *(double *)stopListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // clipboard_payload->data
    if(clipboard_payload->data) {
    if(cJSON_AddStringToObject(item, "data", clipboard_payload->data) == NULL) {
    goto fail; //String
    }
    }


    // clipboard_payload->type
    if(clipboard_payload->type != mindwm_api_clipboard_payload_TYPE_NULL) {
    if(cJSON_AddStringToObject(item, "type", typeclipboard_payload_ToString(clipboard_payload->type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // clipboard_payload->context
    if(clipboard_payload->context) {
    cJSON *context_local_JSON = clipboard_payload_context_convertToJSON(clipboard_payload->context);
    if(context_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "context", context_local_JSON);
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

clipboard_payload_t *clipboard_payload_parseFromJSON(cJSON *clipboard_payloadJSON){

    clipboard_payload_t *clipboard_payload_local_var = NULL;

    // define the local list for clipboard_payload->start
    list_t *startList = NULL;

    // define the local list for clipboard_payload->stop
    list_t *stopList = NULL;

    // define the local variable for clipboard_payload->context
    clipboard_payload_context_t *context_local_nonprim = NULL;

    // clipboard_payload->start
    cJSON *start = cJSON_GetObjectItemCaseSensitive(clipboard_payloadJSON, "start");
    if (start) { 
    cJSON *start_local = NULL;
    if(!cJSON_IsArray(start)) {
        goto end;//primitive container
    }
    startList = list_createList();

    cJSON_ArrayForEach(start_local, start)
    {
        if(!cJSON_IsNumber(start_local))
        {
            goto end;
        }
        double *start_local_value = (double *)calloc(1, sizeof(double));
        if(!start_local_value)
        {
            goto end;
        }
        *start_local_value = start_local->valuedouble;
        list_addElement(startList , start_local_value);
    }
    }

    // clipboard_payload->stop
    cJSON *stop = cJSON_GetObjectItemCaseSensitive(clipboard_payloadJSON, "stop");
    if (stop) { 
    cJSON *stop_local = NULL;
    if(!cJSON_IsArray(stop)) {
        goto end;//primitive container
    }
    stopList = list_createList();

    cJSON_ArrayForEach(stop_local, stop)
    {
        if(!cJSON_IsNumber(stop_local))
        {
            goto end;
        }
        double *stop_local_value = (double *)calloc(1, sizeof(double));
        if(!stop_local_value)
        {
            goto end;
        }
        *stop_local_value = stop_local->valuedouble;
        list_addElement(stopList , stop_local_value);
    }
    }

    // clipboard_payload->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(clipboard_payloadJSON, "data");
    if (data) { 
    if(!cJSON_IsString(data) && !cJSON_IsNull(data))
    {
    goto end; //String
    }
    }

    // clipboard_payload->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(clipboard_payloadJSON, "type");
    mindwm_api_clipboard_payload_TYPE_e typeVariable;
    if (type) { 
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = clipboard_payload_type_FromString(type->valuestring);
    }

    // clipboard_payload->context
    cJSON *context = cJSON_GetObjectItemCaseSensitive(clipboard_payloadJSON, "context");
    if (context) { 
    context_local_nonprim = clipboard_payload_context_parseFromJSON(context); //nonprimitive
    }


    clipboard_payload_local_var = clipboard_payload_create (
        start ? startList : NULL,
        stop ? stopList : NULL,
        data && !cJSON_IsNull(data) ? strdup(data->valuestring) : NULL,
        type ? typeVariable : mindwm_api_clipboard_payload_TYPE_NULL,
        context ? context_local_nonprim : NULL
        );

    return clipboard_payload_local_var;
end:
    if (startList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, startList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(startList);
        startList = NULL;
    }
    if (stopList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, stopList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(stopList);
        stopList = NULL;
    }
    if (context_local_nonprim) {
        clipboard_payload_context_free(context_local_nonprim);
        context_local_nonprim = NULL;
    }
    return NULL;

}
