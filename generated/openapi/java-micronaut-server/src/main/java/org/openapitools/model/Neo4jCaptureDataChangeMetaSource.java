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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Neo4jCaptureDataChangeMetaSource
 */
@JsonPropertyOrder({
  Neo4jCaptureDataChangeMetaSource.JSON_PROPERTY_HOSTNAME
})
@JsonTypeName("Neo4jCaptureDataChange_meta_source")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-07-14T08:10:40.812100638Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@Introspected
public class Neo4jCaptureDataChangeMetaSource {
    public static final String JSON_PROPERTY_HOSTNAME = "hostname";
    private String hostname;

    public Neo4jCaptureDataChangeMetaSource(String hostname) {
        this.hostname = hostname;
    }

    public Neo4jCaptureDataChangeMetaSource hostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get hostname
     * @return hostname
     */
    @NotNull
    @Schema(name = "hostname", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_HOSTNAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getHostname() {
        return hostname;
    }

    @JsonProperty(JSON_PROPERTY_HOSTNAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Neo4jCaptureDataChangeMetaSource neo4jCaptureDataChangeMetaSource = (Neo4jCaptureDataChangeMetaSource) o;
        return Objects.equals(this.hostname, neo4jCaptureDataChangeMetaSource.hostname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostname);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Neo4jCaptureDataChangeMetaSource {\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
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

