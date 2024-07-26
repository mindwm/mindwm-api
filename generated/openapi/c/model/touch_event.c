#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "touch_event.h"



touch_event_t *touch_event_create(
    char *id,
    char *source,
    char *specversion,
    char *type,
    char *datacontenttype,
    char *dataschema,
    char *subject,
    char *time,
    touch_t *data,
    char *data_base64,
    char *knativebrokerttl
    ) {
    touch_event_t *touch_event_local_var = malloc(sizeof(touch_event_t));
    if (!touch_event_local_var) {
        return NULL;
    }
    touch_event_local_var->id = id;
    touch_event_local_var->source = source;
    touch_event_local_var->specversion = specversion;
    touch_event_local_var->type = type;
    touch_event_local_var->datacontenttype = datacontenttype;
    touch_event_local_var->dataschema = dataschema;
    touch_event_local_var->subject = subject;
    touch_event_local_var->time = time;
    touch_event_local_var->data = data;
    touch_event_local_var->data_base64 = data_base64;
    touch_event_local_var->knativebrokerttl = knativebrokerttl;

    return touch_event_local_var;
}


void touch_event_free(touch_event_t *touch_event) {
    if(NULL == touch_event){
        return ;
    }
    listEntry_t *listEntry;
    if (touch_event->id) {
        free(touch_event->id);
        touch_event->id = NULL;
    }
    if (touch_event->source) {
        free(touch_event->source);
        touch_event->source = NULL;
    }
    if (touch_event->specversion) {
        free(touch_event->specversion);
        touch_event->specversion = NULL;
    }
    if (touch_event->type) {
        free(touch_event->type);
        touch_event->type = NULL;
    }
    if (touch_event->datacontenttype) {
        free(touch_event->datacontenttype);
        touch_event->datacontenttype = NULL;
    }
    if (touch_event->dataschema) {
        free(touch_event->dataschema);
        touch_event->dataschema = NULL;
    }
    if (touch_event->subject) {
        free(touch_event->subject);
        touch_event->subject = NULL;
    }
    if (touch_event->time) {
        free(touch_event->time);
        touch_event->time = NULL;
    }
    if (touch_event->data) {
        touch_free(touch_event->data);
        touch_event->data = NULL;
    }
    if (touch_event->data_base64) {
        free(touch_event->data_base64);
        touch_event->data_base64 = NULL;
    }
    if (touch_event->knativebrokerttl) {
        free(touch_event->knativebrokerttl);
        touch_event->knativebrokerttl = NULL;
    }
    free(touch_event);
}

