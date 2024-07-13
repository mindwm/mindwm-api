#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "graph_node_all_of_data.h"



graph_node_all_of_data_t *graph_node_all_of_data_create(
    object_t *headers,
    char *message_key,
    neo4j_capture_data_change_meta_t *meta,
    int offset,
    int partition,
    char *source_type,
    char *timestamp,
    char *topic,
    neo4j_capture_data_change_schema_t *schema,
    neo4j_capture_data_change_node_payload_t *payload
    ) {
    graph_node_all_of_data_t *graph_node_all_of_data_local_var = malloc(sizeof(graph_node_all_of_data_t));
    if (!graph_node_all_of_data_local_var) {
        return NULL;
    }
    graph_node_all_of_data_local_var->headers = headers;
    graph_node_all_of_data_local_var->message_key = message_key;
    graph_node_all_of_data_local_var->meta = meta;
    graph_node_all_of_data_local_var->offset = offset;
    graph_node_all_of_data_local_var->partition = partition;
    graph_node_all_of_data_local_var->source_type = source_type;
    graph_node_all_of_data_local_var->timestamp = timestamp;
    graph_node_all_of_data_local_var->topic = topic;
    graph_node_all_of_data_local_var->schema = schema;
    graph_node_all_of_data_local_var->payload = payload;

    return graph_node_all_of_data_local_var;
}


void graph_node_all_of_data_free(graph_node_all_of_data_t *graph_node_all_of_data) {
    if(NULL == graph_node_all_of_data){
        return ;
    }
    listEntry_t *listEntry;
    if (graph_node_all_of_data->headers) {
        object_free(graph_node_all_of_data->headers);
        graph_node_all_of_data->headers = NULL;
    }
    if (graph_node_all_of_data->message_key) {
        free(graph_node_all_of_data->message_key);
        graph_node_all_of_data->message_key = NULL;
    }
    if (graph_node_all_of_data->meta) {
        neo4j_capture_data_change_meta_free(graph_node_all_of_data->meta);
        graph_node_all_of_data->meta = NULL;
    }
    if (graph_node_all_of_data->source_type) {
        free(graph_node_all_of_data->source_type);
        graph_node_all_of_data->source_type = NULL;
    }
    if (graph_node_all_of_data->timestamp) {
        free(graph_node_all_of_data->timestamp);
        graph_node_all_of_data->timestamp = NULL;
    }
    if (graph_node_all_of_data->topic) {
        free(graph_node_all_of_data->topic);
        graph_node_all_of_data->topic = NULL;
    }
    if (graph_node_all_of_data->schema) {
        neo4j_capture_data_change_schema_free(graph_node_all_of_data->schema);
        graph_node_all_of_data->schema = NULL;
    }
    if (graph_node_all_of_data->payload) {
        neo4j_capture_data_change_node_payload_free(graph_node_all_of_data->payload);
        graph_node_all_of_data->payload = NULL;
    }
    free(graph_node_all_of_data);
}

