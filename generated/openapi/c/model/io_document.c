#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "io_document.h"



io_document_t *io_document_create(
    char *type,
    char *source,
    tmux_pane_io_document_t *data,
    char *id,
    char *specversion,
    char *datacontenttype,
    char *dataschema,
    char *subject,
    char *time,
    char *data_base64
    ) {
    io_document_t *io_document_local_var = malloc(sizeof(io_document_t));
    if (!io_document_local_var) {
        return NULL;
    }
    io_document_local_var->type = type;
    io_document_local_var->source = source;
    io_document_local_var->data = data;
    io_document_local_var->id = id;
    io_document_local_var->specversion = specversion;
    io_document_local_var->datacontenttype = datacontenttype;
    io_document_local_var->dataschema = dataschema;
    io_document_local_var->subject = subject;
    io_document_local_var->time = time;
    io_document_local_var->data_base64 = data_base64;

    return io_document_local_var;
}


void io_document_free(io_document_t *io_document) {
    if(NULL == io_document){
        return ;
    }
    listEntry_t *listEntry;
    if (io_document->type) {
        free(io_document->type);
        io_document->type = NULL;
    }
    if (io_document->source) {
        free(io_document->source);
        io_document->source = NULL;
    }
    if (io_document->data) {
        tmux_pane_io_document_free(io_document->data);
        io_document->data = NULL;
    }
    if (io_document->id) {
        free(io_document->id);
        io_document->id = NULL;
    }
    if (io_document->specversion) {
        free(io_document->specversion);
        io_document->specversion = NULL;
    }
    if (io_document->datacontenttype) {
        free(io_document->datacontenttype);
        io_document->datacontenttype = NULL;
    }
    if (io_document->dataschema) {
        free(io_document->dataschema);
        io_document->dataschema = NULL;
    }
    if (io_document->subject) {
        free(io_document->subject);
        io_document->subject = NULL;
    }
    if (io_document->time) {
        free(io_document->time);
        io_document->time = NULL;
    }
    if (io_document->data_base64) {
        free(io_document->data_base64);
        io_document->data_base64 = NULL;
    }
    free(io_document);
}

cJSON *io_document_convertToJSON(io_document_t *io_document) {
    cJSON *item = cJSON_CreateObject();

    // io_document->type
    if(io_document->type) {
    if(cJSON_AddStringToObject(item, "type", io_document->type) == NULL) {
    goto fail; //String
    }
    }


    // io_document->source
    if(io_document->source) {
    if(cJSON_AddStringToObject(item, "source", io_document->source) == NULL) {
    goto fail; //String
    }
    }


    // io_document->data
    if(io_document->data) {
    cJSON *data_local_JSON = tmux_pane_io_document_convertToJSON(io_document->data);
    if(data_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // io_document->id
    if (!io_document->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", io_document->id) == NULL) {
    goto fail; //String
    }


    // io_document->specversion
    if (!io_document->specversion) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "specversion", io_document->specversion) == NULL) {
    goto fail; //String
    }


    // io_document->datacontenttype
    if(io_document->datacontenttype) {
    if(cJSON_AddStringToObject(item, "datacontenttype", io_document->datacontenttype) == NULL) {
    goto fail; //String
    }
    }


    // io_document->dataschema
    if(io_document->dataschema) {
    if(cJSON_AddStringToObject(item, "dataschema", io_document->dataschema) == NULL) {
    goto fail; //String
    }
    }


    // io_document->subject
    if(io_document->subject) {
    if(cJSON_AddStringToObject(item, "subject", io_document->subject) == NULL) {
    goto fail; //String
    }
    }


    // io_document->time
    if(io_document->time) {
    if(cJSON_AddStringToObject(item, "time", io_document->time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // io_document->data_base64
    if(io_document->data_base64) {
    if(cJSON_AddStringToObject(item, "data_base64", io_document->data_base64) == NULL) {
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

io_document_t *io_document_parseFromJSON(cJSON *io_documentJSON){

    io_document_t *io_document_local_var = NULL;

    // define the local variable for io_document->data
    tmux_pane_io_document_t *data_local_nonprim = NULL;

    // io_document->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(io_documentJSON, "type");
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }

    // io_document->source
    cJSON *source = cJSON_GetObjectItemCaseSensitive(io_documentJSON, "source");
    if (source) { 
    if(!cJSON_IsString(source) && !cJSON_IsNull(source))
    {
    goto end; //String
    }
    }

    // io_document->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(io_documentJSON, "data");
    if (data) { 
    data_local_nonprim = tmux_pane_io_document_parseFromJSON(data); //custom
    }

    // io_document->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(io_documentJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // io_document->specversion
    cJSON *specversion = cJSON_GetObjectItemCaseSensitive(io_documentJSON, "specversion");
    if (!specversion) {
        goto end;
    }

    
    if(!cJSON_IsString(specversion))
    {
    goto end; //String
    }

    // io_document->datacontenttype
    cJSON *datacontenttype = cJSON_GetObjectItemCaseSensitive(io_documentJSON, "datacontenttype");
    if (datacontenttype) { 
    if(!cJSON_IsString(datacontenttype) && !cJSON_IsNull(datacontenttype))
    {
    goto end; //String
    }
    }

    // io_document->dataschema
    cJSON *dataschema = cJSON_GetObjectItemCaseSensitive(io_documentJSON, "dataschema");
    if (dataschema) { 
    if(!cJSON_IsString(dataschema) && !cJSON_IsNull(dataschema))
    {
    goto end; //String
    }
    }

    // io_document->subject
    cJSON *subject = cJSON_GetObjectItemCaseSensitive(io_documentJSON, "subject");
    if (subject) { 
    if(!cJSON_IsString(subject) && !cJSON_IsNull(subject))
    {
    goto end; //String
    }
    }

    // io_document->time
    cJSON *time = cJSON_GetObjectItemCaseSensitive(io_documentJSON, "time");
    if (time) { 
    if(!cJSON_IsString(time) && !cJSON_IsNull(time))
    {
    goto end; //DateTime
    }
    }

    // io_document->data_base64
    cJSON *data_base64 = cJSON_GetObjectItemCaseSensitive(io_documentJSON, "data_base64");
    if (data_base64) { 
    if(!cJSON_IsString(data_base64) && !cJSON_IsNull(data_base64))
    {
    goto end; //String
    }
    }


    io_document_local_var = io_document_create (
        type && !cJSON_IsNull(type) ? strdup(type->valuestring) : NULL,
        source && !cJSON_IsNull(source) ? strdup(source->valuestring) : NULL,
        data ? data_local_nonprim : NULL,
        strdup(id->valuestring),
        strdup(specversion->valuestring),
        datacontenttype && !cJSON_IsNull(datacontenttype) ? strdup(datacontenttype->valuestring) : NULL,
        dataschema && !cJSON_IsNull(dataschema) ? strdup(dataschema->valuestring) : NULL,
        subject && !cJSON_IsNull(subject) ? strdup(subject->valuestring) : NULL,
        time && !cJSON_IsNull(time) ? strdup(time->valuestring) : NULL,
        data_base64 && !cJSON_IsNull(data_base64) ? strdup(data_base64->valuestring) : NULL
        );

    return io_document_local_var;
end:
    if (data_local_nonprim) {
        tmux_pane_io_document_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
