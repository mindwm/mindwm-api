package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Date;
import org.openapitools.model.Neo4jCaptureDataChangeMeta;
import org.openapitools.model.Neo4jCaptureDataChangeRelationshipPayload;
import org.openapitools.model.Neo4jCaptureDataChangeSchema;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GraphRelationshipAllOfData  {
  
  @ApiModelProperty(required = true, value = "")
  private Object headers;

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
  private Neo4jCaptureDataChangeRelationshipPayload payload;
 /**
  * Get headers
  * @return headers
  */
  @JsonProperty("headers")
  @NotNull
  public Object getHeaders() {
    return headers;
  }

  /**
   * Sets the <code>headers</code> property.
   */
 public void setHeaders(Object headers) {
    this.headers = headers;
  }

  /**
   * Sets the <code>headers</code> property.
   */
  public GraphRelationshipAllOfData headers(Object headers) {
    this.headers = headers;
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
  public GraphRelationshipAllOfData messageKey(String messageKey) {
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
  public GraphRelationshipAllOfData meta(Neo4jCaptureDataChangeMeta meta) {
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
  public GraphRelationshipAllOfData offset(Integer offset) {
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
  public GraphRelationshipAllOfData partition(Integer partition) {
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
  public GraphRelationshipAllOfData sourceType(String sourceType) {
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
  public GraphRelationshipAllOfData timestamp(Date timestamp) {
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
  public GraphRelationshipAllOfData topic(String topic) {
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
  public GraphRelationshipAllOfData schema(Neo4jCaptureDataChangeSchema schema) {
    this.schema = schema;
    return this;
  }

 /**
  * Get payload
  * @return payload
  */
  @JsonProperty("payload")
  @NotNull
  public Neo4jCaptureDataChangeRelationshipPayload getPayload() {
    return payload;
  }

  /**
   * Sets the <code>payload</code> property.
   */
 public void setPayload(Neo4jCaptureDataChangeRelationshipPayload payload) {
    this.payload = payload;
  }

  /**
   * Sets the <code>payload</code> property.
   */
  public GraphRelationshipAllOfData payload(Neo4jCaptureDataChangeRelationshipPayload payload) {
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
    GraphRelationshipAllOfData graphRelationshipAllOfData = (GraphRelationshipAllOfData) o;
    return Objects.equals(this.headers, graphRelationshipAllOfData.headers) &&
        Objects.equals(this.messageKey, graphRelationshipAllOfData.messageKey) &&
        Objects.equals(this.meta, graphRelationshipAllOfData.meta) &&
        Objects.equals(this.offset, graphRelationshipAllOfData.offset) &&
        Objects.equals(this.partition, graphRelationshipAllOfData.partition) &&
        Objects.equals(this.sourceType, graphRelationshipAllOfData.sourceType) &&
        Objects.equals(this.timestamp, graphRelationshipAllOfData.timestamp) &&
        Objects.equals(this.topic, graphRelationshipAllOfData.topic) &&
        Objects.equals(this.schema, graphRelationshipAllOfData.schema) &&
        Objects.equals(this.payload, graphRelationshipAllOfData.payload);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

