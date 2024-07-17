package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.openapitools.model.Neo4jCaptureDataChangeMeta;
import org.openapitools.model.Neo4jCaptureDataChangeNodePayload;
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
 * GraphNodeAllOfData
 */

@JsonTypeName("GraphNode_allOf_data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-17T16:10:09.497259654Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class GraphNodeAllOfData {

  private Object headers;

  private String messageKey;

  private Neo4jCaptureDataChangeMeta meta;

  private Integer offset;

  private Integer partition;

  private String sourceType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  private String topic;

  private Neo4jCaptureDataChangeSchema schema;

  private Neo4jCaptureDataChangeNodePayload payload;

  public GraphNodeAllOfData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GraphNodeAllOfData(Object headers, String messageKey, Neo4jCaptureDataChangeMeta meta, Integer offset, Integer partition, String sourceType, OffsetDateTime timestamp, String topic, Neo4jCaptureDataChangeSchema schema, Neo4jCaptureDataChangeNodePayload payload) {
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

  public GraphNodeAllOfData headers(Object headers) {
    this.headers = headers;
    return this;
  }

  /**
   * Get headers
   * @return headers
   */
  @NotNull 
  @Schema(name = "headers", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("headers")
  public Object getHeaders() {
    return headers;
  }

  public void setHeaders(Object headers) {
    this.headers = headers;
  }

  public GraphNodeAllOfData messageKey(String messageKey) {
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

  public GraphNodeAllOfData meta(Neo4jCaptureDataChangeMeta meta) {
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

  public GraphNodeAllOfData offset(Integer offset) {
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

  public GraphNodeAllOfData partition(Integer partition) {
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

  public GraphNodeAllOfData sourceType(String sourceType) {
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

  public GraphNodeAllOfData timestamp(OffsetDateTime timestamp) {
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

  public GraphNodeAllOfData topic(String topic) {
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

  public GraphNodeAllOfData schema(Neo4jCaptureDataChangeSchema schema) {
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

  public GraphNodeAllOfData payload(Neo4jCaptureDataChangeNodePayload payload) {
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
  public Neo4jCaptureDataChangeNodePayload getPayload() {
    return payload;
  }

  public void setPayload(Neo4jCaptureDataChangeNodePayload payload) {
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
    GraphNodeAllOfData graphNodeAllOfData = (GraphNodeAllOfData) o;
    return Objects.equals(this.headers, graphNodeAllOfData.headers) &&
        Objects.equals(this.messageKey, graphNodeAllOfData.messageKey) &&
        Objects.equals(this.meta, graphNodeAllOfData.meta) &&
        Objects.equals(this.offset, graphNodeAllOfData.offset) &&
        Objects.equals(this.partition, graphNodeAllOfData.partition) &&
        Objects.equals(this.sourceType, graphNodeAllOfData.sourceType) &&
        Objects.equals(this.timestamp, graphNodeAllOfData.timestamp) &&
        Objects.equals(this.topic, graphNodeAllOfData.topic) &&
        Objects.equals(this.schema, graphNodeAllOfData.schema) &&
        Objects.equals(this.payload, graphNodeAllOfData.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, messageKey, meta, offset, partition, sourceType, timestamp, topic, schema, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphNodeAllOfData {\n");
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

