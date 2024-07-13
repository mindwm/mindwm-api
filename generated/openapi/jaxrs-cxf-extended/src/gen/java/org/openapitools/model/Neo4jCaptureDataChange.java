package org.openapitools.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.Neo4jCaptureDataChangeMeta;
import org.openapitools.model.Neo4jCaptureDataChangePayload;
import org.openapitools.model.Neo4jCaptureDataChangeSchema;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Neo4jCaptureDataChange  {
  
  @ApiModelProperty(required = true, value = "")
  private Map<String, Object> headers = new HashMap<>();

  @ApiModelProperty(required = true, value = "")
  private String messageKey;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Neo4jCaptureDataChangeMeta meta;

  @ApiModelProperty(required = true, value = "")
  private Integer offset;

  @ApiModelProperty(required = true, value = "")
  private Integer partition;

  @ApiModelProperty(required = true, value = "")
  private String sourceType;

  @ApiModelProperty(required = true, value = "")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date timestamp;

  @ApiModelProperty(required = true, value = "")
  private String topic;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Neo4jCaptureDataChangeSchema schema;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Neo4jCaptureDataChangePayload payload;
 /**
  * Get headers
  * @return headers
  */
  @JsonProperty("headers")
  @NotNull
  public Map<String, Object> getHeaders() {
    return headers;
  }

  /**
   * Sets the <code>headers</code> property.
   */
 public void setHeaders(Map<String, Object> headers) {
    this.headers = headers;
  }

  /**
   * Sets the <code>headers</code> property.
   */
  public Neo4jCaptureDataChange headers(Map<String, Object> headers) {
    this.headers = headers;
    return this;
  }

  /**
   * Puts a new item into the <code>headers</code> map.
   */
  public Neo4jCaptureDataChange putHeadersItem(String key, Object headersItem) {
    this.headers.put(key, headersItem);
    return this;
  }

 /**
  * Get messageKey
  * @return messageKey
  */
  @JsonProperty("message_key")
  @NotNull
  public String getMessageKey() {
    return messageKey;
  }

  /**
   * Sets the <code>messageKey</code> property.
   */
 public void setMessageKey(String messageKey) {
    this.messageKey = messageKey;
  }

  /**
   * Sets the <code>messageKey</code> property.
   */
  public Neo4jCaptureDataChange messageKey(String messageKey) {
    this.messageKey = messageKey;
    return this;
  }

 /**
  * Get meta
  * @return meta
  */
  @JsonProperty("meta")
  @NotNull
  public Neo4jCaptureDataChangeMeta getMeta() {
    return meta;
  }

  /**
   * Sets the <code>meta</code> property.
   */
 public void setMeta(Neo4jCaptureDataChangeMeta meta) {
    this.meta = meta;
  }

  /**
   * Sets the <code>meta</code> property.
   */
  public Neo4jCaptureDataChange meta(Neo4jCaptureDataChangeMeta meta) {
    this.meta = meta;
    return this;
  }

 /**
  * Get offset
  * @return offset
  */
  @JsonProperty("offset")
  @NotNull
  public Integer getOffset() {
    return offset;
  }

  /**
   * Sets the <code>offset</code> property.
   */
 public void setOffset(Integer offset) {
    this.offset = offset;
  }

  /**
   * Sets the <code>offset</code> property.
   */
  public Neo4jCaptureDataChange offset(Integer offset) {
    this.offset = offset;
    return this;
  }

 /**
  * Get partition
  * @return partition
  */
  @JsonProperty("partition")
  @NotNull
  public Integer getPartition() {
    return partition;
  }

  /**
   * Sets the <code>partition</code> property.
   */
 public void setPartition(Integer partition) {
    this.partition = partition;
  }

  /**
   * Sets the <code>partition</code> property.
   */
  public Neo4jCaptureDataChange partition(Integer partition) {
    this.partition = partition;
    return this;
  }

 /**
  * Get sourceType
  * @return sourceType
  */
  @JsonProperty("source_type")
  @NotNull
  public String getSourceType() {
    return sourceType;
  }

  /**
   * Sets the <code>sourceType</code> property.
   */
 public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  /**
   * Sets the <code>sourceType</code> property.
   */
  public Neo4jCaptureDataChange sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

 /**
  * Get timestamp
  * @return timestamp
  */
  @JsonProperty("timestamp")
  @NotNull
  public Date getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the <code>timestamp</code> property.
   */
 public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Sets the <code>timestamp</code> property.
   */
  public Neo4jCaptureDataChange timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }

 /**
  * Get topic
  * @return topic
  */
  @JsonProperty("topic")
  @NotNull
  public String getTopic() {
    return topic;
  }

  /**
   * Sets the <code>topic</code> property.
   */
 public void setTopic(String topic) {
    this.topic = topic;
  }

  /**
   * Sets the <code>topic</code> property.
   */
  public Neo4jCaptureDataChange topic(String topic) {
    this.topic = topic;
    return this;
  }

 /**
  * Get schema
  * @return schema
  */
  @JsonProperty("schema")
  @NotNull
  public Neo4jCaptureDataChangeSchema getSchema() {
    return schema;
  }

  /**
   * Sets the <code>schema</code> property.
   */
 public void setSchema(Neo4jCaptureDataChangeSchema schema) {
    this.schema = schema;
  }

  /**
   * Sets the <code>schema</code> property.
   */
  public Neo4jCaptureDataChange schema(Neo4jCaptureDataChangeSchema schema) {
    this.schema = schema;
    return this;
  }

 /**
  * Get payload
  * @return payload
  */
  @JsonProperty("payload")
  @NotNull
  public Neo4jCaptureDataChangePayload getPayload() {
    return payload;
  }

  /**
   * Sets the <code>payload</code> property.
   */
 public void setPayload(Neo4jCaptureDataChangePayload payload) {
    this.payload = payload;
  }

  /**
   * Sets the <code>payload</code> property.
   */
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

