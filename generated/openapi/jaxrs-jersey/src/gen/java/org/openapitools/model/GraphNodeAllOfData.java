/*
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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.Neo4jCaptureDataChangeMeta;
import org.openapitools.model.Neo4jCaptureDataChangeNodePayload;
import org.openapitools.model.Neo4jCaptureDataChangeSchema;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * GraphNodeAllOfData
 */
@JsonPropertyOrder({
  GraphNodeAllOfData.JSON_PROPERTY_HEADERS,
  GraphNodeAllOfData.JSON_PROPERTY_MESSAGE_KEY,
  GraphNodeAllOfData.JSON_PROPERTY_META,
  GraphNodeAllOfData.JSON_PROPERTY_OFFSET,
  GraphNodeAllOfData.JSON_PROPERTY_PARTITION,
  GraphNodeAllOfData.JSON_PROPERTY_SOURCE_TYPE,
  GraphNodeAllOfData.JSON_PROPERTY_TIMESTAMP,
  GraphNodeAllOfData.JSON_PROPERTY_TOPIC,
  GraphNodeAllOfData.JSON_PROPERTY_SCHEMA,
  GraphNodeAllOfData.JSON_PROPERTY_PAYLOAD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-07-14T10:09:10.277456772Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class GraphNodeAllOfData   {
  public static final String JSON_PROPERTY_HEADERS = "headers";
  @JsonProperty(JSON_PROPERTY_HEADERS)
  private Object headers;

  public static final String JSON_PROPERTY_MESSAGE_KEY = "message_key";
  @JsonProperty(JSON_PROPERTY_MESSAGE_KEY)
  private String messageKey;

  public static final String JSON_PROPERTY_META = "meta";
  @JsonProperty(JSON_PROPERTY_META)
  private Neo4jCaptureDataChangeMeta meta;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  @JsonProperty(JSON_PROPERTY_OFFSET)
  private Integer offset;

  public static final String JSON_PROPERTY_PARTITION = "partition";
  @JsonProperty(JSON_PROPERTY_PARTITION)
  private Integer partition;

  public static final String JSON_PROPERTY_SOURCE_TYPE = "source_type";
  @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
  private String sourceType;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  private Date timestamp;

  public static final String JSON_PROPERTY_TOPIC = "topic";
  @JsonProperty(JSON_PROPERTY_TOPIC)
  private String topic;

  public static final String JSON_PROPERTY_SCHEMA = "schema";
  @JsonProperty(JSON_PROPERTY_SCHEMA)
  private Neo4jCaptureDataChangeSchema schema;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  private Neo4jCaptureDataChangeNodePayload payload;

  public GraphNodeAllOfData headers(Object headers) {
    this.headers = headers;
    return this;
  }

  /**
   * Get headers
   * @return headers
   **/
  @JsonProperty(value = "headers")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
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
  @JsonProperty(value = "message_key")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
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
  @JsonProperty(value = "meta")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
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
  @JsonProperty(value = "offset")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
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
  @JsonProperty(value = "partition")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
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
  @JsonProperty(value = "source_type")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  public GraphNodeAllOfData timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   **/
  @JsonProperty(value = "timestamp")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
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
  @JsonProperty(value = "topic")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
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
  @JsonProperty(value = "schema")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
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
  @JsonProperty(value = "payload")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
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

