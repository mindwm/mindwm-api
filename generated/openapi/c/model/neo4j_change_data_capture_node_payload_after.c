#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "neo4j_change_data_capture_node_payload_after.h"



neo4j_change_data_capture_node_payload_after_t *neo4j_change_data_capture_node_payload_after_create(
    list_t *labels,
    list_t* properties
    ) {
    neo4j_change_data_capture_node_payload_after_t *neo4j_change_data_capture_node_payload_after_local_var = malloc(sizeof(neo4j_change_data_capture_node_payload_after_t));
    if (!neo4j_change_data_capture_node_payload_after_local_var) {
        return NULL;
    }
    neo4j_change_data_capture_node_payload_after_local_var->labels = labels;
    neo4j_change_data_capture_node_payload_after_local_var->properties = properties;

    return neo4j_change_data_capture_node_payload_after_local_var;
}


void neo4j_change_data_capture_node_payload_after_free(neo4j_change_data_capture_node_payload_after_t *neo4j_change_data_capture_node_payload_after) {
    if(NULL == neo4j_change_data_capture_node_payload_after){
        return ;
    }
    listEntry_t *listEntry;
    if (neo4j_change_data_capture_node_payload_after->labels) {
        list_ForEach(listEntry, neo4j_change_data_capture_node_payload_after->labels) {
            free(listEntry->data);
        }
        list_freeList(neo4j_change_data_capture_node_payload_after->labels);
        neo4j_change_data_capture_node_payload_after->labels = NULL;
    }
    if (neo4j_change_data_capture_node_payload_after->properties) {
        list_ForEach(listEntry, neo4j_change_data_capture_node_payload_after->properties) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(neo4j_change_data_capture_node_payload_after->properties);
        neo4j_change_data_capture_node_payload_after->properties = NULL;
    }
    free(neo4j_change_data_capture_node_payload_after);
}

cJSON *neo4j_change_data_capture_node_payload_after_convertToJSON(neo4j_change_data_capture_node_payload_after_t *neo4j_change_data_capture_node_payload_after) {
    cJSON *item = cJSON_CreateObject();

    // neo4j_change_data_capture_node_payload_after->labels
    if (!neo4j_change_data_capture_node_payload_after->labels) {
        goto fail;
    }
    cJSON *labels = cJSON_AddArrayToObject(item, "labels");
    if(labels == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *labelsListEntry;
    list_ForEach(labelsListEntry, neo4j_change_data_capture_node_payload_after->labels) {
    if(cJSON_AddStringToObject(labels, "", (char*)labelsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // neo4j_change_data_capture_node_payload_after->properties
    if (!neo4j_change_data_capture_node_payload_after->properties) {
        goto fail;
    }
    cJSON *properties = cJSON_AddObjectToObject(item, "properties");
    if(properties == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = properties;
    listEntry_t *propertiesListEntry;
    if (neo4j_change_data_capture_node_payload_after->properties) {
    list_ForEach(propertiesListEntry, neo4j_change_data_capture_node_payload_after->properties) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)propertiesListEntry->data;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

neo4j_change_data_capture_node_payload_after_t *neo4j_change_data_capture_node_payload_after_parseFromJSON(cJSON *neo4j_change_data_capture_node_payload_afterJSON){

    neo4j_change_data_capture_node_payload_after_t *neo4j_change_data_capture_node_payload_after_local_var = NULL;

    // define the local list for neo4j_change_data_capture_node_payload_after->labels
    list_t *labelsList = NULL;

    // define the local map for neo4j_change_data_capture_node_payload_after->properties
    list_t *propertiesList = NULL;

    // neo4j_change_data_capture_node_payload_after->labels
    cJSON *labels = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_capture_node_payload_afterJSON, "labels");
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

    // neo4j_change_data_capture_node_payload_after->properties
    cJSON *properties = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_capture_node_payload_afterJSON, "properties");
    if (!properties) {
        goto end;
    }

    
    cJSON *properties_local_map = NULL;
    if(!cJSON_IsObject(properties) && !cJSON_IsNull(properties))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(properties))
    {
        propertiesList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(properties_local_map, properties)
        {
            cJSON *localMapObject = properties_local_map;
            list_addElement(propertiesList , localMapKeyPair);
        }
    }


    neo4j_change_data_capture_node_payload_after_local_var = neo4j_change_data_capture_node_payload_after_create (
        labelsList,
        propertiesList
        );

    return neo4j_change_data_capture_node_payload_after_local_var;
end:
    if (labelsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, labelsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(labelsList);
        labelsList = NULL;
    }
    if (propertiesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, propertiesList) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(propertiesList);
        propertiesList = NULL;
    }
    return NULL;

}
