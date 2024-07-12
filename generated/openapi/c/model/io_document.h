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
#include "tmux_pane_io_document.h"



typedef struct io_document_t {
    char *type; // string
    char *source; // string
    tmux_pane_io_document_t *data; // custom
    char *id; // string
    char *specversion; // string
    char *datacontenttype; // string
    char *dataschema; // string
    char *subject; // string
    char *time; //date time
    char *data_base64; // string

} io_document_t;

io_document_t *io_document_create(
    char *type,
    char *source,
    tmux_pane_io_document_t *data,
    char *id,
    char *specversion,
    char *datacontenttype,
    char *dataschema,
    char *subject,
    char *time,
    char *data_base64
);

void io_document_free(io_document_t *io_document);

io_document_t *io_document_parseFromJSON(cJSON *io_documentJSON);

cJSON *io_document_convertToJSON(io_document_t *io_document);

#endif /* _io_document_H_ */

