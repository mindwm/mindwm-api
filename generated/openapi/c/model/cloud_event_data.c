#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cloud_event_data.h"



cloud_event_data_t *cloud_event_data_create(
    ) {
    cloud_event_data_t *cloud_event_data_local_var = malloc(sizeof(cloud_event_data_t));
    if (!cloud_event_data_local_var) {
        return NULL;
    }

    return cloud_event_data_local_var;
}


void cloud_event_data_free(cloud_event_data_t *cloud_event_data) {
    if(NULL == cloud_event_data){
        return ;
    }
    listEntry_t *listEntry;
    free(cloud_event_data);
}

cJSON *cloud_event_data_convertToJSON(cloud_event_data_t *cloud_event_data) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

cloud_event_data_t *cloud_event_data_parseFromJSON(cJSON *cloud_event_dataJSON){

    cloud_event_data_t *cloud_event_data_local_var = NULL;


    cloud_event_data_local_var = cloud_event_data_create (
        );

    return cloud_event_data_local_var;
end:
    return NULL;

}
