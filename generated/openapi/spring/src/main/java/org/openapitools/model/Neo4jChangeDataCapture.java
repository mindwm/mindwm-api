package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.Neo4jChangeDataCaptureMeta;
import org.openapitools.model.Neo4jChangeDataCapturePayload;
import org.openapitools.model.Neo4jChangeDataCaptureSchema;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Neo4jChangeDataCapture
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-08-22T13:50:00.995778238Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jChangeDataCapture {

  @Valid
  private Map<String, Object> headers = new HashMap<>();

  private String messageKey;

  private Neo4jChangeDataCaptureMeta meta;

  private Integer offset;

  private Integer partition;

  private String sourceType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  private String topic;

  private Neo4jChangeDataCaptureSchema schema;

  private Neo4jChangeDataCapturePayload payload;

  public Neo4jChangeDataCapture() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Neo4jChangeDataCapture(Map<String, Object> headers, String messageKey, Neo4jChangeDataCaptureMeta meta, Integer offset, Integer partition, String sourceType, OffsetDateTime timestamp, String topic, Neo4jChangeDataCaptureSchema schema, Neo4jChangeDataCapturePayload payload) {
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

  public Neo4jChangeDataCapture headers(Map<String, Object> headers) {
    this.headers = headers;
    return this;
  }

  public Neo4jChangeDataCapture putHeadersItem(String key, Object headersItem) {
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

  public Neo4jChangeDataCapture messageKey(String messageKey) {
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

  public Neo4jChangeDataCapture meta(Neo4jChangeDataCaptureMeta meta) {
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
  public Neo4jChangeDataCaptureMeta getMeta() {
    return meta;
  }

  public void setMeta(Neo4jChangeDataCaptureMeta meta) {
    this.meta = meta;
  }

  public Neo4jChangeDataCapture offset(Integer offset) {
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

  public Neo4jChangeDataCapture partition(Integer partition) {
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

  public Neo4jChangeDataCapture sourceType(String sourceType) {
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

  public Neo4jChangeDataCapture timestamp(OffsetDateTime timestamp) {
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
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public Neo4jChangeDataCapture topic(String topic) {
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

  public Neo4jChangeDataCapture schema(Neo4jChangeDataCaptureSchema schema) {
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
  public Neo4jChangeDataCaptureSchema getSchema() {
    return schema;
  }

  public void setSchema(Neo4jChangeDataCaptureSchema schema) {
    this.schema = schema;
  }

  public Neo4jChangeDataCapture payload(Neo4jChangeDataCapturePayload payload) {
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
  public Neo4jChangeDataCapturePayload getPayload() {
    return payload;
  }

  public void setPayload(Neo4jChangeDataCapturePayload payload) {
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
    Neo4jChangeDataCapture neo4jChangeDataCapture = (Neo4jChangeDataCapture) o;
    return Objects.equals(this.headers, neo4jChangeDataCapture.headers) &&
        Objects.equals(this.messageKey, neo4jChangeDataCapture.messageKey) &&
        Objects.equals(this.meta, neo4jChangeDataCapture.meta) &&
        Objects.equals(this.offset, neo4jChangeDataCapture.offset) &&
        Objects.equals(this.partition, neo4jChangeDataCapture.partition) &&
        Objects.equals(this.sourceType, neo4jChangeDataCapture.sourceType) &&
        Objects.equals(this.timestamp, neo4jChangeDataCapture.timestamp) &&
        Objects.equals(this.topic, neo4jChangeDataCapture.topic) &&
        Objects.equals(this.schema, neo4jChangeDataCapture.schema) &&
        Objects.equals(this.payload, neo4jChangeDataCapture.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, messageKey, meta, offset, partition, sourceType, timestamp, topic, schema, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jChangeDataCapture {\n");
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

