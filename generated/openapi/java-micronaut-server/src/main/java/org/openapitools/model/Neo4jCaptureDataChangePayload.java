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
import org.openapitools.model.Neo4jCaptureDataChangeNodePayload;
import org.openapitools.model.Neo4jCaptureDataChangeRelationshipPayload;
import org.openapitools.model.Neo4jCaptureDataChangeRelationshipPayloadEnd;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Neo4jCaptureDataChangePayload
 */
@JsonPropertyOrder({
  Neo4jCaptureDataChangePayload.JSON_PROPERTY_AFTER,
  Neo4jCaptureDataChangePayload.JSON_PROPERTY_BEFORE,
  Neo4jCaptureDataChangePayload.JSON_PROPERTY_ID,
  Neo4jCaptureDataChangePayload.JSON_PROPERTY_TYPE,
  Neo4jCaptureDataChangePayload.JSON_PROPERTY_END,
  Neo4jCaptureDataChangePayload.JSON_PROPERTY_LABEL,
  Neo4jCaptureDataChangePayload.JSON_PROPERTY_START
})
@JsonTypeName("Neo4jCaptureDataChange_payload")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-07-14T10:08:50.187341729Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@Introspected
public class Neo4jCaptureDataChangePayload {
    public static final String JSON_PROPERTY_AFTER = "after";
    private Object after;

    public static final String JSON_PROPERTY_BEFORE = "before";
    private String before;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_TYPE = "type";
    private String type;

    public static final String JSON_PROPERTY_END = "end";
    private Neo4jCaptureDataChangeRelationshipPayloadEnd end;

    public static final String JSON_PROPERTY_LABEL = "label";
    private String label;

    public static final String JSON_PROPERTY_START = "start";
    private Neo4jCaptureDataChangeRelationshipPayloadEnd start;

    public Neo4jCaptureDataChangePayload(Object after, String before, String id, String type, Neo4jCaptureDataChangeRelationshipPayloadEnd end, String label, Neo4jCaptureDataChangeRelationshipPayloadEnd start) {
        this.after = after;
        this.before = before;
        this.id = id;
        this.type = type;
        this.end = end;
        this.label = label;
        this.start = start;
    }

    public Neo4jCaptureDataChangePayload after(Object after) {
        this.after = after;
        return this;
    }

    /**
     * Get after
     * @return after
     */
    @NotNull
    @Schema(name = "after", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_AFTER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Object getAfter() {
        return after;
    }

    @JsonProperty(JSON_PROPERTY_AFTER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAfter(Object after) {
        this.after = after;
    }

    public Neo4jCaptureDataChangePayload before(String before) {
        this.before = before;
        return this;
    }

    /**
     * Get before
     * @return before
     */
    @NotNull
    @Schema(name = "before", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_BEFORE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getBefore() {
        return before;
    }

    @JsonProperty(JSON_PROPERTY_BEFORE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBefore(String before) {
        this.before = before;
    }

    public Neo4jCaptureDataChangePayload id(String id) {
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

    public Neo4jCaptureDataChangePayload type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(String type) {
        this.type = type;
    }

    public Neo4jCaptureDataChangePayload end(Neo4jCaptureDataChangeRelationshipPayloadEnd end) {
        this.end = end;
        return this;
    }

    /**
     * Get end
     * @return end
     */
    @Valid
    @NotNull
    @Schema(name = "end", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_END)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Neo4jCaptureDataChangeRelationshipPayloadEnd getEnd() {
        return end;
    }

    @JsonProperty(JSON_PROPERTY_END)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEnd(Neo4jCaptureDataChangeRelationshipPayloadEnd end) {
        this.end = end;
    }

    public Neo4jCaptureDataChangePayload label(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get label
     * @return label
     */
    @NotNull
    @Schema(name = "label", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_LABEL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getLabel() {
        return label;
    }

    @JsonProperty(JSON_PROPERTY_LABEL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLabel(String label) {
        this.label = label;
    }

    public Neo4jCaptureDataChangePayload start(Neo4jCaptureDataChangeRelationshipPayloadEnd start) {
        this.start = start;
        return this;
    }

    /**
     * Get start
     * @return start
     */
    @Valid
    @NotNull
    @Schema(name = "start", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_START)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Neo4jCaptureDataChangeRelationshipPayloadEnd getStart() {
        return start;
    }

    @JsonProperty(JSON_PROPERTY_START)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStart(Neo4jCaptureDataChangeRelationshipPayloadEnd start) {
        this.start = start;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Neo4jCaptureDataChangePayload neo4jCaptureDataChangePayload = (Neo4jCaptureDataChangePayload) o;
        return Objects.equals(this.after, neo4jCaptureDataChangePayload.after) &&
            Objects.equals(this.before, neo4jCaptureDataChangePayload.before) &&
            Objects.equals(this.id, neo4jCaptureDataChangePayload.id) &&
            Objects.equals(this.type, neo4jCaptureDataChangePayload.type) &&
            Objects.equals(this.end, neo4jCaptureDataChangePayload.end) &&
            Objects.equals(this.label, neo4jCaptureDataChangePayload.label) &&
            Objects.equals(this.start, neo4jCaptureDataChangePayload.start);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, before, id, type, end, label, start);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Neo4jCaptureDataChangePayload {\n");
        sb.append("    after: ").append(toIndentedString(after)).append("\n");
        sb.append("    before: ").append(toIndentedString(before)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

