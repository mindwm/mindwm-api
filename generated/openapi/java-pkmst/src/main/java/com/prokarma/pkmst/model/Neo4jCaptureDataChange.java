package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.Neo4jCaptureDataChangeMeta;
import com.prokarma.pkmst.model.Neo4jCaptureDataChangePayload;
import com.prokarma.pkmst.model.Neo4jCaptureDataChangeSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Neo4jCaptureDataChange
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-07-21T21:29:26.412155295Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jCaptureDataChange   {
  @JsonProperty("headers")
  
  private Map<String, Object> headers = new HashMap<>();

  @JsonProperty("message_key")
  private String messageKey;

  @JsonProperty("meta")
  private Neo4jCaptureDataChangeMeta meta;

  @JsonProperty("offset")
  private Integer offset;

  @JsonProperty("partition")
  private Integer partition;

  @JsonProperty("source_type")
  private String sourceType;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp;

  @JsonProperty("topic")
  private String topic;

  @JsonProperty("schema")
  private Neo4jCaptureDataChangeSchema schema;

  @JsonProperty("payload")
  private Neo4jCaptureDataChangePayload payload;

  public Neo4jCaptureDataChange headers(Map<String, Object> headers) {
    this.headers = headers;
    return this;
  }

  public Neo4jCaptureDataChange putHeadersItem(String key, Object headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>());
    }
    this.headers.put(key, headersItem);
    return this;
  }

  /**
   * Get headers
   * @return headers
   */
  @ApiModelProperty(required = true, value = "")
  public Map<String, Object> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, Object> headers) {
    this.headers = headers;
  }

  public Neo4jCaptureDataChange messageKey(String messageKey) {
    this.messageKey = messageKey;
    return this;
  }

  /**
   * Get messageKey
   * @return messageKey
   */
  @ApiModelProperty(required = true, value = "")
  public String getMessageKey() {
    return messageKey;
  }

  public void setMessageKey(String messageKey) {
    this.messageKey = messageKey;
  }

  public Neo4jCaptureDataChange meta(Neo4jCaptureDataChangeMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @ApiModelProperty(required = true, value = "")
  public Neo4jCaptureDataChangeMeta getMeta() {
    return meta;
  }

  public void setMeta(Neo4jCaptureDataChangeMeta meta) {
    this.meta = meta;
  }

  public Neo4jCaptureDataChange offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
   */
  @ApiModelProperty(required = true, value = "")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public Neo4jCaptureDataChange partition(Integer partition) {
    this.partition = partition;
    return this;
  }

  /**
   * Get partition
   * @return partition
   */
  @ApiModelProperty(required = true, value = "")
  public Integer getPartition() {
    return partition;
  }

  public void setPartition(Integer partition) {
    this.partition = partition;
  }

  public Neo4jCaptureDataChange sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Get sourceType
   * @return sourceType
   */
  @ApiModelProperty(required = true, value = "")
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  public Neo4jCaptureDataChange timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   */
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public Neo4jCaptureDataChange topic(String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * Get topic
   * @return topic
   */
  @ApiModelProperty(required = true, value = "")
  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public Neo4jCaptureDataChange schema(Neo4jCaptureDataChangeSchema schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Get schema
   * @return schema
   */
  @ApiModelProperty(required = true, value = "")
  public Neo4jCaptureDataChangeSchema getSchema() {
    return schema;
  }

  public void setSchema(Neo4jCaptureDataChangeSchema schema) {
    this.schema = schema;
  }

  public Neo4jCaptureDataChange payload(Neo4jCaptureDataChangePayload payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   * @return payload
   */
  @ApiModelProperty(required = true, value = "")
  public Neo4jCaptureDataChangePayload getPayload() {
    return payload;
  }

  public void setPayload(Neo4jCaptureDataChangePayload payload) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

