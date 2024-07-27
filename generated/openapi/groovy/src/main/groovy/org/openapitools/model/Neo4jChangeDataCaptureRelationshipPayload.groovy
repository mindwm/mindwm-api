package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Neo4jChangeDataCaptureRelationshipPayloadEnd;

@Canonical
class Neo4jChangeDataCaptureRelationshipPayload {
    
    Object after
    
    String before
    
    Neo4jChangeDataCaptureRelationshipPayloadEnd end
    
    String id
    
    String label
    
    Neo4jChangeDataCaptureRelationshipPayloadEnd start
    
    String type
}
