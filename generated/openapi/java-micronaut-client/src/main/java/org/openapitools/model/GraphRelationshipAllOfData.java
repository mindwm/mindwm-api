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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.openapitools.model.Neo4jCaptureDataChangeMeta;
import org.openapitools.model.Neo4jCaptureDataChangeRelationshipPayload;
import org.openapitools.model.Neo4jCaptureDataChangeSchema;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * GraphRelationshipAllOfData
 */
@JsonPropertyOrder({
  GraphRelationshipAllOfData.JSON_PROPERTY_HEADERS,
  GraphRelationshipAllOfData.JSON_PROPERTY_MESSAGE_KEY,
  GraphRelationshipAllOfData.JSON_PROPERTY_META,
  GraphRelationshipAllOfData.JSON_PROPERTY_OFFSET,
  GraphRelationshipAllOfData.JSON_PROPERTY_PARTITION,
  GraphRelationshipAllOfData.JSON_PROPERTY_SOURCE_TYPE,
  GraphRelationshipAllOfData.JSON_PROPERTY_TIMESTAMP,
  GraphRelationshipAllOfData.JSON_PROPERTY_TOPIC,
  GraphRelationshipAllOfData.JSON_PROPERTY_SCHEMA,
  GraphRelationshipAllOfData.JSON_PROPERTY_PAYLOAD
})
@JsonTypeName("GraphRelationship_allOf_data")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-07-17T13:48:18.630465359Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@Introspected
public class GraphRelationshipAllOfData {
    public static final String JSON_PROPERTY_HEADERS = "headers";
    private Object headers;

    public static final String JSON_PROPERTY_MESSAGE_KEY = "message_key";
    private String messageKey;

    public static final String JSON_PROPERTY_META = "meta";
    private Neo4jCaptureDataChangeMeta meta;

    public static final String JSON_PROPERTY_OFFSET = "offset";
    private Integer offset;

    public static final String JSON_PROPERTY_PARTITION = "partition";
    private Integer partition;

    public static final String JSON_PROPERTY_SOURCE_TYPE = "source_type";
    private String sourceType;

    public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
    private OffsetDateTime timestamp;

    public static final String JSON_PROPERTY_TOPIC = "topic";
    private String topic;

    public static final String JSON_PROPERTY_SCHEMA = "schema";
    private Neo4jCaptureDataChangeSchema schema;

    public static final String JSON_PROPERTY_PAYLOAD = "payload";
    private Neo4jCaptureDataChangeRelationshipPayload payload;

    public GraphRelationshipAllOfData(Object headers, String messageKey, Neo4jCaptureDataChangeMeta meta, Integer offset, Integer partition, String sourceType, OffsetDateTime timestamp, String topic, Neo4jCaptureDataChangeSchema schema, Neo4jCaptureDataChangeRelationshipPayload payload) {
        this.headers = headers;
        this.messageKey = messageKey;
        this.meta = meta;
        this.offset = offset;
        this.partition = partition;
        this.sourceType = sourceType;
        this.timestamp = timestamp;
        this.topic = topic;
        this.schema = schema;
        this.payload = payload;
    }

    public GraphRelationshipAllOfData headers(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get headers
     * @return headers
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_HEADERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Object getHeaders() {
        return headers;
    }

    @JsonProperty(JSON_PROPERTY_HEADERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_MESSAGE_KEY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getMessageKey() {
        return messageKey;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGE_KEY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
     */
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_META)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Neo4jCaptureDataChangeMeta getMeta() {
        return meta;
    }

    @JsonProperty(JSON_PROPERTY_META)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_OFFSET)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getOffset() {
        return offset;
    }

    @JsonProperty(JSON_PROPERTY_OFFSET)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_PARTITION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getPartition() {
        return partition;
    }

    @JsonProperty(JSON_PROPERTY_PARTITION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getSourceType() {
        return sourceType;
    }

    @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public GraphRelationshipAllOfData timestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     * @return timestamp
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    @JsonProperty(JSON_PROPERTY_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public GraphRelationshipAllOfData topic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * Get topic
     * @return topic
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_TOPIC)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getTopic() {
        return topic;
    }

    @JsonProperty(JSON_PROPERTY_TOPIC)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
     */
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_SCHEMA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Neo4jCaptureDataChangeSchema getSchema() {
        return schema;
    }

    @JsonProperty(JSON_PROPERTY_SCHEMA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
     */
    @Valid
    @NotNull
    @JsonProperty(JSON_PROPERTY_PAYLOAD)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Neo4jCaptureDataChangeRelationshipPayload getPayload() {
        return payload;
    }

    @JsonProperty(JSON_PROPERTY_PAYLOAD)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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

