package apimodels;

import apimodels.Neo4jCaptureDataChangeMeta;
import apimodels.Neo4jCaptureDataChangeNodePayload;
import apimodels.Neo4jCaptureDataChangeSchema;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GraphNodeAllOfData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-07-21T21:29:28.054395936Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GraphNodeAllOfData   {
  @JsonProperty("headers")
  @NotNull

  private Object headers;

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

  private Neo4jCaptureDataChangeNodePayload payload;

  public GraphNodeAllOfData headers(Object headers) {
    this.headers = headers;
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(headers, graphNodeAllOfData.headers) &&
        Objects.equals(messageKey, graphNodeAllOfData.messageKey) &&
        Objects.equals(meta, graphNodeAllOfData.meta) &&
        Objects.equals(offset, graphNodeAllOfData.offset) &&
        Objects.equals(partition, graphNodeAllOfData.partition) &&
        Objects.equals(sourceType, graphNodeAllOfData.sourceType) &&
        Objects.equals(timestamp, graphNodeAllOfData.timestamp) &&
        Objects.equals(topic, graphNodeAllOfData.topic) &&
        Objects.equals(schema, graphNodeAllOfData.schema) &&
        Objects.equals(payload, graphNodeAllOfData.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, messageKey, meta, offset, partition, sourceType, timestamp, topic, schema, payload);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

