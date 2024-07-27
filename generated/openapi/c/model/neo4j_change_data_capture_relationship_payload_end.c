#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "neo4j_change_data_capture_relationship_payload_end.h"



neo4j_change_data_capture_relationship_payload_end_t *neo4j_change_data_capture_relationship_payload_end_create(
    char *id,
    list_t* ids,
    list_t *labels
    ) {
    neo4j_change_data_capture_relationship_payload_end_t *neo4j_change_data_capture_relationship_payload_end_local_var = malloc(sizeof(neo4j_change_data_capture_relationship_payload_end_t));
    if (!neo4j_change_data_capture_relationship_payload_end_local_var) {
        return NULL;
    }
    neo4j_change_data_capture_relationship_payload_end_local_var->id = id;
    neo4j_change_data_capture_relationship_payload_end_local_var->ids = ids;
    neo4j_change_data_capture_relationship_payload_end_local_var->labels = labels;

    return neo4j_change_data_capture_relationship_payload_end_local_var;
}


void neo4j_change_data_capture_relationship_payload_end_free(neo4j_change_data_capture_relationship_payload_end_t *neo4j_change_data_capture_relationship_payload_end) {
    if(NULL == neo4j_change_data_capture_relationship_payload_end){
        return ;
    }
    listEntry_t *listEntry;
    if (neo4j_change_data_capture_relationship_payload_end->id) {
        free(neo4j_change_data_capture_relationship_payload_end->id);
        neo4j_change_data_capture_relationship_payload_end->id = NULL;
    }
    if (neo4j_change_data_capture_relationship_payload_end->ids) {
        list_ForEach(listEntry, neo4j_change_data_capture_relationship_payload_end->ids) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(neo4j_change_data_capture_relationship_payload_end->ids);
        neo4j_change_data_capture_relationship_payload_end->ids = NULL;
    }
    if (neo4j_change_data_capture_relationship_payload_end->labels) {
        list_ForEach(listEntry, neo4j_change_data_capture_relationship_payload_end->labels) {
            free(listEntry->data);
        }
        list_freeList(neo4j_change_data_capture_relationship_payload_end->labels);
        neo4j_change_data_capture_relationship_payload_end->labels = NULL;
    }
    free(neo4j_change_data_capture_relationship_payload_end);
}

cJSON *neo4j_change_data_capture_relationship_payload_end_convertToJSON(neo4j_change_data_capture_relationship_payload_end_t *neo4j_change_data_capture_relationship_payload_end) {
    cJSON *item = cJSON_CreateObject();

    // neo4j_change_data_capture_relationship_payload_end->id
    if (!neo4j_change_data_capture_relationship_payload_end->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", neo4j_change_data_capture_relationship_payload_end->id) == NULL) {
    goto fail; //String
    }


    // neo4j_change_data_capture_relationship_payload_end->ids
    if (!neo4j_change_data_capture_relationship_payload_end->ids) {
        goto fail;
    }
    cJSON *ids = cJSON_AddObjectToObject(item, "ids");
    if(ids == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = ids;
    listEntry_t *idsListEntry;
    if (neo4j_change_data_capture_relationship_payload_end->ids) {
    list_ForEach(idsListEntry, neo4j_change_data_capture_relationship_payload_end->ids) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)idsListEntry->data;
    }
    }


    // neo4j_change_data_capture_relationship_payload_end->labels
    if (!neo4j_change_data_capture_relationship_payload_end->labels) {
        goto fail;
    }
    cJSON *labels = cJSON_AddArrayToObject(item, "labels");
    if(labels == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *labelsListEntry;
    list_ForEach(labelsListEntry, neo4j_change_data_capture_relationship_payload_end->labels) {
    if(cJSON_AddStringToObject(labels, "", (char*)labelsListEntry->data) == NULL)
    {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

neo4j_change_data_capture_relationship_payload_end_t *neo4j_change_data_capture_relationship_payload_end_parseFromJSON(cJSON *neo4j_change_data_capture_relationship_payload_endJSON){

    neo4j_change_data_capture_relationship_payload_end_t *neo4j_change_data_capture_relationship_payload_end_local_var = NULL;

    // define the local map for neo4j_change_data_capture_relationship_payload_end->ids
    list_t *idsList = NULL;

    // define the local list for neo4j_change_data_capture_relationship_payload_end->labels
    list_t *labelsList = NULL;

    // neo4j_change_data_capture_relationship_payload_end->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_capture_relationship_payload_endJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // neo4j_change_data_capture_relationship_payload_end->ids
    cJSON *ids = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_capture_relationship_payload_endJSON, "ids");
    if (!ids) {
        goto end;
    }

    
    cJSON *ids_local_map = NULL;
    if(!cJSON_IsObject(ids) && !cJSON_IsNull(ids))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(ids))
    {
        idsList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(ids_local_map, ids)
        {
            cJSON *localMapObject = ids_local_map;
            list_addElement(idsList , localMapKeyPair);
        }
    }

    // neo4j_change_data_capture_relationship_payload_end->labels
    cJSON *labels = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_capture_relationship_payload_endJSON, "labels");
    if (!labels) {
        goto end;
    }

    
    cJSON *labels_local = NULL;
    if(!cJSON_IsArray(labels)) {
        goto end;//primitive container
    }
    labelsList = list_createList();

    cJSON_ArrayForEach(labels_local, labels)
    {
        if(!cJSON_IsString(labels_local))
        {
            goto end;
        }
        list_addElement(labelsList , strdup(labels_local->valuestring));
    }


    neo4j_change_data_capture_relationship_payload_end_local_var = neo4j_change_data_capture_relationship_payload_end_create (
        strdup(id->valuestring),
        idsList,
        labelsList
        );

    return neo4j_change_data_capture_relationship_payload_end_local_var;
end:
    if (idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, idsList) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(idsList);
        idsList = NULL;
    }
    if (labelsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, labelsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(labelsList);
        labelsList = NULL;
    }
    return NULL;

}
