/*
 * neo4j_capture_data_change_schema.h
 *
 * 
 */

#ifndef _neo4j_capture_data_change_schema_H_
#define _neo4j_capture_data_change_schema_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct neo4j_capture_data_change_schema_t neo4j_capture_data_change_schema_t;

#include "any_type.h"



typedef struct neo4j_capture_data_change_schema_t {
    list_t* constraints; //map
    list_t* properties; //map

} neo4j_capture_data_change_schema_t;

neo4j_capture_data_change_schema_t *neo4j_capture_data_change_schema_create(
    list_t* constraints,
    list_t* properties
);

void neo4j_capture_data_change_schema_free(neo4j_capture_data_change_schema_t *neo4j_capture_data_change_schema);

neo4j_capture_data_change_schema_t *neo4j_capture_data_change_schema_parseFromJSON(cJSON *neo4j_capture_data_change_schemaJSON);

cJSON *neo4j_capture_data_change_schema_convertToJSON(neo4j_capture_data_change_schema_t *neo4j_capture_data_change_schema);

#endif /* _neo4j_capture_data_change_schema_H_ */

