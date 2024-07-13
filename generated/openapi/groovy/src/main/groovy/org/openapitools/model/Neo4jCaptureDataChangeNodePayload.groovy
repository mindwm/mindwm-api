package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Neo4jCaptureDataChangeNodePayloadAfter;

@Canonical
class Neo4jCaptureDataChangeNodePayload {
    
    Neo4jCaptureDataChangeNodePayloadAfter after
    
    String before
    
    String id
    
    String type
}
