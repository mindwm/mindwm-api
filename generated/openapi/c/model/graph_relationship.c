#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "graph_relationship.h"


char* graph_relationship_source_ToString(mindwm_api_graph_relationship_SOURCE_e source) {
    char* sourceArray[] =  { "NULL", "graph.relationship" };
    return sourceArray[source];
}

mindwm_api_graph_relationship_SOURCE_e graph_relationship_source_FromString(char* source){
    int stringToReturn = 0;
    char *sourceArray[] =  { "NULL", "graph.relationship" };
    size_t sizeofArray = sizeof(sourceArray) / sizeof(sourceArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(source, sourceArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* graph_relationship_type_ToString(mindwm_api_graph_relationship_TYPE_e type) {
    char* typeArray[] =  { "NULL", "created", "updated", "deleted" };
    return typeArray[type];
}

mindwm_api_graph_relationship_TYPE_e graph_relationship_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "created", "updated", "deleted" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

graph_relationship_t *graph_relationship_create(
    char *id,
    mindwm_api_graph_relationship_SOURCE_e source,
    char *specversion,
    mindwm_api_graph_relationship_TYPE_e type,
    char *datacontenttype,
    char *dataschema,
    char *subject,
    char *time,
    graph_relationship_all_of_data_t *data,
    char *data_base64
    ) {
    graph_relationship_t *graph_relationship_local_var = malloc(sizeof(graph_relationship_t));
    if (!graph_relationship_local_var) {
        return NULL;
    }
    graph_relationship_local_var->id = id;
    graph_relationship_local_var->source = source;
    graph_relationship_local_var->specversion = specversion;
    graph_relationship_local_var->type = type;
    graph_relationship_local_var->datacontenttype = datacontenttype;
    graph_relationship_local_var->dataschema = dataschema;
    graph_relationship_local_var->subject = subject;
    graph_relationship_local_var->time = time;
    graph_relationship_local_var->data = data;
    graph_relationship_local_var->data_base64 = data_base64;

    return graph_relationship_local_var;
}


void graph_relationship_free(graph_relationship_t *graph_relationship) {
    if(NULL == graph_relationship){
        return ;
    }
    listEntry_t *listEntry;
    if (graph_relationship->id) {
        free(graph_relationship->id);
        graph_relationship->id = NULL;
    }
    if (graph_relationship->specversion) {
        free(graph_relationship->specversion);
        graph_relationship->specversion = NULL;
    }
    if (graph_relationship->datacontenttype) {
        free(graph_relationship->datacontenttype);
        graph_relationship->datacontenttype = NULL;
    }
    if (graph_relationship->dataschema) {
        free(graph_relationship->dataschema);
        graph_relationship->dataschema = NULL;
    }
    if (graph_relationship->subject) {
        free(graph_relationship->subject);
        graph_relationship->subject = NULL;
    }
    if (graph_relationship->time) {
        free(graph_relationship->time);
        graph_relationship->time = NULL;
    }
    if (graph_relationship->data) {
        graph_relationship_all_of_data_free(graph_relationship->data);
        graph_relationship->data = NULL;
    }
    if (graph_relationship->data_base64) {
        free(graph_relationship->data_base64);
        graph_relationship->data_base64 = NULL;
    }
    free(graph_relationship);
}

cJSON *graph_relationship_convertToJSON(graph_relationship_t *graph_relationship) {
    cJSON *item = cJSON_CreateObject();

    // graph_relationship->id
    if (!graph_relationship->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", graph_relationship->id) == NULL) {
    goto fail; //String
    }


    // graph_relationship->source
    if (mindwm_api_graph_relationship_SOURCE_NULL == graph_relationship->source) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "source", sourcegraph_relationship_ToString(graph_relationship->source)) == NULL)
    {
    goto fail; //Enum
    }


    // graph_relationship->specversion
    if (!graph_relationship->specversion) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "specversion", graph_relationship->specversion) == NULL) {
    goto fail; //String
    }


    // graph_relationship->type
    if (mindwm_api_graph_relationship_TYPE_NULL == graph_relationship->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typegraph_relationship_ToString(graph_relationship->type)) == NULL)
    {
    goto fail; //Enum
    }


    // graph_relationship->datacontenttype
    if(graph_relationship->datacontenttype) {
    if(cJSON_AddStringToObject(item, "datacontenttype", graph_relationship->datacontenttype) == NULL) {
    goto fail; //String
    }
    }


    // graph_relationship->dataschema
    if(graph_relationship->dataschema) {
    if(cJSON_AddStringToObject(item, "dataschema", graph_relationship->dataschema) == NULL) {
    goto fail; //String
    }
    }


    // graph_relationship->subject
    if(graph_relationship->subject) {
    if(cJSON_AddStringToObject(item, "subject", graph_relationship->subject) == NULL) {
    goto fail; //String
    }
    }


    // graph_relationship->time
    if(graph_relationship->time) {
    if(cJSON_AddStringToObject(item, "time", graph_relationship->time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // graph_relationship->data
    if(graph_relationship->data) {
    cJSON *data_local_JSON = graph_relationship_all_of_data_convertToJSON(graph_relationship->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // graph_relationship->data_base64
    if(graph_relationship->data_base64) {
    if(cJSON_AddStringToObject(item, "data_base64", graph_relationship->data_base64) == NULL) {
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

graph_relationship_t *graph_relationship_parseFromJSON(cJSON *graph_relationshipJSON){

    graph_relationship_t *graph_relationship_local_var = NULL;

    // define the local variable for graph_relationship->data
    graph_relationship_all_of_data_t *data_local_nonprim = NULL;

    // graph_relationship->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(graph_relationshipJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // graph_relationship->source
    cJSON *source = cJSON_GetObjectItemCaseSensitive(graph_relationshipJSON, "source");
    if (!source) {
        goto end;
    }

    mindwm_api_graph_relationship_SOURCE_e sourceVariable;
    
    if(!cJSON_IsString(source))
    {
    goto end; //Enum
    }
    sourceVariable = graph_relationship_source_FromString(source->valuestring);

    // graph_relationship->specversion
    cJSON *specversion = cJSON_GetObjectItemCaseSensitive(graph_relationshipJSON, "specversion");
    if (!specversion) {
        goto end;
    }

    
    if(!cJSON_IsString(specversion))
    {
    goto end; //String
    }

    // graph_relationship->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(graph_relationshipJSON, "type");
    if (!type) {
        goto end;
    }

    mindwm_api_graph_relationship_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = graph_relationship_type_FromString(type->valuestring);

    // graph_relationship->datacontenttype
    cJSON *datacontenttype = cJSON_GetObjectItemCaseSensitive(graph_relationshipJSON, "datacontenttype");
    if (datacontenttype) { 
    if(!cJSON_IsString(datacontenttype) && !cJSON_IsNull(datacontenttype))
    {
    goto end; //String
    }
    }

    // graph_relationship->dataschema
    cJSON *dataschema = cJSON_GetObjectItemCaseSensitive(graph_relationshipJSON, "dataschema");
    if (dataschema) { 
    if(!cJSON_IsString(dataschema) && !cJSON_IsNull(dataschema))
    {
    goto end; //String
    }
    }

    // graph_relationship->subject
    cJSON *subject = cJSON_GetObjectItemCaseSensitive(graph_relationshipJSON, "subject");
    if (subject) { 
    if(!cJSON_IsString(subject) && !cJSON_IsNull(subject))
    {
    goto end; //String
    }
    }

    // graph_relationship->time
    cJSON *time = cJSON_GetObjectItemCaseSensitive(graph_relationshipJSON, "time");
    if (time) { 
    if(!cJSON_IsString(time) && !cJSON_IsNull(time))
    {
    goto end; //DateTime
    }
    }

    // graph_relationship->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(graph_relationshipJSON, "data");
    if (data) { 
    data_local_nonprim = graph_relationship_all_of_data_parseFromJSON(data); //nonprimitive
    }

    // graph_relationship->data_base64
    cJSON *data_base64 = cJSON_GetObjectItemCaseSensitive(graph_relationshipJSON, "data_base64");
    if (data_base64) { 
    if(!cJSON_IsString(data_base64) && !cJSON_IsNull(data_base64))
    {
    goto end; //String
    }
    }


    graph_relationship_local_var = graph_relationship_create (
        strdup(id->valuestring),
        sourceVariable,
        strdup(specversion->valuestring),
        typeVariable,
        datacontenttype && !cJSON_IsNull(datacontenttype) ? strdup(datacontenttype->valuestring) : NULL,
        dataschema && !cJSON_IsNull(dataschema) ? strdup(dataschema->valuestring) : NULL,
        subject && !cJSON_IsNull(subject) ? strdup(subject->valuestring) : NULL,
        time && !cJSON_IsNull(time) ? strdup(time->valuestring) : NULL,
        data ? data_local_nonprim : NULL,
        data_base64 && !cJSON_IsNull(data_base64) ? strdup(data_base64->valuestring) : NULL
        );

    return graph_relationship_local_var;
end:
    if (data_local_nonprim) {
        graph_relationship_all_of_data_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
