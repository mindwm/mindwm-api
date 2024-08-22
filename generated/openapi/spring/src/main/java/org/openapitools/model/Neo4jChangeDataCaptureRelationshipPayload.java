package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Neo4jChangeDataCaptureRelationshipPayloadEnd;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Neo4jChangeDataCaptureRelationshipPayload
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-08-22T13:50:00.995778238Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jChangeDataCaptureRelationshipPayload implements Neo4jChangeDataCapturePayload {

  private Object after;

  private String before;

  private Neo4jChangeDataCaptureRelationshipPayloadEnd end;

  private String id;

  private String label;

  private Neo4jChangeDataCaptureRelationshipPayloadEnd start;

  private String type;

  public Neo4jChangeDataCaptureRelationshipPayload() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Neo4jChangeDataCaptureRelationshipPayload(Object after, String before, Neo4jChangeDataCaptureRelationshipPayloadEnd end, String id, String label, Neo4jChangeDataCaptureRelationshipPayloadEnd start, String type) {
    this.after = after;
    this.before = before;
    this.end = end;
    this.id = id;
    this.label = label;
    this.start = start;
    this.type = type;
  }

  public Neo4jChangeDataCaptureRelationshipPayload after(Object after) {
    this.after = after;
    return this;
  }

  /**
   * Get after
   * @return after
   */
  @NotNull 
  @Schema(name = "after", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("after")
  public Object getAfter() {
    return after;
  }

  public void setAfter(Object after) {
    this.after = after;
  }

  public Neo4jChangeDataCaptureRelationshipPayload before(String before) {
    this.before = before;
    return this;
  }

  /**
   * Get before
   * @return before
   */
  @NotNull 
  @Schema(name = "before", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("before")
  public String getBefore() {
    return before;
  }

  public void setBefore(String before) {
    this.before = before;
  }

  public Neo4jChangeDataCaptureRelationshipPayload end(Neo4jChangeDataCaptureRelationshipPayloadEnd end) {
    this.end = end;
    return this;
  }

  /**
   * Get end
   * @return end
   */
  @NotNull @Valid 
  @Schema(name = "end", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("end")
  public Neo4jChangeDataCaptureRelationshipPayloadEnd getEnd() {
    return end;
  }

  public void setEnd(Neo4jChangeDataCaptureRelationshipPayloadEnd end) {
    this.end = end;
  }

  public Neo4jChangeDataCaptureRelationshipPayload id(String id) {
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

  public Neo4jChangeDataCaptureRelationshipPayload label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   */
  @NotNull 
  @Schema(name = "label", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Neo4jChangeDataCaptureRelationshipPayload start(Neo4jChangeDataCaptureRelationshipPayloadEnd start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
   */
  @NotNull @Valid 
  @Schema(name = "start", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("start")
  public Neo4jChangeDataCaptureRelationshipPayloadEnd getStart() {
    return start;
  }

  public void setStart(Neo4jChangeDataCaptureRelationshipPayloadEnd start) {
    this.start = start;
  }

  public Neo4jChangeDataCaptureRelationshipPayload type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @NotNull 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Neo4jChangeDataCaptureRelationshipPayload neo4jChangeDataCaptureRelationshipPayload = (Neo4jChangeDataCaptureRelationshipPayload) o;
    return Objects.equals(this.after, neo4jChangeDataCaptureRelationshipPayload.after) &&
        Objects.equals(this.before, neo4jChangeDataCaptureRelationshipPayload.before) &&
        Objects.equals(this.end, neo4jChangeDataCaptureRelationshipPayload.end) &&
        Objects.equals(this.id, neo4jChangeDataCaptureRelationshipPayload.id) &&
        Objects.equals(this.label, neo4jChangeDataCaptureRelationshipPayload.label) &&
        Objects.equals(this.start, neo4jChangeDataCaptureRelationshipPayload.start) &&
        Objects.equals(this.type, neo4jChangeDataCaptureRelationshipPayload.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, before, end, id, label, start, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jChangeDataCaptureRelationshipPayload {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

