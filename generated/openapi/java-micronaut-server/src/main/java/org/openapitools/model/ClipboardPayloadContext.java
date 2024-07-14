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
 * Selection context
 */
@Schema(name = "ClipboardPayload_context", description = "Selection context")
@JsonPropertyOrder({
  ClipboardPayloadContext.JSON_PROPERTY_WINDOW
})
@JsonTypeName("ClipboardPayload_context")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-07-14T12:11:47.737873360Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@Introspected
public class ClipboardPayloadContext {
    public static final String JSON_PROPERTY_WINDOW = "window";
    private String window;

    public ClipboardPayloadContext() {
    }

    public ClipboardPayloadContext window(String window) {
        this.window = window;
        return this;
    }

    /**
     * window id
     * @return window
     */
    @Nullable
    @Schema(name = "window", description = "window id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_WINDOW)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getWindow() {
        return window;
    }

    @JsonProperty(JSON_PROPERTY_WINDOW)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWindow(String window) {
        this.window = window;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClipboardPayloadContext clipboardPayloadContext = (ClipboardPayloadContext) o;
        return Objects.equals(this.window, clipboardPayloadContext.window);
    }

    @Override
    public int hashCode() {
        return Objects.hash(window);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClipboardPayloadContext {\n");
        sb.append("    window: ").append(toIndentedString(window)).append("\n");
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

