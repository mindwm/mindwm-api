/*
 * cloud_event_data.h
 *
 * The event payload.
 */

#ifndef _cloud_event_data_H_
#define _cloud_event_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct cloud_event_data_t cloud_event_data_t;




typedef struct cloud_event_data_t {

} cloud_event_data_t;

cloud_event_data_t *cloud_event_data_create(
);

void cloud_event_data_free(cloud_event_data_t *cloud_event_data);

cloud_event_data_t *cloud_event_data_parseFromJSON(cJSON *cloud_event_dataJSON);

cJSON *cloud_event_data_convertToJSON(cloud_event_data_t *cloud_event_data);

#endif /* _cloud_event_data_H_ */

