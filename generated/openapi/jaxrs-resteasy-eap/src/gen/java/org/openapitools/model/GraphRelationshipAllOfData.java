package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.Neo4jCaptureDataChangeMeta;
import org.openapitools.model.Neo4jCaptureDataChangeRelationshipPayload;
import org.openapitools.model.Neo4jCaptureDataChangeSchema;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-07-17T13:48:45.075419003Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class GraphRelationshipAllOfData   {
  
  private Object headers;
  private String messageKey;
  private Neo4jCaptureDataChangeMeta meta;
  private Integer offset;
  private Integer partition;
  private String sourceType;
  private Date timestamp;
  private String topic;
  private Neo4jCaptureDataChangeSchema schema;
  private Neo4jCaptureDataChangeRelationshipPayload payload;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("headers")
  @NotNull
  public Object getHeaders() {
    return headers;
  }
  public void setHeaders(Object headers) {
    this.headers = headers;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("message_key")
  @NotNull
  public String getMessageKey() {
    return messageKey;
  }
  public void setMessageKey(String messageKey) {
    this.messageKey = messageKey;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("meta")
  @NotNull
  public Neo4jCaptureDataChangeMeta getMeta() {
    return meta;
  }
  public void setMeta(Neo4jCaptureDataChangeMeta meta) {
    this.meta = meta;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("offset")
  @NotNull
  public Integer getOffset() {
    return offset;
  }
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("partition")
  @NotNull
  public Integer getPartition() {
    return partition;
  }
  public void setPartition(Integer partition) {
    this.partition = partition;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("source_type")
  @NotNull
  public String getSourceType() {
    return sourceType;
  }
  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("timestamp")
  @NotNull
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("topic")
  @NotNull
  public String getTopic() {
    return topic;
  }
  public void setTopic(String topic) {
    this.topic = topic;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("schema")
  @NotNull
  public Neo4jCaptureDataChangeSchema getSchema() {
    return schema;
  }
  public void setSchema(Neo4jCaptureDataChangeSchema schema) {
    this.schema = schema;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("payload")
  @NotNull
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

