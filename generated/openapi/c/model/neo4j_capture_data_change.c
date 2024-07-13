#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "neo4j_capture_data_change.h"



neo4j_capture_data_change_t *neo4j_capture_data_change_create(
    list_t* headers,
    char *message_key,
    neo4j_capture_data_change_meta_t *meta,
    int offset,
    int partition,
    char *source_type,
    char *timestamp,
    char *topic,
    neo4j_capture_data_change_schema_t *schema,
    neo4j_capture_data_change_payload_t *payload
    ) {
    neo4j_capture_data_change_t *neo4j_capture_data_change_local_var = malloc(sizeof(neo4j_capture_data_change_t));
    if (!neo4j_capture_data_change_local_var) {
        return NULL;
    }
    neo4j_capture_data_change_local_var->headers = headers;
    neo4j_capture_data_change_local_var->message_key = message_key;
    neo4j_capture_data_change_local_var->meta = meta;
    neo4j_capture_data_change_local_var->offset = offset;
    neo4j_capture_data_change_local_var->partition = partition;
    neo4j_capture_data_change_local_var->source_type = source_type;
    neo4j_capture_data_change_local_var->timestamp = timestamp;
    neo4j_capture_data_change_local_var->topic = topic;
    neo4j_capture_data_change_local_var->schema = schema;
    neo4j_capture_data_change_local_var->payload = payload;

    return neo4j_capture_data_change_local_var;
}


void neo4j_capture_data_change_free(neo4j_capture_data_change_t *neo4j_capture_data_change) {
    if(NULL == neo4j_capture_data_change){
        return ;
    }
    listEntry_t *listEntry;
    if (neo4j_capture_data_change->headers) {
        list_ForEach(listEntry, neo4j_capture_data_change->headers) {
            keyValuePair_t *localKeyValue = (keyValuePair_t*) listEntry->data;
            free (localKeyValue->key);
            free (localKeyValue->value);
            keyValuePair_free(localKeyValue);
        }
        list_freeList(neo4j_capture_data_change->headers);
        neo4j_capture_data_change->headers = NULL;
    }
    if (neo4j_capture_data_change->message_key) {
        free(neo4j_capture_data_change->message_key);
        neo4j_capture_data_change->message_key = NULL;
    }
    if (neo4j_capture_data_change->meta) {
        neo4j_capture_data_change_meta_free(neo4j_capture_data_change->meta);
        neo4j_capture_data_change->meta = NULL;
    }
    if (neo4j_capture_data_change->source_type) {
        free(neo4j_capture_data_change->source_type);
        neo4j_capture_data_change->source_type = NULL;
    }
    if (neo4j_capture_data_change->timestamp) {
        free(neo4j_capture_data_change->timestamp);
        neo4j_capture_data_change->timestamp = NULL;
    }
    if (neo4j_capture_data_change->topic) {
        free(neo4j_capture_data_change->topic);
        neo4j_capture_data_change->topic = NULL;
    }
    if (neo4j_capture_data_change->schema) {
        neo4j_capture_data_change_schema_free(neo4j_capture_data_change->schema);
        neo4j_capture_data_change->schema = NULL;
    }
    if (neo4j_capture_data_change->payload) {
        neo4j_capture_data_change_payload_free(neo4j_capture_data_change->payload);
        neo4j_capture_data_change->payload = NULL;
    }
    free(neo4j_capture_data_change);
}

