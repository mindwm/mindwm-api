package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Neo4jChangeDataCaptureNodePayloadAfter;

@Canonical
class Neo4jChangeDataCaptureNodePayload {
    
    Neo4jChangeDataCaptureNodePayloadAfter after
    
    String before
    
    String id
    
    String type
}
