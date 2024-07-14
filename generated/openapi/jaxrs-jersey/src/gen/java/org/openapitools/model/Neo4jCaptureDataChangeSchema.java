/*
 * Mindwm API
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Neo4jCaptureDataChangeSchema
 */
@JsonPropertyOrder({
  Neo4jCaptureDataChangeSchema.JSON_PROPERTY_CONSTRAINTS,
  Neo4jCaptureDataChangeSchema.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-07-14T10:09:10.277456772Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jCaptureDataChangeSchema   {
  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  private Map<String, Object> constraints = new HashMap<>();

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  private Map<String, Object> properties = new HashMap<>();

  public Neo4jCaptureDataChangeSchema constraints(Map<String, Object> constraints) {
    this.constraints = constraints;
    return this;
  }

  public Neo4jCaptureDataChangeSchema putConstraintsItem(String key, Object constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new HashMap<>();
    }
    this.constraints.put(key, constraintsItem);
    return this;
  }

  /**
   * Get constraints
   * @return constraints
   **/
  @JsonProperty(value = "constraints")
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
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Get properties
   * @return properties
   **/
  @JsonProperty(value = "properties")
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
