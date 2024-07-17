package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Neo4jCaptureDataChangeMetaSource;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-07-17T16:08:12.149251176Z[Etc/UTC]", comments = "Generator version: 7.7.0")
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation")
  @NotNull
  public String getOperation() {
    return operation;
  }
  public void setOperation(String operation) {
    this.operation = operation;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("source")
  @NotNull
  public Neo4jCaptureDataChangeMetaSource getSource() {
    return source;
  }
  public void setSource(Neo4jCaptureDataChangeMetaSource source) {
    this.source = source;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("timestamp")
  @NotNull
  public Integer getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("txEventId")
  @NotNull
  public Integer getTxEventId() {
    return txEventId;
  }
  public void setTxEventId(Integer txEventId) {
    this.txEventId = txEventId;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("txEventsCount")
  @NotNull
  public Integer getTxEventsCount() {
    return txEventsCount;
  }
  public void setTxEventsCount(Integer txEventsCount) {
    this.txEventsCount = txEventsCount;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("txId")
  @NotNull
  public Integer getTxId() {
    return txId;
  }
  public void setTxId(Integer txId) {
    this.txId = txId;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("username")
  @NotNull
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

