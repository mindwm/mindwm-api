package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import org.openapitools.model.Touch;

@Canonical
class TouchEvent {
    /* Identifies the event. */
    String id
    
    String source
    /* The version of the CloudEvents specification which the event uses. */
    String specversion
    
    String type = "touch"
    /* Content type of the data value. Must adhere to RFC 2046 format. */
    String datacontenttype
    /* Identifies the schema that data adheres to. */
    String dataschema
    
    String subject = "node"
    /* Timestamp of when the occurrence happened. Must adhere to RFC 3339. */
    Date time
    
    Touch data
    /* Base64 encoded event payload. Must adhere to RFC4648. */
    String dataBase64
    /* knative broker ttl, workaround for https://github.com/knative-extensions/eventing-natss/issues/518 */
    String knativebrokerttl = "255"
}
