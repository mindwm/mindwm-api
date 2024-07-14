package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Neo4jCaptureDataChange_schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-07-14T12:12:13.130293652Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jCaptureDataChangeSchema   {
  private @Valid Map<String, Object> constraints = new HashMap<>();
  private @Valid Map<String, Object> properties = new HashMap<>();

  /**
   **/
  public Neo4jCaptureDataChangeSchema constraints(Map<String, Object> constraints) {
    this.constraints = constraints;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("constraints")
  public Map<String, Object> getConstraints() {
    return constraints;
  }

  @JsonProperty("constraints")
  public void setConstraints(Map<String, Object> constraints) {
    this.constraints = constraints;
  }

  public Neo4jCaptureDataChangeSchema putConstraintsItem(String key, Object constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new HashMap<>();
    }

    this.constraints.put(key, constraintsItem);
    return this;
  }

  public Neo4jCaptureDataChangeSchema removeConstraintsItem(String key) {
    if (this.constraints != null) {
      this.constraints.remove(key);
    }

    return this;
  }
  /**
   **/
  public Neo4jCaptureDataChangeSchema properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public Map<String, Object> getProperties() {
    return properties;
  }

  @JsonProperty("properties")
  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  public Neo4jCaptureDataChangeSchema putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }

    this.properties.put(key, propertiesItem);
    return this;
  }

  public Neo4jCaptureDataChangeSchema removePropertiesItem(String key) {
    if (this.properties != null) {
      this.properties.remove(key);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

