/*
 * neo4j_change_data_capture_relationship_payload.h
 *
 * 
 */

#ifndef _neo4j_change_data_capture_relationship_payload_H_
#define _neo4j_change_data_capture_relationship_payload_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct neo4j_change_data_capture_relationship_payload_t neo4j_change_data_capture_relationship_payload_t;

#include "neo4j_change_data_capture_relationship_payload_end.h"
#include "object.h"



typedef struct neo4j_change_data_capture_relationship_payload_t {
    object_t *after; //object
    char *before; // string
    struct neo4j_change_data_capture_relationship_payload_end_t *end; //model
    char *id; // string
    char *label; // string
    struct neo4j_change_data_capture_relationship_payload_end_t *start; //model
    char *type; // string

} neo4j_change_data_capture_relationship_payload_t;

neo4j_change_data_capture_relationship_payload_t *neo4j_change_data_capture_relationship_payload_create(
    object_t *after,
    char *before,
    neo4j_change_data_capture_relationship_payload_end_t *end,
    char *id,
    char *label,
    neo4j_change_data_capture_relationship_payload_end_t *start,
    char *type
);

void neo4j_change_data_capture_relationship_payload_free(neo4j_change_data_capture_relationship_payload_t *neo4j_change_data_capture_relationship_payload);

neo4j_change_data_capture_relationship_payload_t *neo4j_change_data_capture_relationship_payload_parseFromJSON(cJSON *neo4j_change_data_capture_relationship_payloadJSON);

cJSON *neo4j_change_data_capture_relationship_payload_convertToJSON(neo4j_change_data_capture_relationship_payload_t *neo4j_change_data_capture_relationship_payload);

#endif /* _neo4j_change_data_capture_relationship_payload_H_ */

