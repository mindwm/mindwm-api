package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Neo4jCaptureDataChangeSchema   {
  
  private Map<String, Object> constraints = new HashMap<>();
  private Map<String, Object> properties = new HashMap<>();

  public Neo4jCaptureDataChangeSchema () {

  }

  public Neo4jCaptureDataChangeSchema (Map<String, Object> constraints, Map<String, Object> properties) {
    this.constraints = constraints;
    this.properties = properties;
  }

    
  @JsonProperty("constraints")
  public Map<String, Object> getConstraints() {
    return constraints;
  }
  public void setConstraints(Map<String, Object> constraints) {
    this.constraints = constraints;
  }

    
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
    Neo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema = (Neo4jCaptureDataChangeSchema) o;
    return Objects.equals(constraints, neo4jCaptureDataChangeSchema.constraints) &&
        Objects.equals(properties, neo4jCaptureDataChangeSchema.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraints, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jCaptureDataChangeSchema {\n");
    
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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