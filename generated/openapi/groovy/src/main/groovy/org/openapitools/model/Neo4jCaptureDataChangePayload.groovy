package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Neo4jCaptureDataChangeNodePayload;
import org.openapitools.model.Neo4jCaptureDataChangeRelationshipPayload;
import org.openapitools.model.Neo4jCaptureDataChangeRelationshipPayloadEnd;

@Canonical
class Neo4jCaptureDataChangePayload {
    
    Object after
    
    String before
    
    String id
    
    String type
    
    Neo4jCaptureDataChangeRelationshipPayloadEnd end
    
    String label
    
    Neo4jCaptureDataChangeRelationshipPayloadEnd start
}
