/*
 * io_document_event.h
 *
 * 
 */

#ifndef _io_document_event_H_
#define _io_document_event_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct io_document_event_t io_document_event_t;

#include "any_type.h"
#include "io_document.h"



typedef struct io_document_event_t {
    char *id; // string
    char *source; // string
    char *specversion; // string
    char *type; // string
    char *datacontenttype; // string
    char *dataschema; // string
    char *subject; // string
    char *time; //date time
    io_document_t *data; // custom
    char *data_base64; // string
    char *knativebrokerttl; // string

} io_document_event_t;

io_document_event_t *io_document_event_create(
    char *id,
    char *source,
    char *specversion,
    char *type,
    char *datacontenttype,
    char *dataschema,
    char *subject,
    char *time,
    io_document_t *data,
    char *data_base64,
    char *knativebrokerttl
);

void io_document_event_free(io_document_event_t *io_document_event);

io_document_event_t *io_document_event_parseFromJSON(cJSON *io_document_eventJSON);

cJSON *io_document_event_convertToJSON(io_document_event_t *io_document_event);

#endif /* _io_document_event_H_ */

