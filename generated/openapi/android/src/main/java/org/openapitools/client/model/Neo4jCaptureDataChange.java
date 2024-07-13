/**
 * Mindwm API
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.Date;
import java.util.Map;
import org.openapitools.client.model.Neo4jCaptureDataChangeMeta;
import org.openapitools.client.model.Neo4jCaptureDataChangePayload;
import org.openapitools.client.model.Neo4jCaptureDataChangeSchema;
import org.openapitools.client.model.OasAnyTypeNotMapped;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Neo4jCaptureDataChange {
  
  @SerializedName("headers")
  private Map<String, OasAnyTypeNotMapped> headers = null;
  @SerializedName("message_key")
  private String messageKey = null;
  @SerializedName("meta")
  private Neo4jCaptureDataChangeMeta meta = null;
  @SerializedName("offset")
  private Integer offset = null;
  @SerializedName("partition")
  private Integer partition = null;
  @SerializedName("source_type")
  private String sourceType = null;
  @SerializedName("timestamp")
  private Date timestamp = null;
  @SerializedName("topic")
  private String topic = null;
  @SerializedName("schema")
  private Neo4jCaptureDataChangeSchema schema = null;
  @SerializedName("payload")
  private Neo4jCaptureDataChangePayload payload = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Map<String, OasAnyTypeNotMapped> getHeaders() {
    return headers;
  }
  public void setHeaders(Map<String, OasAnyTypeNotMapped> headers) {
    this.headers = headers;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getMessageKey() {
    return messageKey;
  }
  public void setMessageKey(String messageKey) {
    this.messageKey = messageKey;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Neo4jCaptureDataChangeMeta getMeta() {
    return meta;
  }
  public void setMeta(Neo4jCaptureDataChangeMeta meta) {
    this.meta = meta;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getOffset() {
    return offset;
  }
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getPartition() {
    return partition;
  }
  public void setPartition(Integer partition) {
    this.partition = partition;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSourceType() {
    return sourceType;
  }
  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTopic() {
    return topic;
  }
  public void setTopic(String topic) {
    this.topic = topic;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Neo4jCaptureDataChangeSchema getSchema() {
    return schema;
  }
  public void setSchema(Neo4jCaptureDataChangeSchema schema) {
    this.schema = schema;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
    return (this.headers == null ? neo4jCaptureDataChange.headers == null : this.headers.equals(neo4jCaptureDataChange.headers)) &&
        (this.messageKey == null ? neo4jCaptureDataChange.messageKey == null : this.messageKey.equals(neo4jCaptureDataChange.messageKey)) &&
        (this.meta == null ? neo4jCaptureDataChange.meta == null : this.meta.equals(neo4jCaptureDataChange.meta)) &&
        (this.offset == null ? neo4jCaptureDataChange.offset == null : this.offset.equals(neo4jCaptureDataChange.offset)) &&
        (this.partition == null ? neo4jCaptureDataChange.partition == null : this.partition.equals(neo4jCaptureDataChange.partition)) &&
        (this.sourceType == null ? neo4jCaptureDataChange.sourceType == null : this.sourceType.equals(neo4jCaptureDataChange.sourceType)) &&
        (this.timestamp == null ? neo4jCaptureDataChange.timestamp == null : this.timestamp.equals(neo4jCaptureDataChange.timestamp)) &&
        (this.topic == null ? neo4jCaptureDataChange.topic == null : this.topic.equals(neo4jCaptureDataChange.topic)) &&
        (this.schema == null ? neo4jCaptureDataChange.schema == null : this.schema.equals(neo4jCaptureDataChange.schema)) &&
        (this.payload == null ? neo4jCaptureDataChange.payload == null : this.payload.equals(neo4jCaptureDataChange.payload));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.headers == null ? 0: this.headers.hashCode());
    result = 31 * result + (this.messageKey == null ? 0: this.messageKey.hashCode());
    result = 31 * result + (this.meta == null ? 0: this.meta.hashCode());
    result = 31 * result + (this.offset == null ? 0: this.offset.hashCode());
    result = 31 * result + (this.partition == null ? 0: this.partition.hashCode());
    result = 31 * result + (this.sourceType == null ? 0: this.sourceType.hashCode());
    result = 31 * result + (this.timestamp == null ? 0: this.timestamp.hashCode());
    result = 31 * result + (this.topic == null ? 0: this.topic.hashCode());
    result = 31 * result + (this.schema == null ? 0: this.schema.hashCode());
    result = 31 * result + (this.payload == null ? 0: this.payload.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jCaptureDataChange {\n");
    
    sb.append("  headers: ").append(headers).append("\n");
    sb.append("  messageKey: ").append(messageKey).append("\n");
    sb.append("  meta: ").append(meta).append("\n");
    sb.append("  offset: ").append(offset).append("\n");
    sb.append("  partition: ").append(partition).append("\n");
    sb.append("  sourceType: ").append(sourceType).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  topic: ").append(topic).append("\n");
    sb.append("  schema: ").append(schema).append("\n");
    sb.append("  payload: ").append(payload).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
