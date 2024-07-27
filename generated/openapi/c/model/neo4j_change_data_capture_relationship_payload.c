#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "neo4j_change_data_capture_relationship_payload.h"



neo4j_change_data_capture_relationship_payload_t *neo4j_change_data_capture_relationship_payload_create(
    object_t *after,
    char *before,
    neo4j_change_data_capture_relationship_payload_end_t *end,
    char *id,
    char *label,
    neo4j_change_data_capture_relationship_payload_end_t *start,
    char *type
    ) {
    neo4j_change_data_capture_relationship_payload_t *neo4j_change_data_capture_relationship_payload_local_var = malloc(sizeof(neo4j_change_data_capture_relationship_payload_t));
    if (!neo4j_change_data_capture_relationship_payload_local_var) {
        return NULL;
    }
    neo4j_change_data_capture_relationship_payload_local_var->after = after;
    neo4j_change_data_capture_relationship_payload_local_var->before = before;
    neo4j_change_data_capture_relationship_payload_local_var->end = end;
    neo4j_change_data_capture_relationship_payload_local_var->id = id;
    neo4j_change_data_capture_relationship_payload_local_var->label = label;
    neo4j_change_data_capture_relationship_payload_local_var->start = start;
    neo4j_change_data_capture_relationship_payload_local_var->type = type;

    return neo4j_change_data_capture_relationship_payload_local_var;
}


void neo4j_change_data_capture_relationship_payload_free(neo4j_change_data_capture_relationship_payload_t *neo4j_change_data_capture_relationship_payload) {
    if(NULL == neo4j_change_data_capture_relationship_payload){
        return ;
    }
    listEntry_t *listEntry;
    if (neo4j_change_data_capture_relationship_payload->after) {
        object_free(neo4j_change_data_capture_relationship_payload->after);
        neo4j_change_data_capture_relationship_payload->after = NULL;
    }
    if (neo4j_change_data_capture_relationship_payload->before) {
        free(neo4j_change_data_capture_relationship_payload->before);
        neo4j_change_data_capture_relationship_payload->before = NULL;
    }
    if (neo4j_change_data_capture_relationship_payload->end) {
        neo4j_change_data_capture_relationship_payload_end_free(neo4j_change_data_capture_relationship_payload->end);
        neo4j_change_data_capture_relationship_payload->end = NULL;
    }
    if (neo4j_change_data_capture_relationship_payload->id) {
        free(neo4j_change_data_capture_relationship_payload->id);
        neo4j_change_data_capture_relationship_payload->id = NULL;
    }
    if (neo4j_change_data_capture_relationship_payload->label) {
        free(neo4j_change_data_capture_relationship_payload->label);
        neo4j_change_data_capture_relationship_payload->label = NULL;
    }
    if (neo4j_change_data_capture_relationship_payload->start) {
        neo4j_change_data_capture_relationship_payload_end_free(neo4j_change_data_capture_relationship_payload->start);
        neo4j_change_data_capture_relationship_payload->start = NULL;
    }
    if (neo4j_change_data_capture_relationship_payload->type) {
        free(neo4j_change_data_capture_relationship_payload->type);
        neo4j_change_data_capture_relationship_payload->type = NULL;
    }
    free(neo4j_change_data_capture_relationship_payload);
}

