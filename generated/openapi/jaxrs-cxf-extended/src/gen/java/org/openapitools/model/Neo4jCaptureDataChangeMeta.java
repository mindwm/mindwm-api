package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.Neo4jCaptureDataChangeMetaSource;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Neo4jCaptureDataChangeMeta  {
  
  @ApiModelProperty(required = true, value = "")
  private String operation;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Neo4jCaptureDataChangeMetaSource source;

  @ApiModelProperty(required = true, value = "")
  private Integer timestamp;

  @ApiModelProperty(required = true, value = "")
  private Integer txEventId;

  @ApiModelProperty(required = true, value = "")
  private Integer txEventsCount;

  @ApiModelProperty(required = true, value = "")
  private Integer txId;

  @ApiModelProperty(required = true, value = "")
  private String username;
 /**
  * Get operation
  * @return operation
  */
  @JsonProperty("operation")
  @NotNull
  public String getOperation() {
    return operation;
  }

  /**
   * Sets the <code>operation</code> property.
   */
 public void setOperation(String operation) {
    this.operation = operation;
  }

  /**
   * Sets the <code>operation</code> property.
   */
  public Neo4jCaptureDataChangeMeta operation(String operation) {
    this.operation = operation;
    return this;
  }

 /**
  * Get source
  * @return source
  */
  @JsonProperty("source")
  @NotNull
  public Neo4jCaptureDataChangeMetaSource getSource() {
    return source;
  }

  /**
   * Sets the <code>source</code> property.
   */
 public void setSource(Neo4jCaptureDataChangeMetaSource source) {
    this.source = source;
  }

  /**
   * Sets the <code>source</code> property.
   */
  public Neo4jCaptureDataChangeMeta source(Neo4jCaptureDataChangeMetaSource source) {
    this.source = source;
    return this;
  }

 /**
  * Get timestamp
  * @return timestamp
  */
  @JsonProperty("timestamp")
  @NotNull
  public Integer getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the <code>timestamp</code> property.
   */
 public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Sets the <code>timestamp</code> property.
   */
  public Neo4jCaptureDataChangeMeta timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

 /**
  * Get txEventId
  * @return txEventId
  */
  @JsonProperty("txEventId")
  @NotNull
  public Integer getTxEventId() {
    return txEventId;
  }

  /**
   * Sets the <code>txEventId</code> property.
   */
 public void setTxEventId(Integer txEventId) {
    this.txEventId = txEventId;
  }

  /**
   * Sets the <code>txEventId</code> property.
   */
  public Neo4jCaptureDataChangeMeta txEventId(Integer txEventId) {
    this.txEventId = txEventId;
    return this;
  }

 /**
  * Get txEventsCount
  * @return txEventsCount
  */
  @JsonProperty("txEventsCount")
  @NotNull
  public Integer getTxEventsCount() {
    return txEventsCount;
  }

  /**
   * Sets the <code>txEventsCount</code> property.
   */
 public void setTxEventsCount(Integer txEventsCount) {
    this.txEventsCount = txEventsCount;
  }

  /**
   * Sets the <code>txEventsCount</code> property.
   */
  public Neo4jCaptureDataChangeMeta txEventsCount(Integer txEventsCount) {
    this.txEventsCount = txEventsCount;
    return this;
  }

 /**
  * Get txId
  * @return txId
  */
  @JsonProperty("txId")
  @NotNull
  public Integer getTxId() {
    return txId;
  }

  /**
   * Sets the <code>txId</code> property.
   */
 public void setTxId(Integer txId) {
    this.txId = txId;
  }

  /**
   * Sets the <code>txId</code> property.
   */
  public Neo4jCaptureDataChangeMeta txId(Integer txId) {
    this.txId = txId;
    return this;
  }

 /**
  * Get username
  * @return username
  */
  @JsonProperty("username")
  @NotNull
  public String getUsername() {
    return username;
  }

  /**
   * Sets the <code>username</code> property.
   */
 public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Sets the <code>username</code> property.
   */
  public Neo4jCaptureDataChangeMeta username(String username) {
    this.username = username;
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
    Neo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta = (Neo4jCaptureDataChangeMeta) o;
    return Objects.equals(this.operation, neo4jCaptureDataChangeMeta.operation) &&
        Objects.equals(this.source, neo4jCaptureDataChangeMeta.source) &&
        Objects.equals(this.timestamp, neo4jCaptureDataChangeMeta.timestamp) &&
        Objects.equals(this.txEventId, neo4jCaptureDataChangeMeta.txEventId) &&
        Objects.equals(this.txEventsCount, neo4jCaptureDataChangeMeta.txEventsCount) &&
        Objects.equals(this.txId, neo4jCaptureDataChangeMeta.txId) &&
        Objects.equals(this.username, neo4jCaptureDataChangeMeta.username);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

