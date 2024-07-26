#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "io_document_event.h"



io_document_event_t *io_document_event_create(
    char *id,
    char *source,
    char *specversion,
    char *type,
    char *datacontenttype,
    char *dataschema,
    char *subject,
    char *time,
    io_document_t *data,
    char *data_base64,
    char *knativebrokerttl
    ) {
    io_document_event_t *io_document_event_local_var = malloc(sizeof(io_document_event_t));
    if (!io_document_event_local_var) {
        return NULL;
    }
    io_document_event_local_var->id = id;
    io_document_event_local_var->source = source;
    io_document_event_local_var->specversion = specversion;
    io_document_event_local_var->type = type;
    io_document_event_local_var->datacontenttype = datacontenttype;
    io_document_event_local_var->dataschema = dataschema;
    io_document_event_local_var->subject = subject;
    io_document_event_local_var->time = time;
    io_document_event_local_var->data = data;
    io_document_event_local_var->data_base64 = data_base64;
    io_document_event_local_var->knativebrokerttl = knativebrokerttl;

    return io_document_event_local_var;
}


void io_document_event_free(io_document_event_t *io_document_event) {
    if(NULL == io_document_event){
        return ;
    }
    listEntry_t *listEntry;
    if (io_document_event->id) {
        free(io_document_event->id);
        io_document_event->id = NULL;
    }
    if (io_document_event->source) {
        free(io_document_event->source);
        io_document_event->source = NULL;
    }
    if (io_document_event->specversion) {
        free(io_document_event->specversion);
        io_document_event->specversion = NULL;
    }
    if (io_document_event->type) {
        free(io_document_event->type);
        io_document_event->type = NULL;
    }
    if (io_document_event->datacontenttype) {
        free(io_document_event->datacontenttype);
        io_document_event->datacontenttype = NULL;
    }
    if (io_document_event->dataschema) {
        free(io_document_event->dataschema);
        io_document_event->dataschema = NULL;
    }
    if (io_document_event->subject) {
        free(io_document_event->subject);
        io_document_event->subject = NULL;
    }
    if (io_document_event->time) {
        free(io_document_event->time);
        io_document_event->time = NULL;
    }
    if (io_document_event->data) {
        io_document_free(io_document_event->data);
        io_document_event->data = NULL;
    }
    if (io_document_event->data_base64) {
        free(io_document_event->data_base64);
        io_document_event->data_base64 = NULL;
    }
    if (io_document_event->knativebrokerttl) {
        free(io_document_event->knativebrokerttl);
        io_document_event->knativebrokerttl = NULL;
    }
    free(io_document_event);
}

