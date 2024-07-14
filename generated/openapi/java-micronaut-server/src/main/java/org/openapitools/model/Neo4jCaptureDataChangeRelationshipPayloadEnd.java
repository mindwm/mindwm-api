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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Neo4jCaptureDataChangeRelationshipPayloadEnd
 */
@JsonPropertyOrder({
  Neo4jCaptureDataChangeRelationshipPayloadEnd.JSON_PROPERTY_ID,
  Neo4jCaptureDataChangeRelationshipPayloadEnd.JSON_PROPERTY_IDS,
  Neo4jCaptureDataChangeRelationshipPayloadEnd.JSON_PROPERTY_LABELS
})
@JsonTypeName("Neo4jCaptureDataChangeRelationshipPayload_end")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-07-14T10:08:50.187341729Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@Introspected
public class Neo4jCaptureDataChangeRelationshipPayloadEnd {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_IDS = "ids";
    private Map<String, Object> ids = new HashMap<>();

    public static final String JSON_PROPERTY_LABELS = "labels";
    private List<String> labels = new ArrayList<>();

    public Neo4jCaptureDataChangeRelationshipPayloadEnd(String id, Map<String, Object> ids, List<String> labels) {
        this.id = id;
        this.ids = ids;
        this.labels = labels;
    }

    public Neo4jCaptureDataChangeRelationshipPayloadEnd id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(String id) {
        this.id = id;
    }

    public Neo4jCaptureDataChangeRelationshipPayloadEnd ids(Map<String, Object> ids) {
        this.ids = ids;
        return this;
    }

    public Neo4jCaptureDataChangeRelationshipPayloadEnd putIdsItem(String key, Object idsItem) {
        this.ids.put(key, idsItem);
        return this;
  }

    /**
     * Get ids
     * @return ids
     */
    @NotNull
    @Schema(name = "ids", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_IDS)
    @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)
    public Map<String, Object> getIds() {
        return ids;
    }

    @JsonProperty(JSON_PROPERTY_IDS)
    @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)
    public void setIds(Map<String, Object> ids) {
        this.ids = ids;
    }

    public Neo4jCaptureDataChangeRelationshipPayloadEnd labels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public Neo4jCaptureDataChangeRelationshipPayloadEnd addLabelsItem(String labelsItem) {
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Get labels
     * @return labels
     */
    @NotNull
    @Schema(name = "labels", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_LABELS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<String> getLabels() {
        return labels;
    }

    @JsonProperty(JSON_PROPERTY_LABELS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Neo4jCaptureDataChangeRelationshipPayloadEnd neo4jCaptureDataChangeRelationshipPayloadEnd = (Neo4jCaptureDataChangeRelationshipPayloadEnd) o;
        return Objects.equals(this.id, neo4jCaptureDataChangeRelationshipPayloadEnd.id) &&
            Objects.equals(this.ids, neo4jCaptureDataChangeRelationshipPayloadEnd.ids) &&
            Objects.equals(this.labels, neo4jCaptureDataChangeRelationshipPayloadEnd.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ids, labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Neo4jCaptureDataChangeRelationshipPayloadEnd {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
