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

package org.openapitools.server.model;

import java.util.Date;
import org.openapitools.server.model.Neo4jCaptureDataChangeMeta;
import org.openapitools.server.model.Neo4jCaptureDataChangeRelationshipPayload;
import org.openapitools.server.model.Neo4jCaptureDataChangeSchema;
import java.lang.reflect.Type;
import javax.json.bind.annotation.JsonbTypeDeserializer;
import javax.json.bind.annotation.JsonbTypeSerializer;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.bind.annotation.JsonbProperty;


public class GraphRelationshipAllOfData  {
  
  @JsonbProperty("headers")
  private Object headers;

  @JsonbProperty("message_key")
  private String messageKey;

  @JsonbProperty("meta")
  private Neo4jCaptureDataChangeMeta meta;

  @JsonbProperty("offset")
  private Integer offset;

  @JsonbProperty("partition")
  private Integer partition;

  @JsonbProperty("source_type")
  private String sourceType;

  @JsonbProperty("timestamp")
  private Date timestamp;

  @JsonbProperty("topic")
  private String topic;

  @JsonbProperty("schema")
  private Neo4jCaptureDataChangeSchema schema;

  @JsonbProperty("payload")
  private Neo4jCaptureDataChangeRelationshipPayload payload;

  /**
   * Get headers
   * @return headers
   **/
  public Object getHeaders() {
    return headers;
  }

  /**
   * Set headers
   */
  public void setHeaders(Object headers) {
    this.headers = headers;
  }

  public GraphRelationshipAllOfData headers(Object headers) {
    this.headers = headers;
    return this;
  }

  /**
   * Get messageKey
   * @return messageKey
   **/
  public String getMessageKey() {
    return messageKey;
  }

  /**
   * Set messageKey
   */
  public void setMessageKey(String messageKey) {
    this.messageKey = messageKey;
  }

  public GraphRelationshipAllOfData messageKey(String messageKey) {
    this.messageKey = messageKey;
    return this;
  }

  /**
   * Get meta
   * @return meta
   **/
  public Neo4jCaptureDataChangeMeta getMeta() {
    return meta;
  }

  /**
   * Set meta
   */
  public void setMeta(Neo4jCaptureDataChangeMeta meta) {
    this.meta = meta;
  }

  public GraphRelationshipAllOfData meta(Neo4jCaptureDataChangeMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get offset
   * @return offset
   **/
  public Integer getOffset() {
    return offset;
  }

  /**
   * Set offset
   */
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public GraphRelationshipAllOfData offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get partition
   * @return partition
   **/
  public Integer getPartition() {
    return partition;
  }

  /**
   * Set partition
   */
  public void setPartition(Integer partition) {
    this.partition = partition;
  }

  public GraphRelationshipAllOfData partition(Integer partition) {
    this.partition = partition;
    return this;
  }

  /**
   * Get sourceType
   * @return sourceType
   **/
  public String getSourceType() {
    return sourceType;
  }

  /**
   * Set sourceType
   */
  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  public GraphRelationshipAllOfData sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   **/
  public Date getTimestamp() {
    return timestamp;
  }

  /**
   * Set timestamp
   */
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public GraphRelationshipAllOfData timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get topic
   * @return topic
   **/
  public String getTopic() {
    return topic;
  }

  /**
   * Set topic
   */
  public void setTopic(String topic) {
    this.topic = topic;
  }

  public GraphRelationshipAllOfData topic(String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * Get schema
   * @return schema
   **/
  public Neo4jCaptureDataChangeSchema getSchema() {
    return schema;
  }

  /**
   * Set schema
   */
  public void setSchema(Neo4jCaptureDataChangeSchema schema) {
    this.schema = schema;
  }

  public GraphRelationshipAllOfData schema(Neo4jCaptureDataChangeSchema schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Get payload
   * @return payload
   **/
  public Neo4jCaptureDataChangeRelationshipPayload getPayload() {
    return payload;
  }

  /**
   * Set payload
   */
  public void setPayload(Neo4jCaptureDataChangeRelationshipPayload payload) {
    this.payload = payload;
  }

  public GraphRelationshipAllOfData payload(Neo4jCaptureDataChangeRelationshipPayload payload) {
    this.payload = payload;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
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

