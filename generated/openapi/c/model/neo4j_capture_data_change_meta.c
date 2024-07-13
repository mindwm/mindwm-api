#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "neo4j_capture_data_change_meta.h"



neo4j_capture_data_change_meta_t *neo4j_capture_data_change_meta_create(
    char *operation,
    neo4j_capture_data_change_meta_source_t *source,
    int timestamp,
    int tx_event_id,
    int tx_events_count,
    int tx_id,
    char *username
    ) {
    neo4j_capture_data_change_meta_t *neo4j_capture_data_change_meta_local_var = malloc(sizeof(neo4j_capture_data_change_meta_t));
    if (!neo4j_capture_data_change_meta_local_var) {
        return NULL;
    }
    neo4j_capture_data_change_meta_local_var->operation = operation;
    neo4j_capture_data_change_meta_local_var->source = source;
    neo4j_capture_data_change_meta_local_var->timestamp = timestamp;
    neo4j_capture_data_change_meta_local_var->tx_event_id = tx_event_id;
    neo4j_capture_data_change_meta_local_var->tx_events_count = tx_events_count;
    neo4j_capture_data_change_meta_local_var->tx_id = tx_id;
    neo4j_capture_data_change_meta_local_var->username = username;

    return neo4j_capture_data_change_meta_local_var;
}


void neo4j_capture_data_change_meta_free(neo4j_capture_data_change_meta_t *neo4j_capture_data_change_meta) {
    if(NULL == neo4j_capture_data_change_meta){
        return ;
    }
    listEntry_t *listEntry;
    if (neo4j_capture_data_change_meta->operation) {
        free(neo4j_capture_data_change_meta->operation);
        neo4j_capture_data_change_meta->operation = NULL;
    }
    if (neo4j_capture_data_change_meta->source) {
        neo4j_capture_data_change_meta_source_free(neo4j_capture_data_change_meta->source);
        neo4j_capture_data_change_meta->source = NULL;
    }
    if (neo4j_capture_data_change_meta->username) {
        free(neo4j_capture_data_change_meta->username);
        neo4j_capture_data_change_meta->username = NULL;
    }
    free(neo4j_capture_data_change_meta);
}

cJSON *neo4j_capture_data_change_meta_convertToJSON(neo4j_capture_data_change_meta_t *neo4j_capture_data_change_meta) {
    cJSON *item = cJSON_CreateObject();

    // neo4j_capture_data_change_meta->operation
    if (!neo4j_capture_data_change_meta->operation) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "operation", neo4j_capture_data_change_meta->operation) == NULL) {
    goto fail; //String
    }


    // neo4j_capture_data_change_meta->source
    if (!neo4j_capture_data_change_meta->source) {
        goto fail;
    }
    cJSON *source_local_JSON = neo4j_capture_data_change_meta_source_convertToJSON(neo4j_capture_data_change_meta->source);
    if(source_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "source", source_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // neo4j_capture_data_change_meta->timestamp
    if (!neo4j_capture_data_change_meta->timestamp) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "timestamp", neo4j_capture_data_change_meta->timestamp) == NULL) {
    goto fail; //Numeric
    }


    // neo4j_capture_data_change_meta->tx_event_id
    if (!neo4j_capture_data_change_meta->tx_event_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "txEventId", neo4j_capture_data_change_meta->tx_event_id) == NULL) {
    goto fail; //Numeric
    }


    // neo4j_capture_data_change_meta->tx_events_count
    if (!neo4j_capture_data_change_meta->tx_events_count) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "txEventsCount", neo4j_capture_data_change_meta->tx_events_count) == NULL) {
    goto fail; //Numeric
    }


    // neo4j_capture_data_change_meta->tx_id
    if (!neo4j_capture_data_change_meta->tx_id) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "txId", neo4j_capture_data_change_meta->tx_id) == NULL) {
    goto fail; //Numeric
    }


    // neo4j_capture_data_change_meta->username
    if (!neo4j_capture_data_change_meta->username) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "username", neo4j_capture_data_change_meta->username) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

neo4j_capture_data_change_meta_t *neo4j_capture_data_change_meta_parseFromJSON(cJSON *neo4j_capture_data_change_metaJSON){

    neo4j_capture_data_change_meta_t *neo4j_capture_data_change_meta_local_var = NULL;

    // define the local variable for neo4j_capture_data_change_meta->source
    neo4j_capture_data_change_meta_source_t *source_local_nonprim = NULL;

    // neo4j_capture_data_change_meta->operation
    cJSON *operation = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_change_metaJSON, "operation");
    if (!operation) {
        goto end;
    }

    
    if(!cJSON_IsString(operation))
    {
    goto end; //String
    }

    // neo4j_capture_data_change_meta->source
    cJSON *source = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_change_metaJSON, "source");
    if (!source) {
        goto end;
    }

    
    source_local_nonprim = neo4j_capture_data_change_meta_source_parseFromJSON(source); //nonprimitive

    // neo4j_capture_data_change_meta->timestamp
    cJSON *timestamp = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_change_metaJSON, "timestamp");
    if (!timestamp) {
        goto end;
    }

    
    if(!cJSON_IsNumber(timestamp))
    {
    goto end; //Numeric
    }

    // neo4j_capture_data_change_meta->tx_event_id
    cJSON *tx_event_id = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_change_metaJSON, "txEventId");
    if (!tx_event_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(tx_event_id))
    {
    goto end; //Numeric
    }

    // neo4j_capture_data_change_meta->tx_events_count
    cJSON *tx_events_count = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_change_metaJSON, "txEventsCount");
    if (!tx_events_count) {
        goto end;
    }

    
    if(!cJSON_IsNumber(tx_events_count))
    {
    goto end; //Numeric
    }

    // neo4j_capture_data_change_meta->tx_id
    cJSON *tx_id = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_change_metaJSON, "txId");
    if (!tx_id) {
        goto end;
    }

    
    if(!cJSON_IsNumber(tx_id))
    {
    goto end; //Numeric
    }

    // neo4j_capture_data_change_meta->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_change_metaJSON, "username");
    if (!username) {
        goto end;
    }

    
    if(!cJSON_IsString(username))
    {
    goto end; //String
    }


    neo4j_capture_data_change_meta_local_var = neo4j_capture_data_change_meta_create (
        strdup(operation->valuestring),
        source_local_nonprim,
        timestamp->valuedouble,
        tx_event_id->valuedouble,
        tx_events_count->valuedouble,
        tx_id->valuedouble,
        strdup(username->valuestring)
        );

    return neo4j_capture_data_change_meta_local_var;
end:
    if (source_local_nonprim) {
        neo4j_capture_data_change_meta_source_free(source_local_nonprim);
        source_local_nonprim = NULL;
    }
    return NULL;

}
