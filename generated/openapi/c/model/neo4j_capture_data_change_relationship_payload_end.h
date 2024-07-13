/*
 * neo4j_capture_data_change_relationship_payload_end.h
 *
 * 
 */

#ifndef _neo4j_capture_data_change_relationship_payload_end_H_
#define _neo4j_capture_data_change_relationship_payload_end_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct neo4j_capture_data_change_relationship_payload_end_t neo4j_capture_data_change_relationship_payload_end_t;

#include "any_type.h"



typedef struct neo4j_capture_data_change_relationship_payload_end_t {
    char *id; // string
    list_t* ids; //map
    list_t *labels; //primitive container

} neo4j_capture_data_change_relationship_payload_end_t;

neo4j_capture_data_change_relationship_payload_end_t *neo4j_capture_data_change_relationship_payload_end_create(
    char *id,
    list_t* ids,
    list_t *labels
);

void neo4j_capture_data_change_relationship_payload_end_free(neo4j_capture_data_change_relationship_payload_end_t *neo4j_capture_data_change_relationship_payload_end);

neo4j_capture_data_change_relationship_payload_end_t *neo4j_capture_data_change_relationship_payload_end_parseFromJSON(cJSON *neo4j_capture_data_change_relationship_payload_endJSON);

cJSON *neo4j_capture_data_change_relationship_payload_end_convertToJSON(neo4j_capture_data_change_relationship_payload_end_t *neo4j_capture_data_change_relationship_payload_end);

#endif /* _neo4j_capture_data_change_relationship_payload_end_H_ */

