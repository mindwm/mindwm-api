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
 * Neo4jChangeDataCaptureRelationshipPayloadEnd
 */

@JsonTypeName("Neo4jChangeDataCaptureRelationshipPayload_end")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-08-15T15:14:18.588332445Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jChangeDataCaptureRelationshipPayloadEnd {

  private String id;

  @Valid
  private Map<String, Object> ids = new HashMap<>();

  @Valid
  private List<String> labels = new ArrayList<>();

  public Neo4jChangeDataCaptureRelationshipPayloadEnd() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Neo4jChangeDataCaptureRelationshipPayloadEnd(String id, Map<String, Object> ids, List<String> labels) {
    this.id = id;
    this.ids = ids;
    this.labels = labels;
  }

  public Neo4jChangeDataCaptureRelationshipPayloadEnd id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Neo4jChangeDataCaptureRelationshipPayloadEnd ids(Map<String, Object> ids) {
    this.ids = ids;
    return this;
  }

  public Neo4jChangeDataCaptureRelationshipPayloadEnd putIdsItem(String key, Object idsItem) {
    if (this.ids == null) {
      this.ids = new HashMap<>();
    }
    this.ids.put(key, idsItem);
    return this;
  }

  /**
   * Get ids
   * @return ids
   */
  @NotNull 
  @Schema(name = "ids", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ids")
  public Map<String, Object> getIds() {
    return ids;
  }

  public void setIds(Map<String, Object> ids) {
    this.ids = ids;
  }

  public Neo4jChangeDataCaptureRelationshipPayloadEnd labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public Neo4jChangeDataCaptureRelationshipPayloadEnd addLabelsItem(String labelsItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Neo4jChangeDataCaptureRelationshipPayloadEnd neo4jChangeDataCaptureRelationshipPayloadEnd = (Neo4jChangeDataCaptureRelationshipPayloadEnd) o;
    return Objects.equals(this.id, neo4jChangeDataCaptureRelationshipPayloadEnd.id) &&
        Objects.equals(this.ids, neo4jChangeDataCaptureRelationshipPayloadEnd.ids) &&
        Objects.equals(this.labels, neo4jChangeDataCaptureRelationshipPayloadEnd.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ids, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jChangeDataCaptureRelationshipPayloadEnd {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

