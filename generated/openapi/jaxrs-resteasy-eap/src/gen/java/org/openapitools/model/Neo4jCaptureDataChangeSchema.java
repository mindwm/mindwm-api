package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-07-16T19:19:34.179761301Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jCaptureDataChangeSchema   {
  
  private Map<String, Object> constraints = new HashMap<>();
  private Map<String, Object> properties = new HashMap<>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("constraints")
  public Map<String, Object> getConstraints() {
    return constraints;
  }
  public void setConstraints(Map<String, Object> constraints) {
    this.constraints = constraints;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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

