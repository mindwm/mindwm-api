#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "io_document.h"



io_document_t *io_document_create(
    char *input,
    char *output,
    char *ps1
    ) {
    io_document_t *io_document_local_var = malloc(sizeof(io_document_t));
    if (!io_document_local_var) {
        return NULL;
    }
    io_document_local_var->input = input;
    io_document_local_var->output = output;
    io_document_local_var->ps1 = ps1;

    return io_document_local_var;
}


void io_document_free(io_document_t *io_document) {
    if(NULL == io_document){
        return ;
    }
    listEntry_t *listEntry;
    if (io_document->input) {
        free(io_document->input);
        io_document->input = NULL;
    }
    if (io_document->output) {
        free(io_document->output);
        io_document->output = NULL;
    }
    if (io_document->ps1) {
        free(io_document->ps1);
        io_document->ps1 = NULL;
    }
    free(io_document);
}

cJSON *io_document_convertToJSON(io_document_t *io_document) {
    cJSON *item = cJSON_CreateObject();

    // io_document->input
    if (!io_document->input) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "input", io_document->input) == NULL) {
    goto fail; //String
    }


    // io_document->output
    if (!io_document->output) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "output", io_document->output) == NULL) {
    goto fail; //String
    }


    // io_document->ps1
    if (!io_document->ps1) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ps1", io_document->ps1) == NULL) {
    goto fail; //String
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

    // io_document->input
    cJSON *input = cJSON_GetObjectItemCaseSensitive(io_documentJSON, "input");
    if (!input) {
        goto end;
    }

    
    if(!cJSON_IsString(input))
    {
    goto end; //String
    }

    // io_document->output
    cJSON *output = cJSON_GetObjectItemCaseSensitive(io_documentJSON, "output");
    if (!output) {
        goto end;
    }

    
    if(!cJSON_IsString(output))
    {
    goto end; //String
    }

    // io_document->ps1
    cJSON *ps1 = cJSON_GetObjectItemCaseSensitive(io_documentJSON, "ps1");
    if (!ps1) {
        goto end;
    }

    
    if(!cJSON_IsString(ps1))
    {
    goto end; //String
    }


    io_document_local_var = io_document_create (
        strdup(input->valuestring),
        strdup(output->valuestring),
        strdup(ps1->valuestring)
        );

    return io_document_local_var;
end:
    return NULL;

}
