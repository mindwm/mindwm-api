#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "neo4j_change_data_capture.h"



neo4j_change_data_capture_t *neo4j_change_data_capture_create(
    list_t* headers,
    char *message_key,
    neo4j_change_data_capture_meta_t *meta,
    int offset,
    int partition,
    char *source_type,
    char *timestamp,
    char *topic,
    neo4j_change_data_capture_schema_t *schema,
    neo4j_change_data_capture_payload_t *payload
    ) {
    neo4j_change_data_capture_t *neo4j_change_data_capture_local_var = malloc(sizeof(neo4j_change_data_capture_t));
    if (!neo4j_change_data_capture_local_var) {
        return NULL;
    }
    neo4j_change_data_capture_local_var->headers = headers;
    neo4j_change_data_capture_local_var->message_key = message_key;
    neo4j_change_data_capture_local_var->meta = meta;
    neo4j_change_data_capture_local_var->offset = offset;
    neo4j_change_data_capture_local_var->partition = partition;
    neo4j_change_data_capture_local_var->source_type = source_type;
    neo4j_change_data_capture_local_var->timestamp = timestamp;
    neo4j_change_data_capture_local_var->topic = topic;
    neo4j_change_data_capture_local_var->schema = schema;
    neo4j_change_data_capture_local_var->payload = payload;

    return neo4j_change_data_capture_local_var;
}


void neo4j_change_data_capture_free(neo4j_change_data_capture_t *neo4j_change_data_capture) {
    if(NULL == neo4j_change_data_capture){
        return ;
    }
    listEntry_t *listEntry;
    if (neo4j_change_data_capture->headers) {
        list_ForEach(listEntry, neo4j_change_data_capture->headers) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(neo4j_change_data_capture->headers);
        neo4j_change_data_capture->headers = NULL;
    }
    if (neo4j_change_data_capture->message_key) {
        free(neo4j_change_data_capture->message_key);
        neo4j_change_data_capture->message_key = NULL;
    }
    if (neo4j_change_data_capture->meta) {
        neo4j_change_data_capture_meta_free(neo4j_change_data_capture->meta);
        neo4j_change_data_capture->meta = NULL;
    }
    if (neo4j_change_data_capture->source_type) {
        free(neo4j_change_data_capture->source_type);
        neo4j_change_data_capture->source_type = NULL;
    }
    if (neo4j_change_data_capture->timestamp) {
        free(neo4j_change_data_capture->timestamp);
        neo4j_change_data_capture->timestamp = NULL;
    }
    if (neo4j_change_data_capture->topic) {
        free(neo4j_change_data_capture->topic);
        neo4j_change_data_capture->topic = NULL;
    }
    if (neo4j_change_data_capture->schema) {
        neo4j_change_data_capture_schema_free(neo4j_change_data_capture->schema);
        neo4j_change_data_capture->schema = NULL;
    }
    if (neo4j_change_data_capture->payload) {
        neo4j_change_data_capture_payload_free(neo4j_change_data_capture->payload);
        neo4j_change_data_capture->payload = NULL;
    }
    free(neo4j_change_data_capture);
}

