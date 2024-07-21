package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;

@Canonical
class CloudEvent {
    /* Identifies the event. */
    String id
    /* Identifies the context in which an event happened. */
    String source
    /* The version of the CloudEvents specification which the event uses. */
    String specversion
    /* Describes the type of event related to the originating occurrence. */
    String type
    /* Content type of the data value. Must adhere to RFC 2046 format. */
    String datacontenttype
    /* Identifies the schema that data adheres to. */
    URI dataschema
    /* Describes the subject of the event in the context of the event producer (identified by source). */
    String subject
    /* Timestamp of when the occurrence happened. Must adhere to RFC 3339. */
    Date time
    /* The event payload. */
    Object data
    /* Base64 encoded event payload. Must adhere to RFC4648. */
    String dataBase64
}
