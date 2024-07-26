#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "touch.h"



touch_t *touch_create(
    list_t *ids
    ) {
    touch_t *touch_local_var = malloc(sizeof(touch_t));
    if (!touch_local_var) {
        return NULL;
    }
    touch_local_var->ids = ids;

    return touch_local_var;
}


void touch_free(touch_t *touch) {
    if(NULL == touch){
        return ;
    }
    listEntry_t *listEntry;
    if (touch->ids) {
        list_ForEach(listEntry, touch->ids) {
            free(listEntry->data);
        }
        list_freeList(touch->ids);
        touch->ids = NULL;
    }
    free(touch);
}

cJSON *touch_convertToJSON(touch_t *touch) {
    cJSON *item = cJSON_CreateObject();

    // touch->ids
    if (!touch->ids) {
        goto fail;
    }
    cJSON *ids = cJSON_AddArrayToObject(item, "ids");
    if(ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *idsListEntry;
    list_ForEach(idsListEntry, touch->ids) {
    if(cJSON_AddNumberToObject(ids, "", *(double *)idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

touch_t *touch_parseFromJSON(cJSON *touchJSON){

    touch_t *touch_local_var = NULL;

    // define the local list for touch->ids
    list_t *idsList = NULL;

    // touch->ids
    cJSON *ids = cJSON_GetObjectItemCaseSensitive(touchJSON, "ids");
    if (!ids) {
        goto end;
    }

    
    cJSON *ids_local = NULL;
    if(!cJSON_IsArray(ids)) {
        goto end;//primitive container
    }
    idsList = list_createList();

    cJSON_ArrayForEach(ids_local, ids)
    {
        if(!cJSON_IsNumber(ids_local))
        {
            goto end;
        }
        double *ids_local_value = (double *)calloc(1, sizeof(double));
        if(!ids_local_value)
        {
            goto end;
        }
        *ids_local_value = ids_local->valuedouble;
        list_addElement(idsList , ids_local_value);
    }


    touch_local_var = touch_create (
        idsList
        );

    return touch_local_var;
end:
    if (idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(idsList);
        idsList = NULL;
    }
    return NULL;

}
