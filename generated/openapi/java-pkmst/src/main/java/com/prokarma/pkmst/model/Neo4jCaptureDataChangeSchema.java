package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Neo4jCaptureDataChangeSchema
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-07-14T08:10:44.976376375Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jCaptureDataChangeSchema   {
  @JsonProperty("constraints")
  
  private Map<String, Object> constraints = null;

  @JsonProperty("properties")
  
  private Map<String, Object> properties = null;

  public Neo4jCaptureDataChangeSchema constraints(Map<String, Object> constraints) {
    this.constraints = constraints;
    return this;
  }

  public Neo4jCaptureDataChangeSchema putConstraintsItem(String key, Object constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new HashMap<>());
    }
    this.constraints.put(key, constraintsItem);
    return this;
  }

  /**
   * Get constraints
   * @return constraints
   */
  @ApiModelProperty(value = "")
  public Map<String, Object> getConstraints() {
    return constraints;
  }

  public void setConstraints(Map<String, Object> constraints) {
    this.constraints = constraints;
  }

  public Neo4jCaptureDataChangeSchema properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

  public Neo4jCaptureDataChangeSchema putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>());
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Get properties
   * @return properties
   */
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

