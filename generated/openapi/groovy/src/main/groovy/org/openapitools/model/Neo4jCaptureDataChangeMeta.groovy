package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Neo4jCaptureDataChangeMetaSource;

@Canonical
class Neo4jCaptureDataChangeMeta {
    
    String operation
    
    Neo4jCaptureDataChangeMetaSource source
    
    Integer timestamp
    
    Integer txEventId
    
    Integer txEventsCount
    
    Integer txId
    
    String username
}
