#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "clipboard.h"



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
    ) {
    clipboard_t *clipboard_local_var = malloc(sizeof(clipboard_t));
    if (!clipboard_local_var) {
        return NULL;
    }
    clipboard_local_var->id = id;
    clipboard_local_var->source = source;
    clipboard_local_var->specversion = specversion;
    clipboard_local_var->type = type;
    clipboard_local_var->datacontenttype = datacontenttype;
    clipboard_local_var->dataschema = dataschema;
    clipboard_local_var->subject = subject;
    clipboard_local_var->time = time;
    clipboard_local_var->data = data;
    clipboard_local_var->data_base64 = data_base64;

    return clipboard_local_var;
}


void clipboard_free(clipboard_t *clipboard) {
    if(NULL == clipboard){
        return ;
    }
    listEntry_t *listEntry;
    if (clipboard->id) {
        free(clipboard->id);
        clipboard->id = NULL;
    }
    if (clipboard->source) {
        free(clipboard->source);
        clipboard->source = NULL;
    }
    if (clipboard->specversion) {
        free(clipboard->specversion);
        clipboard->specversion = NULL;
    }
    if (clipboard->type) {
        free(clipboard->type);
        clipboard->type = NULL;
    }
    if (clipboard->datacontenttype) {
        free(clipboard->datacontenttype);
        clipboard->datacontenttype = NULL;
    }
    if (clipboard->dataschema) {
        free(clipboard->dataschema);
        clipboard->dataschema = NULL;
    }
    if (clipboard->subject) {
        free(clipboard->subject);
        clipboard->subject = NULL;
    }
    if (clipboard->time) {
        free(clipboard->time);
        clipboard->time = NULL;
    }
    if (clipboard->data) {
        clipboard_payload_free(clipboard->data);
        clipboard->data = NULL;
    }
    if (clipboard->data_base64) {
        free(clipboard->data_base64);
        clipboard->data_base64 = NULL;
    }
    free(clipboard);
}

cJSON *clipboard_convertToJSON(clipboard_t *clipboard) {
    cJSON *item = cJSON_CreateObject();

    // clipboard->id
    if (!clipboard->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", clipboard->id) == NULL) {
    goto fail; //String
    }


    // clipboard->source
    if (!clipboard->source) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "source", clipboard->source) == NULL) {
    goto fail; //String
    }


    // clipboard->specversion
    if (!clipboard->specversion) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "specversion", clipboard->specversion) == NULL) {
    goto fail; //String
    }


    // clipboard->type
    if (!clipboard->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", clipboard->type) == NULL) {
    goto fail; //String
    }


    // clipboard->datacontenttype
    if(clipboard->datacontenttype) {
    if(cJSON_AddStringToObject(item, "datacontenttype", clipboard->datacontenttype) == NULL) {
    goto fail; //String
    }
    }


    // clipboard->dataschema
    if(clipboard->dataschema) {
    if(cJSON_AddStringToObject(item, "dataschema", clipboard->dataschema) == NULL) {
    goto fail; //String
    }
    }


    // clipboard->subject
    if(clipboard->subject) {
    if(cJSON_AddStringToObject(item, "subject", clipboard->subject) == NULL) {
    goto fail; //String
    }
    }


    // clipboard->time
    if(clipboard->time) {
    if(cJSON_AddStringToObject(item, "time", clipboard->time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // clipboard->data
    if(clipboard->data) {
    cJSON *data_local_JSON = clipboard_payload_convertToJSON(clipboard->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // clipboard->data_base64
    if(clipboard->data_base64) {
    if(cJSON_AddStringToObject(item, "data_base64", clipboard->data_base64) == NULL) {
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

clipboard_t *clipboard_parseFromJSON(cJSON *clipboardJSON){

    clipboard_t *clipboard_local_var = NULL;

    // define the local variable for clipboard->data
    clipboard_payload_t *data_local_nonprim = NULL;

    // clipboard->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(clipboardJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // clipboard->source
    cJSON *source = cJSON_GetObjectItemCaseSensitive(clipboardJSON, "source");
    if (!source) {
        goto end;
    }

    
    if(!cJSON_IsString(source))
    {
    goto end; //String
    }

    // clipboard->specversion
    cJSON *specversion = cJSON_GetObjectItemCaseSensitive(clipboardJSON, "specversion");
    if (!specversion) {
        goto end;
    }

    
    if(!cJSON_IsString(specversion))
    {
    goto end; //String
    }

    // clipboard->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(clipboardJSON, "type");
    if (!type) {
        goto end;
    }

    
    if(!cJSON_IsString(type))
    {
    goto end; //String
    }

    // clipboard->datacontenttype
    cJSON *datacontenttype = cJSON_GetObjectItemCaseSensitive(clipboardJSON, "datacontenttype");
    if (datacontenttype) { 
    if(!cJSON_IsString(datacontenttype) && !cJSON_IsNull(datacontenttype))
    {
    goto end; //String
    }
    }

    // clipboard->dataschema
    cJSON *dataschema = cJSON_GetObjectItemCaseSensitive(clipboardJSON, "dataschema");
    if (dataschema) { 
    if(!cJSON_IsString(dataschema) && !cJSON_IsNull(dataschema))
    {
    goto end; //String
    }
    }

    // clipboard->subject
    cJSON *subject = cJSON_GetObjectItemCaseSensitive(clipboardJSON, "subject");
    if (subject) { 
    if(!cJSON_IsString(subject) && !cJSON_IsNull(subject))
    {
    goto end; //String
    }
    }

    // clipboard->time
    cJSON *time = cJSON_GetObjectItemCaseSensitive(clipboardJSON, "time");
    if (time) { 
    if(!cJSON_IsString(time) && !cJSON_IsNull(time))
    {
    goto end; //DateTime
    }
    }

    // clipboard->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(clipboardJSON, "data");
    if (data) { 
    data_local_nonprim = clipboard_payload_parseFromJSON(data); //nonprimitive
    }

    // clipboard->data_base64
    cJSON *data_base64 = cJSON_GetObjectItemCaseSensitive(clipboardJSON, "data_base64");
    if (data_base64) { 
    if(!cJSON_IsString(data_base64) && !cJSON_IsNull(data_base64))
    {
    goto end; //String
    }
    }


    clipboard_local_var = clipboard_create (
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

    return clipboard_local_var;
end:
    if (data_local_nonprim) {
        clipboard_payload_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