cJSON *io_document_event_convertToJSON(io_document_event_t *io_document_event) {
    cJSON *item = cJSON_CreateObject();

    // io_document_event->id
    if (!io_document_event->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", io_document_event->id) == NULL) {
    goto fail; //String
    }


    // io_document_event->source
    if (!io_document_event->source) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "source", io_document_event->source) == NULL) {
    goto fail; //String
    }


    // io_document_event->specversion
    if (!io_document_event->specversion) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "specversion", io_document_event->specversion) == NULL) {
    goto fail; //String
    }


    // io_document_event->type
    if (!io_document_event->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", io_document_event->type) == NULL) {
    goto fail; //String
    }


    // io_document_event->datacontenttype
    if(io_document_event->datacontenttype) {
    if(cJSON_AddStringToObject(item, "datacontenttype", io_document_event->datacontenttype) == NULL) {
    goto fail; //String
    }
    }


    // io_document_event->dataschema
    if(io_document_event->dataschema) {
    if(cJSON_AddStringToObject(item, "dataschema", io_document_event->dataschema) == NULL) {
    goto fail; //String
    }
    }


    // io_document_event->subject
    if(io_document_event->subject) {
    if(cJSON_AddStringToObject(item, "subject", io_document_event->subject) == NULL) {
    goto fail; //String
    }
    }


    // io_document_event->time
    if(io_document_event->time) {
    if(cJSON_AddStringToObject(item, "time", io_document_event->time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // io_document_event->data
    if(io_document_event->data) {
    cJSON *data_local_JSON = io_document_convertToJSON(io_document_event->data);
    if(data_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // io_document_event->data_base64
    if(io_document_event->data_base64) {
    if(cJSON_AddStringToObject(item, "data_base64", io_document_event->data_base64) == NULL) {
    goto fail; //String
    }
    }


    // io_document_event->knativebrokerttl
    if(io_document_event->knativebrokerttl) {
    if(cJSON_AddStringToObject(item, "knativebrokerttl", io_document_event->knativebrokerttl) == NULL) {
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

io_document_event_t *io_document_event_parseFromJSON(cJSON *io_document_eventJSON){

    io_document_event_t *io_document_event_local_var = NULL;

    // define the local variable for io_document_event->data
    io_document_t *data_local_nonprim = NULL;

    // io_document_event->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(io_document_eventJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // io_document_event->source
    cJSON *source = cJSON_GetObjectItemCaseSensitive(io_document_eventJSON, "source");
    if (!source) {
        goto end;
    }

    
    if(!cJSON_IsString(source))
    {
    goto end; //String
    }

    // io_document_event->specversion
    cJSON *specversion = cJSON_GetObjectItemCaseSensitive(io_document_eventJSON, "specversion");
    if (!specversion) {
        goto end;
    }

    
    if(!cJSON_IsString(specversion))
    {
    goto end; //String
    }

    // io_document_event->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(io_document_eventJSON, "type");
    if (!type) {
        goto end;
    }

    
    if(!cJSON_IsString(type))
    {
    goto end; //String
    }

    // io_document_event->datacontenttype
    cJSON *datacontenttype = cJSON_GetObjectItemCaseSensitive(io_document_eventJSON, "datacontenttype");
    if (datacontenttype) { 
    if(!cJSON_IsString(datacontenttype) && !cJSON_IsNull(datacontenttype))
    {
    goto end; //String
    }
    }

    // io_document_event->dataschema
    cJSON *dataschema = cJSON_GetObjectItemCaseSensitive(io_document_eventJSON, "dataschema");
    if (dataschema) { 
    if(!cJSON_IsString(dataschema) && !cJSON_IsNull(dataschema))
    {
    goto end; //String
    }
    }

    // io_document_event->subject
    cJSON *subject = cJSON_GetObjectItemCaseSensitive(io_document_eventJSON, "subject");
    if (subject) { 
    if(!cJSON_IsString(subject) && !cJSON_IsNull(subject))
    {
    goto end; //String
    }
    }

    // io_document_event->time
    cJSON *time = cJSON_GetObjectItemCaseSensitive(io_document_eventJSON, "time");
    if (time) { 
    if(!cJSON_IsString(time) && !cJSON_IsNull(time))
    {
    goto end; //DateTime
    }
    }

    // io_document_event->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(io_document_eventJSON, "data");
    if (data) { 
    data_local_nonprim = io_document_parseFromJSON(data); //custom
    }

    // io_document_event->data_base64
    cJSON *data_base64 = cJSON_GetObjectItemCaseSensitive(io_document_eventJSON, "data_base64");
    if (data_base64) { 
    if(!cJSON_IsString(data_base64) && !cJSON_IsNull(data_base64))
    {
    goto end; //String
    }
    }

    // io_document_event->knativebrokerttl
    cJSON *knativebrokerttl = cJSON_GetObjectItemCaseSensitive(io_document_eventJSON, "knativebrokerttl");
    if (knativebrokerttl) { 
    if(!cJSON_IsString(knativebrokerttl) && !cJSON_IsNull(knativebrokerttl))
    {
    goto end; //String
    }
    }


    io_document_event_local_var = io_document_event_create (
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

    return io_document_event_local_var;
end:
    if (data_local_nonprim) {
        io_document_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
