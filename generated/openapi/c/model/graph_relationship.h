/*
 * graph_relationship.h
 *
 * 
 */

#ifndef _graph_relationship_H_
#define _graph_relationship_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct graph_relationship_t graph_relationship_t;

#include "any_type.h"
#include "graph_relationship_all_of_data.h"

// Enum SOURCE for graph_relationship

typedef enum  { mindwm_api_graph_relationship_SOURCE_NULL = 0, mindwm_api_graph_relationship_SOURCE_graph.relationship } mindwm_api_graph_relationship_SOURCE_e;

char* graph_relationship_source_ToString(mindwm_api_graph_relationship_SOURCE_e source);

mindwm_api_graph_relationship_SOURCE_e graph_relationship_source_FromString(char* source);

// Enum TYPE for graph_relationship

typedef enum  { mindwm_api_graph_relationship_TYPE_NULL = 0, mindwm_api_graph_relationship_TYPE_created, mindwm_api_graph_relationship_TYPE_updated, mindwm_api_graph_relationship_TYPE_deleted } mindwm_api_graph_relationship_TYPE_e;

char* graph_relationship_type_ToString(mindwm_api_graph_relationship_TYPE_e type);

mindwm_api_graph_relationship_TYPE_e graph_relationship_type_FromString(char* type);



typedef struct graph_relationship_t {
    char *id; // string
    mindwm_api_graph_relationship_SOURCE_e source; //enum
    char *specversion; // string
    mindwm_api_graph_relationship_TYPE_e type; //enum
    char *datacontenttype; // string
    char *dataschema; // string
    char *subject; // string
    char *time; //date time
    struct graph_relationship_all_of_data_t *data; //model
    char *data_base64; // string

} graph_relationship_t;

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
);

void graph_relationship_free(graph_relationship_t *graph_relationship);

graph_relationship_t *graph_relationship_parseFromJSON(cJSON *graph_relationshipJSON);

cJSON *graph_relationship_convertToJSON(graph_relationship_t *graph_relationship);

#endif /* _graph_relationship_H_ */

