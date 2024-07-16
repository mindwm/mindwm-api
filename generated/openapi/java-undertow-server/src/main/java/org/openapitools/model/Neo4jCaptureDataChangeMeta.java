/*
 * Mindwm API
 *
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * OpenAPI document version: 0.1.0
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Neo4jCaptureDataChangeMetaSource;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-07-16T19:19:18.384203832Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jCaptureDataChangeMeta   {
  
  private String operation;
  private Neo4jCaptureDataChangeMetaSource source;
  private Integer timestamp;
  private Integer txEventId;
  private Integer txEventsCount;
  private Integer txId;
  private String username;

  /**
   */
  public Neo4jCaptureDataChangeMeta operation(String operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation")
  public String getOperation() {
    return operation;
  }
  public void setOperation(String operation) {
    this.operation = operation;
  }

  /**
   */
  public Neo4jCaptureDataChangeMeta source(Neo4jCaptureDataChangeMetaSource source) {
    this.source = source;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("source")
  public Neo4jCaptureDataChangeMetaSource getSource() {
    return source;
  }
  public void setSource(Neo4jCaptureDataChangeMetaSource source) {
    this.source = source;
  }

  /**
   */
  public Neo4jCaptureDataChangeMeta timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("timestamp")
  public Integer getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  /**
   */
  public Neo4jCaptureDataChangeMeta txEventId(Integer txEventId) {
    this.txEventId = txEventId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("txEventId")
  public Integer getTxEventId() {
    return txEventId;
  }
  public void setTxEventId(Integer txEventId) {
    this.txEventId = txEventId;
  }

  /**
   */
  public Neo4jCaptureDataChangeMeta txEventsCount(Integer txEventsCount) {
    this.txEventsCount = txEventsCount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("txEventsCount")
  public Integer getTxEventsCount() {
    return txEventsCount;
  }
  public void setTxEventsCount(Integer txEventsCount) {
    this.txEventsCount = txEventsCount;
  }

  /**
   */
  public Neo4jCaptureDataChangeMeta txId(Integer txId) {
    this.txId = txId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("txId")
  public Integer getTxId() {
    return txId;
  }
  public void setTxId(Integer txId) {
    this.txId = txId;
  }

  /**
   */
  public Neo4jCaptureDataChangeMeta username(String username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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
    Neo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta = (Neo4jCaptureDataChangeMeta) o;
    return Objects.equals(operation, neo4jCaptureDataChangeMeta.operation) &&
        Objects.equals(source, neo4jCaptureDataChangeMeta.source) &&
        Objects.equals(timestamp, neo4jCaptureDataChangeMeta.timestamp) &&
        Objects.equals(txEventId, neo4jCaptureDataChangeMeta.txEventId) &&
        Objects.equals(txEventsCount, neo4jCaptureDataChangeMeta.txEventsCount) &&
        Objects.equals(txId, neo4jCaptureDataChangeMeta.txId) &&
        Objects.equals(username, neo4jCaptureDataChangeMeta.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, source, timestamp, txEventId, txEventsCount, txId, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jCaptureDataChangeMeta {\n");
    
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

