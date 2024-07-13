package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Neo4jCaptureDataChangeMeta;
import org.openapitools.model.Neo4jCaptureDataChangeNodePayload;
import org.openapitools.model.Neo4jCaptureDataChangeSchema;

@Canonical
class GraphNodeAllOfData {
    
    Object headers
    
    String messageKey
    
    Neo4jCaptureDataChangeMeta meta
    
    Integer offset
    
    Integer partition
    
    String sourceType
    
    Date timestamp
    
    String topic
    
    Neo4jCaptureDataChangeSchema schema
    
    Neo4jCaptureDataChangeNodePayload payload
}
