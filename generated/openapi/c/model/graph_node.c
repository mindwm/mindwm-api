#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "graph_node.h"


char* graph_node_source_ToString(mindwm_api_graph_node_SOURCE_e source) {
    char* sourceArray[] =  { "NULL", "graph.node" };
    return sourceArray[source];
}

mindwm_api_graph_node_SOURCE_e graph_node_source_FromString(char* source){
    int stringToReturn = 0;
    char *sourceArray[] =  { "NULL", "graph.node" };
    size_t sizeofArray = sizeof(sourceArray) / sizeof(sourceArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(source, sourceArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* graph_node_type_ToString(mindwm_api_graph_node_TYPE_e type) {
    char* typeArray[] =  { "NULL", "created", "updated", "deleted" };
    return typeArray[type];
}

mindwm_api_graph_node_TYPE_e graph_node_type_FromString(char* type){
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

graph_node_t *graph_node_create(
    char *id,
    mindwm_api_graph_node_SOURCE_e source,
    char *specversion,
    mindwm_api_graph_node_TYPE_e type,
    char *datacontenttype,
    char *dataschema,
    char *subject,
    char *time,
    graph_node_all_of_data_t *data,
    char *data_base64
    ) {
    graph_node_t *graph_node_local_var = malloc(sizeof(graph_node_t));
    if (!graph_node_local_var) {
        return NULL;
    }
    graph_node_local_var->id = id;
    graph_node_local_var->source = source;
    graph_node_local_var->specversion = specversion;
    graph_node_local_var->type = type;
    graph_node_local_var->datacontenttype = datacontenttype;
    graph_node_local_var->dataschema = dataschema;
    graph_node_local_var->subject = subject;
    graph_node_local_var->time = time;
    graph_node_local_var->data = data;
    graph_node_local_var->data_base64 = data_base64;

    return graph_node_local_var;
}


void graph_node_free(graph_node_t *graph_node) {
    if(NULL == graph_node){
        return ;
    }
    listEntry_t *listEntry;
    if (graph_node->id) {
        free(graph_node->id);
        graph_node->id = NULL;
    }
    if (graph_node->specversion) {
        free(graph_node->specversion);
        graph_node->specversion = NULL;
    }
    if (graph_node->datacontenttype) {
        free(graph_node->datacontenttype);
        graph_node->datacontenttype = NULL;
    }
    if (graph_node->dataschema) {
        free(graph_node->dataschema);
        graph_node->dataschema = NULL;
    }
    if (graph_node->subject) {
        free(graph_node->subject);
        graph_node->subject = NULL;
    }
    if (graph_node->time) {
        free(graph_node->time);
        graph_node->time = NULL;
    }
    if (graph_node->data) {
        graph_node_all_of_data_free(graph_node->data);
        graph_node->data = NULL;
    }
    if (graph_node->data_base64) {
        free(graph_node->data_base64);
        graph_node->data_base64 = NULL;
    }
    free(graph_node);
}

cJSON *graph_node_convertToJSON(graph_node_t *graph_node) {
    cJSON *item = cJSON_CreateObject();

    // graph_node->id
    if (!graph_node->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", graph_node->id) == NULL) {
    goto fail; //String
    }


    // graph_node->source
    if (mindwm_api_graph_node_SOURCE_NULL == graph_node->source) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "source", sourcegraph_node_ToString(graph_node->source)) == NULL)
    {
    goto fail; //Enum
    }


    // graph_node->specversion
    if (!graph_node->specversion) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "specversion", graph_node->specversion) == NULL) {
    goto fail; //String
    }


    // graph_node->type
    if (mindwm_api_graph_node_TYPE_NULL == graph_node->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typegraph_node_ToString(graph_node->type)) == NULL)
    {
    goto fail; //Enum
    }


    // graph_node->datacontenttype
    if(graph_node->datacontenttype) {
    if(cJSON_AddStringToObject(item, "datacontenttype", graph_node->datacontenttype) == NULL) {
    goto fail; //String
    }
    }


    // graph_node->dataschema
    if(graph_node->dataschema) {
    if(cJSON_AddStringToObject(item, "dataschema", graph_node->dataschema) == NULL) {
    goto fail; //String
    }
    }


    // graph_node->subject
    if(graph_node->subject) {
    if(cJSON_AddStringToObject(item, "subject", graph_node->subject) == NULL) {
    goto fail; //String
    }
    }


    // graph_node->time
    if(graph_node->time) {
    if(cJSON_AddStringToObject(item, "time", graph_node->time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // graph_node->data
    if(graph_node->data) {
    cJSON *data_local_JSON = graph_node_all_of_data_convertToJSON(graph_node->data);
    if(data_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "data", data_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // graph_node->data_base64
    if(graph_node->data_base64) {
    if(cJSON_AddStringToObject(item, "data_base64", graph_node->data_base64) == NULL) {
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

graph_node_t *graph_node_parseFromJSON(cJSON *graph_nodeJSON){

    graph_node_t *graph_node_local_var = NULL;

    // define the local variable for graph_node->data
    graph_node_all_of_data_t *data_local_nonprim = NULL;

    // graph_node->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(graph_nodeJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // graph_node->source
    cJSON *source = cJSON_GetObjectItemCaseSensitive(graph_nodeJSON, "source");
    if (!source) {
        goto end;
    }

    mindwm_api_graph_node_SOURCE_e sourceVariable;
    
    if(!cJSON_IsString(source))
    {
    goto end; //Enum
    }
    sourceVariable = graph_node_source_FromString(source->valuestring);

    // graph_node->specversion
    cJSON *specversion = cJSON_GetObjectItemCaseSensitive(graph_nodeJSON, "specversion");
    if (!specversion) {
        goto end;
    }

    
    if(!cJSON_IsString(specversion))
    {
    goto end; //String
    }

    // graph_node->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(graph_nodeJSON, "type");
    if (!type) {
        goto end;
    }

    mindwm_api_graph_node_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = graph_node_type_FromString(type->valuestring);

    // graph_node->datacontenttype
    cJSON *datacontenttype = cJSON_GetObjectItemCaseSensitive(graph_nodeJSON, "datacontenttype");
    if (datacontenttype) { 
    if(!cJSON_IsString(datacontenttype) && !cJSON_IsNull(datacontenttype))
    {
    goto end; //String
    }
    }

    // graph_node->dataschema
    cJSON *dataschema = cJSON_GetObjectItemCaseSensitive(graph_nodeJSON, "dataschema");
    if (dataschema) { 
    if(!cJSON_IsString(dataschema) && !cJSON_IsNull(dataschema))
    {
    goto end; //String
    }
    }

    // graph_node->subject
    cJSON *subject = cJSON_GetObjectItemCaseSensitive(graph_nodeJSON, "subject");
    if (subject) { 
    if(!cJSON_IsString(subject) && !cJSON_IsNull(subject))
    {
    goto end; //String
    }
    }

    // graph_node->time
    cJSON *time = cJSON_GetObjectItemCaseSensitive(graph_nodeJSON, "time");
    if (time) { 
    if(!cJSON_IsString(time) && !cJSON_IsNull(time))
    {
    goto end; //DateTime
    }
    }

    // graph_node->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(graph_nodeJSON, "data");
    if (data) { 
    data_local_nonprim = graph_node_all_of_data_parseFromJSON(data); //nonprimitive
    }

    // graph_node->data_base64
    cJSON *data_base64 = cJSON_GetObjectItemCaseSensitive(graph_nodeJSON, "data_base64");
    if (data_base64) { 
    if(!cJSON_IsString(data_base64) && !cJSON_IsNull(data_base64))
    {
    goto end; //String
    }
    }


    graph_node_local_var = graph_node_create (
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

    return graph_node_local_var;
end:
    if (data_local_nonprim) {
        graph_node_all_of_data_free(data_local_nonprim);
        data_local_nonprim = NULL;
    }
    return NULL;

}
