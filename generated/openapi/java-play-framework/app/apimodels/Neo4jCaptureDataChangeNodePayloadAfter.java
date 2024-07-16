package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Neo4jCaptureDataChangeNodePayloadAfter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-07-16T19:19:16.519861287Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Neo4jCaptureDataChangeNodePayloadAfter   {
  @JsonProperty("labels")
  @NotNull

  private List<String> labels = new ArrayList<>();

  @JsonProperty("properties")
  @NotNull

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
    return Objects.equals(labels, neo4jCaptureDataChangeNodePayloadAfter.labels) &&
        Objects.equals(properties, neo4jCaptureDataChangeNodePayloadAfter.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, properties);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

