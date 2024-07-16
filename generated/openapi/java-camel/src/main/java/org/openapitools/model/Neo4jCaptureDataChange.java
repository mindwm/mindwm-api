package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.Neo4jCaptureDataChangeMeta;
import org.openapitools.model.Neo4jCaptureDataChangePayload;
import org.openapitools.model.Neo4jCaptureDataChangeSchema;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Neo4jCaptureDataChange
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-07-16T19:19:22.317989189Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jCaptureDataChange {

  @Valid
  private Map<String, Object> headers = new HashMap<>();

  private String messageKey;

  private Neo4jCaptureDataChangeMeta meta;

  private Integer offset;

  private Integer partition;

  private String sourceType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date timestamp;

  private String topic;

  private Neo4jCaptureDataChangeSchema schema;

  private Neo4jCaptureDataChangePayload payload;

  public Neo4jCaptureDataChange() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Neo4jCaptureDataChange(Map<String, Object> headers, String messageKey, Neo4jCaptureDataChangeMeta meta, Integer offset, Integer partition, String sourceType, Date timestamp, String topic, Neo4jCaptureDataChangeSchema schema, Neo4jCaptureDataChangePayload payload) {
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

  public Neo4jCaptureDataChange headers(Map<String, Object> headers) {
    this.headers = headers;
    return this;
  }

  public Neo4jCaptureDataChange putHeadersItem(String key, Object headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

  /**
   * Get headers
   * @return headers
   */
  @NotNull 
  @Schema(name = "headers", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("headers")
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
  @NotNull 
  @Schema(name = "message_key", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message_key")
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
  @NotNull @Valid 
  @Schema(name = "meta", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("meta")
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
  @NotNull 
  @Schema(name = "offset", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offset")
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
  @NotNull 
  @Schema(name = "partition", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("partition")
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
  @NotNull 
  @Schema(name = "source_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("source_type")
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  public Neo4jCaptureDataChange timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   */
  @NotNull @Valid 
  @Schema(name = "timestamp", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
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
  @NotNull 
  @Schema(name = "topic", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("topic")
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
  @NotNull @Valid 
  @Schema(name = "schema", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schema")
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
  @NotNull @Valid 
  @Schema(name = "payload", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("payload")
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

