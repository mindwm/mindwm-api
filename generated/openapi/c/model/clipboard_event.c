#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "clipboard_event.h"



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
    ) {
    clipboard_event_t *clipboard_event_local_var = malloc(sizeof(clipboard_event_t));
    if (!clipboard_event_local_var) {
        return NULL;
    }
    clipboard_event_local_var->id = id;
    clipboard_event_local_var->source = source;
    clipboard_event_local_var->specversion = specversion;
    clipboard_event_local_var->type = type;
    clipboard_event_local_var->datacontenttype = datacontenttype;
    clipboard_event_local_var->dataschema = dataschema;
    clipboard_event_local_var->subject = subject;
    clipboard_event_local_var->time = time;
    clipboard_event_local_var->data = data;
    clipboard_event_local_var->data_base64 = data_base64;

    return clipboard_event_local_var;
}


void clipboard_event_free(clipboard_event_t *clipboard_event) {
    if(NULL == clipboard_event){
        return ;
    }
    listEntry_t *listEntry;
    if (clipboard_event->id) {
        free(clipboard_event->id);
        clipboard_event->id = NULL;
    }
    if (clipboard_event->source) {
        free(clipboard_event->source);
        clipboard_event->source = NULL;
    }
    if (clipboard_event->specversion) {
        free(clipboard_event->specversion);
        clipboard_event->specversion = NULL;
    }
    if (clipboard_event->type) {
        free(clipboard_event->type);
        clipboard_event->type = NULL;
    }
    if (clipboard_event->datacontenttype) {
        free(clipboard_event->datacontenttype);
        clipboard_event->datacontenttype = NULL;
    }
    if (clipboard_event->dataschema) {
        free(clipboard_event->dataschema);
        clipboard_event->dataschema = NULL;
    }
    if (clipboard_event->subject) {
        free(clipboard_event->subject);
        clipboard_event->subject = NULL;
    }
    if (clipboard_event->time) {
        free(clipboard_event->time);
        clipboard_event->time = NULL;
    }
    if (clipboard_event->data) {
        clipboard_free(clipboard_event->data);
        clipboard_event->data = NULL;
    }
    if (clipboard_event->data_base64) {
        free(clipboard_event->data_base64);
        clipboard_event->data_base64 = NULL;
    }
    free(clipboard_event);
}

