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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-07-17T13:48:16.702923304Z[Etc/UTC]", comments = "Generator version: 7.7.0")
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

  /**
   **/
  public GraphRelationshipAllOfData headers(Object headers) {
    this.headers = headers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("headers")
  public Object getHeaders() {
    return headers;
  }
  public void setHeaders(Object headers) {
    this.headers = headers;
  }

  /**
   **/
  public GraphRelationshipAllOfData messageKey(String messageKey) {
    this.messageKey = messageKey;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("message_key")
  public String getMessageKey() {
    return messageKey;
  }
  public void setMessageKey(String messageKey) {
    this.messageKey = messageKey;
  }

  /**
   **/
  public GraphRelationshipAllOfData meta(Neo4jCaptureDataChangeMeta meta) {
    this.meta = meta;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("meta")
  public Neo4jCaptureDataChangeMeta getMeta() {
    return meta;
  }
  public void setMeta(Neo4jCaptureDataChangeMeta meta) {
    this.meta = meta;
  }

  /**
   **/
  public GraphRelationshipAllOfData offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  /**
   **/
  public GraphRelationshipAllOfData partition(Integer partition) {
    this.partition = partition;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("partition")
  public Integer getPartition() {
    return partition;
  }
  public void setPartition(Integer partition) {
    this.partition = partition;
  }

  /**
   **/
  public GraphRelationshipAllOfData sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("source_type")
  public String getSourceType() {
    return sourceType;
  }
  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  /**
   **/
  public GraphRelationshipAllOfData timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  public GraphRelationshipAllOfData topic(String topic) {
    this.topic = topic;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("topic")
  public String getTopic() {
    return topic;
  }
  public void setTopic(String topic) {
    this.topic = topic;
  }

  /**
   **/
  public GraphRelationshipAllOfData schema(Neo4jCaptureDataChangeSchema schema) {
    this.schema = schema;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("schema")
  public Neo4jCaptureDataChangeSchema getSchema() {
    return schema;
  }
  public void setSchema(Neo4jCaptureDataChangeSchema schema) {
    this.schema = schema;
  }

  /**
   **/
  public GraphRelationshipAllOfData payload(Neo4jCaptureDataChangeRelationshipPayload payload) {
    this.payload = payload;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("payload")
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

