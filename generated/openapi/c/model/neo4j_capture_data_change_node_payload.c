#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "neo4j_capture_data_change_node_payload.h"



neo4j_capture_data_change_node_payload_t *neo4j_capture_data_change_node_payload_create(
    neo4j_capture_data_change_node_payload_after_t *after,
    char *before,
    char *id,
    char *type
    ) {
    neo4j_capture_data_change_node_payload_t *neo4j_capture_data_change_node_payload_local_var = malloc(sizeof(neo4j_capture_data_change_node_payload_t));
    if (!neo4j_capture_data_change_node_payload_local_var) {
        return NULL;
    }
    neo4j_capture_data_change_node_payload_local_var->after = after;
    neo4j_capture_data_change_node_payload_local_var->before = before;
    neo4j_capture_data_change_node_payload_local_var->id = id;
    neo4j_capture_data_change_node_payload_local_var->type = type;

    return neo4j_capture_data_change_node_payload_local_var;
}


void neo4j_capture_data_change_node_payload_free(neo4j_capture_data_change_node_payload_t *neo4j_capture_data_change_node_payload) {
    if(NULL == neo4j_capture_data_change_node_payload){
        return ;
    }
    listEntry_t *listEntry;
    if (neo4j_capture_data_change_node_payload->after) {
        neo4j_capture_data_change_node_payload_after_free(neo4j_capture_data_change_node_payload->after);
        neo4j_capture_data_change_node_payload->after = NULL;
    }
    if (neo4j_capture_data_change_node_payload->before) {
        free(neo4j_capture_data_change_node_payload->before);
        neo4j_capture_data_change_node_payload->before = NULL;
    }
    if (neo4j_capture_data_change_node_payload->id) {
        free(neo4j_capture_data_change_node_payload->id);
        neo4j_capture_data_change_node_payload->id = NULL;
    }
    if (neo4j_capture_data_change_node_payload->type) {
        free(neo4j_capture_data_change_node_payload->type);
        neo4j_capture_data_change_node_payload->type = NULL;
    }
    free(neo4j_capture_data_change_node_payload);
}

cJSON *neo4j_capture_data_change_node_payload_convertToJSON(neo4j_capture_data_change_node_payload_t *neo4j_capture_data_change_node_payload) {
    cJSON *item = cJSON_CreateObject();

    // neo4j_capture_data_change_node_payload->after
    if (!neo4j_capture_data_change_node_payload->after) {
        goto fail;
    }
    cJSON *after_local_JSON = neo4j_capture_data_change_node_payload_after_convertToJSON(neo4j_capture_data_change_node_payload->after);
    if(after_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "after", after_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // neo4j_capture_data_change_node_payload->before
    if (!neo4j_capture_data_change_node_payload->before) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "before", neo4j_capture_data_change_node_payload->before) == NULL) {
    goto fail; //String
    }


    // neo4j_capture_data_change_node_payload->id
    if (!neo4j_capture_data_change_node_payload->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", neo4j_capture_data_change_node_payload->id) == NULL) {
    goto fail; //String
    }


    // neo4j_capture_data_change_node_payload->type
    if (!neo4j_capture_data_change_node_payload->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", neo4j_capture_data_change_node_payload->type) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

neo4j_capture_data_change_node_payload_t *neo4j_capture_data_change_node_payload_parseFromJSON(cJSON *neo4j_capture_data_change_node_payloadJSON){

    neo4j_capture_data_change_node_payload_t *neo4j_capture_data_change_node_payload_local_var = NULL;

    // define the local variable for neo4j_capture_data_change_node_payload->after
    neo4j_capture_data_change_node_payload_after_t *after_local_nonprim = NULL;

    // neo4j_capture_data_change_node_payload->after
    cJSON *after = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_change_node_payloadJSON, "after");
    if (!after) {
        goto end;
    }

    
    after_local_nonprim = neo4j_capture_data_change_node_payload_after_parseFromJSON(after); //nonprimitive

    // neo4j_capture_data_change_node_payload->before
    cJSON *before = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_change_node_payloadJSON, "before");
    if (!before) {
        goto end;
    }

    
    if(!cJSON_IsString(before))
    {
    goto end; //String
    }

    // neo4j_capture_data_change_node_payload->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_change_node_payloadJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // neo4j_capture_data_change_node_payload->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_change_node_payloadJSON, "type");
    if (!type) {
        goto end;
    }

    
    if(!cJSON_IsString(type))
    {
    goto end; //String
    }


    neo4j_capture_data_change_node_payload_local_var = neo4j_capture_data_change_node_payload_create (
        after_local_nonprim,
        strdup(before->valuestring),
        strdup(id->valuestring),
        strdup(type->valuestring)
        );

    return neo4j_capture_data_change_node_payload_local_var;
end:
    if (after_local_nonprim) {
        neo4j_capture_data_change_node_payload_after_free(after_local_nonprim);
        after_local_nonprim = NULL;
    }
    return NULL;

}
