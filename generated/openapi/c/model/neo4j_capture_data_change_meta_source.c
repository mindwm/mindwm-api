#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "neo4j_capture_data_change_meta_source.h"



neo4j_capture_data_change_meta_source_t *neo4j_capture_data_change_meta_source_create(
    char *hostname
    ) {
    neo4j_capture_data_change_meta_source_t *neo4j_capture_data_change_meta_source_local_var = malloc(sizeof(neo4j_capture_data_change_meta_source_t));
    if (!neo4j_capture_data_change_meta_source_local_var) {
        return NULL;
    }
    neo4j_capture_data_change_meta_source_local_var->hostname = hostname;

    return neo4j_capture_data_change_meta_source_local_var;
}


void neo4j_capture_data_change_meta_source_free(neo4j_capture_data_change_meta_source_t *neo4j_capture_data_change_meta_source) {
    if(NULL == neo4j_capture_data_change_meta_source){
        return ;
    }
    listEntry_t *listEntry;
    if (neo4j_capture_data_change_meta_source->hostname) {
        free(neo4j_capture_data_change_meta_source->hostname);
        neo4j_capture_data_change_meta_source->hostname = NULL;
    }
    free(neo4j_capture_data_change_meta_source);
}

cJSON *neo4j_capture_data_change_meta_source_convertToJSON(neo4j_capture_data_change_meta_source_t *neo4j_capture_data_change_meta_source) {
    cJSON *item = cJSON_CreateObject();

    // neo4j_capture_data_change_meta_source->hostname
    if (!neo4j_capture_data_change_meta_source->hostname) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "hostname", neo4j_capture_data_change_meta_source->hostname) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

neo4j_capture_data_change_meta_source_t *neo4j_capture_data_change_meta_source_parseFromJSON(cJSON *neo4j_capture_data_change_meta_sourceJSON){

    neo4j_capture_data_change_meta_source_t *neo4j_capture_data_change_meta_source_local_var = NULL;

    // neo4j_capture_data_change_meta_source->hostname
    cJSON *hostname = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_change_meta_sourceJSON, "hostname");
    if (!hostname) {
        goto end;
    }

    
    if(!cJSON_IsString(hostname))
    {
    goto end; //String
    }


    neo4j_capture_data_change_meta_source_local_var = neo4j_capture_data_change_meta_source_create (
        strdup(hostname->valuestring)
        );

    return neo4j_capture_data_change_meta_source_local_var;
end:
    return NULL;

}
