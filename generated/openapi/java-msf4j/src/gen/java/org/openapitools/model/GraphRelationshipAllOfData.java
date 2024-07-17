package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.Neo4jCaptureDataChangeMeta;
import org.openapitools.model.Neo4jCaptureDataChangeRelationshipPayload;
import org.openapitools.model.Neo4jCaptureDataChangeSchema;

/**
 * GraphRelationshipAllOfData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-07-17T14:05:04.217749254Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class GraphRelationshipAllOfData   {
  @JsonProperty("headers")
  private Object headers;

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
  private Date timestamp;

  @JsonProperty("topic")
  private String topic;

  @JsonProperty("schema")
  private Neo4jCaptureDataChangeSchema schema;

  @JsonProperty("payload")
  private Neo4jCaptureDataChangeRelationshipPayload payload;

  public GraphRelationshipAllOfData headers(Object headers) {
    this.headers = headers;
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  public GraphRelationshipAllOfData timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "")
  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

