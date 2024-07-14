package org.openapitools.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.Neo4jCaptureDataChangeMeta;
import org.openapitools.model.Neo4jCaptureDataChangePayload;
import org.openapitools.model.Neo4jCaptureDataChangeSchema;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Neo4jCaptureDataChange  {
  
  @ApiModelProperty(required = true, value = "")
  private Map<String, Object> headers = new HashMap<>();

  @ApiModelProperty(required = true, value = "")
  private String messageKey;

  @ApiModelProperty(required = true, value = "")
  private Neo4jCaptureDataChangeMeta meta;

  @ApiModelProperty(required = true, value = "")
  private Integer offset;

  @ApiModelProperty(required = true, value = "")
  private Integer partition;

  @ApiModelProperty(required = true, value = "")
  private String sourceType;

  @ApiModelProperty(required = true, value = "")
  private Date timestamp;

  @ApiModelProperty(required = true, value = "")
  private String topic;

  @ApiModelProperty(required = true, value = "")
  private Neo4jCaptureDataChangeSchema schema;

  @ApiModelProperty(required = true, value = "")
  private Neo4jCaptureDataChangePayload payload;
 /**
   * Get headers
   * @return headers
  **/
  @JsonProperty("headers")
  public Map<String, Object> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, Object> headers) {
    this.headers = headers;
  }

  public Neo4jCaptureDataChange headers(Map<String, Object> headers) {
    this.headers = headers;
    return this;
  }

  public Neo4jCaptureDataChange putHeadersItem(String key, Object headersItem) {
    this.headers.put(key, headersItem);
    return this;
  }

 /**
   * Get messageKey
   * @return messageKey
  **/
  @JsonProperty("message_key")
  public String getMessageKey() {
    return messageKey;
  }

  public void setMessageKey(String messageKey) {
    this.messageKey = messageKey;
  }

  public Neo4jCaptureDataChange messageKey(String messageKey) {
    this.messageKey = messageKey;
    return this;
  }

 /**
   * Get meta
   * @return meta
  **/
  @JsonProperty("meta")
  public Neo4jCaptureDataChangeMeta getMeta() {
    return meta;
  }

  public void setMeta(Neo4jCaptureDataChangeMeta meta) {
    this.meta = meta;
  }

  public Neo4jCaptureDataChange meta(Neo4jCaptureDataChangeMeta meta) {
    this.meta = meta;
    return this;
  }

 /**
   * Get offset
   * @return offset
  **/
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public Neo4jCaptureDataChange offset(Integer offset) {
    this.offset = offset;
    return this;
  }

 /**
   * Get partition
   * @return partition
  **/
  @JsonProperty("partition")
  public Integer getPartition() {
    return partition;
  }

  public void setPartition(Integer partition) {
    this.partition = partition;
  }

  public Neo4jCaptureDataChange partition(Integer partition) {
    this.partition = partition;
    return this;
  }

 /**
   * Get sourceType
   * @return sourceType
  **/
  @JsonProperty("source_type")
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  public Neo4jCaptureDataChange sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

 /**
   * Get timestamp
   * @return timestamp
  **/
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public Neo4jCaptureDataChange timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }

 /**
   * Get topic
   * @return topic
  **/
  @JsonProperty("topic")
  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public Neo4jCaptureDataChange topic(String topic) {
    this.topic = topic;
    return this;
  }

 /**
   * Get schema
   * @return schema
  **/
  @JsonProperty("schema")
  public Neo4jCaptureDataChangeSchema getSchema() {
    return schema;
  }

  public void setSchema(Neo4jCaptureDataChangeSchema schema) {
    this.schema = schema;
  }

  public Neo4jCaptureDataChange schema(Neo4jCaptureDataChangeSchema schema) {
    this.schema = schema;
    return this;
  }

 /**
   * Get payload
   * @return payload
  **/
  @JsonProperty("payload")
  public Neo4jCaptureDataChangePayload getPayload() {
    return payload;
  }

  public void setPayload(Neo4jCaptureDataChangePayload payload) {
    this.payload = payload;
  }

  public Neo4jCaptureDataChange payload(Neo4jCaptureDataChangePayload payload) {
    this.payload = payload;
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
    Neo4jCaptureDataChange neo4jCaptureDataChange = (Neo4jCaptureDataChange) o;
    return Objects.equals(this.headers, neo4jCaptureDataChange.headers) &&
        Objects.equals(this.messageKey, neo4jCaptureDataChange.messageKey) &&
        Objects.equals(this.meta, neo4jCaptureDataChange.meta) &&
        Objects.equals(this.offset, neo4jCaptureDataChange.offset) &&
        Objects.equals(this.partition, neo4jCaptureDataChange.partition) &&
        Objects.equals(this.sourceType, neo4jCaptureDataChange.sourceType) &&
        Objects.equals(this.timestamp, neo4jCaptureDataChange.timestamp) &&
        Objects.equals(this.topic, neo4jCaptureDataChange.topic) &&
        Objects.equals(this.schema, neo4jCaptureDataChange.schema) &&
        Objects.equals(this.payload, neo4jCaptureDataChange.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, messageKey, meta, offset, partition, sourceType, timestamp, topic, schema, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jCaptureDataChange {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
