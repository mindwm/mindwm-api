package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Neo4jCaptureDataChangeRelationshipPayloadEnd  {
  
  @ApiModelProperty(required = true, value = "")
  private String id;

  @ApiModelProperty(required = true, value = "")
  private Map<String, Object> ids = new HashMap<>();

  @ApiModelProperty(required = true, value = "")
  private List<String> labels = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Neo4jCaptureDataChangeRelationshipPayloadEnd id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get ids
   * @return ids
  **/
  @JsonProperty("ids")
  public Map<String, Object> getIds() {
    return ids;
  }

  public void setIds(Map<String, Object> ids) {
    this.ids = ids;
  }

  public Neo4jCaptureDataChangeRelationshipPayloadEnd ids(Map<String, Object> ids) {
    this.ids = ids;
    return this;
  }

  public Neo4jCaptureDataChangeRelationshipPayloadEnd putIdsItem(String key, Object idsItem) {
    this.ids.put(key, idsItem);
    return this;
  }

 /**
   * Get labels
   * @return labels
  **/
  @JsonProperty("labels")
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public Neo4jCaptureDataChangeRelationshipPayloadEnd labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public Neo4jCaptureDataChangeRelationshipPayloadEnd addLabelsItem(String labelsItem) {
    this.labels.add(labelsItem);
    return this;
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
    return Objects.equals(this.id, neo4jCaptureDataChangeRelationshipPayloadEnd.id) &&
        Objects.equals(this.ids, neo4jCaptureDataChangeRelationshipPayloadEnd.ids) &&
        Objects.equals(this.labels, neo4jCaptureDataChangeRelationshipPayloadEnd.labels);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
