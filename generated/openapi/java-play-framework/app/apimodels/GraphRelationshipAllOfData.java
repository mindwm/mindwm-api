package apimodels;

import apimodels.Neo4jCaptureDataChangeMeta;
import apimodels.Neo4jCaptureDataChangeRelationshipPayload;
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
 * GraphRelationshipAllOfData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-07-16T18:18:02.788007463Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GraphRelationshipAllOfData   {
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

  private Neo4jCaptureDataChangeRelationshipPayload payload;

  public GraphRelationshipAllOfData headers(Object headers) {
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

  public GraphRelationshipAllOfData messageKey(String messageKey) {
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

  public GraphRelationshipAllOfData meta(Neo4jCaptureDataChangeMeta meta) {
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

  public GraphRelationshipAllOfData offset(Integer offset) {
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

  public GraphRelationshipAllOfData partition(Integer partition) {
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

  public GraphRelationshipAllOfData sourceType(String sourceType) {
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

  public GraphRelationshipAllOfData timestamp(OffsetDateTime timestamp) {
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

  public GraphRelationshipAllOfData topic(String topic) {
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

  public GraphRelationshipAllOfData schema(Neo4jCaptureDataChangeSchema schema) {
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

  public GraphRelationshipAllOfData payload(Neo4jCaptureDataChangeRelationshipPayload payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

