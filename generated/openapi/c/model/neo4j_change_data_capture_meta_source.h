/*
 * neo4j_change_data_capture_meta_source.h
 *
 * 
 */

#ifndef _neo4j_change_data_capture_meta_source_H_
#define _neo4j_change_data_capture_meta_source_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct neo4j_change_data_capture_meta_source_t neo4j_change_data_capture_meta_source_t;




typedef struct neo4j_change_data_capture_meta_source_t {
    char *hostname; // string

} neo4j_change_data_capture_meta_source_t;

neo4j_change_data_capture_meta_source_t *neo4j_change_data_capture_meta_source_create(
    char *hostname
);

void neo4j_change_data_capture_meta_source_free(neo4j_change_data_capture_meta_source_t *neo4j_change_data_capture_meta_source);

neo4j_change_data_capture_meta_source_t *neo4j_change_data_capture_meta_source_parseFromJSON(cJSON *neo4j_change_data_capture_meta_sourceJSON);

cJSON *neo4j_change_data_capture_meta_source_convertToJSON(neo4j_change_data_capture_meta_source_t *neo4j_change_data_capture_meta_source);

#endif /* _neo4j_change_data_capture_meta_source_H_ */

