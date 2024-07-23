package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;

@Canonical
class IoDocument {
    /* User input */
    String input
    /* Command output (mix of stdout & stderr) */
    String output
    /* ps1 (prompt) AFTER the input and output */
    String ps1
}
