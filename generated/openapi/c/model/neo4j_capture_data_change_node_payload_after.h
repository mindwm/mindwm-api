/*
 * neo4j_capture_data_change_node_payload_after.h
 *
 * 
 */

#ifndef _neo4j_capture_data_change_node_payload_after_H_
#define _neo4j_capture_data_change_node_payload_after_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct neo4j_capture_data_change_node_payload_after_t neo4j_capture_data_change_node_payload_after_t;

#include "any_type.h"



typedef struct neo4j_capture_data_change_node_payload_after_t {
    list_t *labels; //primitive container
    list_t* properties; //map

} neo4j_capture_data_change_node_payload_after_t;

neo4j_capture_data_change_node_payload_after_t *neo4j_capture_data_change_node_payload_after_create(
    list_t *labels,
    list_t* properties
);

void neo4j_capture_data_change_node_payload_after_free(neo4j_capture_data_change_node_payload_after_t *neo4j_capture_data_change_node_payload_after);

neo4j_capture_data_change_node_payload_after_t *neo4j_capture_data_change_node_payload_after_parseFromJSON(cJSON *neo4j_capture_data_change_node_payload_afterJSON);

cJSON *neo4j_capture_data_change_node_payload_after_convertToJSON(neo4j_capture_data_change_node_payload_after_t *neo4j_capture_data_change_node_payload_after);

#endif /* _neo4j_capture_data_change_node_payload_after_H_ */

