package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Neo4jCaptureDataChangeMetaSource;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Neo4jCaptureDataChange_meta")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-07-14T12:12:13.130293652Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jCaptureDataChangeMeta   {
  private String operation;
  private Neo4jCaptureDataChangeMetaSource source;
  private Integer timestamp;
  private Integer txEventId;
  private Integer txEventsCount;
  private Integer txId;
  private String username;

  /**
   **/
  public Neo4jCaptureDataChangeMeta operation(String operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation")
  @NotNull public String getOperation() {
    return operation;
  }

  @JsonProperty("operation")
  public void setOperation(String operation) {
    this.operation = operation;
  }

  /**
   **/
  public Neo4jCaptureDataChangeMeta source(Neo4jCaptureDataChangeMetaSource source) {
    this.source = source;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("source")
  @NotNull @Valid public Neo4jCaptureDataChangeMetaSource getSource() {
    return source;
  }

  @JsonProperty("source")
  public void setSource(Neo4jCaptureDataChangeMetaSource source) {
    this.source = source;
  }

  /**
   **/
  public Neo4jCaptureDataChangeMeta timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("timestamp")
  @NotNull public Integer getTimestamp() {
    return timestamp;
  }

  @JsonProperty("timestamp")
  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  public Neo4jCaptureDataChangeMeta txEventId(Integer txEventId) {
    this.txEventId = txEventId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("txEventId")
  @NotNull public Integer getTxEventId() {
    return txEventId;
  }

  @JsonProperty("txEventId")
  public void setTxEventId(Integer txEventId) {
    this.txEventId = txEventId;
  }

  /**
   **/
  public Neo4jCaptureDataChangeMeta txEventsCount(Integer txEventsCount) {
    this.txEventsCount = txEventsCount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("txEventsCount")
  @NotNull public Integer getTxEventsCount() {
    return txEventsCount;
  }

  @JsonProperty("txEventsCount")
  public void setTxEventsCount(Integer txEventsCount) {
    this.txEventsCount = txEventsCount;
  }

  /**
   **/
  public Neo4jCaptureDataChangeMeta txId(Integer txId) {
    this.txId = txId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("txId")
  @NotNull public Integer getTxId() {
    return txId;
  }

  @JsonProperty("txId")
  public void setTxId(Integer txId) {
    this.txId = txId;
  }

  /**
   **/
  public Neo4jCaptureDataChangeMeta username(String username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("username")
  @NotNull public String getUsername() {
    return username;
  }

  @JsonProperty("username")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

