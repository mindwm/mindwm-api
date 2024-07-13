package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.Neo4jCaptureDataChangeMetaSource;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Neo4jCaptureDataChangeMeta   {
  
  private String operation;
  private Neo4jCaptureDataChangeMetaSource source;
  private Integer timestamp;
  private Integer txEventId;
  private Integer txEventsCount;
  private Integer txId;
  private String username;

  public Neo4jCaptureDataChangeMeta () {

  }

  public Neo4jCaptureDataChangeMeta (String operation, Neo4jCaptureDataChangeMetaSource source, Integer timestamp, Integer txEventId, Integer txEventsCount, Integer txId, String username) {
    this.operation = operation;
    this.source = source;
    this.timestamp = timestamp;
    this.txEventId = txEventId;
    this.txEventsCount = txEventsCount;
    this.txId = txId;
    this.username = username;
  }

    
  @JsonProperty("operation")
  public String getOperation() {
    return operation;
  }
  public void setOperation(String operation) {
    this.operation = operation;
  }

    
  @JsonProperty("source")
  public Neo4jCaptureDataChangeMetaSource getSource() {
    return source;
  }
  public void setSource(Neo4jCaptureDataChangeMetaSource source) {
    this.source = source;
  }

    
  @JsonProperty("timestamp")
  public Integer getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

    
  @JsonProperty("txEventId")
  public Integer getTxEventId() {
    return txEventId;
  }
  public void setTxEventId(Integer txEventId) {
    this.txEventId = txEventId;
  }

    
  @JsonProperty("txEventsCount")
  public Integer getTxEventsCount() {
    return txEventsCount;
  }
  public void setTxEventsCount(Integer txEventsCount) {
    this.txEventsCount = txEventsCount;
  }

    
  @JsonProperty("txId")
  public Integer getTxId() {
    return txId;
  }
  public void setTxId(Integer txId) {
    this.txId = txId;
  }

    
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
