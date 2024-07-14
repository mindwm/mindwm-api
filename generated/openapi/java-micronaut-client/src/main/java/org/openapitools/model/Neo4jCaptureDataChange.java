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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.Neo4jCaptureDataChangeMeta;
import org.openapitools.model.Neo4jCaptureDataChangePayload;
import org.openapitools.model.Neo4jCaptureDataChangeSchema;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Neo4jCaptureDataChange
 */
@JsonPropertyOrder({
  Neo4jCaptureDataChange.JSON_PROPERTY_HEADERS,
  Neo4jCaptureDataChange.JSON_PROPERTY_MESSAGE_KEY,
  Neo4jCaptureDataChange.JSON_PROPERTY_META,
  Neo4jCaptureDataChange.JSON_PROPERTY_OFFSET,
  Neo4jCaptureDataChange.JSON_PROPERTY_PARTITION,
  Neo4jCaptureDataChange.JSON_PROPERTY_SOURCE_TYPE,
  Neo4jCaptureDataChange.JSON_PROPERTY_TIMESTAMP,
  Neo4jCaptureDataChange.JSON_PROPERTY_TOPIC,
  Neo4jCaptureDataChange.JSON_PROPERTY_SCHEMA,
  Neo4jCaptureDataChange.JSON_PROPERTY_PAYLOAD
})
@JsonTypeName("Neo4jCaptureDataChange")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-07-14T12:11:45.607314551Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@Introspected
public class Neo4jCaptureDataChange {
    public static final String JSON_PROPERTY_HEADERS = "headers";
    private Map<String, Object> headers = new HashMap<>();

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
    private Neo4jCaptureDataChangePayload payload;

    public Neo4jCaptureDataChange(Map<String, Object> headers, String messageKey, Neo4jCaptureDataChangeMeta meta, Integer offset, Integer partition, String sourceType, OffsetDateTime timestamp, String topic, Neo4jCaptureDataChangeSchema schema, Neo4jCaptureDataChangePayload payload) {
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

    public Neo4jCaptureDataChange headers(Map<String, Object> headers) {
        this.headers = headers;
        return this;
    }

    public Neo4jCaptureDataChange putHeadersItem(String key, Object headersItem) {
        this.headers.put(key, headersItem);
        return this;
  }

    /**
     * Get headers
     * @return headers
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_HEADERS)
    @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)
    public Map<String, Object> getHeaders() {
        return headers;
    }

    @JsonProperty(JSON_PROPERTY_HEADERS)
    @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)
    public void setHeaders(Map<String, Object> headers) {
        this.headers = headers;
    }

    public Neo4jCaptureDataChange messageKey(String messageKey) {
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

    public Neo4jCaptureDataChange meta(Neo4jCaptureDataChangeMeta meta) {
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

    public Neo4jCaptureDataChange offset(Integer offset) {
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

    public Neo4jCaptureDataChange partition(Integer partition) {
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

    public Neo4jCaptureDataChange sourceType(String sourceType) {
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

    public Neo4jCaptureDataChange timestamp(OffsetDateTime timestamp) {
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

    public Neo4jCaptureDataChange topic(String topic) {
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

    public Neo4jCaptureDataChange schema(Neo4jCaptureDataChangeSchema schema) {
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

    public Neo4jCaptureDataChange payload(Neo4jCaptureDataChangePayload payload) {
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
    public Neo4jCaptureDataChangePayload getPayload() {
        return payload;
    }

    @JsonProperty(JSON_PROPERTY_PAYLOAD)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
        return Objects.equals(this.headers, neo4jCaptureDataChange.headers) &&
            Objects.equals(this.messageKey, neo4jCaptureDataChange.messageKey) &&
            Objects.equals(this.meta, neo4jCaptureDataChange.meta) &&
            Objects.equals(this.offset, neo4jCaptureDataChange.offset) &&
            Objects.equals(this.partition, neo4jCaptureDataChange.partition) &&
            Objects.equals(this.sourceType, neo4jCaptureDataChange.sourceType) &&
            Objects.equals(this.timestamp, neo4jCaptureDataChange.timestamp) &&
            Objects.equals(this.topic, neo4jCaptureDataChange.topic) &&
            Objects.equals(this.schema, neo4jCaptureDataChange.schema) &&
            Objects.equals(this.payload, neo4jCaptureDataChange.payload);
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