cJSON *neo4j_change_data_capture_convertToJSON(neo4j_change_data_capture_t *neo4j_change_data_capture) {
    cJSON *item = cJSON_CreateObject();

    // neo4j_change_data_capture->headers
    if (!neo4j_change_data_capture->headers) {
        goto fail;
    }
    cJSON *headers = cJSON_AddObjectToObject(item, "headers");
    if(headers == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = headers;
    listEntry_t *headersListEntry;
    if (neo4j_change_data_capture->headers) {
    list_ForEach(headersListEntry, neo4j_change_data_capture->headers) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)headersListEntry->data;
    }
    }


    // neo4j_change_data_capture->message_key
    if (!neo4j_change_data_capture->message_key) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message_key", neo4j_change_data_capture->message_key) == NULL) {
    goto fail; //String
    }


    // neo4j_change_data_capture->meta
    if (!neo4j_change_data_capture->meta) {
        goto fail;
    }
    cJSON *meta_local_JSON = neo4j_change_data_capture_meta_convertToJSON(neo4j_change_data_capture->meta);
    if(meta_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "meta", meta_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // neo4j_change_data_capture->offset
    if (!neo4j_change_data_capture->offset) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "offset", neo4j_change_data_capture->offset) == NULL) {
    goto fail; //Numeric
    }


    // neo4j_change_data_capture->partition
    if (!neo4j_change_data_capture->partition) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "partition", neo4j_change_data_capture->partition) == NULL) {
    goto fail; //Numeric
    }


    // neo4j_change_data_capture->source_type
    if (!neo4j_change_data_capture->source_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "source_type", neo4j_change_data_capture->source_type) == NULL) {
    goto fail; //String
    }


    // neo4j_change_data_capture->timestamp
    if (!neo4j_change_data_capture->timestamp) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "timestamp", neo4j_change_data_capture->timestamp) == NULL) {
    goto fail; //Date-Time
    }


    // neo4j_change_data_capture->topic
    if (!neo4j_change_data_capture->topic) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "topic", neo4j_change_data_capture->topic) == NULL) {
    goto fail; //String
    }


    // neo4j_change_data_capture->schema
    if (!neo4j_change_data_capture->schema) {
        goto fail;
    }
    cJSON *schema_local_JSON = neo4j_change_data_capture_schema_convertToJSON(neo4j_change_data_capture->schema);
    if(schema_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "schema", schema_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // neo4j_change_data_capture->payload
    if (!neo4j_change_data_capture->payload) {
        goto fail;
    }
    cJSON *payload_local_JSON = neo4j_change_data_capture_payload_convertToJSON(neo4j_change_data_capture->payload);
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

neo4j_change_data_capture_t *neo4j_change_data_capture_parseFromJSON(cJSON *neo4j_change_data_captureJSON){

    neo4j_change_data_capture_t *neo4j_change_data_capture_local_var = NULL;

    // define the local map for neo4j_change_data_capture->headers
    list_t *headersList = NULL;

    // define the local variable for neo4j_change_data_capture->meta
    neo4j_change_data_capture_meta_t *meta_local_nonprim = NULL;

    // define the local variable for neo4j_change_data_capture->schema
    neo4j_change_data_capture_schema_t *schema_local_nonprim = NULL;

    // define the local variable for neo4j_change_data_capture->payload
    neo4j_change_data_capture_payload_t *payload_local_nonprim = NULL;

    // neo4j_change_data_capture->headers
    cJSON *headers = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_captureJSON, "headers");
    if (!headers) {
        goto end;
    }

    
    cJSON *headers_local_map = NULL;
    if(!cJSON_IsObject(headers) && !cJSON_IsNull(headers))
    {
        goto end;//primitive map container
    }
    if(cJSON_IsObject(headers))
    {
        headersList = list_createList();
        keyValuePair_t *localMapKeyPair;
        cJSON_ArrayForEach(headers_local_map, headers)
        {
            cJSON *localMapObject = headers_local_map;
            list_addElement(headersList , localMapKeyPair);
        }
    }

    // neo4j_change_data_capture->message_key
    cJSON *message_key = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_captureJSON, "message_key");
    if (!message_key) {
        goto end;
    }

    
    if(!cJSON_IsString(message_key))
    {
    goto end; //String
    }

    // neo4j_change_data_capture->meta
    cJSON *meta = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_captureJSON, "meta");
    if (!meta) {
        goto end;
    }

    
    meta_local_nonprim = neo4j_change_data_capture_meta_parseFromJSON(meta); //nonprimitive

    // neo4j_change_data_capture->offset
    cJSON *offset = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_captureJSON, "offset");
    if (!offset) {
        goto end;
    }

    
    if(!cJSON_IsNumber(offset))
    {
    goto end; //Numeric
    }

    // neo4j_change_data_capture->partition
    cJSON *partition = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_captureJSON, "partition");
    if (!partition) {
        goto end;
    }

    
    if(!cJSON_IsNumber(partition))
    {
    goto end; //Numeric
    }

    // neo4j_change_data_capture->source_type
    cJSON *source_type = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_captureJSON, "source_type");
    if (!source_type) {
        goto end;
    }

    
    if(!cJSON_IsString(source_type))
    {
    goto end; //String
    }

    // neo4j_change_data_capture->timestamp
    cJSON *timestamp = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_captureJSON, "timestamp");
    if (!timestamp) {
        goto end;
    }

    
    if(!cJSON_IsString(timestamp) && !cJSON_IsNull(timestamp))
    {
    goto end; //DateTime
    }

    // neo4j_change_data_capture->topic
    cJSON *topic = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_captureJSON, "topic");
    if (!topic) {
        goto end;
    }

    
    if(!cJSON_IsString(topic))
    {
    goto end; //String
    }

    // neo4j_change_data_capture->schema
    cJSON *schema = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_captureJSON, "schema");
    if (!schema) {
        goto end;
    }

    
    schema_local_nonprim = neo4j_change_data_capture_schema_parseFromJSON(schema); //nonprimitive

    // neo4j_change_data_capture->payload
    cJSON *payload = cJSON_GetObjectItemCaseSensitive(neo4j_change_data_captureJSON, "payload");
    if (!payload) {
        goto end;
    }

    
    payload_local_nonprim = neo4j_change_data_capture_payload_parseFromJSON(payload); //nonprimitive


    neo4j_change_data_capture_local_var = neo4j_change_data_capture_create (
        headersList,
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

    return neo4j_change_data_capture_local_var;
end:
    if (headersList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, headersList) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free(localKeyValue->key);
            localKeyValue->key = NULL;
            keyValuePair_free(localKeyValue);
            localKeyValue = NULL;
        }
        list_freeList(headersList);
        headersList = NULL;
    }
    if (meta_local_nonprim) {
        neo4j_change_data_capture_meta_free(meta_local_nonprim);
        meta_local_nonprim = NULL;
    }
    if (schema_local_nonprim) {
        neo4j_change_data_capture_schema_free(schema_local_nonprim);
        schema_local_nonprim = NULL;
    }
    if (payload_local_nonprim) {
        neo4j_change_data_capture_payload_free(payload_local_nonprim);
        payload_local_nonprim = NULL;
    }
    return NULL;

}
