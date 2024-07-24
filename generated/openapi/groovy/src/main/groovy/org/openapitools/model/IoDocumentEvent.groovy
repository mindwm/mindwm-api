package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import org.openapitools.model.IoDocument;

@Canonical
class IoDocumentEvent {
    /* Identifies the event. */
    String id
    
    String source
    /* The version of the CloudEvents specification which the event uses. */
    String specversion
    
    String type = "IoDocument"
    /* Content type of the data value. Must adhere to RFC 2046 format. */
    String datacontenttype
    /* Identifies the schema that data adheres to. */
    String dataschema
    
    String subject = "IoDocument"
    /* Timestamp of when the occurrence happened. Must adhere to RFC 3339. */
    Date time
    
    IoDocument data
    /* Base64 encoded event payload. Must adhere to RFC4648. */
    String dataBase64
}
