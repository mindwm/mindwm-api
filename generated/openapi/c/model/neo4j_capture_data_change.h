/*
 * neo4j_capture_data_change.h
 *
 * 
 */

#ifndef _neo4j_capture_data_change_H_
#define _neo4j_capture_data_change_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct neo4j_capture_data_change_t neo4j_capture_data_change_t;

#include "any_type.h"
#include "neo4j_capture_data_change_meta.h"
#include "neo4j_capture_data_change_payload.h"
#include "neo4j_capture_data_change_schema.h"



typedef struct neo4j_capture_data_change_t {
    list_t* headers; //map
    char *message_key; // string
    struct neo4j_capture_data_change_meta_t *meta; //model
    int offset; //numeric
    int partition; //numeric
    char *source_type; // string
    char *timestamp; //date time
    char *topic; // string
    struct neo4j_capture_data_change_schema_t *schema; //model
    struct neo4j_capture_data_change_payload_t *payload; //model

} neo4j_capture_data_change_t;

neo4j_capture_data_change_t *neo4j_capture_data_change_create(
    list_t* headers,
    char *message_key,
    neo4j_capture_data_change_meta_t *meta,
    int offset,
    int partition,
    char *source_type,
    char *timestamp,
    char *topic,
    neo4j_capture_data_change_schema_t *schema,
    neo4j_capture_data_change_payload_t *payload
);

void neo4j_capture_data_change_free(neo4j_capture_data_change_t *neo4j_capture_data_change);

neo4j_capture_data_change_t *neo4j_capture_data_change_parseFromJSON(cJSON *neo4j_capture_data_changeJSON);

cJSON *neo4j_capture_data_change_convertToJSON(neo4j_capture_data_change_t *neo4j_capture_data_change);

#endif /* _neo4j_capture_data_change_H_ */

