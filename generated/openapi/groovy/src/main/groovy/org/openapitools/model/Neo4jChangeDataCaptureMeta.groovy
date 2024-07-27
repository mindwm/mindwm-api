package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Neo4jChangeDataCaptureMetaSource;

@Canonical
class Neo4jChangeDataCaptureMeta {
    
    String operation
    
    Neo4jChangeDataCaptureMetaSource source
    
    Integer timestamp
    
    Integer txEventId
    
    Integer txEventsCount
    
    Integer txId
    
    String username
}
