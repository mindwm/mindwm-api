#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cloud_event.h"



cloud_event_t *cloud_event_create(
    char *id,
    char *source,
    char *specversion,
    char *type,
    char *datacontenttype,
    char *dataschema,
    char *subject,
    char *time,
    object_t *data,
    char *data_base64
    ) {
    cloud_event_t *cloud_event_local_var = malloc(sizeof(cloud_event_t));
    if (!cloud_event_local_var) {
        return NULL;
    }
    cloud_event_local_var->id = id;
    cloud_event_local_var->source = source;
    cloud_event_local_var->specversion = specversion;
    cloud_event_local_var->type = type;
    cloud_event_local_var->datacontenttype = datacontenttype;
    cloud_event_local_var->dataschema = dataschema;
    cloud_event_local_var->subject = subject;
    cloud_event_local_var->time = time;
    cloud_event_local_var->data = data;
    cloud_event_local_var->data_base64 = data_base64;

    return cloud_event_local_var;
}


void cloud_event_free(cloud_event_t *cloud_event) {
    if(NULL == cloud_event){
        return ;
    }
    listEntry_t *listEntry;
    if (cloud_event->id) {
        free(cloud_event->id);
        cloud_event->id = NULL;
    }
    if (cloud_event->source) {
        free(cloud_event->source);
        cloud_event->source = NULL;
    }
    if (cloud_event->specversion) {
        free(cloud_event->specversion);
        cloud_event->specversion = NULL;
    }
    if (cloud_event->type) {
        free(cloud_event->type);
        cloud_event->type = NULL;
    }
    if (cloud_event->datacontenttype) {
        free(cloud_event->datacontenttype);
        cloud_event->datacontenttype = NULL;
    }
    if (cloud_event->dataschema) {
        free(cloud_event->dataschema);
        cloud_event->dataschema = NULL;
    }
    if (cloud_event->subject) {
        free(cloud_event->subject);
        cloud_event->subject = NULL;
    }
    if (cloud_event->time) {
        free(cloud_event->time);
        cloud_event->time = NULL;
    }
    if (cloud_event->data) {
        object_free(cloud_event->data);
        cloud_event->data = NULL;
    }
    if (cloud_event->data_base64) {
        free(cloud_event->data_base64);
        cloud_event->data_base64 = NULL;
    }
    free(cloud_event);
}

cJSON *cloud_event_convertToJSON(cloud_event_t *cloud_event) {
    cJSON *item = cJSON_CreateObject();

    // cloud_event->id
    if (!cloud_event->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", cloud_event->id) == NULL) {
    goto fail; //String
    }


    // cloud_event->source
    if (!cloud_event->source) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "source", cloud_event->source) == NULL) {
    goto fail; //String
    }


    // cloud_event->specversion
    if (!cloud_event->specversion) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "specversion", cloud_event->specversion) == NULL) {
    goto fail; //String
    }


    // cloud_event->type
    if (!cloud_event->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", cloud_event->type) == NULL) {
    goto fail; //String
    }


    // cloud_event->datacontenttype
    if(cloud_event->datacontenttype) {
    if(cJSON_AddStringToObject(item, "datacontenttype", cloud_event->datacontenttype) == NULL) {
    goto fail; //String
    }
    }


    // cloud_event->dataschema
    if(cloud_event->dataschema) {
    if(cJSON_AddStringToObject(item, "dataschema", cloud_event->dataschema) == NULL) {
    goto fail; //String
    }
    }


    // cloud_event->subject
    if(cloud_event->subject) {
    if(cJSON_AddStringToObject(item, "subject", cloud_event->subject) == NULL) {
    goto fail; //String
    }
    }


    // cloud_event->time
    if(cloud_event->time) {
    if(cJSON_AddStringToObject(item, "time", cloud_event->time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // cloud_event->data
    if(cloud_event->data) {
    cJSON *data_object = object_convertToJSON(cloud_event->data);
    if(data_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // cloud_event->data_base64
    if(cloud_event->data_base64) {
    if(cJSON_AddStringToObject(item, "data_base64", cloud_event->data_base64) == NULL) {
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

cloud_event_t *cloud_event_parseFromJSON(cJSON *cloud_eventJSON){

    cloud_event_t *cloud_event_local_var = NULL;

    // cloud_event->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(cloud_eventJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // cloud_event->source
    cJSON *source = cJSON_GetObjectItemCaseSensitive(cloud_eventJSON, "source");
    if (!source) {
        goto end;
    }

    
    if(!cJSON_IsString(source))
    {
    goto end; //String
    }

    // cloud_event->specversion
    cJSON *specversion = cJSON_GetObjectItemCaseSensitive(cloud_eventJSON, "specversion");
    if (!specversion) {
        goto end;
    }

    
    if(!cJSON_IsString(specversion))
    {
    goto end; //String
    }

    // cloud_event->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(cloud_eventJSON, "type");
    if (!type) {
        goto end;
    }

    
    if(!cJSON_IsString(type))
    {
    goto end; //String
    }

    // cloud_event->datacontenttype
    cJSON *datacontenttype = cJSON_GetObjectItemCaseSensitive(cloud_eventJSON, "datacontenttype");
    if (datacontenttype) { 
    if(!cJSON_IsString(datacontenttype) && !cJSON_IsNull(datacontenttype))
    {
    goto end; //String
    }
    }

    // cloud_event->dataschema
    cJSON *dataschema = cJSON_GetObjectItemCaseSensitive(cloud_eventJSON, "dataschema");
    if (dataschema) { 
    if(!cJSON_IsString(dataschema) && !cJSON_IsNull(dataschema))
    {
    goto end; //String
    }
    }

    // cloud_event->subject
    cJSON *subject = cJSON_GetObjectItemCaseSensitive(cloud_eventJSON, "subject");
    if (subject) { 
    if(!cJSON_IsString(subject) && !cJSON_IsNull(subject))
    {
    goto end; //String
    }
    }

    // cloud_event->time
    cJSON *time = cJSON_GetObjectItemCaseSensitive(cloud_eventJSON, "time");
    if (time) { 
    if(!cJSON_IsString(time) && !cJSON_IsNull(time))
    {
    goto end; //DateTime
    }
    }

    // cloud_event->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(cloud_eventJSON, "data");
    object_t *data_local_object = NULL;
    if (data) { 
    data_local_object = object_parseFromJSON(data); //object
    }

    // cloud_event->data_base64
    cJSON *data_base64 = cJSON_GetObjectItemCaseSensitive(cloud_eventJSON, "data_base64");
    if (data_base64) { 
    if(!cJSON_IsString(data_base64) && !cJSON_IsNull(data_base64))
    {
    goto end; //String
    }
    }


    cloud_event_local_var = cloud_event_create (
        strdup(id->valuestring),
        strdup(source->valuestring),
        strdup(specversion->valuestring),
        strdup(type->valuestring),
        datacontenttype && !cJSON_IsNull(datacontenttype) ? strdup(datacontenttype->valuestring) : NULL,
        dataschema && !cJSON_IsNull(dataschema) ? strdup(dataschema->valuestring) : NULL,
        subject && !cJSON_IsNull(subject) ? strdup(subject->valuestring) : NULL,
        time && !cJSON_IsNull(time) ? strdup(time->valuestring) : NULL,
        data ? data_local_object : NULL,
        data_base64 && !cJSON_IsNull(data_base64) ? strdup(data_base64->valuestring) : NULL
        );

    return cloud_event_local_var;
end:
    return NULL;

}