cJSON *clipboard_event_convertToJSON(clipboard_event_t *clipboard_event) {
    cJSON *item = cJSON_CreateObject();

    // clipboard_event->id
    if (!clipboard_event->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", clipboard_event->id) == NULL) {
    goto fail; //String
    }


    // clipboard_event->source
    if (!clipboard_event->source) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "source", clipboard_event->source) == NULL) {
    goto fail; //String
    }


    // clipboard_event->specversion
    if (!clipboard_event->specversion) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "specversion", clipboard_event->specversion) == NULL) {
    goto fail; //String
    }


    // clipboard_event->type
    if (!clipboard_event->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", clipboard_event->type) == NULL) {
    goto fail; //String
    }


    // clipboard_event->datacontenttype
    if(clipboard_event->datacontenttype) {
    if(cJSON_AddStringToObject(item, "datacontenttype", clipboard_event->datacontenttype) == NULL) {
    goto fail; //String
    }
    }


    // clipboard_event->dataschema
    if(clipboard_event->dataschema) {
    if(cJSON_AddStringToObject(item, "dataschema", clipboard_event->dataschema) == NULL) {
    goto fail; //String
    }
    }


    // clipboard_event->subject
    if(clipboard_event->subject) {
    if(cJSON_AddStringToObject(item, "subject", clipboard_event->subject) == NULL) {
    goto fail; //String
    }
    }


    // clipboard_event->time
    if(clipboard_event->time) {
    if(cJSON_AddStringToObject(item, "time", clipboard_event->time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // clipboard_event->data
    if(clipboard_event->data) {
    cJSON *data_local_JSON = clipboard_convertToJSON(clipboard_event->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // clipboard_event->data_base64
    if(clipboard_event->data_base64) {
    if(cJSON_AddStringToObject(item, "data_base64", clipboard_event->data_base64) == NULL) {
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

clipboard_event_t *clipboard_event_parseFromJSON(cJSON *clipboard_eventJSON){

    clipboard_event_t *clipboard_event_local_var = NULL;

    // define the local variable for clipboard_event->data
    clipboard_t *data_local_nonprim = NULL;

    // clipboard_event->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(clipboard_eventJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // clipboard_event->source
    cJSON *source = cJSON_GetObjectItemCaseSensitive(clipboard_eventJSON, "source");
    if (!source) {
        goto end;
    }

    
    if(!cJSON_IsString(source))
    {
    goto end; //String
    }

    // clipboard_event->specversion
    cJSON *specversion = cJSON_GetObjectItemCaseSensitive(clipboard_eventJSON, "specversion");
    if (!specversion) {
        goto end;
    }

    
    if(!cJSON_IsString(specversion))
    {
    goto end; //String
    }

    // clipboard_event->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(clipboard_eventJSON, "type");
    if (!type) {
        goto end;
    }

    
    if(!cJSON_IsString(type))
    {
    goto end; //String
    }

    // clipboard_event->datacontenttype
    cJSON *datacontenttype = cJSON_GetObjectItemCaseSensitive(clipboard_eventJSON, "datacontenttype");
    if (datacontenttype) { 
    if(!cJSON_IsString(datacontenttype) && !cJSON_IsNull(datacontenttype))
    {
    goto end; //String
    }
    }

    // clipboard_event->dataschema
    cJSON *dataschema = cJSON_GetObjectItemCaseSensitive(clipboard_eventJSON, "dataschema");
    if (dataschema) { 
    if(!cJSON_IsString(dataschema) && !cJSON_IsNull(dataschema))
    {
    goto end; //String
    }
    }

    // clipboard_event->subject
    cJSON *subject = cJSON_GetObjectItemCaseSensitive(clipboard_eventJSON, "subject");
    if (subject) { 
    if(!cJSON_IsString(subject) && !cJSON_IsNull(subject))
    {
    goto end; //String
    }
    }

    // clipboard_event->time
    cJSON *time = cJSON_GetObjectItemCaseSensitive(clipboard_eventJSON, "time");
    if (time) { 
    if(!cJSON_IsString(time) && !cJSON_IsNull(time))
    {
    goto end; //DateTime
    }
    }

    // clipboard_event->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(clipboard_eventJSON, "data");
    if (data) { 
    data_local_nonprim = clipboard_parseFromJSON(data); //nonprimitive
    }

    // clipboard_event->data_base64
    cJSON *data_base64 = cJSON_GetObjectItemCaseSensitive(clipboard_eventJSON, "data_base64");
    if (data_base64) { 
    if(!cJSON_IsString(data_base64) && !cJSON_IsNull(data_base64))
    {
    goto end; //String
    }
    }


    clipboard_event_local_var = clipboard_event_create (
        strdup(id->valuestring),
        strdup(source->valuestring),
        strdup(specversion->valuestring),
        strdup(type->valuestring),
        datacontenttype && !cJSON_IsNull(datacontenttype) ? strdup(datacontenttype->valuestring) : NULL,
        dataschema && !cJSON_IsNull(dataschema) ? strdup(dataschema->valuestring) : NULL,
        subject && !cJSON_IsNull(subject) ? strdup(subject->valuestring) : NULL,
        time && !cJSON_IsNull(time) ? strdup(time->valuestring) : NULL,
        data ? data_local_nonprim : NULL,
        data_base64 && !cJSON_IsNull(data_base64) ? strdup(data_base64->valuestring) : NULL
        );

    return clipboard_event_local_var;
end:
    if (data_local_nonprim) {
        clipboard_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
