package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.Neo4jChangeDataCaptureMetaSource;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Neo4jChangeDataCaptureMeta
 */

@JsonTypeName("Neo4jChangeDataCapture_meta")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-31T09:13:05.321170795Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jChangeDataCaptureMeta {

  private String operation;

  private Neo4jChangeDataCaptureMetaSource source;

  private Integer timestamp;

  private Integer txEventId;

  private Integer txEventsCount;

  private Integer txId;

  private String username;

  public Neo4jChangeDataCaptureMeta() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Neo4jChangeDataCaptureMeta(String operation, Neo4jChangeDataCaptureMetaSource source, Integer timestamp, Integer txEventId, Integer txEventsCount, Integer txId, String username) {
    this.operation = operation;
    this.source = source;
    this.timestamp = timestamp;
    this.txEventId = txEventId;
    this.txEventsCount = txEventsCount;
    this.txId = txId;
    this.username = username;
  }

  public Neo4jChangeDataCaptureMeta operation(String operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   */
  @NotNull 
  @Schema(name = "operation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operation")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public Neo4jChangeDataCaptureMeta source(Neo4jChangeDataCaptureMetaSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   */
  @NotNull @Valid 
  @Schema(name = "source", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("source")
  public Neo4jChangeDataCaptureMetaSource getSource() {
    return source;
  }

  public void setSource(Neo4jChangeDataCaptureMetaSource source) {
    this.source = source;
  }

  public Neo4jChangeDataCaptureMeta timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   */
  @NotNull 
  @Schema(name = "timestamp", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("timestamp")
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  public Neo4jChangeDataCaptureMeta txEventId(Integer txEventId) {
    this.txEventId = txEventId;
    return this;
  }

  /**
   * Get txEventId
   * @return txEventId
   */
  @NotNull 
  @Schema(name = "txEventId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("txEventId")
  public Integer getTxEventId() {
    return txEventId;
  }

  public void setTxEventId(Integer txEventId) {
    this.txEventId = txEventId;
  }

  public Neo4jChangeDataCaptureMeta txEventsCount(Integer txEventsCount) {
    this.txEventsCount = txEventsCount;
    return this;
  }

  /**
   * Get txEventsCount
   * @return txEventsCount
   */
  @NotNull 
  @Schema(name = "txEventsCount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("txEventsCount")
  public Integer getTxEventsCount() {
    return txEventsCount;
  }

  public void setTxEventsCount(Integer txEventsCount) {
    this.txEventsCount = txEventsCount;
  }

  public Neo4jChangeDataCaptureMeta txId(Integer txId) {
    this.txId = txId;
    return this;
  }

  /**
   * Get txId
   * @return txId
   */
  @NotNull 
  @Schema(name = "txId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("txId")
  public Integer getTxId() {
    return txId;
  }

  public void setTxId(Integer txId) {
    this.txId = txId;
  }

  public Neo4jChangeDataCaptureMeta username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  @NotNull 
  @Schema(name = "username", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Neo4jChangeDataCaptureMeta neo4jChangeDataCaptureMeta = (Neo4jChangeDataCaptureMeta) o;
    return Objects.equals(this.operation, neo4jChangeDataCaptureMeta.operation) &&
        Objects.equals(this.source, neo4jChangeDataCaptureMeta.source) &&
        Objects.equals(this.timestamp, neo4jChangeDataCaptureMeta.timestamp) &&
        Objects.equals(this.txEventId, neo4jChangeDataCaptureMeta.txEventId) &&
        Objects.equals(this.txEventsCount, neo4jChangeDataCaptureMeta.txEventsCount) &&
        Objects.equals(this.txId, neo4jChangeDataCaptureMeta.txId) &&
        Objects.equals(this.username, neo4jChangeDataCaptureMeta.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, source, timestamp, txEventId, txEventsCount, txId, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jChangeDataCaptureMeta {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    txEventId: ").append(toIndentedString(txEventId)).append("\n");
    sb.append("    txEventsCount: ").append(toIndentedString(txEventsCount)).append("\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

