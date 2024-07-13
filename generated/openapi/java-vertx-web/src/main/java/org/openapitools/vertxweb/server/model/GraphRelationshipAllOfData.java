package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import org.openapitools.vertxweb.server.model.Neo4jCaptureDataChangeMeta;
import org.openapitools.vertxweb.server.model.Neo4jCaptureDataChangeRelationshipPayload;
import org.openapitools.vertxweb.server.model.Neo4jCaptureDataChangeSchema;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GraphRelationshipAllOfData   {
  
  private Object headers;
  private String messageKey;
  private Neo4jCaptureDataChangeMeta meta;
  private Integer offset;
  private Integer partition;
  private String sourceType;
  private OffsetDateTime timestamp;
  private String topic;
  private Neo4jCaptureDataChangeSchema schema;
  private Neo4jCaptureDataChangeRelationshipPayload payload;

  public GraphRelationshipAllOfData () {

  }

  public GraphRelationshipAllOfData (Object headers, String messageKey, Neo4jCaptureDataChangeMeta meta, Integer offset, Integer partition, String sourceType, OffsetDateTime timestamp, String topic, Neo4jCaptureDataChangeSchema schema, Neo4jCaptureDataChangeRelationshipPayload payload) {
    this.headers = headers;
    this.messageKey = messageKey;
    this.meta = meta;
    this.offset = offset;
    this.partition = partition;
    this.sourceType = sourceType;
    this.timestamp = timestamp;
    this.topic = topic;
    this.schema = schema;
    this.payload = payload;
  }

    
  @JsonProperty("headers")
  public Object getHeaders() {
    return headers;
  }
  public void setHeaders(Object headers) {
    this.headers = headers;
  }

    
  @JsonProperty("message_key")
  public String getMessageKey() {
    return messageKey;
  }
  public void setMessageKey(String messageKey) {
    this.messageKey = messageKey;
  }

    
  @JsonProperty("meta")
  public Neo4jCaptureDataChangeMeta getMeta() {
    return meta;
  }
  public void setMeta(Neo4jCaptureDataChangeMeta meta) {
    this.meta = meta;
  }

    
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

    
  @JsonProperty("partition")
  public Integer getPartition() {
    return partition;
  }
  public void setPartition(Integer partition) {
    this.partition = partition;
  }

    
  @JsonProperty("source_type")
  public String getSourceType() {
    return sourceType;
  }
  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

    
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

    
  @JsonProperty("topic")
  public String getTopic() {
    return topic;
  }
  public void setTopic(String topic) {
    this.topic = topic;
  }

    
  @JsonProperty("schema")
  public Neo4jCaptureDataChangeSchema getSchema() {
    return schema;
  }
  public void setSchema(Neo4jCaptureDataChangeSchema schema) {
    this.schema = schema;
  }

    
  @JsonProperty("payload")
  public Neo4jCaptureDataChangeRelationshipPayload getPayload() {
    return payload;
  }
  public void setPayload(Neo4jCaptureDataChangeRelationshipPayload payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphRelationshipAllOfData graphRelationshipAllOfData = (GraphRelationshipAllOfData) o;
    return Objects.equals(headers, graphRelationshipAllOfData.headers) &&
        Objects.equals(messageKey, graphRelationshipAllOfData.messageKey) &&
        Objects.equals(meta, graphRelationshipAllOfData.meta) &&
        Objects.equals(offset, graphRelationshipAllOfData.offset) &&
        Objects.equals(partition, graphRelationshipAllOfData.partition) &&
        Objects.equals(sourceType, graphRelationshipAllOfData.sourceType) &&
        Objects.equals(timestamp, graphRelationshipAllOfData.timestamp) &&
        Objects.equals(topic, graphRelationshipAllOfData.topic) &&
        Objects.equals(schema, graphRelationshipAllOfData.schema) &&
        Objects.equals(payload, graphRelationshipAllOfData.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, messageKey, meta, offset, partition, sourceType, timestamp, topic, schema, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphRelationshipAllOfData {\n");
    
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    messageKey: ").append(toIndentedString(messageKey)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
