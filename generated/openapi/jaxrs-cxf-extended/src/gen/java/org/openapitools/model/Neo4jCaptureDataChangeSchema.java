package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Neo4jCaptureDataChangeSchema  {
  
  @ApiModelProperty(value = "")
  private Map<String, Object> constraints = new HashMap<>();

  @ApiModelProperty(value = "")
  private Map<String, Object> properties = new HashMap<>();
 /**
  * Get constraints
  * @return constraints
  */
  @JsonProperty("constraints")
  public Map<String, Object> getConstraints() {
    return constraints;
  }

  /**
   * Sets the <code>constraints</code> property.
   */
 public void setConstraints(Map<String, Object> constraints) {
    this.constraints = constraints;
  }

  /**
   * Sets the <code>constraints</code> property.
   */
  public Neo4jCaptureDataChangeSchema constraints(Map<String, Object> constraints) {
    this.constraints = constraints;
    return this;
  }

  /**
   * Puts a new item into the <code>constraints</code> map.
   */
  public Neo4jCaptureDataChangeSchema putConstraintsItem(String key, Object constraintsItem) {
    this.constraints.put(key, constraintsItem);
    return this;
  }

 /**
  * Get properties
  * @return properties
  */
  @JsonProperty("properties")
  public Map<String, Object> getProperties() {
    return properties;
  }

  /**
   * Sets the <code>properties</code> property.
   */
 public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  /**
   * Sets the <code>properties</code> property.
   */
  public Neo4jCaptureDataChangeSchema properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Puts a new item into the <code>properties</code> map.
   */
  public Neo4jCaptureDataChangeSchema putPropertiesItem(String key, Object propertiesItem) {
    this.properties.put(key, propertiesItem);
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
    Neo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema = (Neo4jCaptureDataChangeSchema) o;
    return Objects.equals(this.constraints, neo4jCaptureDataChangeSchema.constraints) &&
        Objects.equals(this.properties, neo4jCaptureDataChangeSchema.properties);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

