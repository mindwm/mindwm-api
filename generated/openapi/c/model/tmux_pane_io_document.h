/*
 * tmux_pane_io_document.h
 *
 * 
 */

#ifndef _tmux_pane_io_document_H_
#define _tmux_pane_io_document_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct tmux_pane_io_document_t tmux_pane_io_document_t;

#include "any_type.h"



typedef struct tmux_pane_io_document_t {
    char *input; // string
    char *output; // string
    char *ps1; // string

} tmux_pane_io_document_t;

tmux_pane_io_document_t *tmux_pane_io_document_create(
    char *input,
    char *output,
    char *ps1
);

void tmux_pane_io_document_free(tmux_pane_io_document_t *tmux_pane_io_document);

tmux_pane_io_document_t *tmux_pane_io_document_parseFromJSON(cJSON *tmux_pane_io_documentJSON);

cJSON *tmux_pane_io_document_convertToJSON(tmux_pane_io_document_t *tmux_pane_io_document);

#endif /* _tmux_pane_io_document_H_ */

