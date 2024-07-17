/*
 * Mindwm API
 *
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * OpenAPI document version: 0.1.0
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-07-17T14:05:10.943134242Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jCaptureDataChangeNodePayloadAfter   {
  
  private List<String> labels = new ArrayList<>();
  private Map<String, Object> properties = new HashMap<>();

  /**
   */
  public Neo4jCaptureDataChangeNodePayloadAfter labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("labels")
  public List<String> getLabels() {
    return labels;
  }
  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  /**
   */
  public Neo4jCaptureDataChangeNodePayloadAfter properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("properties")
  public Map<String, Object> getProperties() {
    return properties;
  }
  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Neo4jCaptureDataChangeNodePayloadAfter neo4jCaptureDataChangeNodePayloadAfter = (Neo4jCaptureDataChangeNodePayloadAfter) o;
    return Objects.equals(labels, neo4jCaptureDataChangeNodePayloadAfter.labels) &&
        Objects.equals(properties, neo4jCaptureDataChangeNodePayloadAfter.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jCaptureDataChangeNodePayloadAfter {\n");
    
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

