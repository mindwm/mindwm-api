/*
 * neo4j_capture_data_change_meta.h
 *
 * 
 */

#ifndef _neo4j_capture_data_change_meta_H_
#define _neo4j_capture_data_change_meta_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct neo4j_capture_data_change_meta_t neo4j_capture_data_change_meta_t;

#include "neo4j_capture_data_change_meta_source.h"



typedef struct neo4j_capture_data_change_meta_t {
    char *operation; // string
    struct neo4j_capture_data_change_meta_source_t *source; //model
    int timestamp; //numeric
    int tx_event_id; //numeric
    int tx_events_count; //numeric
    int tx_id; //numeric
    char *username; // string

} neo4j_capture_data_change_meta_t;

neo4j_capture_data_change_meta_t *neo4j_capture_data_change_meta_create(
    char *operation,
    neo4j_capture_data_change_meta_source_t *source,
    int timestamp,
    int tx_event_id,
    int tx_events_count,
    int tx_id,
    char *username
);

void neo4j_capture_data_change_meta_free(neo4j_capture_data_change_meta_t *neo4j_capture_data_change_meta);

neo4j_capture_data_change_meta_t *neo4j_capture_data_change_meta_parseFromJSON(cJSON *neo4j_capture_data_change_metaJSON);

cJSON *neo4j_capture_data_change_meta_convertToJSON(neo4j_capture_data_change_meta_t *neo4j_capture_data_change_meta);

#endif /* _neo4j_capture_data_change_meta_H_ */