cJSON *neo4j_capture_data_change_convertToJSON(neo4j_capture_data_change_t *neo4j_capture_data_change) {
    cJSON *item = cJSON_CreateObject();

    // neo4j_capture_data_change->headers
    if (!neo4j_capture_data_change->headers) {
        goto fail;
    }
    cJSON *headers = cJSON_AddObjectToObject(item, "headers");
    if(headers == NULL) {
        goto fail; //primitive map container
    }
    cJSON *localMapObject = headers;
    listEntry_t *headersListEntry;
    if (neo4j_capture_data_change->headers) {
    list_ForEach(headersListEntry, neo4j_capture_data_change->headers) {
        keyValuePair_t *localKeyValue = (keyValuePair_t*)headersListEntry->data;
    }
    }


    // neo4j_capture_data_change->message_key
    if (!neo4j_capture_data_change->message_key) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message_key", neo4j_capture_data_change->message_key) == NULL) {
    goto fail; //String
    }


    // neo4j_capture_data_change->meta
    if (!neo4j_capture_data_change->meta) {
        goto fail;
    }
    cJSON *meta_local_JSON = neo4j_capture_data_change_meta_convertToJSON(neo4j_capture_data_change->meta);
    if(meta_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "meta", meta_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // neo4j_capture_data_change->offset
    if (!neo4j_capture_data_change->offset) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "offset", neo4j_capture_data_change->offset) == NULL) {
    goto fail; //Numeric
    }


    // neo4j_capture_data_change->partition
    if (!neo4j_capture_data_change->partition) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "partition", neo4j_capture_data_change->partition) == NULL) {
    goto fail; //Numeric
    }


    // neo4j_capture_data_change->source_type
    if (!neo4j_capture_data_change->source_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "source_type", neo4j_capture_data_change->source_type) == NULL) {
    goto fail; //String
    }


    // neo4j_capture_data_change->timestamp
    if (!neo4j_capture_data_change->timestamp) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "timestamp", neo4j_capture_data_change->timestamp) == NULL) {
    goto fail; //Date-Time
    }


    // neo4j_capture_data_change->topic
    if (!neo4j_capture_data_change->topic) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "topic", neo4j_capture_data_change->topic) == NULL) {
    goto fail; //String
    }


    // neo4j_capture_data_change->schema
    if (!neo4j_capture_data_change->schema) {
        goto fail;
    }
    cJSON *schema_local_JSON = neo4j_capture_data_change_schema_convertToJSON(neo4j_capture_data_change->schema);
    if(schema_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "schema", schema_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // neo4j_capture_data_change->payload
    if (!neo4j_capture_data_change->payload) {
        goto fail;
    }
    cJSON *payload_local_JSON = neo4j_capture_data_change_payload_convertToJSON(neo4j_capture_data_change->payload);
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

neo4j_capture_data_change_t *neo4j_capture_data_change_parseFromJSON(cJSON *neo4j_capture_data_changeJSON){

    neo4j_capture_data_change_t *neo4j_capture_data_change_local_var = NULL;

    // define the local map for neo4j_capture_data_change->headers
    list_t *headersList = NULL;

    // define the local variable for neo4j_capture_data_change->meta
    neo4j_capture_data_change_meta_t *meta_local_nonprim = NULL;

    // define the local variable for neo4j_capture_data_change->schema
    neo4j_capture_data_change_schema_t *schema_local_nonprim = NULL;

    // define the local variable for neo4j_capture_data_change->payload
    neo4j_capture_data_change_payload_t *payload_local_nonprim = NULL;

    // neo4j_capture_data_change->headers
    cJSON *headers = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_changeJSON, "headers");
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

    // neo4j_capture_data_change->message_key
    cJSON *message_key = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_changeJSON, "message_key");
    if (!message_key) {
        goto end;
    }

    
    if(!cJSON_IsString(message_key))
    {
    goto end; //String
    }

    // neo4j_capture_data_change->meta
    cJSON *meta = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_changeJSON, "meta");
    if (!meta) {
        goto end;
    }

    
    meta_local_nonprim = neo4j_capture_data_change_meta_parseFromJSON(meta); //nonprimitive

    // neo4j_capture_data_change->offset
    cJSON *offset = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_changeJSON, "offset");
    if (!offset) {
        goto end;
    }

    
    if(!cJSON_IsNumber(offset))
    {
    goto end; //Numeric
    }

    // neo4j_capture_data_change->partition
    cJSON *partition = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_changeJSON, "partition");
    if (!partition) {
        goto end;
    }

    
    if(!cJSON_IsNumber(partition))
    {
    goto end; //Numeric
    }

    // neo4j_capture_data_change->source_type
    cJSON *source_type = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_changeJSON, "source_type");
    if (!source_type) {
        goto end;
    }

    
    if(!cJSON_IsString(source_type))
    {
    goto end; //String
    }

    // neo4j_capture_data_change->timestamp
    cJSON *timestamp = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_changeJSON, "timestamp");
    if (!timestamp) {
        goto end;
    }

    
    if(!cJSON_IsString(timestamp) && !cJSON_IsNull(timestamp))
    {
    goto end; //DateTime
    }

    // neo4j_capture_data_change->topic
    cJSON *topic = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_changeJSON, "topic");
    if (!topic) {
        goto end;
    }

    
    if(!cJSON_IsString(topic))
    {
    goto end; //String
    }

    // neo4j_capture_data_change->schema
    cJSON *schema = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_changeJSON, "schema");
    if (!schema) {
        goto end;
    }

    
    schema_local_nonprim = neo4j_capture_data_change_schema_parseFromJSON(schema); //nonprimitive

    // neo4j_capture_data_change->payload
    cJSON *payload = cJSON_GetObjectItemCaseSensitive(neo4j_capture_data_changeJSON, "payload");
    if (!payload) {
        goto end;
    }

    
    payload_local_nonprim = neo4j_capture_data_change_payload_parseFromJSON(payload); //nonprimitive


    neo4j_capture_data_change_local_var = neo4j_capture_data_change_create (
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

    return neo4j_capture_data_change_local_var;
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
        neo4j_capture_data_change_meta_free(meta_local_nonprim);
        meta_local_nonprim = NULL;
    }
    if (schema_local_nonprim) {
        neo4j_capture_data_change_schema_free(schema_local_nonprim);
        schema_local_nonprim = NULL;
    }
    if (payload_local_nonprim) {
        neo4j_capture_data_change_payload_free(payload_local_nonprim);
        payload_local_nonprim = NULL;
    }
    return NULL;

}
