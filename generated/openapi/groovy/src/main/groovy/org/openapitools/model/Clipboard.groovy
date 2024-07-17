package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.HashMap;
import org.openapitools.model.ClipboardPayload;

@Canonical
class Clipboard {
    /* Identifies the event. */
    String id
    
    String source
    /* The version of the CloudEvents specification which the event uses. */
    String specversion
    
    String type
    /* Content type of the data value. Must adhere to RFC 2046 format. */
    String datacontenttype
    /* Identifies the schema that data adheres to. */
    URI dataschema
    
    String subject
    /* Timestamp of when the occurrence happened. Must adhere to RFC 3339. */
    Date time
    
    ClipboardPayload data
    /* Base64 encoded event payload. Must adhere to RFC4648. */
    String dataBase64
}
