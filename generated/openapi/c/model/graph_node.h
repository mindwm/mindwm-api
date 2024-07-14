/*
 * graph_node.h
 *
 * 
 */

#ifndef _graph_node_H_
#define _graph_node_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct graph_node_t graph_node_t;

#include "any_type.h"
#include "graph_node_all_of_data.h"

// Enum SOURCE for graph_node

typedef enum  { mindwm_api_graph_node_SOURCE_NULL = 0, mindwm_api_graph_node_SOURCE_graph.node, mindwm_api_graph_node_SOURCE_graph.relationship } mindwm_api_graph_node_SOURCE_e;

char* graph_node_source_ToString(mindwm_api_graph_node_SOURCE_e source);

mindwm_api_graph_node_SOURCE_e graph_node_source_FromString(char* source);

// Enum TYPE for graph_node

typedef enum  { mindwm_api_graph_node_TYPE_NULL = 0, mindwm_api_graph_node_TYPE_created, mindwm_api_graph_node_TYPE_updated, mindwm_api_graph_node_TYPE_deleted } mindwm_api_graph_node_TYPE_e;

char* graph_node_type_ToString(mindwm_api_graph_node_TYPE_e type);

mindwm_api_graph_node_TYPE_e graph_node_type_FromString(char* type);



typedef struct graph_node_t {
    char *id; // string
    mindwm_api_graph_node_SOURCE_e source; //enum
    char *specversion; // string
    mindwm_api_graph_node_TYPE_e type; //enum
    char *datacontenttype; // string
    char *dataschema; // string
    char *subject; // string
    char *time; //date time
    struct graph_node_all_of_data_t *data; //model
    char *data_base64; // string

} graph_node_t;

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
);

void graph_node_free(graph_node_t *graph_node);

graph_node_t *graph_node_parseFromJSON(cJSON *graph_nodeJSON);

cJSON *graph_node_convertToJSON(graph_node_t *graph_node);

#endif /* _graph_node_H_ */

