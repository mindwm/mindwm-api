/*
 * graph_relationship_all_of_data.h
 *
 * 
 */

#ifndef _graph_relationship_all_of_data_H_
#define _graph_relationship_all_of_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct graph_relationship_all_of_data_t graph_relationship_all_of_data_t;

#include "neo4j_capture_data_change_meta.h"
#include "neo4j_capture_data_change_relationship_payload.h"
#include "neo4j_capture_data_change_schema.h"
#include "object.h"



typedef struct graph_relationship_all_of_data_t {
    object_t *headers; //object
    char *message_key; // string
    struct neo4j_capture_data_change_meta_t *meta; //model
    int offset; //numeric
    int partition; //numeric
    char *source_type; // string
    char *timestamp; //date time
    char *topic; // string
    struct neo4j_capture_data_change_schema_t *schema; //model
    struct neo4j_capture_data_change_relationship_payload_t *payload; //model

} graph_relationship_all_of_data_t;

graph_relationship_all_of_data_t *graph_relationship_all_of_data_create(
    object_t *headers,
    char *message_key,
    neo4j_capture_data_change_meta_t *meta,
    int offset,
    int partition,
    char *source_type,
    char *timestamp,
    char *topic,
    neo4j_capture_data_change_schema_t *schema,
    neo4j_capture_data_change_relationship_payload_t *payload
);

void graph_relationship_all_of_data_free(graph_relationship_all_of_data_t *graph_relationship_all_of_data);

graph_relationship_all_of_data_t *graph_relationship_all_of_data_parseFromJSON(cJSON *graph_relationship_all_of_dataJSON);

cJSON *graph_relationship_all_of_data_convertToJSON(graph_relationship_all_of_data_t *graph_relationship_all_of_data);

#endif /* _graph_relationship_all_of_data_H_ */

