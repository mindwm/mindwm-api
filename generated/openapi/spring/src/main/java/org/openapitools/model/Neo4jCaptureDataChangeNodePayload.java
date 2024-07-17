package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Neo4jCaptureDataChangeNodePayloadAfter;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Neo4jCaptureDataChangeNodePayload
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-17T13:50:40.031099343Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jCaptureDataChangeNodePayload implements Neo4jCaptureDataChangePayload {

  private Neo4jCaptureDataChangeNodePayloadAfter after;

  private String before;

  private String id;

  private String type;

  public Neo4jCaptureDataChangeNodePayload() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Neo4jCaptureDataChangeNodePayload(Neo4jCaptureDataChangeNodePayloadAfter after, String before, String id, String type) {
    this.after = after;
    this.before = before;
    this.id = id;
    this.type = type;
  }

  public Neo4jCaptureDataChangeNodePayload after(Neo4jCaptureDataChangeNodePayloadAfter after) {
    this.after = after;
    return this;
  }

  /**
   * Get after
   * @return after
   */
  @NotNull @Valid 
  @Schema(name = "after", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("after")
  public Neo4jCaptureDataChangeNodePayloadAfter getAfter() {
    return after;
  }

  public void setAfter(Neo4jCaptureDataChangeNodePayloadAfter after) {
    this.after = after;
  }

  public Neo4jCaptureDataChangeNodePayload before(String before) {
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

  public Neo4jCaptureDataChangeNodePayload id(String id) {
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

  public Neo4jCaptureDataChangeNodePayload type(String type) {
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
    Neo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayload = (Neo4jCaptureDataChangeNodePayload) o;
    return Objects.equals(this.after, neo4jCaptureDataChangeNodePayload.after) &&
        Objects.equals(this.before, neo4jCaptureDataChangeNodePayload.before) &&
        Objects.equals(this.id, neo4jCaptureDataChangeNodePayload.id) &&
        Objects.equals(this.type, neo4jCaptureDataChangeNodePayload.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, before, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jCaptureDataChangeNodePayload {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

