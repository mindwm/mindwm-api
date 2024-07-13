package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Neo4jCaptureDataChangeRelationshipPayloadEnd;

@Canonical
class Neo4jCaptureDataChangeRelationshipPayload {
    
    Object after
    
    String before
    
    Neo4jCaptureDataChangeRelationshipPayloadEnd end
    
    String id
    
    String label
    
    Neo4jCaptureDataChangeRelationshipPayloadEnd start
    
    String type
}
