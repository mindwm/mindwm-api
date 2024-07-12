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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ClipboardPayloadContext;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ClipboardPayload
 */
@JsonPropertyOrder({
  ClipboardPayload.JSON_PROPERTY_START,
  ClipboardPayload.JSON_PROPERTY_STOP,
  ClipboardPayload.JSON_PROPERTY_DATA,
  ClipboardPayload.JSON_PROPERTY_TYPE,
  ClipboardPayload.JSON_PROPERTY_CONTEXT
})
@JsonTypeName("ClipboardPayload")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-07-12T13:38:31.599892342Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@Introspected
public class ClipboardPayload {
    public static final String JSON_PROPERTY_START = "start";
    private List<Integer> start = null;

    public static final String JSON_PROPERTY_STOP = "stop";
    private List<Integer> stop = null;

    public static final String JSON_PROPERTY_DATA = "data";
    private String data;

    /**
     * Clipboard type
     */
    public enum TypeEnum {
        PRIMARY("primary"),
        SECONDARY("secondary"),
        CLIPBOARD("clipboard");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_TYPE = "type";
    private TypeEnum type;

    public static final String JSON_PROPERTY_CONTEXT = "context";
    private ClipboardPayloadContext context;

    public ClipboardPayload() {
    }

    public ClipboardPayload start(List<Integer> start) {
        this.start = start;
        return this;
    }

    public ClipboardPayload addStartItem(Integer startItem) {
        if (this.start == null) {
            this.start = new ArrayList<>();
        }
        this.start.add(startItem);
        return this;
    }

    /**
     * Starting position of clipboard selection [x,y]
     * @return start
     */
    @Nullable
    @Size(min=2, max=2)
    @Schema(name = "start", description = "Starting position of clipboard selection [x,y]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_START)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<Integer> getStart() {
        return start;
    }

    @JsonProperty(JSON_PROPERTY_START)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStart(List<Integer> start) {
        this.start = start;
    }

    public ClipboardPayload stop(List<Integer> stop) {
        this.stop = stop;
        return this;
    }

    public ClipboardPayload addStopItem(Integer stopItem) {
        if (this.stop == null) {
            this.stop = new ArrayList<>();
        }
        this.stop.add(stopItem);
        return this;
    }

    /**
     * Ending position of clipboard selection [x,y]
     * @return stop
     */
    @Nullable
    @Size(min=2, max=2)
    @Schema(name = "stop", description = "Ending position of clipboard selection [x,y]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_STOP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<Integer> getStop() {
        return stop;
    }

    @JsonProperty(JSON_PROPERTY_STOP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStop(List<Integer> stop) {
        this.stop = stop;
    }

    public ClipboardPayload data(String data) {
        this.data = data;
        return this;
    }

    /**
     * Clipboard data
     * @return data
     */
    @Nullable
    @Size(min=1)
    @Schema(name = "data", description = "Clipboard data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setData(String data) {
        this.data = data;
    }

    public ClipboardPayload type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Clipboard type
     * @return type
     */
    @Nullable
    @Schema(name = "type", description = "Clipboard type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TypeEnum getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ClipboardPayload context(ClipboardPayloadContext context) {
        this.context = context;
        return this;
    }

    /**
     * Get context
     * @return context
     */
    @Valid
    @Nullable
    @Schema(name = "context", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_CONTEXT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ClipboardPayloadContext getContext() {
        return context;
    }

    @JsonProperty(JSON_PROPERTY_CONTEXT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setContext(ClipboardPayloadContext context) {
        this.context = context;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClipboardPayload clipboardPayload = (ClipboardPayload) o;
        return Objects.equals(this.start, clipboardPayload.start) &&
            Objects.equals(this.stop, clipboardPayload.stop) &&
            Objects.equals(this.data, clipboardPayload.data) &&
            Objects.equals(this.type, clipboardPayload.type) &&
            Objects.equals(this.context, clipboardPayload.context);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, stop, data, type, context);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClipboardPayload {\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

