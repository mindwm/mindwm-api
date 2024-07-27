package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Neo4jChangeDataCaptureNodePayload;
import org.openapitools.model.Neo4jChangeDataCaptureRelationshipPayload;
import org.openapitools.model.Neo4jChangeDataCaptureRelationshipPayloadEnd;

@Canonical
class Neo4jChangeDataCapturePayload {
    
    Object after
    
    String before
    
    String id
    
    String type
    
    Neo4jChangeDataCaptureRelationshipPayloadEnd end
    
    String label
    
    Neo4jChangeDataCaptureRelationshipPayloadEnd start
}
