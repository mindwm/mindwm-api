#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "tmux_pane_io_document.h"



tmux_pane_io_document_t *tmux_pane_io_document_create(
    char *input,
    char *output,
    char *ps1
    ) {
    tmux_pane_io_document_t *tmux_pane_io_document_local_var = malloc(sizeof(tmux_pane_io_document_t));
    if (!tmux_pane_io_document_local_var) {
        return NULL;
    }
    tmux_pane_io_document_local_var->input = input;
    tmux_pane_io_document_local_var->output = output;
    tmux_pane_io_document_local_var->ps1 = ps1;

    return tmux_pane_io_document_local_var;
}


void tmux_pane_io_document_free(tmux_pane_io_document_t *tmux_pane_io_document) {
    if(NULL == tmux_pane_io_document){
        return ;
    }
    listEntry_t *listEntry;
    if (tmux_pane_io_document->input) {
        free(tmux_pane_io_document->input);
        tmux_pane_io_document->input = NULL;
    }
    if (tmux_pane_io_document->output) {
        free(tmux_pane_io_document->output);
        tmux_pane_io_document->output = NULL;
    }
    if (tmux_pane_io_document->ps1) {
        free(tmux_pane_io_document->ps1);
        tmux_pane_io_document->ps1 = NULL;
    }
    free(tmux_pane_io_document);
}

cJSON *tmux_pane_io_document_convertToJSON(tmux_pane_io_document_t *tmux_pane_io_document) {
    cJSON *item = cJSON_CreateObject();

    // tmux_pane_io_document->input
    if (!tmux_pane_io_document->input) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "input", tmux_pane_io_document->input) == NULL) {
    goto fail; //String
    }


    // tmux_pane_io_document->output
    if (!tmux_pane_io_document->output) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "output", tmux_pane_io_document->output) == NULL) {
    goto fail; //String
    }


    // tmux_pane_io_document->ps1
    if (!tmux_pane_io_document->ps1) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ps1", tmux_pane_io_document->ps1) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

tmux_pane_io_document_t *tmux_pane_io_document_parseFromJSON(cJSON *tmux_pane_io_documentJSON){

    tmux_pane_io_document_t *tmux_pane_io_document_local_var = NULL;

    // tmux_pane_io_document->input
    cJSON *input = cJSON_GetObjectItemCaseSensitive(tmux_pane_io_documentJSON, "input");
    if (!input) {
        goto end;
    }

    
    if(!cJSON_IsString(input))
    {
    goto end; //String
    }

    // tmux_pane_io_document->output
    cJSON *output = cJSON_GetObjectItemCaseSensitive(tmux_pane_io_documentJSON, "output");
    if (!output) {
        goto end;
    }

    
    if(!cJSON_IsString(output))
    {
    goto end; //String
    }

    // tmux_pane_io_document->ps1
    cJSON *ps1 = cJSON_GetObjectItemCaseSensitive(tmux_pane_io_documentJSON, "ps1");
    if (!ps1) {
        goto end;
    }

    
    if(!cJSON_IsString(ps1))
    {
    goto end; //String
    }


    tmux_pane_io_document_local_var = tmux_pane_io_document_create (
        strdup(input->valuestring),
        strdup(output->valuestring),
        strdup(ps1->valuestring)
        );

    return tmux_pane_io_document_local_var;
end:
    return NULL;

}
