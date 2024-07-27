package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

@Canonical
class Neo4jChangeDataCaptureNodePayloadAfter {
    
    List<String> labels = new ArrayList<>()
    
    Map<String, Object> properties = new HashMap<>()
}