cJSON *neo4j_change_data_capture_relationship_payload_convertToJSON(neo4j_change_data_capture_relationship_payload_t *neo4j_change_data_capture_relationship_payload) {
    cJSON *item = cJSON_CreateObject();

    // neo4j_change_data_capture_relationship_payload->after
    if (!neo4j_change_data_capture_relationship_payload->after) {
        goto fail;
    }
    cJSON *after_object = object_convertToJSON(neo4j_change_data_capture_relationship_payload->after);
    if(after_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "after", after_object);
    if(item->child == NULL) {
    goto fail;
    }


    // neo4j_change_data_capture_relationship_payload->before
    if (!neo4j_change_data_capture_relationship_payload->before) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "before", neo4j_change_data_capture_relationship_payload->before) == NULL) {
    goto fail; //String
    }


    // neo4j_change_data_capture_relationship_payload->end
    if (!neo4j_change_data_capture_relationship_payload->end) {
        goto fail;
    }
    cJSON *end_local_JSON = neo4j_change_data_capture_relationship_payload_end_convertToJSON(neo4j_change_data_capture_relationship_payload->end);
    if(end_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "end", end_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // neo4j_change_data_capture_relationship_payload->id
    if (!neo4j_change_data_capture_relationship_payload->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", neo4j_change_data_capture_relationship_payload->id) == NULL) {
    goto fail; //String
    }


    // neo4j_change_data_capture_relationship_payload->label
    if (!neo4j_change_data_capture_relationship_payload->label) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "label", neo4j_change_data_capture_relationship_payload->label) == NULL) {
    goto fail; //String
    }


    // neo4j_change_data_capture_relationship_payload->start
    if (!neo4j_change_data_capture_relationship_payload->start) {
        goto fail;
    }
    cJSON *start_local_JSON = neo4j_change_data_capture_relationship_payload_end_convertToJSON(neo4j_change_data_capture_relationship_payload->start);
    if(start_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "start", start_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // neo4j_change_data_capture_relationship_payload->type
    if (!neo4j_change_data_capture_relationship_payload->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", neo4j_change_data_capture_relationship_payload->type) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

neo4j_change_data_capture_relationship_payload_t *neo4j_change_data_capture_relationship_payload_parseFromJSON(cJSON *neo4j_change_data_capture_relationship_payloadJSON){

    neo4j_change_data_capture_relationship_payload_t *neo4j_change_data_capture_relationship_payload_local_var = NULL;

    // define the local variable for neo4j_change_data_capture_relationship_payload->end
    neo4j_change_data_capture_relationship_payload_end_t *end_local_nonprim = NULL;

    // define the local variable for neo4j_change_data_capture_relationship_payload->start
    neo4j_change_data_capture_relationship_payload_end_t *start_local_nonprim = NULL;

    // neo4j_change_data_capture_relationship_payload->after
    cJSON *after = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_capture_relationship_payloadJSON, "after");
    if (!after) {
        goto end;
    }

    object_t *after_local_object = NULL;
    
    after_local_object = object_parseFromJSON(after); //object

    // neo4j_change_data_capture_relationship_payload->before
    cJSON *before = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_capture_relationship_payloadJSON, "before");
    if (!before) {
        goto end;
    }

    
    if(!cJSON_IsString(before))
    {
    goto end; //String
    }

    // neo4j_change_data_capture_relationship_payload->end
    cJSON *end = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_capture_relationship_payloadJSON, "end");
    if (!end) {
        goto end;
    }

    
    end_local_nonprim = neo4j_change_data_capture_relationship_payload_end_parseFromJSON(end); //nonprimitive

    // neo4j_change_data_capture_relationship_payload->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_capture_relationship_payloadJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // neo4j_change_data_capture_relationship_payload->label
    cJSON *label = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_capture_relationship_payloadJSON, "label");
    if (!label) {
        goto end;
    }

    
    if(!cJSON_IsString(label))
    {
    goto end; //String
    }

    // neo4j_change_data_capture_relationship_payload->start
    cJSON *start = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_capture_relationship_payloadJSON, "start");
    if (!start) {
        goto end;
    }

    
    start_local_nonprim = neo4j_change_data_capture_relationship_payload_end_parseFromJSON(start); //nonprimitive

    // neo4j_change_data_capture_relationship_payload->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_capture_relationship_payloadJSON, "type");
    if (!type) {
        goto end;
    }

    
    if(!cJSON_IsString(type))
    {
    goto end; //String
    }


    neo4j_change_data_capture_relationship_payload_local_var = neo4j_change_data_capture_relationship_payload_create (
        after_local_object,
        strdup(before->valuestring),
        end_local_nonprim,
        strdup(id->valuestring),
        strdup(label->valuestring),
        start_local_nonprim,
        strdup(type->valuestring)
        );

    return neo4j_change_data_capture_relationship_payload_local_var;
end:
    if (end_local_nonprim) {
        neo4j_change_data_capture_relationship_payload_end_free(end_local_nonprim);
        end_local_nonprim = NULL;
    }
    if (start_local_nonprim) {
        neo4j_change_data_capture_relationship_payload_end_free(start_local_nonprim);
        start_local_nonprim = NULL;
    }
    return NULL;

}
