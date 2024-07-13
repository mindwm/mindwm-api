#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "neo4j_capture_data_change_schema.h"



neo4j_capture_data_change_schema_t *neo4j_capture_data_change_schema_create(
    list_t* constraints,
    list_t* properties
    ) {
    neo4j_capture_data_change_schema_t *neo4j_capture_data_change_schema_local_var = malloc(sizeof(neo4j_capture_data_change_schema_t));
    if (!neo4j_capture_data_change_schema_local_var) {
        return NULL;
    }
    neo4j_capture_data_change_schema_local_var->constraints = constraints;
    neo4j_capture_data_change_schema_local_var->properties = properties;

    return neo4j_capture_data_change_schema_local_var;
}


void neo4j_capture_data_change_schema_free(neo4j_capture_data_change_schema_t *neo4j_capture_data_change_schema) {
    if(NULL == neo4j_capture_data_change_schema){
        return ;
    }
    listEntry_t *listEntry;
    if (neo4j_capture_data_change_schema->constraints) {
        list_ForEach(listEntry, neo4j_capture_data_change_schema->constraints) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(neo4j_capture_data_change_schema->constraints);
        neo4j_capture_data_change_schema->constraints = NULL;
    }
    if (neo4j_capture_data_change_schema->properties) {
        list_ForEach(listEntry, neo4j_capture_data_change_schema->properties) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(neo4j_capture_data_change_schema->properties);
        neo4j_capture_data_change_schema->properties = NULL;
    }
    free(neo4j_capture_data_change_schema);
}

cJSON *neo4j_capture_data_change_schema_convertToJSON(neo4j_capture_data_change_schema_t *neo4j_capture_data_change_schema) {
    cJSON *item = cJSON_CreateObject();

    // neo4j_capture_data_change_schema->constraints
    if(neo4j_capture_data_change_schema->constraints) {
    cJSON *constraints = cJSON_AddObjectToObject(item, "constraints");
    if(constraints == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = constraints;
    listEntry_t *constraintsListEntry;
    if (neo4j_capture_data_change_schema->constraints) {
    list_ForEach(constraintsListEntry, neo4j_capture_data_change_schema->constraints) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)constraintsListEntry->data;
    }
    }
    }


    // neo4j_capture_data_change_schema->properties
    if(neo4j_capture_data_change_schema->properties) {
    cJSON *properties = cJSON_AddObjectToObject(item, "properties");
    if(properties == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = properties;
    listEntry_t *propertiesListEntry;
    if (neo4j_capture_data_change_schema->properties) {
    list_ForEach(propertiesListEntry, neo4j_capture_data_change_schema->properties) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)propertiesListEntry->data;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

neo4j_capture_data_change_schema_t *neo4j_capture_data_change_schema_parseFromJSON(cJSON *neo4j_capture_data_change_schemaJSON){

    neo4j_capture_data_change_schema_t *neo4j_capture_data_change_schema_local_var = NULL;

    // define the local map for neo4j_capture_data_change_schema->constraints
    list_t *constraintsList = NULL;

    // define the local map for neo4j_capture_data_change_schema->properties
    list_t *propertiesList = NULL;

    // neo4j_capture_data_change_schema->constraints
    cJSON *constraints = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_change_schemaJSON, "constraints");
    if (constraints) { 
    cJSON *constraints_local_map = NULL;
    if(!cJSON_IsObject(constraints) && !cJSON_IsNull(constraints))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(constraints))
    {
        constraintsList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(constraints_local_map, constraints)
        {
            cJSON *localMapObject = constraints_local_map;
            list_addElement(constraintsList , localMapKeyPair);
        }
    }
    }

    // neo4j_capture_data_change_schema->properties
    cJSON *properties = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_change_schemaJSON, "properties");
    if (properties) { 
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
    }


    neo4j_capture_data_change_schema_local_var = neo4j_capture_data_change_schema_create (
        constraints ? constraintsList : NULL,
        properties ? propertiesList : NULL
        );

    return neo4j_capture_data_change_schema_local_var;
end:
    if (constraintsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, constraintsList) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(constraintsList);
        constraintsList = NULL;
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
