#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "vector2int.h"



vector2int_t *vector2int_create(
    double x,
    double y
    ) {
    vector2int_t *vector2int_local_var = malloc(sizeof(vector2int_t));
    if (!vector2int_local_var) {
        return NULL;
    }
    vector2int_local_var->x = x;
    vector2int_local_var->y = y;

    return vector2int_local_var;
}


void vector2int_free(vector2int_t *vector2int) {
    if(NULL == vector2int){
        return ;
    }
    listEntry_t *listEntry;
    free(vector2int);
}

cJSON *vector2int_convertToJSON(vector2int_t *vector2int) {
    cJSON *item = cJSON_CreateObject();

    // vector2int->x
    if (!vector2int->x) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "x", vector2int->x) == NULL) {
    goto fail; //Numeric
    }


    // vector2int->y
    if (!vector2int->y) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "y", vector2int->y) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

vector2int_t *vector2int_parseFromJSON(cJSON *vector2intJSON){

    vector2int_t *vector2int_local_var = NULL;

    // vector2int->x
    cJSON *x = cJSON_GetObjectItemCaseSensitive(vector2intJSON, "x");
    if (!x) {
        goto end;
    }

    
    if(!cJSON_IsNumber(x))
    {
    goto end; //Numeric
    }

    // vector2int->y
    cJSON *y = cJSON_GetObjectItemCaseSensitive(vector2intJSON, "y");
    if (!y) {
        goto end;
    }

    
    if(!cJSON_IsNumber(y))
    {
    goto end; //Numeric
    }


    vector2int_local_var = vector2int_create (
        x->valuedouble,
        y->valuedouble
        );

    return vector2int_local_var;
end:
    return NULL;

}
