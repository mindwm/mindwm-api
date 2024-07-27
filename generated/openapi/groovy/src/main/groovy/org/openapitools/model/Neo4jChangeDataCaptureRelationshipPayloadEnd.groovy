package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

@Canonical
class Neo4jChangeDataCaptureRelationshipPayloadEnd {
    
    String id
    
    Map<String, Object> ids = new HashMap<>()
    
    List<String> labels = new ArrayList<>()
}
