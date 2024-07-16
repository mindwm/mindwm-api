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
import org.openapitools.model.Neo4jCaptureDataChangeRelationshipPayloadEnd;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Neo4jCaptureDataChangeRelationshipPayload
 */
@JsonPropertyOrder({
  Neo4jCaptureDataChangeRelationshipPayload.JSON_PROPERTY_AFTER,
  Neo4jCaptureDataChangeRelationshipPayload.JSON_PROPERTY_BEFORE,
  Neo4jCaptureDataChangeRelationshipPayload.JSON_PROPERTY_END,
  Neo4jCaptureDataChangeRelationshipPayload.JSON_PROPERTY_ID,
  Neo4jCaptureDataChangeRelationshipPayload.JSON_PROPERTY_LABEL,
  Neo4jCaptureDataChangeRelationshipPayload.JSON_PROPERTY_START,
  Neo4jCaptureDataChangeRelationshipPayload.JSON_PROPERTY_TYPE
})
@JsonTypeName("Neo4jCaptureDataChangeRelationshipPayload")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-07-16T18:17:54.265793865Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@Introspected
public class Neo4jCaptureDataChangeRelationshipPayload {
    public static final String JSON_PROPERTY_AFTER = "after";
    private Object after;

    public static final String JSON_PROPERTY_BEFORE = "before";
    private String before;

    public static final String JSON_PROPERTY_END = "end";
    private Neo4jCaptureDataChangeRelationshipPayloadEnd end;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_LABEL = "label";
    private String label;

    public static final String JSON_PROPERTY_START = "start";
    private Neo4jCaptureDataChangeRelationshipPayloadEnd start;

    public static final String JSON_PROPERTY_TYPE = "type";
    private String type;

    public Neo4jCaptureDataChangeRelationshipPayload(Object after, String before, Neo4jCaptureDataChangeRelationshipPayloadEnd end, String id, String label, Neo4jCaptureDataChangeRelationshipPayloadEnd start, String type) {
        this.after = after;
        this.before = before;
        this.end = end;
        this.id = id;
        this.label = label;
        this.start = start;
        this.type = type;
    }

    public Neo4jCaptureDataChangeRelationshipPayload after(Object after) {
        this.after = after;
        return this;
    }

    /**
     * Get after
     * @return after
     */
    @NotNull
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

    public Neo4jCaptureDataChangeRelationshipPayload before(String before) {
        this.before = before;
        return this;
    }

    /**
     * Get before
     * @return before
     */
    @NotNull
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

    public Neo4jCaptureDataChangeRelationshipPayload end(Neo4jCaptureDataChangeRelationshipPayloadEnd end) {
        this.end = end;
        return this;
    }

    /**
     * Get end
     * @return end
     */
    @Valid
    @NotNull
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

    public Neo4jCaptureDataChangeRelationshipPayload id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
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

    public Neo4jCaptureDataChangeRelationshipPayload label(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get label
     * @return label
     */
    @NotNull
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

    public Neo4jCaptureDataChangeRelationshipPayload start(Neo4jCaptureDataChangeRelationshipPayloadEnd start) {
        this.start = start;
        return this;
    }

    /**
     * Get start
     * @return start
     */
    @Valid
    @NotNull
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

    public Neo4jCaptureDataChangeRelationshipPayload type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Neo4jCaptureDataChangeRelationshipPayload neo4jCaptureDataChangeRelationshipPayload = (Neo4jCaptureDataChangeRelationshipPayload) o;
        return Objects.equals(this.after, neo4jCaptureDataChangeRelationshipPayload.after) &&
            Objects.equals(this.before, neo4jCaptureDataChangeRelationshipPayload.before) &&
            Objects.equals(this.end, neo4jCaptureDataChangeRelationshipPayload.end) &&
            Objects.equals(this.id, neo4jCaptureDataChangeRelationshipPayload.id) &&
            Objects.equals(this.label, neo4jCaptureDataChangeRelationshipPayload.label) &&
            Objects.equals(this.start, neo4jCaptureDataChangeRelationshipPayload.start) &&
            Objects.equals(this.type, neo4jCaptureDataChangeRelationshipPayload.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, before, end, id, label, start, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Neo4jCaptureDataChangeRelationshipPayload {\n");
        sb.append("    after: ").append(toIndentedString(after)).append("\n");
        sb.append("    before: ").append(toIndentedString(before)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

