package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Neo4jChangeDataCaptureSchema
 */

@JsonTypeName("Neo4jChangeDataCapture_schema")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-31T09:13:05.321170795Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jChangeDataCaptureSchema {

  @Valid
  private Map<String, Object> constraints = new HashMap<>();

  @Valid
  private Map<String, Object> properties = new HashMap<>();

  public Neo4jChangeDataCaptureSchema constraints(Map<String, Object> constraints) {
    this.constraints = constraints;
    return this;
  }

  public Neo4jChangeDataCaptureSchema putConstraintsItem(String key, Object constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new HashMap<>();
    }
    this.constraints.put(key, constraintsItem);
    return this;
  }

  /**
   * Get constraints
   * @return constraints
   */
  
  @Schema(name = "constraints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("constraints")
  public Map<String, Object> getConstraints() {
    return constraints;
  }

  public void setConstraints(Map<String, Object> constraints) {
    this.constraints = constraints;
  }

  public Neo4jChangeDataCaptureSchema properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

  public Neo4jChangeDataCaptureSchema putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Get properties
   * @return properties
   */
  
  @Schema(name = "properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    Neo4jChangeDataCaptureSchema neo4jChangeDataCaptureSchema = (Neo4jChangeDataCaptureSchema) o;
    return Objects.equals(this.constraints, neo4jChangeDataCaptureSchema.constraints) &&
        Objects.equals(this.properties, neo4jChangeDataCaptureSchema.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraints, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jChangeDataCaptureSchema {\n");
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

