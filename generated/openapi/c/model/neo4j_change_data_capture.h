/*
 * neo4j_change_data_capture.h
 *
 * 
 */

#ifndef _neo4j_change_data_capture_H_
#define _neo4j_change_data_capture_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct neo4j_change_data_capture_t neo4j_change_data_capture_t;

#include "any_type.h"
#include "neo4j_change_data_capture_meta.h"
#include "neo4j_change_data_capture_payload.h"
#include "neo4j_change_data_capture_schema.h"



typedef struct neo4j_change_data_capture_t {
    list_t* headers; //map
    char *message_key; // string
    struct neo4j_change_data_capture_meta_t *meta; //model
    int offset; //numeric
    int partition; //numeric
    char *source_type; // string
    char *timestamp; //date time
    char *topic; // string
    struct neo4j_change_data_capture_schema_t *schema; //model
    struct neo4j_change_data_capture_payload_t *payload; //model

} neo4j_change_data_capture_t;

neo4j_change_data_capture_t *neo4j_change_data_capture_create(
    list_t* headers,
    char *message_key,
    neo4j_change_data_capture_meta_t *meta,
    int offset,
    int partition,
    char *source_type,
    char *timestamp,
    char *topic,
    neo4j_change_data_capture_schema_t *schema,
    neo4j_change_data_capture_payload_t *payload
);

void neo4j_change_data_capture_free(neo4j_change_data_capture_t *neo4j_change_data_capture);

neo4j_change_data_capture_t *neo4j_change_data_capture_parseFromJSON(cJSON *neo4j_change_data_captureJSON);

cJSON *neo4j_change_data_capture_convertToJSON(neo4j_change_data_capture_t *neo4j_change_data_capture);

#endif /* _neo4j_change_data_capture_H_ */

