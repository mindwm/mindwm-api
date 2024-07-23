package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.HashMap;

@Canonical
class IoDocument {
    /* Identifies the event. */
    String id
    
    String source
    /* The version of the CloudEvents specification which the event uses. */
    String specversion
    
    String type = "IoDocument"
    /* Content type of the data value. Must adhere to RFC 2046 format. */
    String datacontenttype
    /* Identifies the schema that data adheres to. */
    URI dataschema
    
    String subject = "IoDocument"
    /* Timestamp of when the occurrence happened. Must adhere to RFC 3339. */
    Date time
    /* The event payload. */
    Object data
    /* Base64 encoded event payload. Must adhere to RFC4648. */
    String dataBase64
}
