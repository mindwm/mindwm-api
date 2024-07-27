package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Neo4jChangeDataCaptureNodePayloadAfter
 */

@JsonTypeName("Neo4jChangeDataCaptureNodePayload_after")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-27T20:33:35.131405119Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jChangeDataCaptureNodePayloadAfter {

  @Valid
  private List<String> labels = new ArrayList<>();

  @Valid
  private Map<String, Object> properties = new HashMap<>();

  public Neo4jChangeDataCaptureNodePayloadAfter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Neo4jChangeDataCaptureNodePayloadAfter(List<String> labels, Map<String, Object> properties) {
    this.labels = labels;
    this.properties = properties;
  }

  public Neo4jChangeDataCaptureNodePayloadAfter labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public Neo4jChangeDataCaptureNodePayloadAfter addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
   */
  @NotNull 
  @Schema(name = "labels", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("labels")
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public Neo4jChangeDataCaptureNodePayloadAfter properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

  public Neo4jChangeDataCaptureNodePayloadAfter putPropertiesItem(String key, Object propertiesItem) {
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
  @NotNull 
  @Schema(name = "properties", requiredMode = Schema.RequiredMode.REQUIRED)
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
    Neo4jChangeDataCaptureNodePayloadAfter neo4jChangeDataCaptureNodePayloadAfter = (Neo4jChangeDataCaptureNodePayloadAfter) o;
    return Objects.equals(this.labels, neo4jChangeDataCaptureNodePayloadAfter.labels) &&
        Objects.equals(this.properties, neo4jChangeDataCaptureNodePayloadAfter.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jChangeDataCaptureNodePayloadAfter {\n");
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

