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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Neo4jCaptureDataChangeNodePayloadAfter
 */
@JsonPropertyOrder({
  Neo4jCaptureDataChangeNodePayloadAfter.JSON_PROPERTY_LABELS,
  Neo4jCaptureDataChangeNodePayloadAfter.JSON_PROPERTY_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-07-14T12:12:07.388853331Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jCaptureDataChangeNodePayloadAfter   {
  public static final String JSON_PROPERTY_LABELS = "labels";
  @JsonProperty(JSON_PROPERTY_LABELS)
  private List<String> labels = new ArrayList<>();

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  private Map<String, Object> properties = new HashMap<>();

  public Neo4jCaptureDataChangeNodePayloadAfter labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public Neo4jCaptureDataChangeNodePayloadAfter addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
   **/
  @JsonProperty(value = "labels")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public Neo4jCaptureDataChangeNodePayloadAfter properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

  public Neo4jCaptureDataChangeNodePayloadAfter putPropertiesItem(String key, Object propertiesItem) {
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
  @ApiModelProperty(required = true, value = "")
  @NotNull 
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
    return Objects.equals(this.labels, neo4jCaptureDataChangeNodePayloadAfter.labels) &&
        Objects.equals(this.properties, neo4jCaptureDataChangeNodePayloadAfter.properties);
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

