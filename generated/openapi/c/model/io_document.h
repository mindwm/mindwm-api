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



typedef struct io_document_t {
    char *input; // string
    char *output; // string
    char *ps1; // string

} io_document_t;

io_document_t *io_document_create(
    char *input,
    char *output,
    char *ps1
);

void io_document_free(io_document_t *io_document);

io_document_t *io_document_parseFromJSON(cJSON *io_documentJSON);

cJSON *io_document_convertToJSON(io_document_t *io_document);

#endif /* _io_document_H_ */

