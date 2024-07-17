/*
 * Mindwm API
 *
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * OpenAPI document version: 0.1.0
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.Neo4jCaptureDataChangeMeta;
import org.openapitools.model.Neo4jCaptureDataChangePayload;
import org.openapitools.model.Neo4jCaptureDataChangeSchema;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-07-17T13:48:28.958190303Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jCaptureDataChange   {
  
  private Map<String, Object> headers = new HashMap<>();
  private String messageKey;
  private Neo4jCaptureDataChangeMeta meta;
  private Integer offset;
  private Integer partition;
  private String sourceType;
  private Date timestamp;
  private String topic;
  private Neo4jCaptureDataChangeSchema schema;
  private Neo4jCaptureDataChangePayload payload;

  /**
   */
  public Neo4jCaptureDataChange headers(Map<String, Object> headers) {
    this.headers = headers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("headers")
  public Map<String, Object> getHeaders() {
    return headers;
  }
  public void setHeaders(Map<String, Object> headers) {
    this.headers = headers;
  }

  /**
   */
  public Neo4jCaptureDataChange messageKey(String messageKey) {
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
   */
  public Neo4jCaptureDataChange meta(Neo4jCaptureDataChangeMeta meta) {
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
   */
  public Neo4jCaptureDataChange offset(Integer offset) {
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
   */
  public Neo4jCaptureDataChange partition(Integer partition) {
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
   */
  public Neo4jCaptureDataChange sourceType(String sourceType) {
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
   */
  public Neo4jCaptureDataChange timestamp(Date timestamp) {
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
   */
  public Neo4jCaptureDataChange topic(String topic) {
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
   */
  public Neo4jCaptureDataChange schema(Neo4jCaptureDataChangeSchema schema) {
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
   */
  public Neo4jCaptureDataChange payload(Neo4jCaptureDataChangePayload payload) {
    this.payload = payload;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

