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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-07-14T10:08:58.185353528Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jCaptureDataChangeRelationshipPayloadEnd   {
  
  private String id;
  private Map<String, Object> ids = new HashMap<>();
  private List<String> labels = new ArrayList<>();

  /**
   */
  public Neo4jCaptureDataChangeRelationshipPayloadEnd id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   */
  public Neo4jCaptureDataChangeRelationshipPayloadEnd ids(Map<String, Object> ids) {
    this.ids = ids;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("ids")
  public Map<String, Object> getIds() {
    return ids;
  }
  public void setIds(Map<String, Object> ids) {
    this.ids = ids;
  }

  /**
   */
  public Neo4jCaptureDataChangeRelationshipPayloadEnd labels(List<String> labels) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Neo4jCaptureDataChangeRelationshipPayloadEnd neo4jCaptureDataChangeRelationshipPayloadEnd = (Neo4jCaptureDataChangeRelationshipPayloadEnd) o;
    return Objects.equals(id, neo4jCaptureDataChangeRelationshipPayloadEnd.id) &&
        Objects.equals(ids, neo4jCaptureDataChangeRelationshipPayloadEnd.ids) &&
        Objects.equals(labels, neo4jCaptureDataChangeRelationshipPayloadEnd.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ids, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jCaptureDataChangeRelationshipPayloadEnd {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

