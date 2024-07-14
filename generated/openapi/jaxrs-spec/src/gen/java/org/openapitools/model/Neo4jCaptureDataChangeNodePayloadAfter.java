package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Neo4jCaptureDataChangeNodePayload_after")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-07-14T08:11:06.817692523Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jCaptureDataChangeNodePayloadAfter   {
  private @Valid List<String> labels = new ArrayList<>();
  private @Valid Map<String, Object> properties = new HashMap<>();

  /**
   **/
  public Neo4jCaptureDataChangeNodePayloadAfter labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("labels")
  @NotNull public List<String> getLabels() {
    return labels;
  }

  @JsonProperty("labels")
  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public Neo4jCaptureDataChangeNodePayloadAfter addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }

    this.labels.add(labelsItem);
    return this;
  }

  public Neo4jCaptureDataChangeNodePayloadAfter removeLabelsItem(String labelsItem) {
    if (labelsItem != null && this.labels != null) {
      this.labels.remove(labelsItem);
    }

    return this;
  }
  /**
   **/
  public Neo4jCaptureDataChangeNodePayloadAfter properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("properties")
  @NotNull public Map<String, Object> getProperties() {
    return properties;
  }

  @JsonProperty("properties")
  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  public Neo4jCaptureDataChangeNodePayloadAfter putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }

    this.properties.put(key, propertiesItem);
    return this;
  }

  public Neo4jCaptureDataChangeNodePayloadAfter removePropertiesItem(String key) {
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

