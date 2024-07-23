/*
 * io_document.h
 *
 * 
 */

#ifndef _io_document_H_
#define _io_document_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct io_document_t io_document_t;

#include "any_type.h"
#include "object.h"



typedef struct io_document_t {
    char *id; // string
    char *source; // string
    char *specversion; // string
    char *type; // string
    char *datacontenttype; // string
    char *dataschema; // string
    char *subject; // string
    char *time; //date time
    object_t *data; //object
    char *data_base64; // string

} io_document_t;

io_document_t *io_document_create(
    char *id,
    char *source,
    char *specversion,
    char *type,
    char *datacontenttype,
    char *dataschema,
    char *subject,
    char *time,
    object_t *data,
    char *data_base64
);

void io_document_free(io_document_t *io_document);

io_document_t *io_document_parseFromJSON(cJSON *io_documentJSON);

cJSON *io_document_convertToJSON(io_document_t *io_document);

#endif /* _io_document_H_ */

