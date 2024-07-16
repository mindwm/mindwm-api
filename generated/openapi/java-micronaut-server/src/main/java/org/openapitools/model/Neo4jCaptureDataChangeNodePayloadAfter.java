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
 * Neo4jCaptureDataChangeNodePayloadAfter
 */
@JsonPropertyOrder({
  Neo4jCaptureDataChangeNodePayloadAfter.JSON_PROPERTY_LABELS,
  Neo4jCaptureDataChangeNodePayloadAfter.JSON_PROPERTY_PROPERTIES
})
@JsonTypeName("Neo4jCaptureDataChangeNodePayload_after")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-07-16T19:19:10.426459082Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@Introspected
public class Neo4jCaptureDataChangeNodePayloadAfter {
    public static final String JSON_PROPERTY_LABELS = "labels";
    private List<String> labels = new ArrayList<>();

    public static final String JSON_PROPERTY_PROPERTIES = "properties";
    private Map<String, Object> properties = new HashMap<>();

    public Neo4jCaptureDataChangeNodePayloadAfter(List<String> labels, Map<String, Object> properties) {
        this.labels = labels;
        this.properties = properties;
    }

    public Neo4jCaptureDataChangeNodePayloadAfter labels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public Neo4jCaptureDataChangeNodePayloadAfter addLabelsItem(String labelsItem) {
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

    public Neo4jCaptureDataChangeNodePayloadAfter properties(Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }

    public Neo4jCaptureDataChangeNodePayloadAfter putPropertiesItem(String key, Object propertiesItem) {
        this.properties.put(key, propertiesItem);
        return this;
  }

    /**
     * Get properties
     * @return properties
     */
    @NotNull
    @Schema(name = "properties", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_PROPERTIES)
    @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)
    public Map<String, Object> getProperties() {
        return properties;
    }

    @JsonProperty(JSON_PROPERTY_PROPERTIES)
    @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)
    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Neo4jCaptureDataChangeNodePayloadAfter neo4jCaptureDataChangeNodePayloadAfter = (Neo4jCaptureDataChangeNodePayloadAfter) o;
        return Objects.equals(this.labels, neo4jCaptureDataChangeNodePayloadAfter.labels) &&
            Objects.equals(this.properties, neo4jCaptureDataChangeNodePayloadAfter.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labels, properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Neo4jCaptureDataChangeNodePayloadAfter {\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

