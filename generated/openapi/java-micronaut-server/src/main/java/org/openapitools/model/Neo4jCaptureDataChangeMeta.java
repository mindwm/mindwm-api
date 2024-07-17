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
import org.openapitools.model.Neo4jCaptureDataChangeMetaSource;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Neo4jCaptureDataChangeMeta
 */
@JsonPropertyOrder({
  Neo4jCaptureDataChangeMeta.JSON_PROPERTY_OPERATION,
  Neo4jCaptureDataChangeMeta.JSON_PROPERTY_SOURCE,
  Neo4jCaptureDataChangeMeta.JSON_PROPERTY_TIMESTAMP,
  Neo4jCaptureDataChangeMeta.JSON_PROPERTY_TX_EVENT_ID,
  Neo4jCaptureDataChangeMeta.JSON_PROPERTY_TX_EVENTS_COUNT,
  Neo4jCaptureDataChangeMeta.JSON_PROPERTY_TX_ID,
  Neo4jCaptureDataChangeMeta.JSON_PROPERTY_USERNAME
})
@JsonTypeName("Neo4jCaptureDataChange_meta")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-07-17T14:05:01.774271688Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@Introspected
public class Neo4jCaptureDataChangeMeta {
    public static final String JSON_PROPERTY_OPERATION = "operation";
    private String operation;

    public static final String JSON_PROPERTY_SOURCE = "source";
    private Neo4jCaptureDataChangeMetaSource source;

    public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
    private Integer timestamp;

    public static final String JSON_PROPERTY_TX_EVENT_ID = "txEventId";
    private Integer txEventId;

    public static final String JSON_PROPERTY_TX_EVENTS_COUNT = "txEventsCount";
    private Integer txEventsCount;

    public static final String JSON_PROPERTY_TX_ID = "txId";
    private Integer txId;

    public static final String JSON_PROPERTY_USERNAME = "username";
    private String username;

    public Neo4jCaptureDataChangeMeta(String operation, Neo4jCaptureDataChangeMetaSource source, Integer timestamp, Integer txEventId, Integer txEventsCount, Integer txId, String username) {
        this.operation = operation;
        this.source = source;
        this.timestamp = timestamp;
        this.txEventId = txEventId;
        this.txEventsCount = txEventsCount;
        this.txId = txId;
        this.username = username;
    }

    public Neo4jCaptureDataChangeMeta operation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get operation
     * @return operation
     */
    @NotNull
    @Schema(name = "operation", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_OPERATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getOperation() {
        return operation;
    }

    @JsonProperty(JSON_PROPERTY_OPERATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Neo4jCaptureDataChangeMeta source(Neo4jCaptureDataChangeMetaSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     * @return source
     */
    @Valid
    @NotNull
    @Schema(name = "source", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_SOURCE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Neo4jCaptureDataChangeMetaSource getSource() {
        return source;
    }

    @JsonProperty(JSON_PROPERTY_SOURCE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSource(Neo4jCaptureDataChangeMetaSource source) {
        this.source = source;
    }

    public Neo4jCaptureDataChangeMeta timestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     * @return timestamp
     */
    @NotNull
    @Schema(name = "timestamp", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getTimestamp() {
        return timestamp;
    }

    @JsonProperty(JSON_PROPERTY_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Neo4jCaptureDataChangeMeta txEventId(Integer txEventId) {
        this.txEventId = txEventId;
        return this;
    }

    /**
     * Get txEventId
     * @return txEventId
     */
    @NotNull
    @Schema(name = "txEventId", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TX_EVENT_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getTxEventId() {
        return txEventId;
    }

    @JsonProperty(JSON_PROPERTY_TX_EVENT_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTxEventId(Integer txEventId) {
        this.txEventId = txEventId;
    }

    public Neo4jCaptureDataChangeMeta txEventsCount(Integer txEventsCount) {
        this.txEventsCount = txEventsCount;
        return this;
    }

    /**
     * Get txEventsCount
     * @return txEventsCount
     */
    @NotNull
    @Schema(name = "txEventsCount", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TX_EVENTS_COUNT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getTxEventsCount() {
        return txEventsCount;
    }

    @JsonProperty(JSON_PROPERTY_TX_EVENTS_COUNT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTxEventsCount(Integer txEventsCount) {
        this.txEventsCount = txEventsCount;
    }

    public Neo4jCaptureDataChangeMeta txId(Integer txId) {
        this.txId = txId;
        return this;
    }

    /**
     * Get txId
     * @return txId
     */
    @NotNull
    @Schema(name = "txId", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TX_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getTxId() {
        return txId;
    }

    @JsonProperty(JSON_PROPERTY_TX_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTxId(Integer txId) {
        this.txId = txId;
    }

    public Neo4jCaptureDataChangeMeta username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get username
     * @return username
     */
    @NotNull
    @Schema(name = "username", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_USERNAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getUsername() {
        return username;
    }

    @JsonProperty(JSON_PROPERTY_USERNAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Neo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta = (Neo4jCaptureDataChangeMeta) o;
        return Objects.equals(this.operation, neo4jCaptureDataChangeMeta.operation) &&
            Objects.equals(this.source, neo4jCaptureDataChangeMeta.source) &&
            Objects.equals(this.timestamp, neo4jCaptureDataChangeMeta.timestamp) &&
            Objects.equals(this.txEventId, neo4jCaptureDataChangeMeta.txEventId) &&
            Objects.equals(this.txEventsCount, neo4jCaptureDataChangeMeta.txEventsCount) &&
            Objects.equals(this.txId, neo4jCaptureDataChangeMeta.txId) &&
            Objects.equals(this.username, neo4jCaptureDataChangeMeta.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, source, timestamp, txEventId, txEventsCount, txId, username);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Neo4jCaptureDataChangeMeta {\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    txEventId: ").append(toIndentedString(txEventId)).append("\n");
        sb.append("    txEventsCount: ").append(toIndentedString(txEventsCount)).append("\n");
        sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

