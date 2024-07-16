package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.Neo4jCaptureDataChangeMeta;
import org.openapitools.model.Neo4jCaptureDataChangeNodePayload;
import org.openapitools.model.Neo4jCaptureDataChangeSchema;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("GraphNode_allOf_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-07-16T18:18:23.167745866Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class GraphNodeAllOfData   {
  private Object headers;
  private String messageKey;
  private Neo4jCaptureDataChangeMeta meta;
  private Integer offset;
  private Integer partition;
  private String sourceType;
  private Date timestamp;
  private String topic;
  private Neo4jCaptureDataChangeSchema schema;
  private Neo4jCaptureDataChangeNodePayload payload;

  /**
   **/
  public GraphNodeAllOfData headers(Object headers) {
    this.headers = headers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("headers")
  @NotNull public Object getHeaders() {
    return headers;
  }

  @JsonProperty("headers")
  public void setHeaders(Object headers) {
    this.headers = headers;
  }

  /**
   **/
  public GraphNodeAllOfData messageKey(String messageKey) {
    this.messageKey = messageKey;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("message_key")
  @NotNull public String getMessageKey() {
    return messageKey;
  }

  @JsonProperty("message_key")
  public void setMessageKey(String messageKey) {
    this.messageKey = messageKey;
  }

  /**
   **/
  public GraphNodeAllOfData meta(Neo4jCaptureDataChangeMeta meta) {
    this.meta = meta;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("meta")
  @NotNull @Valid public Neo4jCaptureDataChangeMeta getMeta() {
    return meta;
  }

  @JsonProperty("meta")
  public void setMeta(Neo4jCaptureDataChangeMeta meta) {
    this.meta = meta;
  }

  /**
   **/
  public GraphNodeAllOfData offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("offset")
  @NotNull public Integer getOffset() {
    return offset;
  }

  @JsonProperty("offset")
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  /**
   **/
  public GraphNodeAllOfData partition(Integer partition) {
    this.partition = partition;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("partition")
  @NotNull public Integer getPartition() {
    return partition;
  }

  @JsonProperty("partition")
  public void setPartition(Integer partition) {
    this.partition = partition;
  }

  /**
   **/
  public GraphNodeAllOfData sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("source_type")
  @NotNull public String getSourceType() {
    return sourceType;
  }

  @JsonProperty("source_type")
  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  /**
   **/
  public GraphNodeAllOfData timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("timestamp")
  @NotNull public Date getTimestamp() {
    return timestamp;
  }

  @JsonProperty("timestamp")
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  public GraphNodeAllOfData topic(String topic) {
    this.topic = topic;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("topic")
  @NotNull public String getTopic() {
    return topic;
  }

  @JsonProperty("topic")
  public void setTopic(String topic) {
    this.topic = topic;
  }

  /**
   **/
  public GraphNodeAllOfData schema(Neo4jCaptureDataChangeSchema schema) {
    this.schema = schema;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("schema")
  @NotNull @Valid public Neo4jCaptureDataChangeSchema getSchema() {
    return schema;
  }

  @JsonProperty("schema")
  public void setSchema(Neo4jCaptureDataChangeSchema schema) {
    this.schema = schema;
  }

  /**
   **/
  public GraphNodeAllOfData payload(Neo4jCaptureDataChangeNodePayload payload) {
    this.payload = payload;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("payload")
  @NotNull @Valid public Neo4jCaptureDataChangeNodePayload getPayload() {
    return payload;
  }

  @JsonProperty("payload")
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

