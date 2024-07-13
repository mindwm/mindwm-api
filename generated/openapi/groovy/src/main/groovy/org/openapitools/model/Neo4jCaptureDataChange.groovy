package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import org.openapitools.model.Neo4jCaptureDataChangeMeta;
import org.openapitools.model.Neo4jCaptureDataChangePayload;
import org.openapitools.model.Neo4jCaptureDataChangeSchema;

@Canonical
class Neo4jCaptureDataChange {
    
    Map<String, Object> headers = new HashMap<>()
    
    String messageKey
    
    Neo4jCaptureDataChangeMeta meta
    
    Integer offset
    
    Integer partition
    
    String sourceType
    
    Date timestamp
    
    String topic
    
    Neo4jCaptureDataChangeSchema schema
    
    Neo4jCaptureDataChangePayload payload
}
