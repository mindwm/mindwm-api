package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import org.openapitools.model.Neo4jChangeDataCaptureMeta;
import org.openapitools.model.Neo4jChangeDataCapturePayload;
import org.openapitools.model.Neo4jChangeDataCaptureSchema;

@Canonical
class Neo4jChangeDataCapture {
    
    Map<String, Object> headers = new HashMap<>()
    
    String messageKey
    
    Neo4jChangeDataCaptureMeta meta
    
    Integer offset
    
    Integer partition
    
    String sourceType
    
    Date timestamp
    
    String topic
    
    Neo4jChangeDataCaptureSchema schema
    
    Neo4jChangeDataCapturePayload payload
}