cJSON *graph_node_all_of_data_convertToJSON(graph_node_all_of_data_t *graph_node_all_of_data) {
    cJSON *item = cJSON_CreateObject();

    // graph_node_all_of_data->headers
    if (!graph_node_all_of_data->headers) {
        goto fail;
    }
    cJSON *headers_object = object_convertToJSON(graph_node_all_of_data->headers);
    if(headers_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "headers", headers_object);
    if(item->child == NULL) {
    goto fail;
    }


    // graph_node_all_of_data->message_key
    if (!graph_node_all_of_data->message_key) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message_key", graph_node_all_of_data->message_key) == NULL) {
    goto fail; //String
    }


    // graph_node_all_of_data->meta
    if (!graph_node_all_of_data->meta) {
        goto fail;
    }
    cJSON *meta_local_JSON = neo4j_capture_data_change_meta_convertToJSON(graph_node_all_of_data->meta);
    if(meta_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "meta", meta_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // graph_node_all_of_data->offset
    if (!graph_node_all_of_data->offset) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "offset", graph_node_all_of_data->offset) == NULL) {
    goto fail; //Numeric
    }


    // graph_node_all_of_data->partition
    if (!graph_node_all_of_data->partition) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "partition", graph_node_all_of_data->partition) == NULL) {
    goto fail; //Numeric
    }


    // graph_node_all_of_data->source_type
    if (!graph_node_all_of_data->source_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "source_type", graph_node_all_of_data->source_type) == NULL) {
    goto fail; //String
    }


    // graph_node_all_of_data->timestamp
    if (!graph_node_all_of_data->timestamp) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "timestamp", graph_node_all_of_data->timestamp) == NULL) {
    goto fail; //Date-Time
    }


    // graph_node_all_of_data->topic
    if (!graph_node_all_of_data->topic) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "topic", graph_node_all_of_data->topic) == NULL) {
    goto fail; //String
    }


    // graph_node_all_of_data->schema
    if (!graph_node_all_of_data->schema) {
        goto fail;
    }
    cJSON *schema_local_JSON = neo4j_capture_data_change_schema_convertToJSON(graph_node_all_of_data->schema);
    if(schema_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "schema", schema_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // graph_node_all_of_data->payload
    if (!graph_node_all_of_data->payload) {
        goto fail;
    }
    cJSON *payload_local_JSON = neo4j_capture_data_change_node_payload_convertToJSON(graph_node_all_of_data->payload);
    if(payload_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "payload", payload_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

graph_node_all_of_data_t *graph_node_all_of_data_parseFromJSON(cJSON *graph_node_all_of_dataJSON){

    graph_node_all_of_data_t *graph_node_all_of_data_local_var = NULL;

    // define the local variable for graph_node_all_of_data->meta
    neo4j_capture_data_change_meta_t *meta_local_nonprim = NULL;

    // define the local variable for graph_node_all_of_data->schema
    neo4j_capture_data_change_schema_t *schema_local_nonprim = NULL;

    // define the local variable for graph_node_all_of_data->payload
    neo4j_capture_data_change_node_payload_t *payload_local_nonprim = NULL;

    // graph_node_all_of_data->headers
    cJSON *headers = cJSON_GetObjectItemCaseSensitive(graph_node_all_of_dataJSON, "headers");
    if (!headers) {
        goto end;
    }

    object_t *headers_local_object = NULL;
    
    headers_local_object = object_parseFromJSON(headers); //object

    // graph_node_all_of_data->message_key
    cJSON *message_key = cJSON_GetObjectItemCaseSensitive(graph_node_all_of_dataJSON, "message_key");
    if (!message_key) {
        goto end;
    }

    
    if(!cJSON_IsString(message_key))
    {
    goto end; //String
    }

    // graph_node_all_of_data->meta
    cJSON *meta = cJSON_GetObjectItemCaseSensitive(graph_node_all_of_dataJSON, "meta");
    if (!meta) {
        goto end;
    }

    
    meta_local_nonprim = neo4j_capture_data_change_meta_parseFromJSON(meta); //nonprimitive

    // graph_node_all_of_data->offset
    cJSON *offset = cJSON_GetObjectItemCaseSensitive(graph_node_all_of_dataJSON, "offset");
    if (!offset) {
        goto end;
    }

    
    if(!cJSON_IsNumber(offset))
    {
    goto end; //Numeric
    }

    // graph_node_all_of_data->partition
    cJSON *partition = cJSON_GetObjectItemCaseSensitive(graph_node_all_of_dataJSON, "partition");
    if (!partition) {
        goto end;
    }

    
    if(!cJSON_IsNumber(partition))
    {
    goto end; //Numeric
    }

    // graph_node_all_of_data->source_type
    cJSON *source_type = cJSON_GetObjectItemCaseSensitive(graph_node_all_of_dataJSON, "source_type");
    if (!source_type) {
        goto end;
    }

    
    if(!cJSON_IsString(source_type))
    {
    goto end; //String
    }

    // graph_node_all_of_data->timestamp
    cJSON *timestamp = cJSON_GetObjectItemCaseSensitive(graph_node_all_of_dataJSON, "timestamp");
    if (!timestamp) {
        goto end;
    }

    
    if(!cJSON_IsString(timestamp) && !cJSON_IsNull(timestamp))
    {
    goto end; //DateTime
    }

    // graph_node_all_of_data->topic
    cJSON *topic = cJSON_GetObjectItemCaseSensitive(graph_node_all_of_dataJSON, "topic");
    if (!topic) {
        goto end;
    }

    
    if(!cJSON_IsString(topic))
    {
    goto end; //String
    }

    // graph_node_all_of_data->schema
    cJSON *schema = cJSON_GetObjectItemCaseSensitive(graph_node_all_of_dataJSON, "schema");
    if (!schema) {
        goto end;
    }

    
    schema_local_nonprim = neo4j_capture_data_change_schema_parseFromJSON(schema); //nonprimitive

    // graph_node_all_of_data->payload
    cJSON *payload = cJSON_GetObjectItemCaseSensitive(graph_node_all_of_dataJSON, "payload");
    if (!payload) {
        goto end;
    }

    
    payload_local_nonprim = neo4j_capture_data_change_node_payload_parseFromJSON(payload); //nonprimitive


    graph_node_all_of_data_local_var = graph_node_all_of_data_create (
        headers_local_object,
        strdup(message_key->valuestring),
        meta_local_nonprim,
        offset->valuedouble,
        partition->valuedouble,
        strdup(source_type->valuestring),
        strdup(timestamp->valuestring),
        strdup(topic->valuestring),
        schema_local_nonprim,
        payload_local_nonprim
        );

    return graph_node_all_of_data_local_var;
end:
    if (meta_local_nonprim) {
        neo4j_capture_data_change_meta_free(meta_local_nonprim);
        meta_local_nonprim = NULL;
    }
    if (schema_local_nonprim) {
        neo4j_capture_data_change_schema_free(schema_local_nonprim);
        schema_local_nonprim = NULL;
    }
    if (payload_local_nonprim) {
        neo4j_capture_data_change_node_payload_free(payload_local_nonprim);
        payload_local_nonprim = NULL;
    }
    return NULL;

}
