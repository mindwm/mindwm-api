/*
 * neo4j_change_data_capture_node_payload.h
 *
 * 
 */

#ifndef _neo4j_change_data_capture_node_payload_H_
#define _neo4j_change_data_capture_node_payload_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct neo4j_change_data_capture_node_payload_t neo4j_change_data_capture_node_payload_t;

#include "neo4j_change_data_capture_node_payload_after.h"



typedef struct neo4j_change_data_capture_node_payload_t {
    struct neo4j_change_data_capture_node_payload_after_t *after; //model
    char *before; // string
    char *id; // string
    char *type; // string

} neo4j_change_data_capture_node_payload_t;

neo4j_change_data_capture_node_payload_t *neo4j_change_data_capture_node_payload_create(
    neo4j_change_data_capture_node_payload_after_t *after,
    char *before,
    char *id,
    char *type
);

void neo4j_change_data_capture_node_payload_free(neo4j_change_data_capture_node_payload_t *neo4j_change_data_capture_node_payload);

neo4j_change_data_capture_node_payload_t *neo4j_change_data_capture_node_payload_parseFromJSON(cJSON *neo4j_change_data_capture_node_payloadJSON);

cJSON *neo4j_change_data_capture_node_payload_convertToJSON(neo4j_change_data_capture_node_payload_t *neo4j_change_data_capture_node_payload);

#endif /* _neo4j_change_data_capture_node_payload_H_ */