cJSON *touch_event_convertToJSON(touch_event_t *touch_event) {
    cJSON *item = cJSON_CreateObject();

    // touch_event->id
    if (!touch_event->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", touch_event->id) == NULL) {
    goto fail; //String
    }


    // touch_event->source
    if (!touch_event->source) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "source", touch_event->source) == NULL) {
    goto fail; //String
    }


    // touch_event->specversion
    if (!touch_event->specversion) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "specversion", touch_event->specversion) == NULL) {
    goto fail; //String
    }


    // touch_event->type
    if (!touch_event->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", touch_event->type) == NULL) {
    goto fail; //String
    }


    // touch_event->datacontenttype
    if(touch_event->datacontenttype) {
    if(cJSON_AddStringToObject(item, "datacontenttype", touch_event->datacontenttype) == NULL) {
    goto fail; //String
    }
    }


    // touch_event->dataschema
    if(touch_event->dataschema) {
    if(cJSON_AddStringToObject(item, "dataschema", touch_event->dataschema) == NULL) {
    goto fail; //String
    }
    }


    // touch_event->subject
    if(touch_event->subject) {
    if(cJSON_AddStringToObject(item, "subject", touch_event->subject) == NULL) {
    goto fail; //String
    }
    }


    // touch_event->time
    if(touch_event->time) {
    if(cJSON_AddStringToObject(item, "time", touch_event->time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // touch_event->data
    if(touch_event->data) {
    cJSON *data_local_JSON = touch_convertToJSON(touch_event->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // touch_event->data_base64
    if(touch_event->data_base64) {
    if(cJSON_AddStringToObject(item, "data_base64", touch_event->data_base64) == NULL) {
    goto fail; //String
    }
    }


    // touch_event->knativebrokerttl
    if(touch_event->knativebrokerttl) {
    if(cJSON_AddStringToObject(item, "knativebrokerttl", touch_event->knativebrokerttl) == NULL) {
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

touch_event_t *touch_event_parseFromJSON(cJSON *touch_eventJSON){

    touch_event_t *touch_event_local_var = NULL;

    // define the local variable for touch_event->data
    touch_t *data_local_nonprim = NULL;

    // touch_event->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(touch_eventJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // touch_event->source
    cJSON *source = cJSON_GetObjectItemCaseSensitive(touch_eventJSON, "source");
    if (!source) {
        goto end;
    }

    
    if(!cJSON_IsString(source))
    {
    goto end; //String
    }

    // touch_event->specversion
    cJSON *specversion = cJSON_GetObjectItemCaseSensitive(touch_eventJSON, "specversion");
    if (!specversion) {
        goto end;
    }

    
    if(!cJSON_IsString(specversion))
    {
    goto end; //String
    }

    // touch_event->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(touch_eventJSON, "type");
    if (!type) {
        goto end;
    }

    
    if(!cJSON_IsString(type))
    {
    goto end; //String
    }

    // touch_event->datacontenttype
    cJSON *datacontenttype = cJSON_GetObjectItemCaseSensitive(touch_eventJSON, "datacontenttype");
    if (datacontenttype) { 
    if(!cJSON_IsString(datacontenttype) && !cJSON_IsNull(datacontenttype))
    {
    goto end; //String
    }
    }

    // touch_event->dataschema
    cJSON *dataschema = cJSON_GetObjectItemCaseSensitive(touch_eventJSON, "dataschema");
    if (dataschema) { 
    if(!cJSON_IsString(dataschema) && !cJSON_IsNull(dataschema))
    {
    goto end; //String
    }
    }

    // touch_event->subject
    cJSON *subject = cJSON_GetObjectItemCaseSensitive(touch_eventJSON, "subject");
    if (subject) { 
    if(!cJSON_IsString(subject) && !cJSON_IsNull(subject))
    {
    goto end; //String
    }
    }

    // touch_event->time
    cJSON *time = cJSON_GetObjectItemCaseSensitive(touch_eventJSON, "time");
    if (time) { 
    if(!cJSON_IsString(time) && !cJSON_IsNull(time))
    {
    goto end; //DateTime
    }
    }

    // touch_event->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(touch_eventJSON, "data");
    if (data) { 
    data_local_nonprim = touch_parseFromJSON(data); //nonprimitive
    }

    // touch_event->data_base64
    cJSON *data_base64 = cJSON_GetObjectItemCaseSensitive(touch_eventJSON, "data_base64");
    if (data_base64) { 
    if(!cJSON_IsString(data_base64) && !cJSON_IsNull(data_base64))
    {
    goto end; //String
    }
    }

    // touch_event->knativebrokerttl
    cJSON *knativebrokerttl = cJSON_GetObjectItemCaseSensitive(touch_eventJSON, "knativebrokerttl");
    if (knativebrokerttl) { 
    if(!cJSON_IsString(knativebrokerttl) && !cJSON_IsNull(knativebrokerttl))
    {
    goto end; //String
    }
    }


    touch_event_local_var = touch_event_create (
        strdup(id->valuestring),
        strdup(source->valuestring),
        strdup(specversion->valuestring),
        strdup(type->valuestring),
        datacontenttype && !cJSON_IsNull(datacontenttype) ? strdup(datacontenttype->valuestring) : NULL,
        dataschema && !cJSON_IsNull(dataschema) ? strdup(dataschema->valuestring) : NULL,
        subject && !cJSON_IsNull(subject) ? strdup(subject->valuestring) : NULL,
        time && !cJSON_IsNull(time) ? strdup(time->valuestring) : NULL,
        data ? data_local_nonprim : NULL,
        data_base64 && !cJSON_IsNull(data_base64) ? strdup(data_base64->valuestring) : NULL,
        knativebrokerttl && !cJSON_IsNull(knativebrokerttl) ? strdup(knativebrokerttl->valuestring) : NULL
        );

    return touch_event_local_var;
end:
    if (data_local_nonprim) {
        touch_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
