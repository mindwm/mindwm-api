package apimodels;

import apimodels.Neo4jCaptureDataChangeMeta;
import apimodels.Neo4jCaptureDataChangePayload;
import apimodels.Neo4jCaptureDataChangeSchema;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Neo4jCaptureDataChange
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-07-14T10:08:56.234850658Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Neo4jCaptureDataChange   {
  @JsonProperty("headers")
  @NotNull

  private Map<String, Object> headers = new HashMap<>();

  @JsonProperty("message_key")
  @NotNull

  private String messageKey;

  @JsonProperty("meta")
  @NotNull
@Valid

  private Neo4jCaptureDataChangeMeta meta;

  @JsonProperty("offset")
  @NotNull

  private Integer offset;

  @JsonProperty("partition")
  @NotNull

  private Integer partition;

  @JsonProperty("source_type")
  @NotNull

  private String sourceType;

  @JsonProperty("timestamp")
  @NotNull
@Valid

  private OffsetDateTime timestamp;

  @JsonProperty("topic")
  @NotNull

  private String topic;

  @JsonProperty("schema")
  @NotNull
@Valid

  private Neo4jCaptureDataChangeSchema schema;

  @JsonProperty("payload")
  @NotNull
@Valid

  private Neo4jCaptureDataChangePayload payload;

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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(headers, neo4jCaptureDataChange.headers) &&
        Objects.equals(messageKey, neo4jCaptureDataChange.messageKey) &&
        Objects.equals(meta, neo4jCaptureDataChange.meta) &&
        Objects.equals(offset, neo4jCaptureDataChange.offset) &&
        Objects.equals(partition, neo4jCaptureDataChange.partition) &&
        Objects.equals(sourceType, neo4jCaptureDataChange.sourceType) &&
        Objects.equals(timestamp, neo4jCaptureDataChange.timestamp) &&
        Objects.equals(topic, neo4jCaptureDataChange.topic) &&
        Objects.equals(schema, neo4jCaptureDataChange.schema) &&
        Objects.equals(payload, neo4jCaptureDataChange.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, messageKey, meta, offset, partition, sourceType, timestamp, topic, schema, payload);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

